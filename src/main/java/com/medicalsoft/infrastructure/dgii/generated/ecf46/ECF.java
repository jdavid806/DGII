//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.07.23 a las 06:59:05 PM COT 
//


package com.medicalsoft.infrastructure.dgii.generated.ecf46;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Encabezado"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Version" type="{}versionType"/&gt;
 *                   &lt;element name="IdDoc"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TipoeCF" type="{}TipoeCFType"/&gt;
 *                             &lt;element name="eNCF" type="{}eNCFValidationType"/&gt;
 *                             &lt;element name="FechaVencimientoSecuencia" type="{}FechaValidationType"/&gt;
 *                             &lt;element name="TipoPago" type="{}TipoPagoType" minOccurs="0"/&gt;
 *                             &lt;element name="FechaLimitePago" type="{}FechaValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="TerminoPago" type="{}TerminoPagoValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="TablaFormasPago" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FormaDePago" maxOccurs="7"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="FormaPago" type="{}FormaPagoType"/&gt;
 *                                                 &lt;element name="MontoPago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TipoCuentaPago" type="{}TipoCuentaPagoType" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroCuentaPago" type="{}NumeroCuentaPagoType" minOccurs="0"/&gt;
 *                             &lt;element name="BancoPago" type="{}BancoPagoType" minOccurs="0"/&gt;
 *                             &lt;element name="FechaDesde" type="{}FechaValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="FechaHasta" type="{}FechaValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="TotalPaginas" type="{}Integer4ValidationTypeMayorUno" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Emisor"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RNCEmisor" type="{}RNCValidationType"/&gt;
 *                             &lt;element name="RazonSocialEmisor" type="{}AlfNum150Type"/&gt;
 *                             &lt;element name="NombreComercial" type="{}AlfNum150Type" minOccurs="0"/&gt;
 *                             &lt;element name="Sucursal" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="DireccionEmisor" type="{}AlfNum100Type"/&gt;
 *                             &lt;element name="Municipio" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
 *                             &lt;element name="Provincia" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
 *                             &lt;element name="TablaTelefonoEmisor" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TelefonoEmisor" type="{}TelefonoValidationType" maxOccurs="3"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CorreoEmisor" type="{}CorreoValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="WebSite" type="{}AlfNum50Type" minOccurs="0"/&gt;
 *                             &lt;element name="ActividadEconomica" type="{}AlfNum100Type" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroFacturaInterna" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroPedidoInterno" type="{}Integer20ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="InformacionAdicionalEmisor" type="{}AlfNum250Type" minOccurs="0"/&gt;
 *                             &lt;element name="FechaEmision" type="{}FechaValidationType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Comprador" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IdentificadorExtranjero" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="RazonSocialComprador" type="{}AlfNum150Type" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Transporte" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PaisDestino" type="{}Alfa60Type" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Totales"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="MontoExento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
 *                             &lt;element name="MontoPeriodo" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
 *                             &lt;element name="SaldoAnterior" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
 *                             &lt;element name="MontoAvancePago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="ValorPagar" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
 *                             &lt;element name="TotalISRRetencion" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OtraMoneda" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TipoMoneda" type="{}TipoMonedaType" minOccurs="0"/&gt;
 *                             &lt;element name="TipoCambio" type="{}Decimal7D1or4ValidationTypeMayorCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoExentoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoTotalOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DetallesItems"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" maxOccurs="1000"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroLinea" type="{}NumeroLineaType"/&gt;
 *                             &lt;element name="TablaCodigosItem" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CodigosItem" maxOccurs="5"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoCodigo" type="{}AlfNum14Type"/&gt;
 *                                                 &lt;element name="CodigoItem" type="{}AlfNum35Type"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="IndicadorFacturacion" type="{}IndicadorFacturacionType"/&gt;
 *                             &lt;element name="Retencion"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="IndicadorAgenteRetencionoPercepcion" type="{}IndicadorAgenteRetencionoPercepcionType"/&gt;
 *                                       &lt;element name="MontoISRRetenido" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="NombreItem" type="{}AlfNum80Type"/&gt;
 *                             &lt;element name="IndicadorBienoServicio" type="{}IndicadorBienoServicioType"/&gt;
 *                             &lt;element name="DescripcionItem" type="{}AlfNum1000Type" minOccurs="0"/&gt;
 *                             &lt;element name="CantidadItem" type="{}Decimal18D1or2ValidationTypeMayorCero"/&gt;
 *                             &lt;element name="UnidadMedida" type="{}UnidadMedidaType" minOccurs="0"/&gt;
 *                             &lt;element name="PrecioUnitarioItem" type="{}Decimal20D1or4ValidationTypeMayorIgualCero"/&gt;
 *                             &lt;element name="OtraMonedaDetalle" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PrecioOtraMoneda" type="{}Decimal20D1or4ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                                       &lt;element name="DescuentoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                                       &lt;element name="RecargoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                                       &lt;element name="MontoItemOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="MontoItem" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Subtotales" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Subtotal" maxOccurs="20"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroSubTotal" type="{}Integer2ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="DescripcionSubtotal" type="{}AlfNum40Type" minOccurs="0"/&gt;
 *                             &lt;element name="Orden" type="{}Integer2ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="SubTotalExento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoSubTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="Lineas" type="{}Integer2ValidationType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Paginacion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Pagina" maxOccurs="1000"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PaginaNo" type="{}Integer4V1To1000ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="NoLineaDesde" type="{}Integer4V1To1000ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="NoLineaHasta" type="{}Integer4V1To1000ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="SubtotalExentoPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoSubtotalPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InformacionReferencia" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NCFModificado" type="{}AlfNum11a19ValidationType" minOccurs="0"/&gt;
 *                   &lt;element name="RNCOtroContribuyente" type="{}RNCValidationType" minOccurs="0"/&gt;
 *                   &lt;element name="FechaNCFModificado" type="{}FechaValidationType" minOccurs="0"/&gt;
 *                   &lt;element name="CodigoModificacion" type="{}CodigoModificacionType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FechaHoraFirma" type="{}DateTimeValidationType"/&gt;
 *         &lt;any processContents='skip'/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "encabezado",
    "detallesItems",
    "subtotales",
    "paginacion",
    "informacionReferencia",
    "fechaHoraFirma",
    "any"
})
@XmlRootElement(name = "ECF")
public class ECF {

    @XmlElement(name = "Encabezado", required = true)
    protected ECF.Encabezado encabezado;
    @XmlElement(name = "DetallesItems", required = true)
    protected ECF.DetallesItems detallesItems;
    @XmlElement(name = "Subtotales")
    protected ECF.Subtotales subtotales;
    @XmlElement(name = "Paginacion")
    protected ECF.Paginacion paginacion;
    @XmlElement(name = "InformacionReferencia")
    protected ECF.InformacionReferencia informacionReferencia;
    @XmlElement(name = "FechaHoraFirma", required = true)
    protected String fechaHoraFirma;
    @XmlAnyElement
    protected Element any;

    /**
     * Obtiene el valor de la propiedad encabezado.
     * 
     * @return
     *     possible object is
     *     {@link ECF.Encabezado }
     *     
     */
    public ECF.Encabezado getEncabezado() {
        return encabezado;
    }

    /**
     * Define el valor de la propiedad encabezado.
     * 
     * @param value
     *     allowed object is
     *     {@link ECF.Encabezado }
     *     
     */
    public void setEncabezado(ECF.Encabezado value) {
        this.encabezado = value;
    }

    /**
     * Obtiene el valor de la propiedad detallesItems.
     * 
     * @return
     *     possible object is
     *     {@link ECF.DetallesItems }
     *     
     */
    public ECF.DetallesItems getDetallesItems() {
        return detallesItems;
    }

