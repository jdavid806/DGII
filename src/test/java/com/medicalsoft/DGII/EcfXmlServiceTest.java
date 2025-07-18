package com.medicalsoft.DGII;

import com.medicalsoft.DGII.application.service.EcfXmlService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EcfXmlServiceTest {

    @Autowired
    private EcfXmlService ecfXmlService;

    @Test
    public void testProcesarExcelYGenerarXml() throws Exception {
        // Crear un Excel en memoria
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();

        // Fila de encabezado
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("RNCEmisor");
        header.createCell(1).setCellValue("RazonSocialEmisor");
        header.createCell(2).setCellValue("NombreComercial");
        header.createCell(3).setCellValue("Sucursal");
        header.createCell(4).setCellValue("RNCComprador");
        header.createCell(5).setCellValue("TipoeCF");
        header.createCell(6).setCellValue("ENCF");
        header.createCell(7).setCellValue("TipoIngresos");
        header.createCell(8).setCellValue("MontoTotal");

        // Fila de datos
        Row data = sheet.createRow(1);
        data.createCell(0).setCellValue("123456789");
        data.createCell(1).setCellValue("EMPRESA DEMO SRL");
        data.createCell(2).setCellValue("EMPRESA DEMO");
        data.createCell(3).setCellValue("1");
        data.createCell(4).setCellValue("987654321");
        data.createCell(5).setCellValue("31");
        data.createCell(6).setCellValue("E3100000001");
        data.createCell(7).setCellValue("01");
        data.createCell(8).setCellValue("10000.50");

        workbook.write(out);
        workbook.close();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(out.toByteArray());

        // Ejecutar método
        File resultXml = ecfXmlService.procesarExcelYGenerarXml(inputStream);

        // Validar que el archivo se creó
        assertThat(resultXml).exists();
        assertThat(resultXml.length()).isGreaterThan(0);

        // Mostrar XML en consola (opcional)
        System.out.println("--- XML Generado ---");
        System.out.println(new String(java.nio.file.Files.readAllBytes(resultXml.toPath())));

        // Limpiar
        resultXml.delete();
    }
}