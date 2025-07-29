package com.medicalsoft.infrastructure.builder;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Sheet;

import com.medicalsoft.DGII.model.FieldHandler;
import com.medicalsoft.DGII.shared.utils.ExcelUtils;
import com.medicalsoft.infrastructure.adapters.AbstractEcfBuilder;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Encabezado.Comprador;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Encabezado.Emisor;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Encabezado.IdDoc;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Encabezado.InformacionesAdicionales;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Encabezado.OtraMoneda;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Encabezado.Totales;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Encabezado.Totales.ImpuestosAdicionales.ImpuestoAdicional;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Encabezado.Transporte;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Paginacion.Pagina;
import com.medicalsoft.infrastructure.dgii.generated.ecf31.ECF.Subtotales.Subtotal;

public class Ecf31Builder extends AbstractEcfBuilder<ECF> {

    private final ECF ecf;
    private final ECF.Encabezado encabezado;

    // Subcomponentes del encabezado
    private final ECF.Encabezado.Emisor emisor;
    private final ECF.Encabezado.Comprador comprador;
    private final ECF.Encabezado.IdDoc idDoc;
    private final ECF.Encabezado.Totales totales;
    private final ECF.Encabezado.InformacionesAdicionales informacionesAdicionales;
    private final ECF.Encabezado.OtraMoneda otraMoneda;
    private final ECF.Encabezado.Totales.ImpuestosAdicionales.ImpuestoAdicional impuestoAdicional;
    private final ECF.Paginacion.Pagina pagina;
    private final ECF.Subtotales.Subtotal subtotal;
    private final ECF.Encabezado.Transporte transporte;

    public Ecf31Builder(Sheet sheet) {
        super(Objects.requireNonNull(sheet, "Sheet no puede ser nulo"));

        this.ecf = new ECF();
        this.encabezado = new ECF.Encabezado();

        // Inicialización de componentes
        this.emisor = new ECF.Encabezado.Emisor();
        this.comprador = new ECF.Encabezado.Comprador();
        this.idDoc = new ECF.Encabezado.IdDoc();
        this.totales = new ECF.Encabezado.Totales();
        this.informacionesAdicionales = new ECF.Encabezado.InformacionesAdicionales();
        this.otraMoneda = new ECF.Encabezado.OtraMoneda();
        this.impuestoAdicional = new ECF.Encabezado.Totales.ImpuestosAdicionales.ImpuestoAdicional();
        this.pagina = new ECF.Paginacion.Pagina();
        this.subtotal = new ECF.Subtotales.Subtotal();
        this.transporte = new ECF.Encabezado.Transporte();

        initializeHandlers();
    }

    @Override
    protected void registerFieldHandlers() {
        addFieldHandler("simpleFields", new SimpleFieldsHandler(
            emisor, comprador, idDoc, totales,
            informacionesAdicionales, otraMoneda,
            impuestoAdicional, pagina, subtotal, transporte
        ));
        // Puedes registrar más handlers si necesitas
    }

    @Override
    protected ECF getContext() {
        return ecf;
    }

    @Override
    protected ECF postProcess() throws Exception {
        encabezado.setVersion(new BigDecimal("1.0"));
        encabezado.setIdDoc(idDoc);
        encabezado.setEmisor(emisor);
        encabezado.setComprador(comprador);
        encabezado.setTotales(totales);
        encabezado.setInformacionesAdicionales(informacionesAdicionales);
        encabezado.setOtraMoneda(otraMoneda);
        // encabezado.setImpuestoAdicional(impuestoAdicional);
        // encabezado.setPagina(pagina);
        // encabezado.setSubTotal(subtotal);
        encabezado.setTransporte(transporte);

        ecf.setEncabezado(encabezado);
        ecf.setFechaHoraFirma(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        return ecf;
    }

    @Override
    protected void handleUnmappedField(String columnName) {
        System.err.println("Campo no mapeado: " + columnName);
    }

    private class SimpleFieldsHandler implements FieldHandler<ECF> {

        private final Map<String, Object> fieldTargetMap;

        public SimpleFieldsHandler(Emisor emisor, Comprador comprador, IdDoc idDoc, Totales totales,
        InformacionesAdicionales informacionesAdicionales, OtraMoneda otraMoneda,
        ImpuestoAdicional impuestoAdicional, Pagina pagina, Subtotal subtotal, Transporte transporte)
         {
            this.fieldTargetMap = Map.ofEntries(
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
                Map.entry("FechaVencimientoSecuencia", idDoc),

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

                // Informaciones Adicionales
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

                // Otra moneda
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

                // Impuesto adicional
                Map.entry("TipoImpuesto", impuestoAdicional),
                Map.entry("TasaImpuestoAdicional", impuestoAdicional),
                Map.entry("MontoImpuestoSelectivoConsumoEspecifico", impuestoAdicional),
                Map.entry("MontoImpuestoSelectivoConsumoAdvalorem", impuestoAdicional),
                Map.entry("OtrosImpuestosAdicionales", impuestoAdicional),

                // Página
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

                // Subtotal
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
                Map.entry("NumeroAlbaran", transporte)
            );
        }



        @Override
        public boolean canHandle(String columnName) {
            String normalized = normalizeColumnName(columnName);
            return fieldTargetMap.containsKey(normalized) && isSimpleField(columnName);
        }

        @Override
        public void handle(String columnName, String cellValue, ECF context) throws Exception {
            String normalized = normalizeColumnName(columnName);
            Object target = fieldTargetMap.get(normalized);
            Method setter = ExcelUtils.findSetter(target.getClass(), normalized);
            if (setter != null) {
                Object parsed = ExcelUtils.parseValue(cellValue, setter.getParameterTypes()[0]);
                if (parsed != null) {
                    setter.invoke(target, parsed);
                }
            }
        }

        private boolean isSimpleField(String columnName) {
            return !columnName.matches(".*\\[\\d+\\].*");
        }
    }

    private String normalizeColumnName(String columnName) {
        return columnName.replaceAll("\\[\\d+\\]", "").trim();
    }
}
