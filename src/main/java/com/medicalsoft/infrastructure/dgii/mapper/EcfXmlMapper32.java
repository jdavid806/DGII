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
import com.medicalsoft.infrastructure.dgii.generated.ecf32.ECF;

public class EcfXmlMapper32 implements ExcelToEcfMapper<ECF> {
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
        ECF.Encabezado.InformacionesAdicionales informacionesAdicionales = new ECF.Encabezado.InformacionesAdicionales();
        ECF.Encabezado.OtraMoneda otraMoneda = new ECF.Encabezado.OtraMoneda();
        ECF.Paginacion.Pagina pagina = new ECF.Paginacion.Pagina();
        ECF.Subtotales.Subtotal subtotal = new ECF.Subtotales.Subtotal();
        ECF.Encabezado.Totales.ImpuestosAdicionales.ImpuestoAdicional impuestoAdicional = new ECF.Encabezado.Totales.ImpuestosAdicionales.ImpuestoAdicional();
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

                // Documento
                Map.entry("TipoeCF", idDoc),
                Map.entry("ENCF", idDoc),
                Map.entry("IndicadorEnvioDiferido", idDoc),
                Map.entry("IndicadorMontoGravado", idDoc),
                Map.entry("IndicadorServicioTodoIncluido", idDoc),
                Map.entry("TipoIngresos", idDoc),
                Map.entry("TipoPago", idDoc),
                Map.entry("FechaLimitePago", idDoc),
                Map.entry("TerminoPago", idDoc),
                Map.entry("TablaFormasPago", idDoc),
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
                Map.entry("ImpuestosAdicionales", totales),
                Map.entry("MontoTotal", totales),
                Map.entry("MontoNoFacturable", totales),
                Map.entry("MontoPeriodo", totales),
                Map.entry("SaldoAnterior", totales),
                Map.entry("MontoAvancePago", totales),
                Map.entry("ValorPagar", totales),

                Map.entry("FechaEmbarque", informacionesAdicionales),
                Map.entry("NumeroEmbarque", informacionesAdicionales),
                Map.entry("NumeroContenedor", informacionesAdicionales),
                Map.entry("NumeroReferencia", informacionesAdicionales),
                Map.entry("PesoBruto", informacionesAdicionales),
                Map.entry("PesoNeto", informacionesAdicionales),
                Map.entry("UnidadPesoBruto", informacionesAdicionales),
                Map.entry("UnidadPesoNeto", informacionesAdicionales),
                Map.entry("CantidadBulto", informacionesAdicionales),
                Map.entry("UnidadBulto", informacionesAdicionales),
                Map.entry("VolumenBulto", informacionesAdicionales),
                Map.entry("UnidadVolumen", informacionesAdicionales),

                Map.entry("TipoMoneda", otraMoneda),
                Map.entry("TipoCambio", otraMoneda),
                Map.entry("MontoGravadoTotalOtraMoneda", otraMoneda),
                Map.entry("MontoGravado1OtraMoneda", otraMoneda),
                Map.entry("MontoGravado2OtraMoneda", otraMoneda),
                Map.entry("MontoGravado3OtraMoneda", otraMoneda),
                Map.entry("MontoExentoOtraMoneda", otraMoneda),
                Map.entry("TotalITBISOtraMoneda", otraMoneda),
                Map.entry("TotalITBIS1OtraMoneda", otraMoneda),
                Map.entry("TotalITBIS2OtraMoneda", otraMoneda),
                Map.entry("TotalITBIS3OtraMoneda", otraMoneda),
                Map.entry("MontoImpuestoAdicionalOtraMoneda", otraMoneda),
                Map.entry("ImpuestosAdicionalesOtraMoneda", otraMoneda),
                Map.entry("MontoTotalOtraMoneda", otraMoneda),

                Map.entry("TipoImpuesto", impuestoAdicional),
                Map.entry("TasaImpuestoAdicional", impuestoAdicional),
                Map.entry("MontoImpuestoSelectivoConsumoEspecifico", impuestoAdicional),
                Map.entry("MontoImpuestoSelectivoConsumoAdvalorem", impuestoAdicional),
                Map.entry("OtrosImpuestosAdicionales", impuestoAdicional),

                Map.entry("PaginaNo", pagina),
                Map.entry("NoLineaDesde", pagina),
                Map.entry("NoLineaHasta", pagina),
                Map.entry("SubtotalMontoGravadoPagina", pagina),
                Map.entry("SubtotalMontoGravado1Pagina", pagina),
                Map.entry("SubtotalMontoGravado2Pagina", pagina),
                Map.entry("SubtotalMontoGravado3Pagina", pagina),
                Map.entry("SubtotalExentoPagina", pagina),
                Map.entry("SubtotalItbisPagina", pagina),
                Map.entry("SubtotalItbis1Pagina", pagina),
                Map.entry("SubtotalItbis2Pagina", pagina),
                Map.entry("SubtotalItbis3Pagina", pagina),
                Map.entry("SubtotalImpuestoAdicionalPagina", pagina),
                Map.entry("SubtotalImpuestoAdicional", pagina),
                Map.entry("MontoSubtotalPagina", pagina),
                Map.entry("SubtotalMontoNoFacturablePagina", pagina),

                Map.entry("NumeroSubTotal", subtotal),
                Map.entry("DescripcionSubtotal", subtotal),
                Map.entry("Orden", subtotal),
                Map.entry("SubTotalMontoGravadoTotal", subtotal),
                Map.entry("SubTotalMontoGravadoI1", subtotal),
                Map.entry("SubTotalMontoGravadoI2", subtotal),
                Map.entry("SubTotalMontoGravadoI3", subtotal),
                Map.entry("SubTotaITBIS", subtotal),
                Map.entry("SubTotaITBIS1", subtotal),
                Map.entry("SubTotaITBIS2", subtotal),
                Map.entry("SubTotaITBIS3", subtotal),
                Map.entry("SubTotalImpuestoAdicional", subtotal),
                Map.entry("SubTotalExento", subtotal),
                Map.entry("MontoSubTotal", subtotal),
                Map.entry("Lineas", subtotal),
                // Transporte
                Map.entry("Conductor", transporte),
                Map.entry("DocumentoTransporte", transporte),
                Map.entry("Ficha", transporte),
                Map.entry("Placa", transporte),
                Map.entry("RutaTransporte", transporte),
                Map.entry("ZonaTransporte", transporte),
                Map.entry("NumeroAlbaran", transporte)));

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

                // try {
                // if (cleanField.equals("IndicadorAgenteRetencionoPercepcion")
                // || cleanField.equals("MontoISRRetenido")) {
                // if (item.getRetencion() == null) {
                // item.setRetencion(new ECF.DetallesItems.Item.Retencion());
                // }
                // Method setter = ExcelUtils.findSetter(item.getRetencion().getClass(),
                // cleanField);
                // Object parsed = ExcelUtils.parseValue(cellValue,
                // setter.getParameterTypes()[0]);
                // setter.invoke(item.getRetencion(), parsed);
                // } else {
                // Method setter = ExcelUtils.findSetter(item.getClass(), cleanField);
                // Object parsed = ExcelUtils.parseValue(cellValue,
                // setter.getParameterTypes()[0]);
                // setter.invoke(item, parsed);
                // }
                // } catch (Exception e) {
                // System.err.println("Error en Item[" + itemIndex + "]: " + columnName + " - "
                // + e.getMessage());
                // }
                
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
