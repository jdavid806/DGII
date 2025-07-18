package com.medicalsoft.DGII.application.service;

import com.medicalsoft.DGII.shared.utils.ExcelUtils;
import com.medicalsoft.infrastructure.dgii.generated.auth.ECF;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;

@Service
public class EcfXmlService {

    public File procesarExcelYGenerarXml(InputStream excelInputStream) throws Exception {
        Workbook workbook = new XSSFWorkbook(excelInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        Row headerRow = sheet.getRow(0);
        Row dataRow = sheet.getRow(1);

        ECF ecf = new ECF();
        ECF.Encabezado encabezado = new ECF.Encabezado();
        ECF.Encabezado.Emisor emisor = new ECF.Encabezado.Emisor();
        ECF.Encabezado.Comprador comprador = new ECF.Encabezado.Comprador();
        ECF.Encabezado.IdDoc idDoc = new ECF.Encabezado.IdDoc();
        ECF.Encabezado.Totales totales = new ECF.Encabezado.Totales();
        ECF.Paginacion.Pagina pagina = new ECF.Paginacion.Pagina();
        ECF.DetallesItems.Item.OtraMonedaDetalle otraMoneda = new ECF.DetallesItems.Item.OtraMonedaDetalle();
        ECF.DetallesItems.Item items = new ECF.DetallesItems.Item();
        ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago pagos = new ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago();
        ECF.Encabezado.Transporte transporte = new ECF.Encabezado.Transporte();

        // Mapeo entre campos del Excel y el objeto que los contiene
        Map<String, Object> bindingMap = Map.ofEntries(
                // Campos de Emisor
                Map.entry("RNCEmisor", emisor),
                Map.entry("RazonSocialEmisor", emisor),
                Map.entry("NombreComercial", emisor),
                Map.entry("Sucursal", emisor),
                Map.entry("DireccionEmisor", emisor),
                Map.entry("Municipio", emisor),
                Map.entry("Provincia", emisor),
                Map.entry("TelefonoEmisor[1]", emisor),
                Map.entry("TelefonoEmisor[2]", emisor),
                Map.entry("CorreoEmisor", emisor),
                Map.entry("WebSite", emisor),
                Map.entry("CodigoVendedor", emisor),
                Map.entry("InformacionAdicionalEmisor", emisor),

                // Campos de Comprador
                Map.entry("RNCComprador", comprador),
                Map.entry("IdentificadorExtranjero", comprador),
                Map.entry("RazonSocialComprador", comprador),
                Map.entry("ContactoComprador", comprador),
                Map.entry("CorreoComprador", comprador),
                Map.entry("DireccionComprador", comprador),
                Map.entry("MunicipioComprador", comprador),
                Map.entry("ProvinciaComprador", comprador),
                Map.entry("TelefonoAdicional", comprador),
                Map.entry("FechaOrdenCompra", comprador),
                Map.entry("NumeroOrdenCompra", comprador),
                Map.entry("CodigoInternoComprador", comprador),

                // Campos de IdDoc
                Map.entry("TipoeCF", idDoc),
                Map.entry("ENCF", idDoc),
                Map.entry("FechaVencimientoSecuencia", idDoc),
                Map.entry("IndicadorNotaCredito", idDoc),
                Map.entry("IndicadorMontoGravado", idDoc),
                Map.entry("TipoIngresos", idDoc),
                Map.entry("TipoPago", idDoc),
                Map.entry("TerminoPago", idDoc),
                Map.entry("FechaEmision", idDoc),
                Map.entry("FechaEntrega", idDoc),
                Map.entry("NumeroFacturaInterna", idDoc),
                Map.entry("NumeroPedidoInterno", idDoc),
                Map.entry("ZonaVenta", idDoc),
                Map.entry("NCFModificado", idDoc),
                Map.entry("RNCOtroContribuyente", idDoc),
                Map.entry("FechaNCFModificado", idDoc),
                Map.entry("CodigoModificacion", idDoc),
                Map.entry("RazonModificacion", idDoc),

                // Campos de Totales
                Map.entry("MontoTotal", totales),
                Map.entry("MontoGravadoTotal", totales),
                Map.entry("MontoGravadoI1", totales),
                Map.entry("MontoGravadoI2", totales),
                Map.entry("MontoGravadoI3", totales),
                Map.entry("MontoExento", totales),
                Map.entry("ITBIS1", totales),
                Map.entry("ITBIS2", totales),
                Map.entry("ITBIS3", totales),
                Map.entry("TotalITBIS", totales),
                Map.entry("TotalITBIS1", totales),
                Map.entry("TotalITBIS2", totales),
                Map.entry("TotalITBIS3", totales),
                Map.entry("MontoImpuestoAdicional", totales),
                Map.entry("TipoImpuesto[1]", totales),
                Map.entry("TasaImpuestoAdicional[1]", totales),
                Map.entry("MontoImpuestoSelectivoConsumoEspecifico[1]", totales),
                Map.entry("TipoImpuesto[2]", totales),
                Map.entry("TasaImpuestoAdicional[2]", totales),
                Map.entry("MontoImpuestoSelectivoConsumoAdvalorem[2]", totales),
                Map.entry("MontoNoFacturable", totales),
                Map.entry("MontoPeriodo", totales),
                Map.entry("ValorPagar", totales),
                Map.entry("TotalITBISRetenido", totales),
                Map.entry("TotalISRRetencion", totales),
                Map.entry("TipoMoneda", totales),
                Map.entry("TipoCambio", totales),
                Map.entry("MontoExentoOtraMoneda", totales),
                Map.entry("MontoTotalOtraMoneda", totales),

                // Campos de Pagos
                Map.entry("FormaPago[1]", pagos),
                Map.entry("MontoPago[1]", pagos),
                Map.entry("FormaPago[2]", pagos),
                Map.entry("MontoPago[2]", pagos),

                // Campos de Transporte
                Map.entry("NumeroContenedor", transporte),
                Map.entry("NumeroReferencia", transporte),
                Map.entry("PaisDestino", transporte),
                Map.entry("Conductor", transporte),
                Map.entry("DocumentoTransporte", transporte),
                Map.entry("Ficha", transporte),
                Map.entry("Placa", transporte),
                Map.entry("RutaTransporte", transporte),
                Map.entry("ZonaTransporte", transporte),
                Map.entry("NumeroAlbaran", transporte),

                // Campos de Items (hasta 16 líneas)
                Map.entry("NumeroLinea[1]", items),
                Map.entry("TipoCodigo[1][1]", items),
                Map.entry("CodigoItem[1][1]", items),
                Map.entry("IndicadorFacturacion[1]", items),
                Map.entry("IndicadorAgenteRetencionoPercepcion[1]", items),
                Map.entry("MontoITBISRetenido[1]", items),
                Map.entry("MontoISRRetenido[1]", items),
                Map.entry("NombreItem[1]", items),
                Map.entry("IndicadorBienoServicio[1]", items),
                Map.entry("CantidadItem[1]", items),
                Map.entry("UnidadMedida[1]", items),
                Map.entry("CantidadReferencia[1]", items),
                Map.entry("UnidadReferencia[1]", items),
                Map.entry("Subcantidad[1][1]", items),
                Map.entry("CodigoSubcantidad[1][1]", items),
                Map.entry("GradosAlcohol[1]", items),
                Map.entry("PrecioUnitarioReferencia[1]", items),
                Map.entry("PrecioUnitarioItem[1]", items),
                Map.entry("DescuentoMonto[1]", items),
                Map.entry("TipoSubDescuento[1][1]", items),
                Map.entry("MontoSubDescuento[1][1]", items),
                Map.entry("RecargoMonto[1]", items),
                Map.entry("TipoSubRecargo[1][1]", items),
                Map.entry("SubRecargoPorcentaje[1][1]", items),
                Map.entry("MontosubRecargo[1][1]", items),
                Map.entry("TipoImpuesto[1][1]", items),
                Map.entry("TipoImpuesto[1][2]", items),
                Map.entry("PrecioOtraMoneda[1]", items),
                Map.entry("MontoItemOtraMoneda[1]", items),
                Map.entry("MontoItem[1]", items));

        for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {
            String fieldName = headerRow.getCell(i).getStringCellValue().trim();
            String value = ExcelUtils.getCellString(dataRow.getCell(i));

            if (value.equalsIgnoreCase("#e") || value.isEmpty()) {
                continue;
            }

            Object targetObject = bindingMap.get(fieldName);
            if (targetObject == null) {
                continue;
            }

            try {
                Method setter = ExcelUtils.findSetter(targetObject.getClass(), fieldName);
                if (setter != null) {
                    Class<?> paramType = setter.getParameterTypes()[0];
                    Object parsedValue = ExcelUtils.parseValue(value, paramType);
                    setter.invoke(targetObject, parsedValue);
                }
            } catch (Exception e) {
                System.err.println("Error setting field '" + fieldName + "': " + e.getMessage());
            }
        }

        // Armar ECF final
        encabezado.setEmisor(emisor);
        encabezado.setComprador(comprador);
        encabezado.setIdDoc(idDoc);
        encabezado.setTotales(totales);
        ecf.setEncabezado(encabezado);
        // Setear formas de pago si están dentro de IdDoc
        if (pagos != null) {
            ECF.Encabezado.IdDoc.TablaFormasPago tablaPagos = new ECF.Encabezado.IdDoc.TablaFormasPago();
            tablaPagos.getFormaDePago().add(pagos);
            idDoc.setTablaFormasPago(tablaPagos);
        }

        // Setear transporte
        if (transporte != null) {
            encabezado.setTransporte(transporte);
        }

        // Setear items
        if (items != null) {
            ECF.DetallesItems detallesItems = new ECF.DetallesItems();
            detallesItems.getItem().add(items);
            ecf.setDetallesItems(detallesItems);
        }

        // Setear paginación (opcional si aplica)
        if (pagina != null) {
            ECF.Paginacion paginacion = new ECF.Paginacion();
            paginacion.getPagina().add(pagina);
            ecf.setPaginacion(paginacion);
        }

        // Serializar a XML
        JAXBContext context = JAXBContext.newInstance(ECF.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        File xmlFile = File.createTempFile("ecf-", ".xml");
        marshaller.marshal(ecf, xmlFile);

        workbook.close();
        return xmlFile;
    }
}
