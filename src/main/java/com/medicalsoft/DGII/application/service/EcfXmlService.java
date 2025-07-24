package com.medicalsoft.DGII.application.service;

import com.medicalsoft.DGII.application.factory.EcfXmlMapperFactory;
import com.medicalsoft.DGII.domain.interfaces.ExcelToEcfMapper;
import com.medicalsoft.DGII.shared.utils.ExcelUtils;
import com.medicalsoft.DGII.shared.utils.KeystoreLoader;
import com.medicalsoft.DGII.shared.utils.XmlSigner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import java.io.*;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class EcfXmlService {

    private final KeystoreLoader keystoreLoader;
    private final XmlSigner xmlSigner;

    public EcfXmlService(KeystoreLoader keystoreLoader, XmlSigner xmlSigner) {
        this.keystoreLoader = keystoreLoader;
        this.xmlSigner = xmlSigner;
    }

    public File procesarExcelYGenerarXml(InputStream excelInputStream) throws Exception {
        Workbook workbook = new XSSFWorkbook(excelInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // 1. Obtener tipo eCF desde el Excel
        String tipoEcf = obtenerTipoEcfDesdeExcel(sheet);
        if (tipoEcf == null || tipoEcf.isBlank()) {
            throw new IllegalArgumentException("No se pudo detectar el TipoeCF en el Excel.");
        }

        // 2. Obtener mapper correspondiente
        ExcelToEcfMapper<?> mapper = EcfXmlMapperFactory.getMapper(tipoEcf);

        // 3. Mapear el Excel a un objeto ECF (o ECF43, etc.)
        Object ecfObject = mapper.map(sheet);

        // 4. Establecer la fecha de firma
        Method setFechaFirma = ecfObject.getClass().getMethod("setFechaHoraFirma", String.class);
        String fechaHoraFirma = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        setFechaFirma.invoke(ecfObject, fechaHoraFirma);

        // 5. Serializar a XML
        System.out.println("Clase real de ecfObject: " + ecfObject.getClass().getName());

        JAXBContext context = JAXBContext.newInstance(ecfObject.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter writer = new StringWriter();
        marshaller.marshal(ecfObject, writer);
        String xmlSinFirmar = writer.toString();

        // 6. Firmar el XML
        String xmlFirmado;
        try (InputStream keystoreStream = keystoreLoader.loadKeystoreStream()) {
            xmlFirmado = xmlSigner.sign(xmlSinFirmar, keystoreStream, keystoreLoader.getPassword());
        }

        // 7. Validar contra el XSD correspondiente
        validarXmlFirmado(xmlFirmado, tipoEcf);

        // 8. Guardar archivo XML
        File xmlDir = new File("xml_enviados");
        xmlDir.mkdirs();
        File xmlFile = new File(xmlDir, "ecf-firmado-" + System.currentTimeMillis() + ".xml");

        try (FileOutputStream fos = new FileOutputStream(xmlFile)) {
            fos.write(xmlFirmado.getBytes(StandardCharsets.UTF_8));
        }

        workbook.close();
        return xmlFile;
    }

    private String obtenerTipoEcfDesdeExcel(Sheet sheet) {
        Row headerRow = sheet.getRow(0);
        Row dataRow = sheet.getRow(1);
        for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {
            String colName = headerRow.getCell(i).getStringCellValue();
            if (colName.equalsIgnoreCase("TipoeCF")) {
                return ExcelUtils.getCellString(dataRow.getCell(i)).trim();
            }
        }
        return null;
    }

    private void validarXmlFirmado(String xmlContent, String tipoEcf) throws Exception {
        System.setProperty("javax.xml.validation.SchemaFactory:" + XMLConstants.W3C_XML_SCHEMA_NS_URI,
                "org.apache.xerces.jaxp.validation.XMLSchemaFactory");

        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        try {
            factory.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
        } catch (org.xml.sax.SAXNotRecognizedException e) {
            System.out.println("El parser no reconoce la feature, se omite.");
        }

        File xsdFile = switch (tipoEcf) {
            case "47" -> new File("src/main/resources/xsd/e-CF-47.xsd");
            // case "43" -> new File("src/main/resources/xsd/e-CF-43.xsd");
            default -> throw new IllegalArgumentException("XSD no soportado para TipoeCF: " + tipoEcf);
        };

        Schema schema = factory.newSchema(xsdFile);
        Validator validator = schema.newValidator();

        try (StringReader reader = new StringReader(xmlContent)) {
            validator.validate(new StreamSource(reader));
            System.out.println("XML válido contra el XSD.");
        } catch (org.xml.sax.SAXException e) {
            System.err.println(" Error de validación XML: " + e.getMessage());
            throw e;
        }
    }
}
