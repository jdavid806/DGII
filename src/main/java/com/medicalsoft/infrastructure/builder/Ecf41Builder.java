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
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF;
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF.Encabezado;
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF.Encabezado.Comprador;
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF.Encabezado.Emisor;
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF.Encabezado.IdDoc;
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF.Encabezado.OtraMoneda;
import com.medicalsoft.infrastructure.dgii.generated.ecf41.ECF.Encabezado.Totales;
import com.medicalsoft.infrastructure.dgii.hanlder.ecf41.DetallesItemHandler41;
import com.medicalsoft.infrastructure.dgii.hanlder.ecf41.FormaPagoHandler41;
import com.medicalsoft.infrastructure.dgii.hanlder.ecf41.TelefonoEmisorHandler41;

public class Ecf41Builder extends AbstractEcfBuilder<ECF> {

    private final ECF ecf;
    private final Encabezado encabezado;
    private final Emisor emisor;
    private final Comprador comprador;
    private final IdDoc idDoc;
    private final Totales totales;
    private final OtraMoneda otraMoneda;
    private final FormaPagoHandler41 formaPagoHandler;

    public Ecf41Builder(Sheet sheet) {

        super(Objects.requireNonNull(sheet, "Sheet no puede ser nulo"));

        // Inicialización de componentes principales
        this.ecf = new ECF();
        this.encabezado = new Encabezado();
        this.emisor = new Emisor();
        this.comprador = new Comprador();
        this.idDoc = new IdDoc();
        this.totales = new Totales();
        this.otraMoneda = new OtraMoneda();
        this.formaPagoHandler = new FormaPagoHandler41(idDoc);

        initializeHandlers();
    }

    @Override
    protected void registerFieldHandlers() {
        // Handler para campos simples
        addFieldHandler("simpleFields", new SimpleFieldsHandler(
                emisor, comprador, idDoc, totales, otraMoneda));

        addFieldHandler("telefonosEmisor", new TelefonoEmisorHandler41(emisor));
        addFieldHandler("formasPago", new FormaPagoHandler41(idDoc));
        addFieldHandler("detallesItem", new DetallesItemHandler41(ecf));
    }

    @Override
    protected ECF getContext() {
        return ecf;
    }

    @Override
    protected ECF postProcess() throws Exception {

        // Establecer la estructura jerárquica en el orden correcto
        encabezado.setVersion(new BigDecimal("1.0"));
        encabezado.setEmisor(emisor);
        encabezado.setComprador(comprador);
        encabezado.setIdDoc(idDoc);
        encabezado.setTotales(totales);

        if (tieneDatos(otraMoneda)) {
            encabezado.setOtraMoneda(otraMoneda);
        }

        // Filtrar ítems vacíos antes de generar el XML
        if (ecf.getDetallesItems() != null && ecf.getDetallesItems().getItem() != null) {
            for (ECF.DetallesItems.Item item : ecf.getDetallesItems().getItem()) {
                if (item.getRetencion() == null) {
                    item.setRetencion(new ECF.DetallesItems.Item.Retencion());
                }
            }
        }

        ecf.setEncabezado(encabezado);
        ecf.setFechaHoraFirma(LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        formaPagoHandler.applyIfNotEmpty();

        return ecf;
    }

    @Override
    protected void handleUnmappedField(String columnName) {
        System.err.println("Campo no mapeado: " + columnName);
        // Opcional: registrar en un log de campos no mapeados
    }

    /**
     * Handler para campos simples que no requieren lógica especial
     */
    private static class SimpleFieldsHandler implements FieldHandler<ECF> {
        private final Map<String, Object> fieldTargetMap;

        public SimpleFieldsHandler(Emisor emisor, Comprador comprador, IdDoc idDoc,
                Totales totales, OtraMoneda otraMoneda) {
            this.fieldTargetMap = Map.ofEntries(
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
                    Map.entry("MontoTotalOtraMoneda", otraMoneda)
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

        private static String normalizeColumnName(String columnName) {
            return columnName.replaceAll("\\[\\d+\\]", "").trim();
        }

    }

    private boolean tieneDatos(OtraMoneda moneda) {
        return moneda.getTipoCambio() != null ||
                moneda.getTipoMoneda() != null ||
                moneda.getMontoTotalOtraMoneda() != null;
        // Revisa todos los campos numéricos relevantes
    }
}