    /**
     * Define el valor de la propiedad detallesItems.
     * 
     * @param value
     *     allowed object is
     *     {@link ECF.DetallesItems }
     *     
     */
    public void setDetallesItems(ECF.DetallesItems value) {
        this.detallesItems = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotales.
     * 
     * @return
     *     possible object is
     *     {@link ECF.Subtotales }
     *     
     */
    public ECF.Subtotales getSubtotales() {
        return subtotales;
    }

    /**
     * Define el valor de la propiedad subtotales.
     * 
     * @param value
     *     allowed object is
     *     {@link ECF.Subtotales }
     *     
     */
    public void setSubtotales(ECF.Subtotales value) {
        this.subtotales = value;
    }

    /**
     * Obtiene el valor de la propiedad paginacion.
     * 
     * @return
     *     possible object is
     *     {@link ECF.Paginacion }
     *     
     */
    public ECF.Paginacion getPaginacion() {
        return paginacion;
    }

    /**
     * Define el valor de la propiedad paginacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ECF.Paginacion }
     *     
     */
    public void setPaginacion(ECF.Paginacion value) {
        this.paginacion = value;
    }

    /**
     * Obtiene el valor de la propiedad informacionReferencia.
     * 
     * @return
     *     possible object is
     *     {@link ECF.InformacionReferencia }
     *     
     */
    public ECF.InformacionReferencia getInformacionReferencia() {
        return informacionReferencia;
    }

    /**
     * Define el valor de la propiedad informacionReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link ECF.InformacionReferencia }
     *     
     */
    public void setInformacionReferencia(ECF.InformacionReferencia value) {
        this.informacionReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraFirma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHoraFirma() {
        return fechaHoraFirma;
    }

    /**
     * Define el valor de la propiedad fechaHoraFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHoraFirma(String value) {
        this.fechaHoraFirma = value;
    }

    /**
     * Obtiene el valor de la propiedad any.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Define el valor de la propiedad any.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Item" maxOccurs="1000"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroLinea" type="{}NumeroLineaType"/&gt;
     *                   &lt;element name="TablaCodigosItem" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CodigosItem" maxOccurs="5"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoCodigo" type="{}AlfNum14Type"/&gt;
     *                                       &lt;element name="CodigoItem" type="{}AlfNum35Type"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="IndicadorFacturacion" type="{}IndicadorFacturacionType"/&gt;
     *                   &lt;element name="Retencion"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="IndicadorAgenteRetencionoPercepcion" type="{}IndicadorAgenteRetencionoPercepcionType"/&gt;
     *                             &lt;element name="MontoISRRetenido" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NombreItem" type="{}AlfNum80Type"/&gt;
     *                   &lt;element name="IndicadorBienoServicio" type="{}IndicadorBienoServicioType"/&gt;
     *                   &lt;element name="DescripcionItem" type="{}AlfNum1000Type" minOccurs="0"/&gt;
     *                   &lt;element name="CantidadItem" type="{}Decimal18D1or2ValidationTypeMayorCero"/&gt;
     *                   &lt;element name="UnidadMedida" type="{}UnidadMedidaType" minOccurs="0"/&gt;
     *                   &lt;element name="PrecioUnitarioItem" type="{}Decimal20D1or4ValidationTypeMayorIgualCero"/&gt;
     *                   &lt;element name="OtraMonedaDetalle" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PrecioOtraMoneda" type="{}Decimal20D1or4ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                             &lt;element name="DescuentoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                             &lt;element name="RecargoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                             &lt;element name="MontoItemOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="MontoItem" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class DetallesItems {

        @XmlElement(name = "Item", required = true)
        protected List<ECF.DetallesItems.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECF.DetallesItems.Item }
         * 
         * 
         */
        public List<ECF.DetallesItems.Item> getItem() {
            if (item == null) {
                item = new ArrayList<ECF.DetallesItems.Item>();
            }
            return this.item;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="NumeroLinea" type="{}NumeroLineaType"/&gt;
         *         &lt;element name="TablaCodigosItem" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CodigosItem" maxOccurs="5"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoCodigo" type="{}AlfNum14Type"/&gt;
         *                             &lt;element name="CodigoItem" type="{}AlfNum35Type"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="IndicadorFacturacion" type="{}IndicadorFacturacionType"/&gt;
         *         &lt;element name="Retencion"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="IndicadorAgenteRetencionoPercepcion" type="{}IndicadorAgenteRetencionoPercepcionType"/&gt;
         *                   &lt;element name="MontoISRRetenido" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NombreItem" type="{}AlfNum80Type"/&gt;
         *         &lt;element name="IndicadorBienoServicio" type="{}IndicadorBienoServicioType"/&gt;
         *         &lt;element name="DescripcionItem" type="{}AlfNum1000Type" minOccurs="0"/&gt;
         *         &lt;element name="CantidadItem" type="{}Decimal18D1or2ValidationTypeMayorCero"/&gt;
         *         &lt;element name="UnidadMedida" type="{}UnidadMedidaType" minOccurs="0"/&gt;
         *         &lt;element name="PrecioUnitarioItem" type="{}Decimal20D1or4ValidationTypeMayorIgualCero"/&gt;
         *         &lt;element name="OtraMonedaDetalle" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PrecioOtraMoneda" type="{}Decimal20D1or4ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *                   &lt;element name="DescuentoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *                   &lt;element name="RecargoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *                   &lt;element name="MontoItemOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="MontoItem" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numeroLinea",
            "tablaCodigosItem",
            "indicadorFacturacion",
            "retencion",
            "nombreItem",
            "indicadorBienoServicio",
            "descripcionItem",
            "cantidadItem",
            "unidadMedida",
            "precioUnitarioItem",
            "otraMonedaDetalle",
            "montoItem"
        })
        public static class Item {

            @XmlElement(name = "NumeroLinea")
            @XmlSchemaType(name = "integer")
            protected int numeroLinea;
            @XmlElement(name = "TablaCodigosItem")
            protected ECF.DetallesItems.Item.TablaCodigosItem tablaCodigosItem;
            @XmlElement(name = "IndicadorFacturacion", required = true)
            protected BigInteger indicadorFacturacion;
            @XmlElement(name = "Retencion", required = true)
            protected ECF.DetallesItems.Item.Retencion retencion;
            @XmlElement(name = "NombreItem", required = true)
            protected String nombreItem;
            @XmlElement(name = "IndicadorBienoServicio", required = true)
            protected BigInteger indicadorBienoServicio;
            @XmlElement(name = "DescripcionItem")
            protected String descripcionItem;
            @XmlElement(name = "CantidadItem", required = true)
            protected BigDecimal cantidadItem;
            @XmlElement(name = "UnidadMedida")
            protected BigInteger unidadMedida;
            @XmlElement(name = "PrecioUnitarioItem", required = true)
            protected BigDecimal precioUnitarioItem;
            @XmlElement(name = "OtraMonedaDetalle")
            protected ECF.DetallesItems.Item.OtraMonedaDetalle otraMonedaDetalle;
            @XmlElement(name = "MontoItem", required = true)
            protected BigDecimal montoItem;

            /**
             * Obtiene el valor de la propiedad numeroLinea.
             * 
             */
            public int getNumeroLinea() {
                return numeroLinea;
            }

            /**
             * Define el valor de la propiedad numeroLinea.
             * 
             */
            public void setNumeroLinea(int value) {
                this.numeroLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad tablaCodigosItem.
             * 
             * @return
             *     possible object is
             *     {@link ECF.DetallesItems.Item.TablaCodigosItem }
             *     
             */
            public ECF.DetallesItems.Item.TablaCodigosItem getTablaCodigosItem() {
                return tablaCodigosItem;
            }

            /**
             * Define el valor de la propiedad tablaCodigosItem.
             * 
             * @param value
             *     allowed object is
             *     {@link ECF.DetallesItems.Item.TablaCodigosItem }
             *     
             */
            public void setTablaCodigosItem(ECF.DetallesItems.Item.TablaCodigosItem value) {
                this.tablaCodigosItem = value;
            }

            /**
             * Obtiene el valor de la propiedad indicadorFacturacion.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIndicadorFacturacion() {
                return indicadorFacturacion;
            }

            /**
             * Define el valor de la propiedad indicadorFacturacion.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIndicadorFacturacion(BigInteger value) {
                this.indicadorFacturacion = value;
            }

            /**
             * Obtiene el valor de la propiedad retencion.
             * 
             * @return
             *     possible object is
             *     {@link ECF.DetallesItems.Item.Retencion }
             *     
             */
            public ECF.DetallesItems.Item.Retencion getRetencion() {
                return retencion;
            }

            /**
             * Define el valor de la propiedad retencion.
             * 
             * @param value
             *     allowed object is
             *     {@link ECF.DetallesItems.Item.Retencion }
             *     
             */
            public void setRetencion(ECF.DetallesItems.Item.Retencion value) {
                this.retencion = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreItem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreItem() {
                return nombreItem;
            }

            /**
             * Define el valor de la propiedad nombreItem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreItem(String value) {
                this.nombreItem = value;
            }

            /**
             * Obtiene el valor de la propiedad indicadorBienoServicio.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIndicadorBienoServicio() {
                return indicadorBienoServicio;
            }

            /**
             * Define el valor de la propiedad indicadorBienoServicio.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIndicadorBienoServicio(BigInteger value) {
                this.indicadorBienoServicio = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcionItem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcionItem() {
                return descripcionItem;
            }

            /**
             * Define el valor de la propiedad descripcionItem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcionItem(String value) {
                this.descripcionItem = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadItem.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidadItem() {
                return cantidadItem;
            }

            /**
             * Define el valor de la propiedad cantidadItem.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidadItem(BigDecimal value) {
                this.cantidadItem = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadMedida.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUnidadMedida() {
                return unidadMedida;
            }

            /**
             * Define el valor de la propiedad unidadMedida.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUnidadMedida(BigInteger value) {
                this.unidadMedida = value;
            }

            /**
             * Obtiene el valor de la propiedad precioUnitarioItem.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrecioUnitarioItem() {
                return precioUnitarioItem;
            }

            /**
             * Define el valor de la propiedad precioUnitarioItem.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrecioUnitarioItem(BigDecimal value) {
                this.precioUnitarioItem = value;
            }

            /**
             * Obtiene el valor de la propiedad otraMonedaDetalle.
             * 
             * @return
             *     possible object is
             *     {@link ECF.DetallesItems.Item.OtraMonedaDetalle }
             *     
             */
            public ECF.DetallesItems.Item.OtraMonedaDetalle getOtraMonedaDetalle() {
                return otraMonedaDetalle;
            }

            /**
             * Define el valor de la propiedad otraMonedaDetalle.
             * 
             * @param value
             *     allowed object is
             *     {@link ECF.DetallesItems.Item.OtraMonedaDetalle }
             *     
             */
            public void setOtraMonedaDetalle(ECF.DetallesItems.Item.OtraMonedaDetalle value) {
                this.otraMonedaDetalle = value;
            }

            /**
             * Obtiene el valor de la propiedad montoItem.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoItem() {
                return montoItem;
            }

            /**
             * Define el valor de la propiedad montoItem.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoItem(BigDecimal value) {
                this.montoItem = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="PrecioOtraMoneda" type="{}Decimal20D1or4ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
             *         &lt;element name="DescuentoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
             *         &lt;element name="RecargoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
             *         &lt;element name="MontoItemOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "precioOtraMoneda",
                "descuentoOtraMoneda",
                "recargoOtraMoneda",
                "montoItemOtraMoneda"
            })
            public static class OtraMonedaDetalle {

                @XmlElement(name = "PrecioOtraMoneda")
                protected BigDecimal precioOtraMoneda;
                @XmlElement(name = "DescuentoOtraMoneda")
                protected BigDecimal descuentoOtraMoneda;
                @XmlElement(name = "RecargoOtraMoneda")
                protected BigDecimal recargoOtraMoneda;
                @XmlElement(name = "MontoItemOtraMoneda")
                protected BigDecimal montoItemOtraMoneda;

                /**
                 * Obtiene el valor de la propiedad precioOtraMoneda.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPrecioOtraMoneda() {
                    return precioOtraMoneda;
                }

                /**
                 * Define el valor de la propiedad precioOtraMoneda.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPrecioOtraMoneda(BigDecimal value) {
                    this.precioOtraMoneda = value;
                }

                /**
                 * Obtiene el valor de la propiedad descuentoOtraMoneda.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getDescuentoOtraMoneda() {
                    return descuentoOtraMoneda;
                }

                /**
                 * Define el valor de la propiedad descuentoOtraMoneda.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setDescuentoOtraMoneda(BigDecimal value) {
                    this.descuentoOtraMoneda = value;
                }

                /**
                 * Obtiene el valor de la propiedad recargoOtraMoneda.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRecargoOtraMoneda() {
                    return recargoOtraMoneda;
                }

                /**
                 * Define el valor de la propiedad recargoOtraMoneda.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRecargoOtraMoneda(BigDecimal value) {
                    this.recargoOtraMoneda = value;
                }

                /**
                 * Obtiene el valor de la propiedad montoItemOtraMoneda.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMontoItemOtraMoneda() {
                    return montoItemOtraMoneda;
                }

                /**
                 * Define el valor de la propiedad montoItemOtraMoneda.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMontoItemOtraMoneda(BigDecimal value) {
                    this.montoItemOtraMoneda = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="IndicadorAgenteRetencionoPercepcion" type="{}IndicadorAgenteRetencionoPercepcionType"/&gt;
             *         &lt;element name="MontoISRRetenido" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "indicadorAgenteRetencionoPercepcion",
                "montoISRRetenido"
            })
            public static class Retencion {

                @XmlElement(name = "IndicadorAgenteRetencionoPercepcion", required = true)
                protected BigInteger indicadorAgenteRetencionoPercepcion;
                @XmlElement(name = "MontoISRRetenido", required = true)
                protected BigDecimal montoISRRetenido;

                /**
                 * Obtiene el valor de la propiedad indicadorAgenteRetencionoPercepcion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getIndicadorAgenteRetencionoPercepcion() {
                    return indicadorAgenteRetencionoPercepcion;
                }

                /**
                 * Define el valor de la propiedad indicadorAgenteRetencionoPercepcion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setIndicadorAgenteRetencionoPercepcion(BigInteger value) {
                    this.indicadorAgenteRetencionoPercepcion = value;
                }

                /**
                 * Obtiene el valor de la propiedad montoISRRetenido.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMontoISRRetenido() {
                    return montoISRRetenido;
                }

                /**
                 * Define el valor de la propiedad montoISRRetenido.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMontoISRRetenido(BigDecimal value) {
                    this.montoISRRetenido = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="CodigosItem" maxOccurs="5"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoCodigo" type="{}AlfNum14Type"/&gt;
             *                   &lt;element name="CodigoItem" type="{}AlfNum35Type"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codigosItem"
            })
            public static class TablaCodigosItem {

                @XmlElement(name = "CodigosItem", required = true)
                protected List<ECF.DetallesItems.Item.TablaCodigosItem.CodigosItem> codigosItem;

                /**
                 * Gets the value of the codigosItem property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the codigosItem property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCodigosItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ECF.DetallesItems.Item.TablaCodigosItem.CodigosItem }
                 * 
                 * 
                 */
                public List<ECF.DetallesItems.Item.TablaCodigosItem.CodigosItem> getCodigosItem() {
                    if (codigosItem == null) {
                        codigosItem = new ArrayList<ECF.DetallesItems.Item.TablaCodigosItem.CodigosItem>();
                    }
                    return this.codigosItem;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="TipoCodigo" type="{}AlfNum14Type"/&gt;
                 *         &lt;element name="CodigoItem" type="{}AlfNum35Type"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "tipoCodigo",
                    "codigoItem"
                })
                public static class CodigosItem {

                    @XmlElement(name = "TipoCodigo", required = true)
                    protected String tipoCodigo;
                    @XmlElement(name = "CodigoItem", required = true)
                    protected String codigoItem;

                    /**
                     * Obtiene el valor de la propiedad tipoCodigo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipoCodigo() {
                        return tipoCodigo;
                    }

                    /**
                     * Define el valor de la propiedad tipoCodigo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipoCodigo(String value) {
                        this.tipoCodigo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad codigoItem.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigoItem() {
                        return codigoItem;
                    }

                    /**
                     * Define el valor de la propiedad codigoItem.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigoItem(String value) {
                        this.codigoItem = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Version" type="{}versionType"/&gt;
     *         &lt;element name="IdDoc"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TipoeCF" type="{}TipoeCFType"/&gt;
     *                   &lt;element name="eNCF" type="{}eNCFValidationType"/&gt;
     *                   &lt;element name="FechaVencimientoSecuencia" type="{}FechaValidationType"/&gt;
     *                   &lt;element name="TipoPago" type="{}TipoPagoType" minOccurs="0"/&gt;
     *                   &lt;element name="FechaLimitePago" type="{}FechaValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="TerminoPago" type="{}TerminoPagoValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="TablaFormasPago" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FormaDePago" maxOccurs="7"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="FormaPago" type="{}FormaPagoType"/&gt;
     *                                       &lt;element name="MontoPago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TipoCuentaPago" type="{}TipoCuentaPagoType" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroCuentaPago" type="{}NumeroCuentaPagoType" minOccurs="0"/&gt;
     *                   &lt;element name="BancoPago" type="{}BancoPagoType" minOccurs="0"/&gt;
     *                   &lt;element name="FechaDesde" type="{}FechaValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="FechaHasta" type="{}FechaValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="TotalPaginas" type="{}Integer4ValidationTypeMayorUno" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Emisor"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RNCEmisor" type="{}RNCValidationType"/&gt;
     *                   &lt;element name="RazonSocialEmisor" type="{}AlfNum150Type"/&gt;
     *                   &lt;element name="NombreComercial" type="{}AlfNum150Type" minOccurs="0"/&gt;
     *                   &lt;element name="Sucursal" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="DireccionEmisor" type="{}AlfNum100Type"/&gt;
     *                   &lt;element name="Municipio" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
     *                   &lt;element name="Provincia" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
     *                   &lt;element name="TablaTelefonoEmisor" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TelefonoEmisor" type="{}TelefonoValidationType" maxOccurs="3"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CorreoEmisor" type="{}CorreoValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="WebSite" type="{}AlfNum50Type" minOccurs="0"/&gt;
     *                   &lt;element name="ActividadEconomica" type="{}AlfNum100Type" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroFacturaInterna" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroPedidoInterno" type="{}Integer20ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="InformacionAdicionalEmisor" type="{}AlfNum250Type" minOccurs="0"/&gt;
     *                   &lt;element name="FechaEmision" type="{}FechaValidationType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Comprador" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IdentificadorExtranjero" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="RazonSocialComprador" type="{}AlfNum150Type" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Transporte" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PaisDestino" type="{}Alfa60Type" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Totales"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="MontoExento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
     *                   &lt;element name="MontoPeriodo" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
     *                   &lt;element name="SaldoAnterior" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
     *                   &lt;element name="MontoAvancePago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="ValorPagar" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
     *                   &lt;element name="TotalISRRetencion" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OtraMoneda" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TipoMoneda" type="{}TipoMonedaType" minOccurs="0"/&gt;
     *                   &lt;element name="TipoCambio" type="{}Decimal7D1or4ValidationTypeMayorCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoExentoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoTotalOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "version",
        "idDoc",
        "emisor",
        "comprador",
        "transporte",
        "totales",
        "otraMoneda"
    })
    public static class Encabezado {

        @XmlElement(name = "Version", required = true)
        protected BigDecimal version;
        @XmlElement(name = "IdDoc", required = true)
        protected ECF.Encabezado.IdDoc idDoc;
        @XmlElement(name = "Emisor", required = true)
        protected ECF.Encabezado.Emisor emisor;
        @XmlElement(name = "Comprador")
        protected ECF.Encabezado.Comprador comprador;
        @XmlElement(name = "Transporte")
        protected ECF.Encabezado.Transporte transporte;
        @XmlElement(name = "Totales", required = true)
        protected ECF.Encabezado.Totales totales;
        @XmlElement(name = "OtraMoneda")
        protected ECF.Encabezado.OtraMoneda otraMoneda;

        /**
         * Obtiene el valor de la propiedad version.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * Define el valor de la propiedad version.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVersion(BigDecimal value) {
            this.version = value;
        }

        /**
         * Obtiene el valor de la propiedad idDoc.
         * 
         * @return
         *     possible object is
         *     {@link ECF.Encabezado.IdDoc }
         *     
         */
        public ECF.Encabezado.IdDoc getIdDoc() {
            return idDoc;
        }

        /**
         * Define el valor de la propiedad idDoc.
         * 
         * @param value
         *     allowed object is
         *     {@link ECF.Encabezado.IdDoc }
         *     
         */
        public void setIdDoc(ECF.Encabezado.IdDoc value) {
            this.idDoc = value;
        }

        /**
         * Obtiene el valor de la propiedad emisor.
         * 
         * @return
         *     possible object is
         *     {@link ECF.Encabezado.Emisor }
         *     
         */
        public ECF.Encabezado.Emisor getEmisor() {
            return emisor;
        }

        /**
         * Define el valor de la propiedad emisor.
         * 
         * @param value
         *     allowed object is
         *     {@link ECF.Encabezado.Emisor }
         *     
         */
        public void setEmisor(ECF.Encabezado.Emisor value) {
            this.emisor = value;
        }

        /**
         * Obtiene el valor de la propiedad comprador.
         * 
         * @return
         *     possible object is
         *     {@link ECF.Encabezado.Comprador }
         *     
         */
        public ECF.Encabezado.Comprador getComprador() {
            return comprador;
        }

        /**
         * Define el valor de la propiedad comprador.
         * 
         * @param value
         *     allowed object is
         *     {@link ECF.Encabezado.Comprador }
         *     
         */
        public void setComprador(ECF.Encabezado.Comprador value) {
            this.comprador = value;
        }

        /**
         * Obtiene el valor de la propiedad transporte.
         * 
         * @return
         *     possible object is
         *     {@link ECF.Encabezado.Transporte }
         *     
         */
        public ECF.Encabezado.Transporte getTransporte() {
            return transporte;
        }

        /**
         * Define el valor de la propiedad transporte.
         * 
         * @param value
         *     allowed object is
         *     {@link ECF.Encabezado.Transporte }
         *     
         */
        public void setTransporte(ECF.Encabezado.Transporte value) {
            this.transporte = value;
        }

        /**
         * Obtiene el valor de la propiedad totales.
         * 
         * @return
         *     possible object is
         *     {@link ECF.Encabezado.Totales }
         *     
         */
        public ECF.Encabezado.Totales getTotales() {
            return totales;
        }

        /**
         * Define el valor de la propiedad totales.
         * 
         * @param value
         *     allowed object is
         *     {@link ECF.Encabezado.Totales }
         *     
         */
        public void setTotales(ECF.Encabezado.Totales value) {
            this.totales = value;
        }

        /**
         * Obtiene el valor de la propiedad otraMoneda.
         * 
         * @return
         *     possible object is
         *     {@link ECF.Encabezado.OtraMoneda }
         *     
         */
        public ECF.Encabezado.OtraMoneda getOtraMoneda() {
            return otraMoneda;
        }

        /**
         * Define el valor de la propiedad otraMoneda.
         * 
         * @param value
         *     allowed object is
         *     {@link ECF.Encabezado.OtraMoneda }
         *     
         */
        public void setOtraMoneda(ECF.Encabezado.OtraMoneda value) {
            this.otraMoneda = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="IdentificadorExtranjero" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="RazonSocialComprador" type="{}AlfNum150Type" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "identificadorExtranjero",
            "razonSocialComprador"
        })
        public static class Comprador {

            @XmlElement(name = "IdentificadorExtranjero")
            protected String identificadorExtranjero;
            @XmlElement(name = "RazonSocialComprador")
            protected String razonSocialComprador;

            /**
             * Obtiene el valor de la propiedad identificadorExtranjero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentificadorExtranjero() {
                return identificadorExtranjero;
            }

            /**
             * Define el valor de la propiedad identificadorExtranjero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentificadorExtranjero(String value) {
                this.identificadorExtranjero = value;
            }

            /**
             * Obtiene el valor de la propiedad razonSocialComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRazonSocialComprador() {
                return razonSocialComprador;
            }

            /**
             * Define el valor de la propiedad razonSocialComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRazonSocialComprador(String value) {
                this.razonSocialComprador = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="RNCEmisor" type="{}RNCValidationType"/&gt;
         *         &lt;element name="RazonSocialEmisor" type="{}AlfNum150Type"/&gt;
         *         &lt;element name="NombreComercial" type="{}AlfNum150Type" minOccurs="0"/&gt;
         *         &lt;element name="Sucursal" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="DireccionEmisor" type="{}AlfNum100Type"/&gt;
         *         &lt;element name="Municipio" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
         *         &lt;element name="Provincia" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
         *         &lt;element name="TablaTelefonoEmisor" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TelefonoEmisor" type="{}TelefonoValidationType" maxOccurs="3"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CorreoEmisor" type="{}CorreoValidationType" minOccurs="0"/&gt;
         *         &lt;element name="WebSite" type="{}AlfNum50Type" minOccurs="0"/&gt;
         *         &lt;element name="ActividadEconomica" type="{}AlfNum100Type" minOccurs="0"/&gt;
         *         &lt;element name="NumeroFacturaInterna" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="NumeroPedidoInterno" type="{}Integer20ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="InformacionAdicionalEmisor" type="{}AlfNum250Type" minOccurs="0"/&gt;
         *         &lt;element name="FechaEmision" type="{}FechaValidationType"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rncEmisor",
            "razonSocialEmisor",
            "nombreComercial",
            "sucursal",
            "direccionEmisor",
            "municipio",
            "provincia",
            "tablaTelefonoEmisor",
            "correoEmisor",
            "webSite",
            "actividadEconomica",
            "numeroFacturaInterna",
            "numeroPedidoInterno",
            "informacionAdicionalEmisor",
            "fechaEmision"
        })
        public static class Emisor {

            @XmlElement(name = "RNCEmisor", required = true)
            protected String rncEmisor;
            @XmlElement(name = "RazonSocialEmisor", required = true)
            protected String razonSocialEmisor;
            @XmlElement(name = "NombreComercial")
            protected String nombreComercial;
            @XmlElement(name = "Sucursal")
            protected String sucursal;
            @XmlElement(name = "DireccionEmisor", required = true)
            protected String direccionEmisor;
            @XmlElement(name = "Municipio")
            protected String municipio;
            @XmlElement(name = "Provincia")
            protected String provincia;
            @XmlElement(name = "TablaTelefonoEmisor")
            protected ECF.Encabezado.Emisor.TablaTelefonoEmisor tablaTelefonoEmisor;
            @XmlElement(name = "CorreoEmisor")
            protected String correoEmisor;
            @XmlElement(name = "WebSite")
            protected String webSite;
            @XmlElement(name = "ActividadEconomica")
            protected String actividadEconomica;
            @XmlElement(name = "NumeroFacturaInterna")
            protected String numeroFacturaInterna;
            @XmlElement(name = "NumeroPedidoInterno")
            protected BigInteger numeroPedidoInterno;
            @XmlElement(name = "InformacionAdicionalEmisor")
            protected String informacionAdicionalEmisor;
            @XmlElement(name = "FechaEmision", required = true)
            protected String fechaEmision;

            /**
             * Obtiene el valor de la propiedad rncEmisor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRNCEmisor() {
                return rncEmisor;
            }

            /**
             * Define el valor de la propiedad rncEmisor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRNCEmisor(String value) {
                this.rncEmisor = value;
            }

            /**
             * Obtiene el valor de la propiedad razonSocialEmisor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRazonSocialEmisor() {
                return razonSocialEmisor;
            }

            /**
             * Define el valor de la propiedad razonSocialEmisor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRazonSocialEmisor(String value) {
                this.razonSocialEmisor = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreComercial.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreComercial() {
                return nombreComercial;
            }

            /**
             * Define el valor de la propiedad nombreComercial.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreComercial(String value) {
                this.nombreComercial = value;
            }

            /**
             * Obtiene el valor de la propiedad sucursal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSucursal() {
                return sucursal;
            }

            /**
             * Define el valor de la propiedad sucursal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSucursal(String value) {
                this.sucursal = value;
            }

            /**
             * Obtiene el valor de la propiedad direccionEmisor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionEmisor() {
                return direccionEmisor;
            }

            /**
             * Define el valor de la propiedad direccionEmisor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionEmisor(String value) {
                this.direccionEmisor = value;
            }

            /**
             * Obtiene el valor de la propiedad municipio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMunicipio() {
                return municipio;
            }

            /**
             * Define el valor de la propiedad municipio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMunicipio(String value) {
                this.municipio = value;
            }

            /**
             * Obtiene el valor de la propiedad provincia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvincia() {
                return provincia;
            }

            /**
             * Define el valor de la propiedad provincia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvincia(String value) {
                this.provincia = value;
            }

            /**
             * Obtiene el valor de la propiedad tablaTelefonoEmisor.
             * 
             * @return
             *     possible object is
             *     {@link ECF.Encabezado.Emisor.TablaTelefonoEmisor }
             *     
             */
            public ECF.Encabezado.Emisor.TablaTelefonoEmisor getTablaTelefonoEmisor() {
                return tablaTelefonoEmisor;
            }

            /**
             * Define el valor de la propiedad tablaTelefonoEmisor.
             * 
             * @param value
             *     allowed object is
             *     {@link ECF.Encabezado.Emisor.TablaTelefonoEmisor }
             *     
             */
            public void setTablaTelefonoEmisor(ECF.Encabezado.Emisor.TablaTelefonoEmisor value) {
                this.tablaTelefonoEmisor = value;
            }

            /**
             * Obtiene el valor de la propiedad correoEmisor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorreoEmisor() {
                return correoEmisor;
            }

            /**
             * Define el valor de la propiedad correoEmisor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorreoEmisor(String value) {
                this.correoEmisor = value;
            }

            /**
             * Obtiene el valor de la propiedad webSite.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWebSite() {
                return webSite;
            }

            /**
             * Define el valor de la propiedad webSite.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWebSite(String value) {
                this.webSite = value;
            }

            /**
             * Obtiene el valor de la propiedad actividadEconomica.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActividadEconomica() {
                return actividadEconomica;
            }

            /**
             * Define el valor de la propiedad actividadEconomica.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActividadEconomica(String value) {
                this.actividadEconomica = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroFacturaInterna.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroFacturaInterna() {
                return numeroFacturaInterna;
            }

            /**
             * Define el valor de la propiedad numeroFacturaInterna.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroFacturaInterna(String value) {
                this.numeroFacturaInterna = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroPedidoInterno.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumeroPedidoInterno() {
                return numeroPedidoInterno;
            }

            /**
             * Define el valor de la propiedad numeroPedidoInterno.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumeroPedidoInterno(BigInteger value) {
                this.numeroPedidoInterno = value;
            }

            /**
             * Obtiene el valor de la propiedad informacionAdicionalEmisor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInformacionAdicionalEmisor() {
                return informacionAdicionalEmisor;
            }

            /**
             * Define el valor de la propiedad informacionAdicionalEmisor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInformacionAdicionalEmisor(String value) {
                this.informacionAdicionalEmisor = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaEmision.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaEmision() {
                return fechaEmision;
            }

            /**
             * Define el valor de la propiedad fechaEmision.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaEmision(String value) {
                this.fechaEmision = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="TelefonoEmisor" type="{}TelefonoValidationType" maxOccurs="3"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "telefonoEmisor"
            })
            public static class TablaTelefonoEmisor {

                @XmlElement(name = "TelefonoEmisor", required = true)
                protected List<String> telefonoEmisor;

                /**
                 * Gets the value of the telefonoEmisor property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the telefonoEmisor property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTelefonoEmisor().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getTelefonoEmisor() {
                    if (telefonoEmisor == null) {
                        telefonoEmisor = new ArrayList<String>();
                    }
                    return this.telefonoEmisor;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TipoeCF" type="{}TipoeCFType"/&gt;
         *         &lt;element name="eNCF" type="{}eNCFValidationType"/&gt;
         *         &lt;element name="FechaVencimientoSecuencia" type="{}FechaValidationType"/&gt;
         *         &lt;element name="TipoPago" type="{}TipoPagoType" minOccurs="0"/&gt;
         *         &lt;element name="FechaLimitePago" type="{}FechaValidationType" minOccurs="0"/&gt;
         *         &lt;element name="TerminoPago" type="{}TerminoPagoValidationType" minOccurs="0"/&gt;
         *         &lt;element name="TablaFormasPago" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FormaDePago" maxOccurs="7"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="FormaPago" type="{}FormaPagoType"/&gt;
         *                             &lt;element name="MontoPago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TipoCuentaPago" type="{}TipoCuentaPagoType" minOccurs="0"/&gt;
         *         &lt;element name="NumeroCuentaPago" type="{}NumeroCuentaPagoType" minOccurs="0"/&gt;
         *         &lt;element name="BancoPago" type="{}BancoPagoType" minOccurs="0"/&gt;
         *         &lt;element name="FechaDesde" type="{}FechaValidationType" minOccurs="0"/&gt;
         *         &lt;element name="FechaHasta" type="{}FechaValidationType" minOccurs="0"/&gt;
         *         &lt;element name="TotalPaginas" type="{}Integer4ValidationTypeMayorUno" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tipoeCF",
            "encf",
            "fechaVencimientoSecuencia",
            "tipoPago",
            "fechaLimitePago",
            "terminoPago",
            "tablaFormasPago",
            "tipoCuentaPago",
            "numeroCuentaPago",
            "bancoPago",
            "fechaDesde",
            "fechaHasta",
            "totalPaginas"
        })
        public static class IdDoc {

            @XmlElement(name = "TipoeCF", required = true)
            protected BigInteger tipoeCF;
            @XmlElement(name = "eNCF", required = true)
            protected String encf;
            @XmlElement(name = "FechaVencimientoSecuencia", required = true)
            protected String fechaVencimientoSecuencia;
            @XmlElement(name = "TipoPago")
            protected BigInteger tipoPago;
            @XmlElement(name = "FechaLimitePago")
            protected String fechaLimitePago;
            @XmlElement(name = "TerminoPago")
            protected String terminoPago;
            @XmlElement(name = "TablaFormasPago")
            protected ECF.Encabezado.IdDoc.TablaFormasPago tablaFormasPago;
            @XmlElement(name = "TipoCuentaPago")
            @XmlSchemaType(name = "string")
            protected TipoCuentaPagoType tipoCuentaPago;
            @XmlElement(name = "NumeroCuentaPago")
            protected String numeroCuentaPago;
            @XmlElement(name = "BancoPago")
            protected String bancoPago;
            @XmlElement(name = "FechaDesde")
            protected String fechaDesde;
            @XmlElement(name = "FechaHasta")
            protected String fechaHasta;
            @XmlElement(name = "TotalPaginas")
            protected BigInteger totalPaginas;

            /**
             * Obtiene el valor de la propiedad tipoeCF.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTipoeCF() {
                return tipoeCF;
            }

            /**
             * Define el valor de la propiedad tipoeCF.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTipoeCF(BigInteger value) {
                this.tipoeCF = value;
            }

            /**
             * Obtiene el valor de la propiedad encf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENCF() {
                return encf;
            }

            /**
             * Define el valor de la propiedad encf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENCF(String value) {
                this.encf = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaVencimientoSecuencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaVencimientoSecuencia() {
                return fechaVencimientoSecuencia;
            }

            /**
             * Define el valor de la propiedad fechaVencimientoSecuencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaVencimientoSecuencia(String value) {
                this.fechaVencimientoSecuencia = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoPago.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTipoPago() {
                return tipoPago;
            }

            /**
             * Define el valor de la propiedad tipoPago.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTipoPago(BigInteger value) {
                this.tipoPago = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaLimitePago.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaLimitePago() {
                return fechaLimitePago;
            }

            /**
             * Define el valor de la propiedad fechaLimitePago.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaLimitePago(String value) {
                this.fechaLimitePago = value;
            }

            /**
             * Obtiene el valor de la propiedad terminoPago.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminoPago() {
                return terminoPago;
            }

            /**
             * Define el valor de la propiedad terminoPago.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminoPago(String value) {
                this.terminoPago = value;
            }

            /**
             * Obtiene el valor de la propiedad tablaFormasPago.
             * 
             * @return
             *     possible object is
             *     {@link ECF.Encabezado.IdDoc.TablaFormasPago }
             *     
             */
            public ECF.Encabezado.IdDoc.TablaFormasPago getTablaFormasPago() {
                return tablaFormasPago;
            }

            /**
             * Define el valor de la propiedad tablaFormasPago.
             * 
             * @param value
             *     allowed object is
             *     {@link ECF.Encabezado.IdDoc.TablaFormasPago }
             *     
             */
            public void setTablaFormasPago(ECF.Encabezado.IdDoc.TablaFormasPago value) {
                this.tablaFormasPago = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoCuentaPago.
             * 
             * @return
             *     possible object is
             *     {@link TipoCuentaPagoType }
             *     
             */
            public TipoCuentaPagoType getTipoCuentaPago() {
                return tipoCuentaPago;
            }

            /**
             * Define el valor de la propiedad tipoCuentaPago.
             * 
             * @param value
             *     allowed object is
             *     {@link TipoCuentaPagoType }
             *     
             */
            public void setTipoCuentaPago(TipoCuentaPagoType value) {
                this.tipoCuentaPago = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroCuentaPago.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroCuentaPago() {
                return numeroCuentaPago;
            }

            /**
             * Define el valor de la propiedad numeroCuentaPago.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroCuentaPago(String value) {
                this.numeroCuentaPago = value;
            }

            /**
             * Obtiene el valor de la propiedad bancoPago.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBancoPago() {
                return bancoPago;
            }

            /**
             * Define el valor de la propiedad bancoPago.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBancoPago(String value) {
                this.bancoPago = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaDesde.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaDesde() {
                return fechaDesde;
            }

            /**
             * Define el valor de la propiedad fechaDesde.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaDesde(String value) {
                this.fechaDesde = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaHasta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaHasta() {
                return fechaHasta;
            }

            /**
             * Define el valor de la propiedad fechaHasta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaHasta(String value) {
                this.fechaHasta = value;
            }

            /**
             * Obtiene el valor de la propiedad totalPaginas.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalPaginas() {
                return totalPaginas;
            }

            /**
             * Define el valor de la propiedad totalPaginas.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalPaginas(BigInteger value) {
                this.totalPaginas = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="FormaDePago" maxOccurs="7"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="FormaPago" type="{}FormaPagoType"/&gt;
             *                   &lt;element name="MontoPago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "formaDePago"
            })
            public static class TablaFormasPago {

                @XmlElement(name = "FormaDePago", required = true)
                protected List<ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago> formaDePago;

                /**
                 * Gets the value of the formaDePago property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the formaDePago property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFormaDePago().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago }
                 * 
                 * 
                 */
                public List<ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago> getFormaDePago() {
                    if (formaDePago == null) {
                        formaDePago = new ArrayList<ECF.Encabezado.IdDoc.TablaFormasPago.FormaDePago>();
                    }
                    return this.formaDePago;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="FormaPago" type="{}FormaPagoType"/&gt;
                 *         &lt;element name="MontoPago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "formaPago",
                    "montoPago"
                })
                public static class FormaDePago {

                    @XmlElement(name = "FormaPago", required = true)
                    protected BigInteger formaPago;
                    @XmlElement(name = "MontoPago", required = true)
                    protected BigDecimal montoPago;

                    /**
                     * Obtiene el valor de la propiedad formaPago.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getFormaPago() {
                        return formaPago;
                    }

                    /**
                     * Define el valor de la propiedad formaPago.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setFormaPago(BigInteger value) {
                        this.formaPago = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoPago.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoPago() {
                        return montoPago;
                    }

                    /**
                     * Define el valor de la propiedad montoPago.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoPago(BigDecimal value) {
                        this.montoPago = value;
                    }

                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TipoMoneda" type="{}TipoMonedaType" minOccurs="0"/&gt;
         *         &lt;element name="TipoCambio" type="{}Decimal7D1or4ValidationTypeMayorCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoExentoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoTotalOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tipoMoneda",
            "tipoCambio",
            "montoExentoOtraMoneda",
            "montoTotalOtraMoneda"
        })
        public static class OtraMoneda {

            @XmlElement(name = "TipoMoneda")
            @XmlSchemaType(name = "string")
            protected TipoMonedaType tipoMoneda;
            @XmlElement(name = "TipoCambio")
            protected BigDecimal tipoCambio;
            @XmlElement(name = "MontoExentoOtraMoneda")
            protected BigDecimal montoExentoOtraMoneda;
            @XmlElement(name = "MontoTotalOtraMoneda")
            protected BigDecimal montoTotalOtraMoneda;

            /**
             * Obtiene el valor de la propiedad tipoMoneda.
             * 
             * @return
             *     possible object is
             *     {@link TipoMonedaType }
             *     
             */
            public TipoMonedaType getTipoMoneda() {
                return tipoMoneda;
            }

            /**
             * Define el valor de la propiedad tipoMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link TipoMonedaType }
             *     
             */
            public void setTipoMoneda(TipoMonedaType value) {
                this.tipoMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoCambio.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTipoCambio() {
                return tipoCambio;
            }

            /**
             * Define el valor de la propiedad tipoCambio.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTipoCambio(BigDecimal value) {
                this.tipoCambio = value;
            }

            /**
             * Obtiene el valor de la propiedad montoExentoOtraMoneda.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoExentoOtraMoneda() {
                return montoExentoOtraMoneda;
            }

            /**
             * Define el valor de la propiedad montoExentoOtraMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoExentoOtraMoneda(BigDecimal value) {
                this.montoExentoOtraMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad montoTotalOtraMoneda.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTotalOtraMoneda() {
                return montoTotalOtraMoneda;
            }

            /**
             * Define el valor de la propiedad montoTotalOtraMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTotalOtraMoneda(BigDecimal value) {
                this.montoTotalOtraMoneda = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="MontoExento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
         *         &lt;element name="MontoPeriodo" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
         *         &lt;element name="SaldoAnterior" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
         *         &lt;element name="MontoAvancePago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="ValorPagar" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
         *         &lt;element name="TotalISRRetencion" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "montoExento",
            "montoTotal",
            "montoPeriodo",
            "saldoAnterior",
            "montoAvancePago",
            "valorPagar",
            "totalISRRetencion"
        })
        public static class Totales {

            @XmlElement(name = "MontoExento")
            protected BigDecimal montoExento;
            @XmlElement(name = "MontoTotal", required = true)
            protected BigDecimal montoTotal;
            @XmlElement(name = "MontoPeriodo")
            protected BigDecimal montoPeriodo;
            @XmlElement(name = "SaldoAnterior")
            protected BigDecimal saldoAnterior;
            @XmlElement(name = "MontoAvancePago")
            protected BigDecimal montoAvancePago;
            @XmlElement(name = "ValorPagar")
            protected BigDecimal valorPagar;
            @XmlElement(name = "TotalISRRetencion")
            protected BigDecimal totalISRRetencion;

            /**
             * Obtiene el valor de la propiedad montoExento.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoExento() {
                return montoExento;
            }

            /**
             * Define el valor de la propiedad montoExento.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoExento(BigDecimal value) {
                this.montoExento = value;
            }

            /**
             * Obtiene el valor de la propiedad montoTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTotal() {
                return montoTotal;
            }

            /**
             * Define el valor de la propiedad montoTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTotal(BigDecimal value) {
                this.montoTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad montoPeriodo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoPeriodo() {
                return montoPeriodo;
            }

            /**
             * Define el valor de la propiedad montoPeriodo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoPeriodo(BigDecimal value) {
                this.montoPeriodo = value;
            }

            /**
             * Obtiene el valor de la propiedad saldoAnterior.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSaldoAnterior() {
                return saldoAnterior;
            }

            /**
             * Define el valor de la propiedad saldoAnterior.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSaldoAnterior(BigDecimal value) {
                this.saldoAnterior = value;
            }

            /**
             * Obtiene el valor de la propiedad montoAvancePago.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoAvancePago() {
                return montoAvancePago;
            }

            /**
             * Define el valor de la propiedad montoAvancePago.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoAvancePago(BigDecimal value) {
                this.montoAvancePago = value;
            }

            /**
             * Obtiene el valor de la propiedad valorPagar.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorPagar() {
                return valorPagar;
            }

            /**
             * Define el valor de la propiedad valorPagar.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorPagar(BigDecimal value) {
                this.valorPagar = value;
            }

            /**
             * Obtiene el valor de la propiedad totalISRRetencion.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalISRRetencion() {
                return totalISRRetencion;
            }

            /**
             * Define el valor de la propiedad totalISRRetencion.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalISRRetencion(BigDecimal value) {
                this.totalISRRetencion = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PaisDestino" type="{}Alfa60Type" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paisDestino"
        })
        public static class Transporte {

            @XmlElement(name = "PaisDestino")
            protected String paisDestino;

            /**
             * Obtiene el valor de la propiedad paisDestino.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaisDestino() {
                return paisDestino;
            }

            /**
             * Define el valor de la propiedad paisDestino.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaisDestino(String value) {
                this.paisDestino = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NCFModificado" type="{}AlfNum11a19ValidationType" minOccurs="0"/&gt;
     *         &lt;element name="RNCOtroContribuyente" type="{}RNCValidationType" minOccurs="0"/&gt;
     *         &lt;element name="FechaNCFModificado" type="{}FechaValidationType" minOccurs="0"/&gt;
     *         &lt;element name="CodigoModificacion" type="{}CodigoModificacionType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ncfModificado",
        "rncOtroContribuyente",
        "fechaNCFModificado",
        "codigoModificacion"
    })
    public static class InformacionReferencia {

        @XmlElement(name = "NCFModificado")
        protected String ncfModificado;
        @XmlElement(name = "RNCOtroContribuyente")
        protected String rncOtroContribuyente;
        @XmlElement(name = "FechaNCFModificado")
        protected String fechaNCFModificado;
        @XmlElement(name = "CodigoModificacion")
        protected BigInteger codigoModificacion;

        /**
         * Obtiene el valor de la propiedad ncfModificado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNCFModificado() {
            return ncfModificado;
        }

        /**
         * Define el valor de la propiedad ncfModificado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNCFModificado(String value) {
            this.ncfModificado = value;
        }

        /**
         * Obtiene el valor de la propiedad rncOtroContribuyente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRNCOtroContribuyente() {
            return rncOtroContribuyente;
        }

        /**
         * Define el valor de la propiedad rncOtroContribuyente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRNCOtroContribuyente(String value) {
            this.rncOtroContribuyente = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaNCFModificado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaNCFModificado() {
            return fechaNCFModificado;
        }

        /**
         * Define el valor de la propiedad fechaNCFModificado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaNCFModificado(String value) {
            this.fechaNCFModificado = value;
        }

        /**
         * Obtiene el valor de la propiedad codigoModificacion.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodigoModificacion() {
            return codigoModificacion;
        }

        /**
         * Define el valor de la propiedad codigoModificacion.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodigoModificacion(BigInteger value) {
            this.codigoModificacion = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Pagina" maxOccurs="1000"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PaginaNo" type="{}Integer4V1To1000ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="NoLineaDesde" type="{}Integer4V1To1000ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="NoLineaHasta" type="{}Integer4V1To1000ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="SubtotalExentoPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoSubtotalPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pagina"
    })
    public static class Paginacion {

        @XmlElement(name = "Pagina", required = true)
        protected List<ECF.Paginacion.Pagina> pagina;

        /**
         * Gets the value of the pagina property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pagina property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPagina().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECF.Paginacion.Pagina }
         * 
         * 
         */
        public List<ECF.Paginacion.Pagina> getPagina() {
            if (pagina == null) {
                pagina = new ArrayList<ECF.Paginacion.Pagina>();
            }
            return this.pagina;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PaginaNo" type="{}Integer4V1To1000ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="NoLineaDesde" type="{}Integer4V1To1000ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="NoLineaHasta" type="{}Integer4V1To1000ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="SubtotalExentoPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoSubtotalPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "paginaNo",
            "noLineaDesde",
            "noLineaHasta",
            "subtotalExentoPagina",
            "montoSubtotalPagina"
        })
        public static class Pagina {

            @XmlElement(name = "PaginaNo")
            @XmlSchemaType(name = "integer")
            protected Integer paginaNo;
            @XmlElement(name = "NoLineaDesde")
            @XmlSchemaType(name = "integer")
            protected Integer noLineaDesde;
            @XmlElement(name = "NoLineaHasta")
            @XmlSchemaType(name = "integer")
            protected Integer noLineaHasta;
            @XmlElement(name = "SubtotalExentoPagina")
            protected BigDecimal subtotalExentoPagina;
            @XmlElement(name = "MontoSubtotalPagina")
            protected BigDecimal montoSubtotalPagina;

            /**
             * Obtiene el valor de la propiedad paginaNo.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPaginaNo() {
                return paginaNo;
            }

            /**
             * Define el valor de la propiedad paginaNo.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPaginaNo(Integer value) {
                this.paginaNo = value;
            }

            /**
             * Obtiene el valor de la propiedad noLineaDesde.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNoLineaDesde() {
                return noLineaDesde;
            }

            /**
             * Define el valor de la propiedad noLineaDesde.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNoLineaDesde(Integer value) {
                this.noLineaDesde = value;
            }

            /**
             * Obtiene el valor de la propiedad noLineaHasta.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNoLineaHasta() {
                return noLineaHasta;
            }

            /**
             * Define el valor de la propiedad noLineaHasta.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNoLineaHasta(Integer value) {
                this.noLineaHasta = value;
            }

            /**
             * Obtiene el valor de la propiedad subtotalExentoPagina.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubtotalExentoPagina() {
                return subtotalExentoPagina;
            }

            /**
             * Define el valor de la propiedad subtotalExentoPagina.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubtotalExentoPagina(BigDecimal value) {
                this.subtotalExentoPagina = value;
            }

            /**
             * Obtiene el valor de la propiedad montoSubtotalPagina.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoSubtotalPagina() {
                return montoSubtotalPagina;
            }

            /**
             * Define el valor de la propiedad montoSubtotalPagina.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoSubtotalPagina(BigDecimal value) {
                this.montoSubtotalPagina = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Subtotal" maxOccurs="20"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroSubTotal" type="{}Integer2ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="DescripcionSubtotal" type="{}AlfNum40Type" minOccurs="0"/&gt;
     *                   &lt;element name="Orden" type="{}Integer2ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="SubTotalExento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoSubTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="Lineas" type="{}Integer2ValidationType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subtotal"
    })
    public static class Subtotales {

        @XmlElement(name = "Subtotal", required = true)
        protected List<ECF.Subtotales.Subtotal> subtotal;

        /**
         * Gets the value of the subtotal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subtotal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubtotal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECF.Subtotales.Subtotal }
         * 
         * 
         */
        public List<ECF.Subtotales.Subtotal> getSubtotal() {
            if (subtotal == null) {
                subtotal = new ArrayList<ECF.Subtotales.Subtotal>();
            }
            return this.subtotal;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="NumeroSubTotal" type="{}Integer2ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="DescripcionSubtotal" type="{}AlfNum40Type" minOccurs="0"/&gt;
         *         &lt;element name="Orden" type="{}Integer2ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="SubTotalExento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoSubTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="Lineas" type="{}Integer2ValidationType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numeroSubTotal",
            "descripcionSubtotal",
            "orden",
            "subTotalExento",
            "montoSubTotal",
            "lineas"
        })
        public static class Subtotal {

            @XmlElement(name = "NumeroSubTotal")
            protected BigInteger numeroSubTotal;
            @XmlElement(name = "DescripcionSubtotal")
            protected String descripcionSubtotal;
            @XmlElement(name = "Orden")
            protected BigInteger orden;
            @XmlElement(name = "SubTotalExento")
            protected BigDecimal subTotalExento;
            @XmlElement(name = "MontoSubTotal")
            protected BigDecimal montoSubTotal;
            @XmlElement(name = "Lineas")
            protected BigInteger lineas;

            /**
             * Obtiene el valor de la propiedad numeroSubTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumeroSubTotal() {
                return numeroSubTotal;
            }

            /**
             * Define el valor de la propiedad numeroSubTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumeroSubTotal(BigInteger value) {
                this.numeroSubTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcionSubtotal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcionSubtotal() {
                return descripcionSubtotal;
            }

            /**
             * Define el valor de la propiedad descripcionSubtotal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcionSubtotal(String value) {
                this.descripcionSubtotal = value;
            }

            /**
             * Obtiene el valor de la propiedad orden.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getOrden() {
                return orden;
            }

            /**
             * Define el valor de la propiedad orden.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setOrden(BigInteger value) {
                this.orden = value;
            }

            /**
             * Obtiene el valor de la propiedad subTotalExento.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubTotalExento() {
                return subTotalExento;
            }

            /**
             * Define el valor de la propiedad subTotalExento.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubTotalExento(BigDecimal value) {
                this.subTotalExento = value;
            }

            /**
             * Obtiene el valor de la propiedad montoSubTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoSubTotal() {
                return montoSubTotal;
            }

            /**
             * Define el valor de la propiedad montoSubTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoSubTotal(BigDecimal value) {
                this.montoSubTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad lineas.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLineas() {
                return lineas;
            }

            /**
             * Define el valor de la propiedad lineas.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLineas(BigInteger value) {
                this.lineas = value;
            }

        }

    }

}
