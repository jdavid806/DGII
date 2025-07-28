package com.medicalsoft.infrastructure.dgii.mapper;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.medicalsoft.DGII.domain.interfaces.ExcelToEcfMapper;
import com.medicalsoft.DGII.shared.utils.ExcelUtils;
import com.medicalsoft.infrastructure.dgii.generated.ecf33.ECF;

public class EcfXmlMapper33 implements ExcelToEcfMapper<ECF> {

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
        ECF.InformacionReferencia informacionReferencia = new ECF.InformacionReferencia();
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
                Map.entry("TablaTelefonoEmisor", emisor),
                Map.entry("CorreoEmisor", emisor),
                Map.entry("WebSite", emisor),
                Map.entry("ActividadEconomica", emisor),
                Map.entry("CodigoVendedor", emisor),
                Map.entry("NumeroFacturaInterna", emisor),
                Map.entry("NumeroPedidoInterno", emisor),
                Map.entry("ZonaVenta", emisor),
                Map.entry("RutaVenta", emisor),
                Map.entry("InformacionAdicionalEmisor", emisor),
                Map.entry("FechaEmision", emisor),

                // Comprador
                Map.entry("RNCComprador", comprador),
                Map.entry("IdentificadorExtranjero", comprador),
                Map.entry("RazonSocialComprador", comprador),
                Map.entry("ContactoComprador", comprador),
                Map.entry("CorreoComprador", comprador),
                Map.entry("DireccionComprador", comprador),
                Map.entry("MunicipioComprador", comprador),
                Map.entry("ProvinciaComprador", comprador),
                Map.entry("FechaEntrega", comprador),
                Map.entry("ContactoEntrega", comprador),
                Map.entry("DireccionEntrega", comprador),
                Map.entry("TelefonoAdicional", comprador),
                Map.entry("FechaOrdenCompra", comprador),
                Map.entry("NumeroOrdenCompra", comprador),
                Map.entry("CodigoInternoComprador", comprador),
                Map.entry("ResponsablePago", comprador),
                Map.entry("InformacionAdicionalComprador", comprador),

                // IdDoc
                Map.entry("TipoeCF", idDoc),
                Map.entry("ENCF", idDoc),
                Map.entry("IndicadorEnvioDiferido", idDoc),
                Map.entry("IndicadorMontoGravado", idDoc),
                Map.entry("IndicadorServicioTodoIncluido", idDoc),
                Map.entry("TipoIngresos", idDoc),
                Map.entry("TipoPago", idDoc),
                Map.entry("FechaLimitePago", idDoc),
                Map.entry("TerminoPago", idDoc),
                Map.entry("TipoCuentaPago", idDoc),
                Map.entry("NumeroCuentaPago", idDoc),
                Map.entry("BancoPago", idDoc),
                Map.entry("FechaDesde", idDoc),
                Map.entry("FechaHasta", idDoc),
                Map.entry("TotalPaginas", idDoc),

                // Totales
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
                Map.entry("MontoTotal", totales),
                Map.entry("MontoNoFacturable", totales),
                Map.entry("MontoPeriodo", totales),
                Map.entry("SaldoAnterior", totales),
                Map.entry("MontoAvancePago", totales),
                Map.entry("ValorPagar", totales),

                Map.entry("NCFModificado", informacionReferencia),
                Map.entry("RNCOtroContribuyente", informacionReferencia),
                Map.entry("FechaNCFModificado", informacionReferencia),
                Map.entry("CodigoModificacion", informacionReferencia),
                Map.entry("RazonModificacion", informacionReferencia),

                // Transporte
                Map.entry("Conductor", transporte),
                Map.entry("DocumentoTransporte", transporte),
                Map.entry("Ficha", transporte),
                Map.entry("Placa", transporte),
                Map.entry("RutaTransporte", transporte),
                Map.entry("ZonaTransporte", transporte),
                Map.entry("NumeroAlbaran", transporte)
        ));

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
                        if (!cellValue.trim().isEmpty()) {
                            if (emisor.getTablaTelefonoEmisor() == null)
                                emisor.setTablaTelefonoEmisor(new ECF.Encabezado.Emisor.TablaTelefonoEmisor());
                            emisor.getTablaTelefonoEmisor().getTelefonoEmisor().add(cellValue.trim());
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

            // Formas de Pago
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

            // Detalles Items
            if (columnName.matches(".*\\[\\d+].*")) {
                int itemIndex = ExcelUtils.extractIndex(columnName);
                if (cellValue.equalsIgnoreCase("#e") || cellValue.isEmpty())
                    continue;

                ECF.DetallesItems.Item item = itemMap.computeIfAbsent(itemIndex, k -> new ECF.DetallesItems.Item());
                String cleanField = columnName.replaceAll("\\[\\d+]", "");

                try {
                    Method setter = ExcelUtils.findSetter(item.getClass(), cleanField);
                    if (setter != null) {
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(item, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error en Item[" + itemIndex + "]: " + columnName + " - " + e.getMessage());
                }
                continue;
            }
        }

        // Ensamblar estructura final en orden correcto
        encabezado.setEmisor(emisor);
        encabezado.setComprador(comprador);
        encabezado.setIdDoc(idDoc);
        encabezado.setTotales(totales);
        // encabezado.setTransporte(transporte);

        ecf.setInformacionReferencia(informacionReferencia);


        if (!tablaFormasPago.getFormaDePago().isEmpty()) {
            idDoc.setTablaFormasPago(tablaFormasPago);
        }

        encabezado.setVersion(new BigDecimal("1.0"));
        ecf.setEncabezado(encabezado);

        // Limpieza de ítems inválidos
        itemMap.values().removeIf(item ->
            (item.getNumeroLinea() == 0) &&
            (item.getNombreItem() == null || item.getNombreItem().isBlank()) &&
            (item.getMontoItem() == null || item.getMontoItem().compareTo(BigDecimal.ZERO) == 0)
        );

        if (!itemMap.isEmpty()) {
            ECF.DetallesItems detallesItems = new ECF.DetallesItems();
            detallesItems.getItem().addAll(itemMap.values());
            ecf.setDetallesItems(detallesItems);
        }

        // Establecer FechaHoraFirma (después de todo)
        String fechaHoraFirma = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        ecf.setFechaHoraFirma(fechaHoraFirma);

        return ecf;
    }
}
