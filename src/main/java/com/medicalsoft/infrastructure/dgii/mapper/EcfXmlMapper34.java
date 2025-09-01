package com.medicalsoft.infrastructure.dgii.mapper;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.medicalsoft.DGII.application.ports.input.ExcelToEcfMapper;
import com.medicalsoft.DGII.shared.utils.ExcelUtils;
import com.medicalsoft.infrastructure.dgii.generated.ecf34.ECF;

public class EcfXmlMapper34 implements ExcelToEcfMapper<ECF> {

    private boolean isEmpty(Object obj) {
        if (obj == null) return true;
        
        if (obj instanceof ECF.Encabezado.Transporte) {
            ECF.Encabezado.Transporte transporte = (ECF.Encabezado.Transporte) obj;
            return transporte.getConductor() == null && 
                   transporte.getDocumentoTransporte() == null &&
                   transporte.getFicha() == null &&
                   transporte.getPlaca() == null &&
                   transporte.getRutaTransporte() == null &&
                   transporte.getZonaTransporte() == null &&
                   transporte.getNumeroAlbaran() == null;
        }
        
        if (obj instanceof ECF.Encabezado.InformacionesAdicionales) {
            ECF.Encabezado.InformacionesAdicionales info = (ECF.Encabezado.InformacionesAdicionales) obj;
            return info.getFechaEmbarque() == null &&
                   info.getNumeroEmbarque() == null &&
                   info.getNumeroContenedor() == null &&
                   info.getNumeroReferencia() == null &&
                   info.getPesoBruto() == null &&
                   info.getPesoNeto() == null &&
                   info.getUnidadPesoBruto() == null &&
                   info.getUnidadPesoNeto() == null &&
                   info.getCantidadBulto() == null &&
                   info.getUnidadBulto() == null &&
                   info.getVolumenBulto() == null &&
                   info.getUnidadVolumen() == null;
        }
        
        if (obj instanceof ECF.Paginacion.Pagina) {
            ECF.Paginacion.Pagina pagina = (ECF.Paginacion.Pagina) obj;
            return pagina.getPaginaNo() == null &&
                   pagina.getNoLineaDesde() == null &&
                   pagina.getNoLineaHasta() == null &&
                   pagina.getSubtotalMontoGravadoPagina() == null &&
                   pagina.getSubtotalMontoGravado1Pagina() == null &&
                   pagina.getSubtotalMontoGravado2Pagina() == null &&
                   pagina.getSubtotalMontoGravado3Pagina() == null &&
                   pagina.getSubtotalExentoPagina() == null &&
                   pagina.getSubtotalItbisPagina() == null &&
                   pagina.getSubtotalItbis1Pagina() == null &&
                   pagina.getSubtotalItbis2Pagina() == null &&
                   pagina.getSubtotalItbis3Pagina() == null &&
                   pagina.getSubtotalImpuestoAdicionalPagina() == null &&
                   pagina.getMontoSubtotalPagina() == null &&
                   pagina.getSubtotalMontoNoFacturablePagina() == null;
        }
        
        if (obj instanceof ECF.Encabezado.OtraMoneda) {
            ECF.Encabezado.OtraMoneda otraMoneda = (ECF.Encabezado.OtraMoneda) obj;
            return otraMoneda.getTipoMoneda() == null &&
                   otraMoneda.getTipoCambio() == null &&
                   otraMoneda.getMontoGravadoTotalOtraMoneda() == null &&
                   otraMoneda.getMontoGravado1OtraMoneda() == null &&
                   otraMoneda.getMontoGravado2OtraMoneda() == null &&
                   otraMoneda.getMontoGravado3OtraMoneda() == null &&
                   otraMoneda.getMontoExentoOtraMoneda() == null &&
                   otraMoneda.getTotalITBISOtraMoneda() == null &&
                   otraMoneda.getTotalITBIS1OtraMoneda() == null &&
                   otraMoneda.getTotalITBIS2OtraMoneda() == null &&
                   otraMoneda.getTotalITBIS3OtraMoneda() == null &&
                   otraMoneda.getMontoImpuestoAdicionalOtraMoneda() == null &&
                   otraMoneda.getMontoTotalOtraMoneda() == null;
        }
        
        return false;
    }

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
        
