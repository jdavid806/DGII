package com.medicalsoft.infrastructure.dgii.mapper;

import com.medicalsoft.DGII.domain.interfaces.ExcelToEcfMapper;
import com.medicalsoft.infrastructure.dgii.generated.ecf47.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.medicalsoft.DGII.shared.utils.ExcelUtils;

public class EcfXmlMapper47 implements ExcelToEcfMapper<ECF> {

    @Override
    public ECF map(Sheet sheet) throws Exception {
        Row headerRow = sheet.getRow(0);
        Row dataRow = sheet.getRow(1);

           ECF ecf = new ECF();
        ECF.Encabezado encabezado = new ECF.Encabezado();
        ECF.Encabezado.Emisor emisor = new ECF.Encabezado.Emisor();
        ECF.Encabezado.Comprador comprador = new ECF.Encabezado.Comprador();
        ECF.Encabezado.IdDoc idDoc = new ECF.Encabezado.IdDoc();
        ECF.Encabezado.Totales totales = new ECF.Encabezado.Totales();
        ECF.Encabezado.Transporte transporte = new ECF.Encabezado.Transporte();
        ECF.Encabezado.IdDoc.TablaFormasPago tablaFormasPago = new ECF.Encabezado.IdDoc.TablaFormasPago();

        Map<Integer, ECF.DetallesItems.Item> itemMap = new TreeMap<>();

        Map<String, Object> baseMap = new HashMap<>();
        baseMap.putAll(Map.ofEntries(
                Map.entry("FechaVencimientoSecuencia", idDoc),
                // Emisor
                Map.entry("RNCEmisor", emisor),
                Map.entry("RazonSocialEmisor", emisor),
                Map.entry("NombreComercial", emisor),
                Map.entry("Sucursal", emisor),
                Map.entry("DireccionEmisor", emisor),
                Map.entry("Municipio", emisor),
                Map.entry("Provincia", emisor),
                Map.entry("TelefonoEmisor", emisor),
                Map.entry("CorreoEmisor", emisor),
                Map.entry("WebSite", emisor),
                Map.entry("CodigoVendedor", emisor),
                Map.entry("InformacionAdicionalEmisor", emisor),
                Map.entry("NumeroFacturaInterna", emisor),
                Map.entry("NumeroPedidoInterno", emisor),
                Map.entry("FechaEmision", emisor),
                // Comprador
                Map.entry("RNCComprador", comprador),
                Map.entry("RazonSocialComprador", comprador),
                Map.entry("ContactoComprador", comprador),
                Map.entry("CorreoComprador", comprador),
                Map.entry("DireccionComprador", comprador),
                Map.entry("MunicipioComprador", comprador),
                Map.entry("ProvinciaComprador", comprador),
                Map.entry("TelefonoAdicional", comprador),
                Map.entry("IdentificadorExtranjero", comprador),
                // Documento
                Map.entry("TipoeCF", idDoc),
                Map.entry("ENCF", idDoc),
                Map.entry("FechaEntrega", idDoc),
                Map.entry("TipoPago", idDoc),
                Map.entry("TerminoPago", idDoc),
                Map.entry("Moneda", idDoc),
                Map.entry("TipoCambio", idDoc),
                Map.entry("Observaciones", idDoc),
                Map.entry("TipoTransaccion", idDoc),
                Map.entry("BienesTransp", idDoc),
                Map.entry("CondicionOperacion", idDoc),
                Map.entry("FormaEntrega", idDoc),
                // Totales
                Map.entry("MontoGravadoTotal", totales),
                Map.entry("MontoItemExento", totales),
                Map.entry("MontoSubTotal", totales),
                Map.entry("TotalDescuento", totales),
                Map.entry("TotalCargo", totales),
                Map.entry("TotalITBIS", totales),
                Map.entry("TotalISC", totales),
                Map.entry("TotalOtrosImpuestos", totales),
                Map.entry("TotalITBISRetenido", totales),
                Map.entry("TotalISRRetencion", totales),
                Map.entry("MontoTotal", totales),
                Map.entry("MontoExento", totales),
                Map.entry("MontoPeriodo", totales),
                Map.entry("ValorPagar", totales),
                // Transporte
                Map.entry("NumeroContenedor", transporte),
                Map.entry("NumeroReferencia", transporte),
                Map.entry("PaisDestino", transporte),
                Map.entry("Placa", transporte),
                Map.entry("RutaTransporte", transporte)));

        for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {
            String columnName = headerRow.getCell(i).getStringCellValue().trim();
            String cellValue = ExcelUtils.getCellString(dataRow.getCell(i));
            String normalizedColumnName = columnName.replaceAll("\\[\\d+]", "").trim();

            if (cellValue.equalsIgnoreCase("#e") || cellValue.isEmpty())
                continue;

            Object baseObject = baseMap.get(normalizedColumnName);
            if (baseObject != null) {
                try {
                    Method setter = ExcelUtils.findSetter(baseObject.getClass(), normalizedColumnName);
                    if (columnName.matches("TelefonoEmisor\\[\\d+]")) {
                        String telefono = cellValue.trim();
                        if (!telefono.isEmpty()) {
                            if (emisor.getTablaTelefonoEmisor() == null)
                                emisor.setTablaTelefonoEmisor(new ECF.Encabezado.Emisor.TablaTelefonoEmisor());
                            emisor.getTablaTelefonoEmisor().getTelefonoEmisor().add(telefono);
                        }
                        continue;
                    }
                    if (setter != null) {
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        if (parsed != null)
                            setter.invoke(baseObject, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error en campo simple: " + normalizedColumnName + " - " + e.getMessage());
                }
                continue;
            }

            if (columnName.matches("FormaPago\\[\\d+]") || columnName.matches("MontoPago\\[\\d+]")) {
                int idx = ExcelUtils.extractIndex(columnName);
                ExcelUtils.ensureSize(tablaFormasPago.getFormaDePago(), idx);
                ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago forma = tablaFormasPago.getFormaDePago().get(idx - 1);
                if (forma == null) {
                    forma = new ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago();
                    tablaFormasPago.getFormaDePago().set(idx - 1, forma);
                }

                String baseField = columnName.replaceAll("\\[\\d+]", "");
                Method setter = ExcelUtils.findSetter(forma.getClass(), baseField);
                if (setter != null) {
                    Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                    setter.invoke(forma, parsed);
                }
                continue;
            }

            if (columnName.matches(".*\\[\\d+].*")) {
                int itemIndex = ExcelUtils.extractIndex(columnName);
                ECF.DetallesItems.Item item = itemMap.computeIfAbsent(itemIndex, k -> new ECF.DetallesItems.Item());
                String cleanField = columnName.replaceAll("\\[\\d+]", "");

                try {
                    if (cleanField.equals("IndicadorAgenteRetencionoPercepcion")
                            || cleanField.equals("MontoISRRetenido")) {
                        if (item.getRetencion() == null) {
                            item.setRetencion(new ECF.DetallesItems.Item.Retencion());
                        }
                        Method setter = ExcelUtils.findSetter(item.getRetencion().getClass(), cleanField);
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(item.getRetencion(), parsed);
                    } else {
                        Method setter = ExcelUtils.findSetter(item.getClass(), cleanField);
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(item, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error en Item[" + itemIndex + "]: " + columnName + " - " + e.getMessage());
                }
            }
        }

        // Ensamblar estructura final
        encabezado.setEmisor(emisor);
        encabezado.setComprador(comprador);
        encabezado.setIdDoc(idDoc);
        encabezado.setTotales(totales);
        encabezado.setTransporte(transporte);

        if (!tablaFormasPago.getFormaDePago().isEmpty()) {
            idDoc.setTablaFormasPago(tablaFormasPago);
        }

        encabezado.setVersion(new BigDecimal("1.0"));
        ecf.setEncabezado(encabezado);

        if (!itemMap.isEmpty()) {
            ECF.DetallesItems detallesItems = new ECF.DetallesItems();
            detallesItems.getItem().addAll(itemMap.values());
            ecf.setDetallesItems(detallesItems);
        }

        // Establecer FechaHoraFirma
        String fechaHoraFirma = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        ecf.setFechaHoraFirma(fechaHoraFirma);

        return ecf;// Establecer FechaHoraFirma

    }

}