        // Objetos opcionales - se crearán solo si son necesarios
        ECF.Encabezado.Transporte transporte = null;
        ECF.Encabezado.InformacionesAdicionales informacionesAdicionales = null;
        ECF.Encabezado.OtraMoneda otraMoneda = null;
        ECF.Paginacion.Pagina pagina = null;
        // ECF.Subtotales.Subtotal subtotal = null;
        // ECF.Encabezado.Totales.ImpuestosAdicionales.ImpuestoAdicional impuestoAdicional = null;
        
        ECF.InformacionReferencia informacionReferencia = new ECF.InformacionReferencia();
        Map<Integer, ECF.DetallesItems.Item> itemMap = new TreeMap<>();
        Map<Integer, ECF.DescuentosORecargos.DescuentoORecargo> descuentoMap = new TreeMap<>();

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
                Map.entry("IndicadorNotaCredito", idDoc),

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

                // Información de referencia
                Map.entry("NCFModificado", informacionReferencia),
                Map.entry("RNCOtroContribuyente", informacionReferencia),
                Map.entry("FechaNCFModificado", informacionReferencia),
                Map.entry("CodigoModificacion", informacionReferencia),
                Map.entry("RazonModificacion", informacionReferencia)));

        for (int i = 0; i < headerRow.getPhysicalNumberOfCells(); i++) {
            String columnName = headerRow.getCell(i).getStringCellValue().trim();
            String cellValue = ExcelUtils.getCellString(dataRow.getCell(i));
            String normalizedColumnName = columnName.replaceAll("\\[\\d+]", "").trim();

            if (cellValue.equalsIgnoreCase("#e") || cellValue.isEmpty())
                continue;

            // Manejo de campos de transporte
            if (columnName.startsWith("Conductor") || columnName.startsWith("DocumentoTransporte") || 
                columnName.startsWith("Ficha") || columnName.startsWith("Placa") || 
                columnName.startsWith("RutaTransporte") || columnName.startsWith("ZonaTransporte") || 
                columnName.startsWith("NumeroAlbaran")) {
                
                if (transporte == null) {
                    transporte = new ECF.Encabezado.Transporte();
                }
                
                try {
                    Method setter = ExcelUtils.findSetter(transporte.getClass(), normalizedColumnName);
                    if (setter != null) {
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(transporte, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error en campo de transporte: " + normalizedColumnName + " - " + e.getMessage());
                }
                continue;
            }

            // Manejo de campos de informaciones adicionales
            if (columnName.startsWith("FechaEmbarque") || columnName.startsWith("NumeroEmbarque") || 
                columnName.startsWith("NumeroContenedor") || columnName.startsWith("NumeroReferencia") || 
                columnName.startsWith("PesoBruto") || columnName.startsWith("PesoNeto") || 
                columnName.startsWith("UnidadPesoBruto") || columnName.startsWith("UnidadPesoNeto") || 
                columnName.startsWith("CantidadBulto") || columnName.startsWith("UnidadBulto") || 
                columnName.startsWith("VolumenBulto") || columnName.startsWith("UnidadVolumen")) {
                
                if (informacionesAdicionales == null) {
                    informacionesAdicionales = new ECF.Encabezado.InformacionesAdicionales();
                }
                
                try {
                    Method setter = ExcelUtils.findSetter(informacionesAdicionales.getClass(), normalizedColumnName);
                    if (setter != null) {
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(informacionesAdicionales, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error en campo de informaciones adicionales: " + normalizedColumnName + " - " + e.getMessage());
                }
                continue;
            }

            // Manejo de campos de paginación
            if (columnName.startsWith("PaginaNo") || columnName.startsWith("NoLineaDesde") || 
                columnName.startsWith("NoLineaHasta") || columnName.startsWith("SubtotalMontoGravadoPagina") || 
                columnName.startsWith("SubtotalMontoGravado1Pagina") || columnName.startsWith("SubtotalMontoGravado2Pagina") || 
                columnName.startsWith("SubtotalMontoGravado3Pagina") || columnName.startsWith("SubtotalExentoPagina") || 
                columnName.startsWith("SubtotalItbisPagina") || columnName.startsWith("SubtotalItbis1Pagina") || 
                columnName.startsWith("SubtotalItbis2Pagina") || columnName.startsWith("SubtotalItbis3Pagina") || 
                columnName.startsWith("SubtotalImpuestoAdicionalPagina") || columnName.startsWith("MontoSubtotalPagina") || 
                columnName.startsWith("SubtotalMontoNoFacturablePagina")) {
                
                if (pagina == null) {
                    pagina = new ECF.Paginacion.Pagina();
                }
                
                try {
                    Method setter = ExcelUtils.findSetter(pagina.getClass(), normalizedColumnName);
                    if (setter != null) {
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(pagina, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error en campo de paginación: " + normalizedColumnName + " - " + e.getMessage());
                }
                continue;
            }

            // Manejo de campos de otra moneda
            if (columnName.startsWith("TipoMoneda") || columnName.startsWith("TipoCambio") || 
                columnName.startsWith("MontoGravadoTotalOtraMoneda") || columnName.startsWith("MontoGravado1OtraMoneda") || 
                columnName.startsWith("MontoGravado2OtraMoneda") || columnName.startsWith("MontoGravado3OtraMoneda") || 
                columnName.startsWith("MontoExentoOtraMoneda") || columnName.startsWith("TotalITBISOtraMoneda") || 
                columnName.startsWith("TotalITBIS1OtraMoneda") || columnName.startsWith("TotalITBIS2OtraMoneda") || 
                columnName.startsWith("TotalITBIS3OtraMoneda") || columnName.startsWith("MontoImpuestoAdicionalOtraMoneda") || 
                columnName.startsWith("MontoTotalOtraMoneda")) {
                
                if (otraMoneda == null) {
                    otraMoneda = new ECF.Encabezado.OtraMoneda();
                }
                
                try {
                    Method setter = ExcelUtils.findSetter(otraMoneda.getClass(), normalizedColumnName);
                    if (setter != null) {
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(otraMoneda, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error en campo de otra moneda: " + normalizedColumnName + " - " + e.getMessage());
                }
                continue;
            }

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

            if (columnName.matches("CodigoItem(\\[\\d+]){2}")) {
                int itemIndex = ExcelUtils.extractIndex(columnName);
                int subIndex = ExcelUtils.extractSubIndex(columnName);

                if (itemIndex < 0) {
                    System.err.println("Índice inválido en: " + columnName);
                    return ecf;
                }

                if (subIndex < 0) subIndex = 0;

                ECF.DetallesItems.Item item = itemMap.computeIfAbsent(itemIndex, k -> {
                    ECF.DetallesItems.Item newItem = new ECF.DetallesItems.Item();
                    newItem.setNumeroLinea(k);
                    return newItem;
                });

                ECF.DetallesItems.Item.TablaCodigosItem tabla = item.getTablaCodigosItem();
                if (tabla == null) {
                    tabla = new ECF.DetallesItems.Item.TablaCodigosItem();
                    item.setTablaCodigosItem(tabla);
                }

                List<ECF.DetallesItems.Item.TablaCodigosItem.CodigosItem> codigosList = tabla.getCodigosItem();
                while (codigosList.size() <= subIndex) {
                    codigosList.add(new ECF.DetallesItems.Item.TablaCodigosItem.CodigosItem());
                }

                String field = columnName.replaceAll(".*\\.", "");
                ECF.DetallesItems.Item.TablaCodigosItem.CodigosItem codigo = codigosList.get(subIndex);

                try {
                    Method setter = ExcelUtils.findSetter(codigo.getClass(), field);
                    if (setter != null) {
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(codigo, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error en CodigosItem[" + itemIndex + "][" + subIndex + "]: " + field + " - "
                            + e.getMessage());
                }
            } else if (columnName.matches("Item\\[\\d+\\]\\..+")) {
                int itemIndex = ExcelUtils.extractIndex(columnName);
                String cleanField = columnName.replaceAll(".*\\]\\.", "");

                ECF.DetallesItems.Item item = itemMap.computeIfAbsent(itemIndex, k -> {
                    ECF.DetallesItems.Item newItem = new ECF.DetallesItems.Item();
                    newItem.setNumeroLinea(k + 1);
                    return newItem;
                });

                try {
                    if (cleanField.equals("IndicadorAgenteRetencionoPercepcion")
                            || cleanField.equals("MontoISRRetenido")) {
                        if (item.getRetencion() == null) {
                            item.setRetencion(new ECF.DetallesItems.Item.Retencion());
                        }
                        Method setter = ExcelUtils.findSetter(item.getRetencion().getClass(), cleanField);
                        if (setter != null) {
                            Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                            setter.invoke(item.getRetencion(), parsed);
                        }
                    } else {
                        Method setter = ExcelUtils.findSetter(item.getClass(), cleanField);
                        if (setter != null) {
                            Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                            setter.invoke(item, parsed);
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Error en Item[" + itemIndex + "]: " + cleanField + " - " + e.getMessage());
                }
            } else if (columnName.matches("^[A-Za-z]+Item\\[\\d+\\]$")) {
                String field = columnName.replaceAll("\\[\\d+\\]", "");
                int itemIndex = ExcelUtils.extractIndex(columnName);

                ECF.DetallesItems.Item item = itemMap.computeIfAbsent(itemIndex, k -> {
                    ECF.DetallesItems.Item newItem = new ECF.DetallesItems.Item();
                    newItem.setNumeroLinea(k + 1);
                    return newItem;
                });

                try {
                    Method setter = ExcelUtils.findSetter(item.getClass(), field);
                    if (setter != null) {
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(item, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error asignando campo simple del item [" + itemIndex + "]: " + field + " - "
                            + e.getMessage());
                }
            } else if (columnName.matches("^(IndicadorFacturacion|IndicadorBienoServicio)\\[\\d+\\]$")) {
                int itemIndex = ExcelUtils.extractIndex(columnName);
                String field = columnName.replaceAll("\\[\\d+\\]", "");

                ECF.DetallesItems.Item item = itemMap.computeIfAbsent(itemIndex, k -> {
                    ECF.DetallesItems.Item newItem = new ECF.DetallesItems.Item();
                    newItem.setNumeroLinea(k + 1);
                    return newItem;
                });

                try {
                    Method setter = ExcelUtils.findSetter(item.getClass(), field);
                    if (setter != null) {
                        Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                        setter.invoke(item, parsed);
                    }
                } catch (Exception e) {
                    System.err.println("Error en Item[" + itemIndex + "]: " + field + " - " + e.getMessage());
                }
            }
            else if (columnName.matches("NumeroLinea\\[\\d+]")) {
                int itemIndex = ExcelUtils.extractIndex(columnName);
                if (itemIndex < 0) {
                    System.err.println("Índice inválido en: " + columnName);
                    return ecf;
                }

                ECF.DetallesItems.Item item = itemMap.computeIfAbsent(itemIndex, k -> {
                    ECF.DetallesItems.Item newItem = new ECF.DetallesItems.Item();
                    return newItem;
                });

                try {
                    Object parsed = ExcelUtils.parseValue(cellValue, Integer.class);
                    item.setNumeroLinea((Integer) parsed);
                } catch (Exception e) {
                    System.err.println("Error seteando NumeroLinea[" + itemIndex + "]: " + e.getMessage());
                }
            }
        }

        // Configuración final del ECF
        encabezado.setEmisor(emisor);
        encabezado.setComprador(comprador);
        encabezado.setIdDoc(idDoc);
        encabezado.setTotales(totales);
        
        // Solo agregar transporte si tiene datos
        if (transporte != null && !isEmpty(transporte)) {
            encabezado.setTransporte(transporte);
        }
        
        // Solo agregar informaciones adicionales si tiene datos
        if (informacionesAdicionales != null && !isEmpty(informacionesAdicionales)) {
            encabezado.setInformacionesAdicionales(informacionesAdicionales);
        }
        
        // Solo agregar otra moneda si tiene datos
        if (otraMoneda != null && !isEmpty(otraMoneda)) {
            encabezado.setOtraMoneda(otraMoneda);
        }
        
        encabezado.setVersion(new BigDecimal("1.0"));
        ecf.setEncabezado(encabezado);

        // Configura DetallesItems solo si hay items
        if (!itemMap.isEmpty()) {
            ECF.DetallesItems detallesItems = new ECF.DetallesItems();
            detallesItems.getItem().addAll(itemMap.values());
            ecf.setDetallesItems(detallesItems);
        }

        // Configura DescuentosORecargos solo si hay descuentos
        if (!descuentoMap.isEmpty()) {
            ECF.DescuentosORecargos dor = new ECF.DescuentosORecargos();
            dor.getDescuentoORecargo().addAll(descuentoMap.values());
            ecf.setDescuentosORecargos(dor);
        }

        // Configura Paginación solo si la página tiene datos
        if (pagina != null && !isEmpty(pagina)) {
            ECF.Paginacion paginacion = new ECF.Paginacion();
            paginacion.getPagina().add(pagina);
            ecf.setPaginacion(paginacion);
        }

        // Configura Subtotales solo si hay subtotales
        // if (subtotal != null && !isEmpty(subtotal)) {
        //     ECF.Subtotales subtotales = new ECF.Subtotales();
        //     subtotales.getSubtotal().add(subtotal);
        //     ecf.setSubtotales(subtotales);
        // };

        ecf.setInformacionReferencia(informacionReferencia);
        ecf.setFechaHoraFirma(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        return ecf;
    }
}