//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.07.28 a las 10:03:29 PM COT 
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
 *                             &lt;element name="IndicadorEnvioDiferido" type="{}IndicadorEnvioDiferidoType" minOccurs="0"/&gt;
 *                             &lt;element name="TipoIngresos" type="{}TipoIngresosValidationType"/&gt;
 *                             &lt;element name="TipoPago" type="{}TipoPagoType"/&gt;
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
 *                             &lt;element name="CodigoVendedor" type="{}AlfNum60Type" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroFacturaInterna" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroPedidoInterno" type="{}Integer20ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="ZonaVenta" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="RutaVenta" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="InformacionAdicionalEmisor" type="{}AlfNum250Type" minOccurs="0"/&gt;
 *                             &lt;element name="FechaEmision" type="{}FechaValidationType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Comprador"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RNCComprador" type="{}RNCValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="IdentificadorExtranjero" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="RazonSocialComprador" type="{}AlfNum150Type"/&gt;
 *                             &lt;element name="ContactoComprador" type="{}AlfNum80Type" minOccurs="0"/&gt;
 *                             &lt;element name="CorreoComprador" type="{}CorreoValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="DireccionComprador" type="{}AlfNum100Type" minOccurs="0"/&gt;
 *                             &lt;element name="MunicipioComprador" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
 *                             &lt;element name="ProvinciaComprador" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
 *                             &lt;element name="PaisComprador" type="{}Alfa60Type" minOccurs="0"/&gt;
 *                             &lt;element name="FechaEntrega" type="{}FechaValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="ContactoEntrega" type="{}AlfNum100Type" minOccurs="0"/&gt;
 *                             &lt;element name="DireccionEntrega" type="{}AlfNum100Type" minOccurs="0"/&gt;
 *                             &lt;element name="TelefonoAdicional" type="{}TelefonoValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="FechaOrdenCompra" type="{}FechaValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroOrdenCompra" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="CodigoInternoComprador" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="ResponsablePago" type="{}Alfa20Type" minOccurs="0"/&gt;
 *                             &lt;element name="InformacionAdicionalComprador" type="{}AlfNum150Type" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="InformacionesAdicionales" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FechaEmbarque" type="{}FechaValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroEmbarque" type="{}AlfNum25Type" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroContenedor" type="{}AlfNum100Type" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroReferencia" type="{}Integer20ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="NombrePuertoEmbarque" type="{}AlfNum40Type" minOccurs="0"/&gt;
 *                             &lt;element name="CondicionesEntrega" type="{}Alfa3Type" minOccurs="0"/&gt;
 *                             &lt;element name="TotalFob" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
 *                             &lt;element name="Seguro" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
 *                             &lt;element name="Flete" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
 *                             &lt;element name="OtrosGastos" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
 *                             &lt;element name="TotalCif" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="RegimenAduanero" type="{}Alfa35Type" minOccurs="0"/&gt;
 *                             &lt;element name="NombrePuertoSalida" type="{}AlfNum40Type" minOccurs="0"/&gt;
 *                             &lt;element name="NombrePuertoDesembarque" type="{}AlfNum40Type" minOccurs="0"/&gt;
 *                             &lt;element name="PesoBruto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="PesoNeto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="UnidadPesoBruto" type="{}UnidadMedidaType" minOccurs="0"/&gt;
 *                             &lt;element name="UnidadPesoNeto" type="{}UnidadMedidaType" minOccurs="0"/&gt;
 *                             &lt;element name="CantidadBulto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="UnidadBulto" type="{}UnidadMedidaType" minOccurs="0"/&gt;
 *                             &lt;element name="VolumenBulto" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
 *                             &lt;element name="UnidadVolumen" type="{}UnidadMedidaType" minOccurs="0"/&gt;
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
 *                             &lt;element name="ViaTransporte" type="{}ViaTransporteType" minOccurs="0"/&gt;
 *                             &lt;element name="PaisOrigen" type="{}Alfa60Type" minOccurs="0"/&gt;
 *                             &lt;element name="DireccionDestino" type="{}AlfNum100Type" minOccurs="0"/&gt;
 *                             &lt;element name="PaisDestino" type="{}Alfa60Type" minOccurs="0"/&gt;
 *                             &lt;element name="RNCIdentificacionCompaniaTransportista" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="NombreCompaniaTransportista" type="{}AlfNum150Type" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroViaje" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="Conductor" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="DocumentoTransporte" type="{}Integer20ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="Ficha" type="{}AlfNum10Type" minOccurs="0"/&gt;
 *                             &lt;element name="Placa" type="{}AlfNum7Type" minOccurs="0"/&gt;
 *                             &lt;element name="RutaTransporte" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="ZonaTransporte" type="{}AlfNum20Type" minOccurs="0"/&gt;
 *                             &lt;element name="NumeroAlbaran" type="{}AlfNum20Type" minOccurs="0"/&gt;
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
 *                             &lt;element name="MontoGravadoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoGravadoI3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="ITBIS3" type="{}Integer2ValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="TotalITBIS" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="TotalITBIS3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
 *                             &lt;element name="MontoNoFacturable" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
 *                             &lt;element name="MontoPeriodo" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
 *                             &lt;element name="SaldoAnterior" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
 *                             &lt;element name="MontoAvancePago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="ValorPagar" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
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
 *                             &lt;element name="MontoGravadoTotalOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoGravado3OtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="TotalITBISOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="TotalITBIS3OtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
 *                             &lt;element name="NombreItem" type="{}AlfNum80Type"/&gt;
 *                             &lt;element name="IndicadorBienoServicio" type="{}IndicadorBienoServicioType"/&gt;
 *                             &lt;element name="DescripcionItem" type="{}AlfNum1000Type" minOccurs="0"/&gt;
 *                             &lt;element name="CantidadItem" type="{}Decimal18D1or2ValidationTypeMayorCero"/&gt;
 *                             &lt;element name="UnidadMedida" type="{}UnidadMedidaType" minOccurs="0"/&gt;
 *                             &lt;element name="FechaElaboracion" type="{}FechaValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="FechaVencimientoItem" type="{}FechaValidationType" minOccurs="0"/&gt;
 *                             &lt;element name="Mineria" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PesoNetoKilogramo" type="{}Decimal19D1or3ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                                       &lt;element name="PesoNetoMineria" type="{}Decimal19D1or3ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                                       &lt;element name="TipoAfiliacion" type="{}TipoAfiliacionType" minOccurs="0"/&gt;
 *                                       &lt;element name="Liquidacion" type="{}LiquidacionType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PrecioUnitarioItem" type="{}Decimal20D1or4ValidationTypeMayorIgualCero"/&gt;
 *                             &lt;element name="DescuentoMonto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="TablaSubDescuento" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SubDescuento" maxOccurs="12"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoSubDescuento" type="{}TipoDescuentoRecargoType"/&gt;
 *                                                 &lt;element name="SubDescuentoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoSubDescuento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
 *                             &lt;element name="RecargoMonto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="TablaSubRecargo" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SubRecargo" maxOccurs="12"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="TipoSubRecargo" type="{}TipoDescuentoRecargoType"/&gt;
 *                                                 &lt;element name="SubRecargoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
 *                                                 &lt;element name="MontoSubRecargo" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
 *                             &lt;element name="SubTotalMontoGravadoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="SubTotalMontoGravadoI3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="SubTotaITBIS" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="SubTotaITBIS3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
 *         &lt;element name="DescuentosORecargos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DescuentoORecargo" maxOccurs="20"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NumeroLinea" type="{}Integer2ValidationType"/&gt;
 *                             &lt;element name="TipoAjuste" type="{}TipoAjusteType"/&gt;
 *                             &lt;element name="DescripcionDescuentooRecargo" type="{}AlfNum45Type" minOccurs="0"/&gt;
 *                             &lt;element name="TipoValor" type="{}TipoDescuentoRecargoType" minOccurs="0"/&gt;
 *                             &lt;element name="ValorDescuentooRecargo" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoDescuentooRecargo" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoDescuentooRecargoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="IndicadorFacturacionDescuentooRecargo" type="{}IndicadorFacturacionDRType" minOccurs="0"/&gt;
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
 *                             &lt;element name="SubtotalMontoGravadoPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="SubtotalMontoGravado3Pagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="SubtotalItbisPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="SubtotalItbis3Pagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="MontoSubtotalPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
 *                             &lt;element name="SubtotalMontoNoFacturablePagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
    "descuentosORecargos",
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
    @XmlElement(name = "DescuentosORecargos")
    protected ECF.DescuentosORecargos descuentosORecargos;
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
     * Obtiene el valor de la propiedad descuentosORecargos.
     * 
     * @return
     *     possible object is
     *     {@link ECF.DescuentosORecargos }
     *     
     */
    public ECF.DescuentosORecargos getDescuentosORecargos() {
        return descuentosORecargos;
    }

    /**
     * Define el valor de la propiedad descuentosORecargos.
     * 
     * @param value
     *     allowed object is
     *     {@link ECF.DescuentosORecargos }
     *     
     */
    public void setDescuentosORecargos(ECF.DescuentosORecargos value) {
        this.descuentosORecargos = value;
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
     *         &lt;element name="DescuentoORecargo" maxOccurs="20"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NumeroLinea" type="{}Integer2ValidationType"/&gt;
     *                   &lt;element name="TipoAjuste" type="{}TipoAjusteType"/&gt;
     *                   &lt;element name="DescripcionDescuentooRecargo" type="{}AlfNum45Type" minOccurs="0"/&gt;
     *                   &lt;element name="TipoValor" type="{}TipoDescuentoRecargoType" minOccurs="0"/&gt;
     *                   &lt;element name="ValorDescuentooRecargo" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoDescuentooRecargo" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoDescuentooRecargoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="IndicadorFacturacionDescuentooRecargo" type="{}IndicadorFacturacionDRType" minOccurs="0"/&gt;
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
        "descuentoORecargo"
    })
    public static class DescuentosORecargos {

        @XmlElement(name = "DescuentoORecargo", required = true)
        protected List<ECF.DescuentosORecargos.DescuentoORecargo> descuentoORecargo;

        /**
         * Gets the value of the descuentoORecargo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descuentoORecargo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescuentoORecargo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ECF.DescuentosORecargos.DescuentoORecargo }
         * 
         * 
         */
        public List<ECF.DescuentosORecargos.DescuentoORecargo> getDescuentoORecargo() {
            if (descuentoORecargo == null) {
                descuentoORecargo = new ArrayList<ECF.DescuentosORecargos.DescuentoORecargo>();
            }
            return this.descuentoORecargo;
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
         *         &lt;element name="NumeroLinea" type="{}Integer2ValidationType"/&gt;
         *         &lt;element name="TipoAjuste" type="{}TipoAjusteType"/&gt;
         *         &lt;element name="DescripcionDescuentooRecargo" type="{}AlfNum45Type" minOccurs="0"/&gt;
         *         &lt;element name="TipoValor" type="{}TipoDescuentoRecargoType" minOccurs="0"/&gt;
         *         &lt;element name="ValorDescuentooRecargo" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoDescuentooRecargo" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoDescuentooRecargoOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="IndicadorFacturacionDescuentooRecargo" type="{}IndicadorFacturacionDRType" minOccurs="0"/&gt;
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
            "tipoAjuste",
            "descripcionDescuentooRecargo",
            "tipoValor",
            "valorDescuentooRecargo",
            "montoDescuentooRecargo",
            "montoDescuentooRecargoOtraMoneda",
            "indicadorFacturacionDescuentooRecargo"
        })
        public static class DescuentoORecargo {

            @XmlElement(name = "NumeroLinea", required = true)
            protected BigInteger numeroLinea;
            @XmlElement(name = "TipoAjuste", required = true)
            @XmlSchemaType(name = "string")
            protected TipoAjusteType tipoAjuste;
            @XmlElement(name = "DescripcionDescuentooRecargo")
            protected String descripcionDescuentooRecargo;
            @XmlElement(name = "TipoValor")
            protected String tipoValor;
            @XmlElement(name = "ValorDescuentooRecargo")
            protected BigDecimal valorDescuentooRecargo;
            @XmlElement(name = "MontoDescuentooRecargo")
            protected BigDecimal montoDescuentooRecargo;
            @XmlElement(name = "MontoDescuentooRecargoOtraMoneda")
            protected BigDecimal montoDescuentooRecargoOtraMoneda;
            @XmlElement(name = "IndicadorFacturacionDescuentooRecargo")
            protected BigInteger indicadorFacturacionDescuentooRecargo;

            /**
             * Obtiene el valor de la propiedad numeroLinea.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumeroLinea() {
                return numeroLinea;
            }

            /**
             * Define el valor de la propiedad numeroLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumeroLinea(BigInteger value) {
                this.numeroLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoAjuste.
             * 
             * @return
             *     possible object is
             *     {@link TipoAjusteType }
             *     
             */
            public TipoAjusteType getTipoAjuste() {
                return tipoAjuste;
            }

            /**
             * Define el valor de la propiedad tipoAjuste.
             * 
             * @param value
             *     allowed object is
             *     {@link TipoAjusteType }
             *     
             */
            public void setTipoAjuste(TipoAjusteType value) {
                this.tipoAjuste = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcionDescuentooRecargo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcionDescuentooRecargo() {
                return descripcionDescuentooRecargo;
            }

            /**
             * Define el valor de la propiedad descripcionDescuentooRecargo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcionDescuentooRecargo(String value) {
                this.descripcionDescuentooRecargo = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoValor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoValor() {
                return tipoValor;
            }

            /**
             * Define el valor de la propiedad tipoValor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoValor(String value) {
                this.tipoValor = value;
            }

            /**
             * Obtiene el valor de la propiedad valorDescuentooRecargo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorDescuentooRecargo() {
                return valorDescuentooRecargo;
            }

            /**
             * Define el valor de la propiedad valorDescuentooRecargo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorDescuentooRecargo(BigDecimal value) {
                this.valorDescuentooRecargo = value;
            }

            /**
             * Obtiene el valor de la propiedad montoDescuentooRecargo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoDescuentooRecargo() {
                return montoDescuentooRecargo;
            }

            /**
             * Define el valor de la propiedad montoDescuentooRecargo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoDescuentooRecargo(BigDecimal value) {
                this.montoDescuentooRecargo = value;
            }

            /**
             * Obtiene el valor de la propiedad montoDescuentooRecargoOtraMoneda.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoDescuentooRecargoOtraMoneda() {
                return montoDescuentooRecargoOtraMoneda;
            }

            /**
             * Define el valor de la propiedad montoDescuentooRecargoOtraMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoDescuentooRecargoOtraMoneda(BigDecimal value) {
                this.montoDescuentooRecargoOtraMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad indicadorFacturacionDescuentooRecargo.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIndicadorFacturacionDescuentooRecargo() {
                return indicadorFacturacionDescuentooRecargo;
            }

            /**
             * Define el valor de la propiedad indicadorFacturacionDescuentooRecargo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIndicadorFacturacionDescuentooRecargo(BigInteger value) {
                this.indicadorFacturacionDescuentooRecargo = value;
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
     *                   &lt;element name="NombreItem" type="{}AlfNum80Type"/&gt;
     *                   &lt;element name="IndicadorBienoServicio" type="{}IndicadorBienoServicioType"/&gt;
     *                   &lt;element name="DescripcionItem" type="{}AlfNum1000Type" minOccurs="0"/&gt;
     *                   &lt;element name="CantidadItem" type="{}Decimal18D1or2ValidationTypeMayorCero"/&gt;
     *                   &lt;element name="UnidadMedida" type="{}UnidadMedidaType" minOccurs="0"/&gt;
     *                   &lt;element name="FechaElaboracion" type="{}FechaValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="FechaVencimientoItem" type="{}FechaValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="Mineria" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PesoNetoKilogramo" type="{}Decimal19D1or3ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                             &lt;element name="PesoNetoMineria" type="{}Decimal19D1or3ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                             &lt;element name="TipoAfiliacion" type="{}TipoAfiliacionType" minOccurs="0"/&gt;
     *                             &lt;element name="Liquidacion" type="{}LiquidacionType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PrecioUnitarioItem" type="{}Decimal20D1or4ValidationTypeMayorIgualCero"/&gt;
     *                   &lt;element name="DescuentoMonto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="TablaSubDescuento" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SubDescuento" maxOccurs="12"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoSubDescuento" type="{}TipoDescuentoRecargoType"/&gt;
     *                                       &lt;element name="SubDescuentoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoSubDescuento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
     *                   &lt;element name="RecargoMonto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="TablaSubRecargo" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SubRecargo" maxOccurs="12"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="TipoSubRecargo" type="{}TipoDescuentoRecargoType"/&gt;
     *                                       &lt;element name="SubRecargoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
     *                                       &lt;element name="MontoSubRecargo" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
         *         &lt;element name="NombreItem" type="{}AlfNum80Type"/&gt;
         *         &lt;element name="IndicadorBienoServicio" type="{}IndicadorBienoServicioType"/&gt;
         *         &lt;element name="DescripcionItem" type="{}AlfNum1000Type" minOccurs="0"/&gt;
         *         &lt;element name="CantidadItem" type="{}Decimal18D1or2ValidationTypeMayorCero"/&gt;
         *         &lt;element name="UnidadMedida" type="{}UnidadMedidaType" minOccurs="0"/&gt;
         *         &lt;element name="FechaElaboracion" type="{}FechaValidationType" minOccurs="0"/&gt;
         *         &lt;element name="FechaVencimientoItem" type="{}FechaValidationType" minOccurs="0"/&gt;
         *         &lt;element name="Mineria" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PesoNetoKilogramo" type="{}Decimal19D1or3ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *                   &lt;element name="PesoNetoMineria" type="{}Decimal19D1or3ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *                   &lt;element name="TipoAfiliacion" type="{}TipoAfiliacionType" minOccurs="0"/&gt;
         *                   &lt;element name="Liquidacion" type="{}LiquidacionType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PrecioUnitarioItem" type="{}Decimal20D1or4ValidationTypeMayorIgualCero"/&gt;
         *         &lt;element name="DescuentoMonto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="TablaSubDescuento" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SubDescuento" maxOccurs="12"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoSubDescuento" type="{}TipoDescuentoRecargoType"/&gt;
         *                             &lt;element name="SubDescuentoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
         *                             &lt;element name="MontoSubDescuento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
         *         &lt;element name="RecargoMonto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="TablaSubRecargo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SubRecargo" maxOccurs="12"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="TipoSubRecargo" type="{}TipoDescuentoRecargoType"/&gt;
         *                             &lt;element name="SubRecargoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
         *                             &lt;element name="MontoSubRecargo" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
            "nombreItem",
            "indicadorBienoServicio",
            "descripcionItem",
            "cantidadItem",
            "unidadMedida",
            "fechaElaboracion",
            "fechaVencimientoItem",
            "mineria",
            "precioUnitarioItem",
            "descuentoMonto",
            "tablaSubDescuento",
            "recargoMonto",
            "tablaSubRecargo",
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
            @XmlElement(name = "FechaElaboracion")
            protected String fechaElaboracion;
            @XmlElement(name = "FechaVencimientoItem")
            protected String fechaVencimientoItem;
            @XmlElement(name = "Mineria")
            protected ECF.DetallesItems.Item.Mineria mineria;
            @XmlElement(name = "PrecioUnitarioItem", required = true)
            protected BigDecimal precioUnitarioItem;
            @XmlElement(name = "DescuentoMonto")
            protected BigDecimal descuentoMonto;
            @XmlElement(name = "TablaSubDescuento")
            protected ECF.DetallesItems.Item.TablaSubDescuento tablaSubDescuento;
            @XmlElement(name = "RecargoMonto")
            protected BigDecimal recargoMonto;
            @XmlElement(name = "TablaSubRecargo")
            protected ECF.DetallesItems.Item.TablaSubRecargo tablaSubRecargo;
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
             * Obtiene el valor de la propiedad fechaElaboracion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaElaboracion() {
                return fechaElaboracion;
            }

            /**
             * Define el valor de la propiedad fechaElaboracion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaElaboracion(String value) {
                this.fechaElaboracion = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaVencimientoItem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaVencimientoItem() {
                return fechaVencimientoItem;
            }

            /**
             * Define el valor de la propiedad fechaVencimientoItem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaVencimientoItem(String value) {
                this.fechaVencimientoItem = value;
            }

            /**
             * Obtiene el valor de la propiedad mineria.
             * 
             * @return
             *     possible object is
             *     {@link ECF.DetallesItems.Item.Mineria }
             *     
             */
            public ECF.DetallesItems.Item.Mineria getMineria() {
                return mineria;
            }

            /**
             * Define el valor de la propiedad mineria.
             * 
             * @param value
             *     allowed object is
             *     {@link ECF.DetallesItems.Item.Mineria }
             *     
             */
            public void setMineria(ECF.DetallesItems.Item.Mineria value) {
                this.mineria = value;
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
             * Obtiene el valor de la propiedad descuentoMonto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDescuentoMonto() {
                return descuentoMonto;
            }

            /**
             * Define el valor de la propiedad descuentoMonto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDescuentoMonto(BigDecimal value) {
                this.descuentoMonto = value;
            }

            /**
             * Obtiene el valor de la propiedad tablaSubDescuento.
             * 
             * @return
             *     possible object is
             *     {@link ECF.DetallesItems.Item.TablaSubDescuento }
             *     
             */
            public ECF.DetallesItems.Item.TablaSubDescuento getTablaSubDescuento() {
                return tablaSubDescuento;
            }

            /**
             * Define el valor de la propiedad tablaSubDescuento.
             * 
             * @param value
             *     allowed object is
             *     {@link ECF.DetallesItems.Item.TablaSubDescuento }
             *     
             */
            public void setTablaSubDescuento(ECF.DetallesItems.Item.TablaSubDescuento value) {
                this.tablaSubDescuento = value;
            }

            /**
             * Obtiene el valor de la propiedad recargoMonto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getRecargoMonto() {
                return recargoMonto;
            }

            /**
             * Define el valor de la propiedad recargoMonto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setRecargoMonto(BigDecimal value) {
                this.recargoMonto = value;
            }

            /**
             * Obtiene el valor de la propiedad tablaSubRecargo.
             * 
             * @return
             *     possible object is
             *     {@link ECF.DetallesItems.Item.TablaSubRecargo }
             *     
             */
            public ECF.DetallesItems.Item.TablaSubRecargo getTablaSubRecargo() {
                return tablaSubRecargo;
            }

            /**
             * Define el valor de la propiedad tablaSubRecargo.
             * 
             * @param value
             *     allowed object is
             *     {@link ECF.DetallesItems.Item.TablaSubRecargo }
             *     
             */
            public void setTablaSubRecargo(ECF.DetallesItems.Item.TablaSubRecargo value) {
                this.tablaSubRecargo = value;
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
             *         &lt;element name="PesoNetoKilogramo" type="{}Decimal19D1or3ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
             *         &lt;element name="PesoNetoMineria" type="{}Decimal19D1or3ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
             *         &lt;element name="TipoAfiliacion" type="{}TipoAfiliacionType" minOccurs="0"/&gt;
             *         &lt;element name="Liquidacion" type="{}LiquidacionType" minOccurs="0"/&gt;
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
                "pesoNetoKilogramo",
                "pesoNetoMineria",
                "tipoAfiliacion",
                "liquidacion"
            })
            public static class Mineria {

                @XmlElement(name = "PesoNetoKilogramo")
                protected BigDecimal pesoNetoKilogramo;
                @XmlElement(name = "PesoNetoMineria")
                protected BigDecimal pesoNetoMineria;
                @XmlElement(name = "TipoAfiliacion")
                protected BigInteger tipoAfiliacion;
                @XmlElement(name = "Liquidacion")
                protected BigInteger liquidacion;

                /**
                 * Obtiene el valor de la propiedad pesoNetoKilogramo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPesoNetoKilogramo() {
                    return pesoNetoKilogramo;
                }

                /**
                 * Define el valor de la propiedad pesoNetoKilogramo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPesoNetoKilogramo(BigDecimal value) {
                    this.pesoNetoKilogramo = value;
                }

                /**
                 * Obtiene el valor de la propiedad pesoNetoMineria.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPesoNetoMineria() {
                    return pesoNetoMineria;
                }

                /**
                 * Define el valor de la propiedad pesoNetoMineria.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPesoNetoMineria(BigDecimal value) {
                    this.pesoNetoMineria = value;
                }

                /**
                 * Obtiene el valor de la propiedad tipoAfiliacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getTipoAfiliacion() {
                    return tipoAfiliacion;
                }

                /**
                 * Define el valor de la propiedad tipoAfiliacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setTipoAfiliacion(BigInteger value) {
                    this.tipoAfiliacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad liquidacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getLiquidacion() {
                    return liquidacion;
                }

                /**
                 * Define el valor de la propiedad liquidacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setLiquidacion(BigInteger value) {
                    this.liquidacion = value;
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
             *         &lt;element name="SubDescuento" maxOccurs="12"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoSubDescuento" type="{}TipoDescuentoRecargoType"/&gt;
             *                   &lt;element name="SubDescuentoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
             *                   &lt;element name="MontoSubDescuento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
                "subDescuento"
            })
            public static class TablaSubDescuento {

                @XmlElement(name = "SubDescuento", required = true)
                protected List<ECF.DetallesItems.Item.TablaSubDescuento.SubDescuento> subDescuento;

                /**
                 * Gets the value of the subDescuento property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the subDescuento property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSubDescuento().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ECF.DetallesItems.Item.TablaSubDescuento.SubDescuento }
                 * 
                 * 
                 */
                public List<ECF.DetallesItems.Item.TablaSubDescuento.SubDescuento> getSubDescuento() {
                    if (subDescuento == null) {
                        subDescuento = new ArrayList<ECF.DetallesItems.Item.TablaSubDescuento.SubDescuento>();
                    }
                    return this.subDescuento;
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
                 *         &lt;element name="TipoSubDescuento" type="{}TipoDescuentoRecargoType"/&gt;
                 *         &lt;element name="SubDescuentoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
                 *         &lt;element name="MontoSubDescuento" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
                    "tipoSubDescuento",
                    "subDescuentoPorcentaje",
                    "montoSubDescuento"
                })
                public static class SubDescuento {

                    @XmlElement(name = "TipoSubDescuento", required = true)
                    protected String tipoSubDescuento;
                    @XmlElement(name = "SubDescuentoPorcentaje")
                    protected BigDecimal subDescuentoPorcentaje;
                    @XmlElement(name = "MontoSubDescuento")
                    protected BigDecimal montoSubDescuento;

                    /**
                     * Obtiene el valor de la propiedad tipoSubDescuento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipoSubDescuento() {
                        return tipoSubDescuento;
                    }

                    /**
                     * Define el valor de la propiedad tipoSubDescuento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipoSubDescuento(String value) {
                        this.tipoSubDescuento = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad subDescuentoPorcentaje.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSubDescuentoPorcentaje() {
                        return subDescuentoPorcentaje;
                    }

                    /**
                     * Define el valor de la propiedad subDescuentoPorcentaje.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSubDescuentoPorcentaje(BigDecimal value) {
                        this.subDescuentoPorcentaje = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoSubDescuento.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoSubDescuento() {
                        return montoSubDescuento;
                    }

                    /**
                     * Define el valor de la propiedad montoSubDescuento.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoSubDescuento(BigDecimal value) {
                        this.montoSubDescuento = value;
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
             *         &lt;element name="SubRecargo" maxOccurs="12"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="TipoSubRecargo" type="{}TipoDescuentoRecargoType"/&gt;
             *                   &lt;element name="SubRecargoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
             *                   &lt;element name="MontoSubRecargo" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
                "subRecargo"
            })
            public static class TablaSubRecargo {

                @XmlElement(name = "SubRecargo", required = true)
                protected List<ECF.DetallesItems.Item.TablaSubRecargo.SubRecargo> subRecargo;

                /**
                 * Gets the value of the subRecargo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the subRecargo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSubRecargo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ECF.DetallesItems.Item.TablaSubRecargo.SubRecargo }
                 * 
                 * 
                 */
                public List<ECF.DetallesItems.Item.TablaSubRecargo.SubRecargo> getSubRecargo() {
                    if (subRecargo == null) {
                        subRecargo = new ArrayList<ECF.DetallesItems.Item.TablaSubRecargo.SubRecargo>();
                    }
                    return this.subRecargo;
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
                 *         &lt;element name="TipoSubRecargo" type="{}TipoDescuentoRecargoType"/&gt;
                 *         &lt;element name="SubRecargoPorcentaje" type="{}Decimal5D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
                 *         &lt;element name="MontoSubRecargo" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
                    "tipoSubRecargo",
                    "subRecargoPorcentaje",
                    "montoSubRecargo"
                })
                public static class SubRecargo {

                    @XmlElement(name = "TipoSubRecargo", required = true)
                    protected String tipoSubRecargo;
                    @XmlElement(name = "SubRecargoPorcentaje")
                    protected BigDecimal subRecargoPorcentaje;
                    @XmlElement(name = "MontoSubRecargo")
                    protected BigDecimal montoSubRecargo;

                    /**
                     * Obtiene el valor de la propiedad tipoSubRecargo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTipoSubRecargo() {
                        return tipoSubRecargo;
                    }

                    /**
                     * Define el valor de la propiedad tipoSubRecargo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTipoSubRecargo(String value) {
                        this.tipoSubRecargo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad subRecargoPorcentaje.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSubRecargoPorcentaje() {
                        return subRecargoPorcentaje;
                    }

                    /**
                     * Define el valor de la propiedad subRecargoPorcentaje.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSubRecargoPorcentaje(BigDecimal value) {
                        this.subRecargoPorcentaje = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad montoSubRecargo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMontoSubRecargo() {
                        return montoSubRecargo;
                    }

                    /**
                     * Define el valor de la propiedad montoSubRecargo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMontoSubRecargo(BigDecimal value) {
                        this.montoSubRecargo = value;
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
     *                   &lt;element name="IndicadorEnvioDiferido" type="{}IndicadorEnvioDiferidoType" minOccurs="0"/&gt;
     *                   &lt;element name="TipoIngresos" type="{}TipoIngresosValidationType"/&gt;
     *                   &lt;element name="TipoPago" type="{}TipoPagoType"/&gt;
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
     *                   &lt;element name="CodigoVendedor" type="{}AlfNum60Type" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroFacturaInterna" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroPedidoInterno" type="{}Integer20ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="ZonaVenta" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="RutaVenta" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="InformacionAdicionalEmisor" type="{}AlfNum250Type" minOccurs="0"/&gt;
     *                   &lt;element name="FechaEmision" type="{}FechaValidationType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Comprador"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RNCComprador" type="{}RNCValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="IdentificadorExtranjero" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="RazonSocialComprador" type="{}AlfNum150Type"/&gt;
     *                   &lt;element name="ContactoComprador" type="{}AlfNum80Type" minOccurs="0"/&gt;
     *                   &lt;element name="CorreoComprador" type="{}CorreoValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="DireccionComprador" type="{}AlfNum100Type" minOccurs="0"/&gt;
     *                   &lt;element name="MunicipioComprador" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
     *                   &lt;element name="ProvinciaComprador" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
     *                   &lt;element name="PaisComprador" type="{}Alfa60Type" minOccurs="0"/&gt;
     *                   &lt;element name="FechaEntrega" type="{}FechaValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="ContactoEntrega" type="{}AlfNum100Type" minOccurs="0"/&gt;
     *                   &lt;element name="DireccionEntrega" type="{}AlfNum100Type" minOccurs="0"/&gt;
     *                   &lt;element name="TelefonoAdicional" type="{}TelefonoValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="FechaOrdenCompra" type="{}FechaValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroOrdenCompra" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="CodigoInternoComprador" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="ResponsablePago" type="{}Alfa20Type" minOccurs="0"/&gt;
     *                   &lt;element name="InformacionAdicionalComprador" type="{}AlfNum150Type" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="InformacionesAdicionales" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FechaEmbarque" type="{}FechaValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroEmbarque" type="{}AlfNum25Type" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroContenedor" type="{}AlfNum100Type" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroReferencia" type="{}Integer20ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="NombrePuertoEmbarque" type="{}AlfNum40Type" minOccurs="0"/&gt;
     *                   &lt;element name="CondicionesEntrega" type="{}Alfa3Type" minOccurs="0"/&gt;
     *                   &lt;element name="TotalFob" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
     *                   &lt;element name="Seguro" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
     *                   &lt;element name="Flete" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
     *                   &lt;element name="OtrosGastos" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
     *                   &lt;element name="TotalCif" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="RegimenAduanero" type="{}Alfa35Type" minOccurs="0"/&gt;
     *                   &lt;element name="NombrePuertoSalida" type="{}AlfNum40Type" minOccurs="0"/&gt;
     *                   &lt;element name="NombrePuertoDesembarque" type="{}AlfNum40Type" minOccurs="0"/&gt;
     *                   &lt;element name="PesoBruto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="PesoNeto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="UnidadPesoBruto" type="{}UnidadMedidaType" minOccurs="0"/&gt;
     *                   &lt;element name="UnidadPesoNeto" type="{}UnidadMedidaType" minOccurs="0"/&gt;
     *                   &lt;element name="CantidadBulto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="UnidadBulto" type="{}UnidadMedidaType" minOccurs="0"/&gt;
     *                   &lt;element name="VolumenBulto" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
     *                   &lt;element name="UnidadVolumen" type="{}UnidadMedidaType" minOccurs="0"/&gt;
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
     *                   &lt;element name="ViaTransporte" type="{}ViaTransporteType" minOccurs="0"/&gt;
     *                   &lt;element name="PaisOrigen" type="{}Alfa60Type" minOccurs="0"/&gt;
     *                   &lt;element name="DireccionDestino" type="{}AlfNum100Type" minOccurs="0"/&gt;
     *                   &lt;element name="PaisDestino" type="{}Alfa60Type" minOccurs="0"/&gt;
     *                   &lt;element name="RNCIdentificacionCompaniaTransportista" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="NombreCompaniaTransportista" type="{}AlfNum150Type" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroViaje" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="Conductor" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="DocumentoTransporte" type="{}Integer20ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="Ficha" type="{}AlfNum10Type" minOccurs="0"/&gt;
     *                   &lt;element name="Placa" type="{}AlfNum7Type" minOccurs="0"/&gt;
     *                   &lt;element name="RutaTransporte" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="ZonaTransporte" type="{}AlfNum20Type" minOccurs="0"/&gt;
     *                   &lt;element name="NumeroAlbaran" type="{}AlfNum20Type" minOccurs="0"/&gt;
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
     *                   &lt;element name="MontoGravadoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoGravadoI3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="ITBIS3" type="{}Integer2ValidationType" minOccurs="0"/&gt;
     *                   &lt;element name="TotalITBIS" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="TotalITBIS3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
     *                   &lt;element name="MontoNoFacturable" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
     *                   &lt;element name="MontoPeriodo" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
     *                   &lt;element name="SaldoAnterior" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
     *                   &lt;element name="MontoAvancePago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="ValorPagar" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
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
     *                   &lt;element name="MontoGravadoTotalOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoGravado3OtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="TotalITBISOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="TotalITBIS3OtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
        "informacionesAdicionales",
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
        @XmlElement(name = "Comprador", required = true)
        protected ECF.Encabezado.Comprador comprador;
        @XmlElement(name = "InformacionesAdicionales")
        protected ECF.Encabezado.InformacionesAdicionales informacionesAdicionales;
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
         * Obtiene el valor de la propiedad informacionesAdicionales.
         * 
         * @return
         *     possible object is
         *     {@link ECF.Encabezado.InformacionesAdicionales }
         *     
         */
        public ECF.Encabezado.InformacionesAdicionales getInformacionesAdicionales() {
            return informacionesAdicionales;
        }

        /**
         * Define el valor de la propiedad informacionesAdicionales.
         * 
         * @param value
         *     allowed object is
         *     {@link ECF.Encabezado.InformacionesAdicionales }
         *     
         */
        public void setInformacionesAdicionales(ECF.Encabezado.InformacionesAdicionales value) {
            this.informacionesAdicionales = value;
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
         *         &lt;element name="RNCComprador" type="{}RNCValidationType" minOccurs="0"/&gt;
         *         &lt;element name="IdentificadorExtranjero" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="RazonSocialComprador" type="{}AlfNum150Type"/&gt;
         *         &lt;element name="ContactoComprador" type="{}AlfNum80Type" minOccurs="0"/&gt;
         *         &lt;element name="CorreoComprador" type="{}CorreoValidationType" minOccurs="0"/&gt;
         *         &lt;element name="DireccionComprador" type="{}AlfNum100Type" minOccurs="0"/&gt;
         *         &lt;element name="MunicipioComprador" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
         *         &lt;element name="ProvinciaComprador" type="{}ProvinciaMunicipioType" minOccurs="0"/&gt;
         *         &lt;element name="PaisComprador" type="{}Alfa60Type" minOccurs="0"/&gt;
         *         &lt;element name="FechaEntrega" type="{}FechaValidationType" minOccurs="0"/&gt;
         *         &lt;element name="ContactoEntrega" type="{}AlfNum100Type" minOccurs="0"/&gt;
         *         &lt;element name="DireccionEntrega" type="{}AlfNum100Type" minOccurs="0"/&gt;
         *         &lt;element name="TelefonoAdicional" type="{}TelefonoValidationType" minOccurs="0"/&gt;
         *         &lt;element name="FechaOrdenCompra" type="{}FechaValidationType" minOccurs="0"/&gt;
         *         &lt;element name="NumeroOrdenCompra" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="CodigoInternoComprador" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="ResponsablePago" type="{}Alfa20Type" minOccurs="0"/&gt;
         *         &lt;element name="InformacionAdicionalComprador" type="{}AlfNum150Type" minOccurs="0"/&gt;
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
            "rncComprador",
            "identificadorExtranjero",
            "razonSocialComprador",
            "contactoComprador",
            "correoComprador",
            "direccionComprador",
            "municipioComprador",
            "provinciaComprador",
            "paisComprador",
            "fechaEntrega",
            "contactoEntrega",
            "direccionEntrega",
            "telefonoAdicional",
            "fechaOrdenCompra",
            "numeroOrdenCompra",
            "codigoInternoComprador",
            "responsablePago",
            "informacionAdicionalComprador"
        })
        public static class Comprador {

            @XmlElement(name = "RNCComprador")
            protected String rncComprador;
            @XmlElement(name = "IdentificadorExtranjero")
            protected String identificadorExtranjero;
            @XmlElement(name = "RazonSocialComprador", required = true)
            protected String razonSocialComprador;
            @XmlElement(name = "ContactoComprador")
            protected String contactoComprador;
            @XmlElement(name = "CorreoComprador")
            protected String correoComprador;
            @XmlElement(name = "DireccionComprador")
            protected String direccionComprador;
            @XmlElement(name = "MunicipioComprador")
            protected String municipioComprador;
            @XmlElement(name = "ProvinciaComprador")
            protected String provinciaComprador;
            @XmlElement(name = "PaisComprador")
            protected String paisComprador;
            @XmlElement(name = "FechaEntrega")
            protected String fechaEntrega;
            @XmlElement(name = "ContactoEntrega")
            protected String contactoEntrega;
            @XmlElement(name = "DireccionEntrega")
            protected String direccionEntrega;
            @XmlElement(name = "TelefonoAdicional")
            protected String telefonoAdicional;
            @XmlElement(name = "FechaOrdenCompra")
            protected String fechaOrdenCompra;
            @XmlElement(name = "NumeroOrdenCompra")
            protected String numeroOrdenCompra;
            @XmlElement(name = "CodigoInternoComprador")
            protected String codigoInternoComprador;
            @XmlElement(name = "ResponsablePago")
            protected String responsablePago;
            @XmlElement(name = "InformacionAdicionalComprador")
            protected String informacionAdicionalComprador;

            /**
             * Obtiene el valor de la propiedad rncComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRNCComprador() {
                return rncComprador;
            }

            /**
             * Define el valor de la propiedad rncComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRNCComprador(String value) {
                this.rncComprador = value;
            }

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

            /**
             * Obtiene el valor de la propiedad contactoComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactoComprador() {
                return contactoComprador;
            }

            /**
             * Define el valor de la propiedad contactoComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactoComprador(String value) {
                this.contactoComprador = value;
            }

            /**
             * Obtiene el valor de la propiedad correoComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorreoComprador() {
                return correoComprador;
            }

            /**
             * Define el valor de la propiedad correoComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorreoComprador(String value) {
                this.correoComprador = value;
            }

            /**
             * Obtiene el valor de la propiedad direccionComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionComprador() {
                return direccionComprador;
            }

            /**
             * Define el valor de la propiedad direccionComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionComprador(String value) {
                this.direccionComprador = value;
            }

            /**
             * Obtiene el valor de la propiedad municipioComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMunicipioComprador() {
                return municipioComprador;
            }

            /**
             * Define el valor de la propiedad municipioComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMunicipioComprador(String value) {
                this.municipioComprador = value;
            }

            /**
             * Obtiene el valor de la propiedad provinciaComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvinciaComprador() {
                return provinciaComprador;
            }

            /**
             * Define el valor de la propiedad provinciaComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvinciaComprador(String value) {
                this.provinciaComprador = value;
            }

            /**
             * Obtiene el valor de la propiedad paisComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaisComprador() {
                return paisComprador;
            }

            /**
             * Define el valor de la propiedad paisComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaisComprador(String value) {
                this.paisComprador = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaEntrega.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaEntrega() {
                return fechaEntrega;
            }

            /**
             * Define el valor de la propiedad fechaEntrega.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaEntrega(String value) {
                this.fechaEntrega = value;
            }

            /**
             * Obtiene el valor de la propiedad contactoEntrega.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactoEntrega() {
                return contactoEntrega;
            }

            /**
             * Define el valor de la propiedad contactoEntrega.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactoEntrega(String value) {
                this.contactoEntrega = value;
            }

            /**
             * Obtiene el valor de la propiedad direccionEntrega.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionEntrega() {
                return direccionEntrega;
            }

            /**
             * Define el valor de la propiedad direccionEntrega.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionEntrega(String value) {
                this.direccionEntrega = value;
            }

            /**
             * Obtiene el valor de la propiedad telefonoAdicional.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelefonoAdicional() {
                return telefonoAdicional;
            }

            /**
             * Define el valor de la propiedad telefonoAdicional.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelefonoAdicional(String value) {
                this.telefonoAdicional = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaOrdenCompra.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaOrdenCompra() {
                return fechaOrdenCompra;
            }

            /**
             * Define el valor de la propiedad fechaOrdenCompra.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaOrdenCompra(String value) {
                this.fechaOrdenCompra = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroOrdenCompra.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroOrdenCompra() {
                return numeroOrdenCompra;
            }

            /**
             * Define el valor de la propiedad numeroOrdenCompra.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroOrdenCompra(String value) {
                this.numeroOrdenCompra = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoInternoComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoInternoComprador() {
                return codigoInternoComprador;
            }

            /**
             * Define el valor de la propiedad codigoInternoComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoInternoComprador(String value) {
                this.codigoInternoComprador = value;
            }

            /**
             * Obtiene el valor de la propiedad responsablePago.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponsablePago() {
                return responsablePago;
            }

            /**
             * Define el valor de la propiedad responsablePago.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponsablePago(String value) {
                this.responsablePago = value;
            }

            /**
             * Obtiene el valor de la propiedad informacionAdicionalComprador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInformacionAdicionalComprador() {
                return informacionAdicionalComprador;
            }

            /**
             * Define el valor de la propiedad informacionAdicionalComprador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInformacionAdicionalComprador(String value) {
                this.informacionAdicionalComprador = value;
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
         *         &lt;element name="CodigoVendedor" type="{}AlfNum60Type" minOccurs="0"/&gt;
         *         &lt;element name="NumeroFacturaInterna" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="NumeroPedidoInterno" type="{}Integer20ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="ZonaVenta" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="RutaVenta" type="{}AlfNum20Type" minOccurs="0"/&gt;
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
            "codigoVendedor",
            "numeroFacturaInterna",
            "numeroPedidoInterno",
            "zonaVenta",
            "rutaVenta",
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
            @XmlElement(name = "CodigoVendedor")
            protected String codigoVendedor;
            @XmlElement(name = "NumeroFacturaInterna")
            protected String numeroFacturaInterna;
            @XmlElement(name = "NumeroPedidoInterno")
            protected BigInteger numeroPedidoInterno;
            @XmlElement(name = "ZonaVenta")
            protected String zonaVenta;
            @XmlElement(name = "RutaVenta")
            protected String rutaVenta;
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
             * Obtiene el valor de la propiedad codigoVendedor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoVendedor() {
                return codigoVendedor;
            }

            /**
             * Define el valor de la propiedad codigoVendedor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoVendedor(String value) {
                this.codigoVendedor = value;
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
             * Obtiene el valor de la propiedad zonaVenta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZonaVenta() {
                return zonaVenta;
            }

            /**
             * Define el valor de la propiedad zonaVenta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZonaVenta(String value) {
                this.zonaVenta = value;
            }

            /**
             * Obtiene el valor de la propiedad rutaVenta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRutaVenta() {
                return rutaVenta;
            }

            /**
             * Define el valor de la propiedad rutaVenta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRutaVenta(String value) {
                this.rutaVenta = value;
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
         *         &lt;element name="IndicadorEnvioDiferido" type="{}IndicadorEnvioDiferidoType" minOccurs="0"/&gt;
         *         &lt;element name="TipoIngresos" type="{}TipoIngresosValidationType"/&gt;
         *         &lt;element name="TipoPago" type="{}TipoPagoType"/&gt;
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
            "indicadorEnvioDiferido",
            "tipoIngresos",
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
            @XmlElement(name = "IndicadorEnvioDiferido")
            protected BigInteger indicadorEnvioDiferido;
            @XmlElement(name = "TipoIngresos", required = true)
            protected String tipoIngresos;
            @XmlElement(name = "TipoPago", required = true)
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
             * Obtiene el valor de la propiedad indicadorEnvioDiferido.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIndicadorEnvioDiferido() {
                return indicadorEnvioDiferido;
            }

            /**
             * Define el valor de la propiedad indicadorEnvioDiferido.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIndicadorEnvioDiferido(BigInteger value) {
                this.indicadorEnvioDiferido = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoIngresos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoIngresos() {
                return tipoIngresos;
            }

            /**
             * Define el valor de la propiedad tipoIngresos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoIngresos(String value) {
                this.tipoIngresos = value;
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
         *         &lt;element name="FechaEmbarque" type="{}FechaValidationType" minOccurs="0"/&gt;
         *         &lt;element name="NumeroEmbarque" type="{}AlfNum25Type" minOccurs="0"/&gt;
         *         &lt;element name="NumeroContenedor" type="{}AlfNum100Type" minOccurs="0"/&gt;
         *         &lt;element name="NumeroReferencia" type="{}Integer20ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="NombrePuertoEmbarque" type="{}AlfNum40Type" minOccurs="0"/&gt;
         *         &lt;element name="CondicionesEntrega" type="{}Alfa3Type" minOccurs="0"/&gt;
         *         &lt;element name="TotalFob" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
         *         &lt;element name="Seguro" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
         *         &lt;element name="Flete" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
         *         &lt;element name="OtrosGastos" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
         *         &lt;element name="TotalCif" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="RegimenAduanero" type="{}Alfa35Type" minOccurs="0"/&gt;
         *         &lt;element name="NombrePuertoSalida" type="{}AlfNum40Type" minOccurs="0"/&gt;
         *         &lt;element name="NombrePuertoDesembarque" type="{}AlfNum40Type" minOccurs="0"/&gt;
         *         &lt;element name="PesoBruto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="PesoNeto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="UnidadPesoBruto" type="{}UnidadMedidaType" minOccurs="0"/&gt;
         *         &lt;element name="UnidadPesoNeto" type="{}UnidadMedidaType" minOccurs="0"/&gt;
         *         &lt;element name="CantidadBulto" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="UnidadBulto" type="{}UnidadMedidaType" minOccurs="0"/&gt;
         *         &lt;element name="VolumenBulto" type="{}Decimal18D1or2ValidationTypeMayorCero" minOccurs="0"/&gt;
         *         &lt;element name="UnidadVolumen" type="{}UnidadMedidaType" minOccurs="0"/&gt;
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
            "fechaEmbarque",
            "numeroEmbarque",
            "numeroContenedor",
            "numeroReferencia",
            "nombrePuertoEmbarque",
            "condicionesEntrega",
            "totalFob",
            "seguro",
            "flete",
            "otrosGastos",
            "totalCif",
            "regimenAduanero",
            "nombrePuertoSalida",
            "nombrePuertoDesembarque",
            "pesoBruto",
            "pesoNeto",
            "unidadPesoBruto",
            "unidadPesoNeto",
            "cantidadBulto",
            "unidadBulto",
            "volumenBulto",
            "unidadVolumen"
        })
        public static class InformacionesAdicionales {

            @XmlElement(name = "FechaEmbarque")
            protected String fechaEmbarque;
            @XmlElement(name = "NumeroEmbarque")
            protected String numeroEmbarque;
            @XmlElement(name = "NumeroContenedor")
            protected String numeroContenedor;
            @XmlElement(name = "NumeroReferencia")
            protected BigInteger numeroReferencia;
            @XmlElement(name = "NombrePuertoEmbarque")
            protected String nombrePuertoEmbarque;
            @XmlElement(name = "CondicionesEntrega")
            protected String condicionesEntrega;
            @XmlElement(name = "TotalFob")
            protected BigDecimal totalFob;
            @XmlElement(name = "Seguro")
            protected BigDecimal seguro;
            @XmlElement(name = "Flete")
            protected BigDecimal flete;
            @XmlElement(name = "OtrosGastos")
            protected BigDecimal otrosGastos;
            @XmlElement(name = "TotalCif")
            protected BigDecimal totalCif;
            @XmlElement(name = "RegimenAduanero")
            protected String regimenAduanero;
            @XmlElement(name = "NombrePuertoSalida")
            protected String nombrePuertoSalida;
            @XmlElement(name = "NombrePuertoDesembarque")
            protected String nombrePuertoDesembarque;
            @XmlElement(name = "PesoBruto")
            protected BigDecimal pesoBruto;
            @XmlElement(name = "PesoNeto")
            protected BigDecimal pesoNeto;
            @XmlElement(name = "UnidadPesoBruto")
            protected BigInteger unidadPesoBruto;
            @XmlElement(name = "UnidadPesoNeto")
            protected BigInteger unidadPesoNeto;
            @XmlElement(name = "CantidadBulto")
            protected BigDecimal cantidadBulto;
            @XmlElement(name = "UnidadBulto")
            protected BigInteger unidadBulto;
            @XmlElement(name = "VolumenBulto")
            protected BigDecimal volumenBulto;
            @XmlElement(name = "UnidadVolumen")
            protected BigInteger unidadVolumen;

            /**
             * Obtiene el valor de la propiedad fechaEmbarque.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaEmbarque() {
                return fechaEmbarque;
            }

            /**
             * Define el valor de la propiedad fechaEmbarque.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaEmbarque(String value) {
                this.fechaEmbarque = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroEmbarque.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroEmbarque() {
                return numeroEmbarque;
            }

            /**
             * Define el valor de la propiedad numeroEmbarque.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroEmbarque(String value) {
                this.numeroEmbarque = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroContenedor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroContenedor() {
                return numeroContenedor;
            }

            /**
             * Define el valor de la propiedad numeroContenedor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroContenedor(String value) {
                this.numeroContenedor = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroReferencia.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumeroReferencia() {
                return numeroReferencia;
            }

            /**
             * Define el valor de la propiedad numeroReferencia.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumeroReferencia(BigInteger value) {
                this.numeroReferencia = value;
            }

            /**
             * Obtiene el valor de la propiedad nombrePuertoEmbarque.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombrePuertoEmbarque() {
                return nombrePuertoEmbarque;
            }

            /**
             * Define el valor de la propiedad nombrePuertoEmbarque.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombrePuertoEmbarque(String value) {
                this.nombrePuertoEmbarque = value;
            }

            /**
             * Obtiene el valor de la propiedad condicionesEntrega.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCondicionesEntrega() {
                return condicionesEntrega;
            }

            /**
             * Define el valor de la propiedad condicionesEntrega.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCondicionesEntrega(String value) {
                this.condicionesEntrega = value;
            }

            /**
             * Obtiene el valor de la propiedad totalFob.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalFob() {
                return totalFob;
            }

            /**
             * Define el valor de la propiedad totalFob.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalFob(BigDecimal value) {
                this.totalFob = value;
            }

            /**
             * Obtiene el valor de la propiedad seguro.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSeguro() {
                return seguro;
            }

            /**
             * Define el valor de la propiedad seguro.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSeguro(BigDecimal value) {
                this.seguro = value;
            }

            /**
             * Obtiene el valor de la propiedad flete.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFlete() {
                return flete;
            }

            /**
             * Define el valor de la propiedad flete.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFlete(BigDecimal value) {
                this.flete = value;
            }

            /**
             * Obtiene el valor de la propiedad otrosGastos.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getOtrosGastos() {
                return otrosGastos;
            }

            /**
             * Define el valor de la propiedad otrosGastos.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setOtrosGastos(BigDecimal value) {
                this.otrosGastos = value;
            }

            /**
             * Obtiene el valor de la propiedad totalCif.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalCif() {
                return totalCif;
            }

            /**
             * Define el valor de la propiedad totalCif.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalCif(BigDecimal value) {
                this.totalCif = value;
            }

            /**
             * Obtiene el valor de la propiedad regimenAduanero.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegimenAduanero() {
                return regimenAduanero;
            }

            /**
             * Define el valor de la propiedad regimenAduanero.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegimenAduanero(String value) {
                this.regimenAduanero = value;
            }

            /**
             * Obtiene el valor de la propiedad nombrePuertoSalida.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombrePuertoSalida() {
                return nombrePuertoSalida;
            }

            /**
             * Define el valor de la propiedad nombrePuertoSalida.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombrePuertoSalida(String value) {
                this.nombrePuertoSalida = value;
            }

            /**
             * Obtiene el valor de la propiedad nombrePuertoDesembarque.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombrePuertoDesembarque() {
                return nombrePuertoDesembarque;
            }

            /**
             * Define el valor de la propiedad nombrePuertoDesembarque.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombrePuertoDesembarque(String value) {
                this.nombrePuertoDesembarque = value;
            }

            /**
             * Obtiene el valor de la propiedad pesoBruto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPesoBruto() {
                return pesoBruto;
            }

            /**
             * Define el valor de la propiedad pesoBruto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPesoBruto(BigDecimal value) {
                this.pesoBruto = value;
            }

            /**
             * Obtiene el valor de la propiedad pesoNeto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPesoNeto() {
                return pesoNeto;
            }

            /**
             * Define el valor de la propiedad pesoNeto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPesoNeto(BigDecimal value) {
                this.pesoNeto = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadPesoBruto.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUnidadPesoBruto() {
                return unidadPesoBruto;
            }

            /**
             * Define el valor de la propiedad unidadPesoBruto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUnidadPesoBruto(BigInteger value) {
                this.unidadPesoBruto = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadPesoNeto.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUnidadPesoNeto() {
                return unidadPesoNeto;
            }

            /**
             * Define el valor de la propiedad unidadPesoNeto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUnidadPesoNeto(BigInteger value) {
                this.unidadPesoNeto = value;
            }

            /**
             * Obtiene el valor de la propiedad cantidadBulto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidadBulto() {
                return cantidadBulto;
            }

            /**
             * Define el valor de la propiedad cantidadBulto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidadBulto(BigDecimal value) {
                this.cantidadBulto = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadBulto.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUnidadBulto() {
                return unidadBulto;
            }

            /**
             * Define el valor de la propiedad unidadBulto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUnidadBulto(BigInteger value) {
                this.unidadBulto = value;
            }

            /**
             * Obtiene el valor de la propiedad volumenBulto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVolumenBulto() {
                return volumenBulto;
            }

            /**
             * Define el valor de la propiedad volumenBulto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVolumenBulto(BigDecimal value) {
                this.volumenBulto = value;
            }

            /**
             * Obtiene el valor de la propiedad unidadVolumen.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUnidadVolumen() {
                return unidadVolumen;
            }

            /**
             * Define el valor de la propiedad unidadVolumen.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUnidadVolumen(BigInteger value) {
                this.unidadVolumen = value;
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
         *         &lt;element name="MontoGravadoTotalOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoGravado3OtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="TotalITBISOtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="TotalITBIS3OtraMoneda" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
            "montoGravadoTotalOtraMoneda",
            "montoGravado3OtraMoneda",
            "totalITBISOtraMoneda",
            "totalITBIS3OtraMoneda",
            "montoTotalOtraMoneda"
        })
        public static class OtraMoneda {

            @XmlElement(name = "TipoMoneda")
            @XmlSchemaType(name = "string")
            protected TipoMonedaType tipoMoneda;
            @XmlElement(name = "TipoCambio")
            protected BigDecimal tipoCambio;
            @XmlElement(name = "MontoGravadoTotalOtraMoneda")
            protected BigDecimal montoGravadoTotalOtraMoneda;
            @XmlElement(name = "MontoGravado3OtraMoneda")
            protected BigDecimal montoGravado3OtraMoneda;
            @XmlElement(name = "TotalITBISOtraMoneda")
            protected BigDecimal totalITBISOtraMoneda;
            @XmlElement(name = "TotalITBIS3OtraMoneda")
            protected BigDecimal totalITBIS3OtraMoneda;
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
             * Obtiene el valor de la propiedad montoGravadoTotalOtraMoneda.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoGravadoTotalOtraMoneda() {
                return montoGravadoTotalOtraMoneda;
            }

            /**
             * Define el valor de la propiedad montoGravadoTotalOtraMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoGravadoTotalOtraMoneda(BigDecimal value) {
                this.montoGravadoTotalOtraMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad montoGravado3OtraMoneda.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoGravado3OtraMoneda() {
                return montoGravado3OtraMoneda;
            }

            /**
             * Define el valor de la propiedad montoGravado3OtraMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoGravado3OtraMoneda(BigDecimal value) {
                this.montoGravado3OtraMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad totalITBISOtraMoneda.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalITBISOtraMoneda() {
                return totalITBISOtraMoneda;
            }

            /**
             * Define el valor de la propiedad totalITBISOtraMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalITBISOtraMoneda(BigDecimal value) {
                this.totalITBISOtraMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad totalITBIS3OtraMoneda.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalITBIS3OtraMoneda() {
                return totalITBIS3OtraMoneda;
            }

            /**
             * Define el valor de la propiedad totalITBIS3OtraMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalITBIS3OtraMoneda(BigDecimal value) {
                this.totalITBIS3OtraMoneda = value;
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
         *         &lt;element name="MontoGravadoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoGravadoI3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="ITBIS3" type="{}Integer2ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="TotalITBIS" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="TotalITBIS3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero"/&gt;
         *         &lt;element name="MontoNoFacturable" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
         *         &lt;element name="MontoPeriodo" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
         *         &lt;element name="SaldoAnterior" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
         *         &lt;element name="MontoAvancePago" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="ValorPagar" type="{}Decimal18D1or2ValidationTypeNegativoPositivo" minOccurs="0"/&gt;
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
            "montoGravadoTotal",
            "montoGravadoI3",
            "itbis3",
            "totalITBIS",
            "totalITBIS3",
            "montoTotal",
            "montoNoFacturable",
            "montoPeriodo",
            "saldoAnterior",
            "montoAvancePago",
            "valorPagar"
        })
        public static class Totales {

            @XmlElement(name = "MontoGravadoTotal")
            protected BigDecimal montoGravadoTotal;
            @XmlElement(name = "MontoGravadoI3")
            protected BigDecimal montoGravadoI3;
            @XmlElement(name = "ITBIS3")
            protected BigInteger itbis3;
            @XmlElement(name = "TotalITBIS")
            protected BigDecimal totalITBIS;
            @XmlElement(name = "TotalITBIS3")
            protected BigDecimal totalITBIS3;
            @XmlElement(name = "MontoTotal", required = true)
            protected BigDecimal montoTotal;
            @XmlElement(name = "MontoNoFacturable")
            protected BigDecimal montoNoFacturable;
            @XmlElement(name = "MontoPeriodo")
            protected BigDecimal montoPeriodo;
            @XmlElement(name = "SaldoAnterior")
            protected BigDecimal saldoAnterior;
            @XmlElement(name = "MontoAvancePago")
            protected BigDecimal montoAvancePago;
            @XmlElement(name = "ValorPagar")
            protected BigDecimal valorPagar;

            /**
             * Obtiene el valor de la propiedad montoGravadoTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoGravadoTotal() {
                return montoGravadoTotal;
            }

            /**
             * Define el valor de la propiedad montoGravadoTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoGravadoTotal(BigDecimal value) {
                this.montoGravadoTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad montoGravadoI3.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoGravadoI3() {
                return montoGravadoI3;
            }

            /**
             * Define el valor de la propiedad montoGravadoI3.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoGravadoI3(BigDecimal value) {
                this.montoGravadoI3 = value;
            }

            /**
             * Obtiene el valor de la propiedad itbis3.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getITBIS3() {
                return itbis3;
            }

            /**
             * Define el valor de la propiedad itbis3.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setITBIS3(BigInteger value) {
                this.itbis3 = value;
            }

            /**
             * Obtiene el valor de la propiedad totalITBIS.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalITBIS() {
                return totalITBIS;
            }

            /**
             * Define el valor de la propiedad totalITBIS.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalITBIS(BigDecimal value) {
                this.totalITBIS = value;
            }

            /**
             * Obtiene el valor de la propiedad totalITBIS3.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalITBIS3() {
                return totalITBIS3;
            }

            /**
             * Define el valor de la propiedad totalITBIS3.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalITBIS3(BigDecimal value) {
                this.totalITBIS3 = value;
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
             * Obtiene el valor de la propiedad montoNoFacturable.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoNoFacturable() {
                return montoNoFacturable;
            }

            /**
             * Define el valor de la propiedad montoNoFacturable.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoNoFacturable(BigDecimal value) {
                this.montoNoFacturable = value;
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
         *         &lt;element name="ViaTransporte" type="{}ViaTransporteType" minOccurs="0"/&gt;
         *         &lt;element name="PaisOrigen" type="{}Alfa60Type" minOccurs="0"/&gt;
         *         &lt;element name="DireccionDestino" type="{}AlfNum100Type" minOccurs="0"/&gt;
         *         &lt;element name="PaisDestino" type="{}Alfa60Type" minOccurs="0"/&gt;
         *         &lt;element name="RNCIdentificacionCompaniaTransportista" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="NombreCompaniaTransportista" type="{}AlfNum150Type" minOccurs="0"/&gt;
         *         &lt;element name="NumeroViaje" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="Conductor" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="DocumentoTransporte" type="{}Integer20ValidationType" minOccurs="0"/&gt;
         *         &lt;element name="Ficha" type="{}AlfNum10Type" minOccurs="0"/&gt;
         *         &lt;element name="Placa" type="{}AlfNum7Type" minOccurs="0"/&gt;
         *         &lt;element name="RutaTransporte" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="ZonaTransporte" type="{}AlfNum20Type" minOccurs="0"/&gt;
         *         &lt;element name="NumeroAlbaran" type="{}AlfNum20Type" minOccurs="0"/&gt;
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
            "viaTransporte",
            "paisOrigen",
            "direccionDestino",
            "paisDestino",
            "rncIdentificacionCompaniaTransportista",
            "nombreCompaniaTransportista",
            "numeroViaje",
            "conductor",
            "documentoTransporte",
            "ficha",
            "placa",
            "rutaTransporte",
            "zonaTransporte",
            "numeroAlbaran"
        })
        public static class Transporte {

            @XmlElement(name = "ViaTransporte")
            protected String viaTransporte;
            @XmlElement(name = "PaisOrigen")
            protected String paisOrigen;
            @XmlElement(name = "DireccionDestino")
            protected String direccionDestino;
            @XmlElement(name = "PaisDestino")
            protected String paisDestino;
            @XmlElement(name = "RNCIdentificacionCompaniaTransportista")
            protected String rncIdentificacionCompaniaTransportista;
            @XmlElement(name = "NombreCompaniaTransportista")
            protected String nombreCompaniaTransportista;
            @XmlElement(name = "NumeroViaje")
            protected String numeroViaje;
            @XmlElement(name = "Conductor")
            protected String conductor;
            @XmlElement(name = "DocumentoTransporte")
            protected BigInteger documentoTransporte;
            @XmlElement(name = "Ficha")
            protected String ficha;
            @XmlElement(name = "Placa")
            protected String placa;
            @XmlElement(name = "RutaTransporte")
            protected String rutaTransporte;
            @XmlElement(name = "ZonaTransporte")
            protected String zonaTransporte;
            @XmlElement(name = "NumeroAlbaran")
            protected String numeroAlbaran;

            /**
             * Obtiene el valor de la propiedad viaTransporte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViaTransporte() {
                return viaTransporte;
            }

            /**
             * Define el valor de la propiedad viaTransporte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViaTransporte(String value) {
                this.viaTransporte = value;
            }

            /**
             * Obtiene el valor de la propiedad paisOrigen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaisOrigen() {
                return paisOrigen;
            }

            /**
             * Define el valor de la propiedad paisOrigen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaisOrigen(String value) {
                this.paisOrigen = value;
            }

            /**
             * Obtiene el valor de la propiedad direccionDestino.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDireccionDestino() {
                return direccionDestino;
            }

            /**
             * Define el valor de la propiedad direccionDestino.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDireccionDestino(String value) {
                this.direccionDestino = value;
            }

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

            /**
             * Obtiene el valor de la propiedad rncIdentificacionCompaniaTransportista.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRNCIdentificacionCompaniaTransportista() {
                return rncIdentificacionCompaniaTransportista;
            }

            /**
             * Define el valor de la propiedad rncIdentificacionCompaniaTransportista.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRNCIdentificacionCompaniaTransportista(String value) {
                this.rncIdentificacionCompaniaTransportista = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreCompaniaTransportista.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreCompaniaTransportista() {
                return nombreCompaniaTransportista;
            }

            /**
             * Define el valor de la propiedad nombreCompaniaTransportista.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreCompaniaTransportista(String value) {
                this.nombreCompaniaTransportista = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroViaje.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroViaje() {
                return numeroViaje;
            }

            /**
             * Define el valor de la propiedad numeroViaje.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroViaje(String value) {
                this.numeroViaje = value;
            }

            /**
             * Obtiene el valor de la propiedad conductor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConductor() {
                return conductor;
            }

            /**
             * Define el valor de la propiedad conductor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConductor(String value) {
                this.conductor = value;
            }

            /**
             * Obtiene el valor de la propiedad documentoTransporte.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDocumentoTransporte() {
                return documentoTransporte;
            }

            /**
             * Define el valor de la propiedad documentoTransporte.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDocumentoTransporte(BigInteger value) {
                this.documentoTransporte = value;
            }

            /**
             * Obtiene el valor de la propiedad ficha.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFicha() {
                return ficha;
            }

            /**
             * Define el valor de la propiedad ficha.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFicha(String value) {
                this.ficha = value;
            }

            /**
             * Obtiene el valor de la propiedad placa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaca() {
                return placa;
            }

            /**
             * Define el valor de la propiedad placa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaca(String value) {
                this.placa = value;
            }

            /**
             * Obtiene el valor de la propiedad rutaTransporte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRutaTransporte() {
                return rutaTransporte;
            }

            /**
             * Define el valor de la propiedad rutaTransporte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRutaTransporte(String value) {
                this.rutaTransporte = value;
            }

            /**
             * Obtiene el valor de la propiedad zonaTransporte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZonaTransporte() {
                return zonaTransporte;
            }

            /**
             * Define el valor de la propiedad zonaTransporte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZonaTransporte(String value) {
                this.zonaTransporte = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroAlbaran.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroAlbaran() {
                return numeroAlbaran;
            }

            /**
             * Define el valor de la propiedad numeroAlbaran.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroAlbaran(String value) {
                this.numeroAlbaran = value;
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
     *                   &lt;element name="SubtotalMontoGravadoPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="SubtotalMontoGravado3Pagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="SubtotalItbisPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="SubtotalItbis3Pagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="MontoSubtotalPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="SubtotalMontoNoFacturablePagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
         *         &lt;element name="SubtotalMontoGravadoPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="SubtotalMontoGravado3Pagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="SubtotalItbisPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="SubtotalItbis3Pagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="MontoSubtotalPagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="SubtotalMontoNoFacturablePagina" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
            "subtotalMontoGravadoPagina",
            "subtotalMontoGravado3Pagina",
            "subtotalItbisPagina",
            "subtotalItbis3Pagina",
            "montoSubtotalPagina",
            "subtotalMontoNoFacturablePagina"
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
            @XmlElement(name = "SubtotalMontoGravadoPagina")
            protected BigDecimal subtotalMontoGravadoPagina;
            @XmlElement(name = "SubtotalMontoGravado3Pagina")
            protected BigDecimal subtotalMontoGravado3Pagina;
            @XmlElement(name = "SubtotalItbisPagina")
            protected BigDecimal subtotalItbisPagina;
            @XmlElement(name = "SubtotalItbis3Pagina")
            protected BigDecimal subtotalItbis3Pagina;
            @XmlElement(name = "MontoSubtotalPagina")
            protected BigDecimal montoSubtotalPagina;
            @XmlElement(name = "SubtotalMontoNoFacturablePagina")
            protected BigDecimal subtotalMontoNoFacturablePagina;

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
             * Obtiene el valor de la propiedad subtotalMontoGravadoPagina.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubtotalMontoGravadoPagina() {
                return subtotalMontoGravadoPagina;
            }

            /**
             * Define el valor de la propiedad subtotalMontoGravadoPagina.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubtotalMontoGravadoPagina(BigDecimal value) {
                this.subtotalMontoGravadoPagina = value;
            }

            /**
             * Obtiene el valor de la propiedad subtotalMontoGravado3Pagina.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubtotalMontoGravado3Pagina() {
                return subtotalMontoGravado3Pagina;
            }

            /**
             * Define el valor de la propiedad subtotalMontoGravado3Pagina.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubtotalMontoGravado3Pagina(BigDecimal value) {
                this.subtotalMontoGravado3Pagina = value;
            }

            /**
             * Obtiene el valor de la propiedad subtotalItbisPagina.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubtotalItbisPagina() {
                return subtotalItbisPagina;
            }

            /**
             * Define el valor de la propiedad subtotalItbisPagina.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubtotalItbisPagina(BigDecimal value) {
                this.subtotalItbisPagina = value;
            }

            /**
             * Obtiene el valor de la propiedad subtotalItbis3Pagina.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubtotalItbis3Pagina() {
                return subtotalItbis3Pagina;
            }

            /**
             * Define el valor de la propiedad subtotalItbis3Pagina.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubtotalItbis3Pagina(BigDecimal value) {
                this.subtotalItbis3Pagina = value;
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

            /**
             * Obtiene el valor de la propiedad subtotalMontoNoFacturablePagina.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubtotalMontoNoFacturablePagina() {
                return subtotalMontoNoFacturablePagina;
            }

            /**
             * Define el valor de la propiedad subtotalMontoNoFacturablePagina.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubtotalMontoNoFacturablePagina(BigDecimal value) {
                this.subtotalMontoNoFacturablePagina = value;
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
     *                   &lt;element name="SubTotalMontoGravadoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="SubTotalMontoGravadoI3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="SubTotaITBIS" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
     *                   &lt;element name="SubTotaITBIS3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
         *         &lt;element name="SubTotalMontoGravadoTotal" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="SubTotalMontoGravadoI3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="SubTotaITBIS" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
         *         &lt;element name="SubTotaITBIS3" type="{}Decimal18D1or2ValidationTypeMayorIgualCero" minOccurs="0"/&gt;
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
            "subTotalMontoGravadoTotal",
            "subTotalMontoGravadoI3",
            "subTotaITBIS",
            "subTotaITBIS3",
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
            @XmlElement(name = "SubTotalMontoGravadoTotal")
            protected BigDecimal subTotalMontoGravadoTotal;
            @XmlElement(name = "SubTotalMontoGravadoI3")
            protected BigDecimal subTotalMontoGravadoI3;
            @XmlElement(name = "SubTotaITBIS")
            protected BigDecimal subTotaITBIS;
            @XmlElement(name = "SubTotaITBIS3")
            protected BigDecimal subTotaITBIS3;
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
             * Obtiene el valor de la propiedad subTotalMontoGravadoTotal.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubTotalMontoGravadoTotal() {
                return subTotalMontoGravadoTotal;
            }

            /**
             * Define el valor de la propiedad subTotalMontoGravadoTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubTotalMontoGravadoTotal(BigDecimal value) {
                this.subTotalMontoGravadoTotal = value;
            }

            /**
             * Obtiene el valor de la propiedad subTotalMontoGravadoI3.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubTotalMontoGravadoI3() {
                return subTotalMontoGravadoI3;
            }

            /**
             * Define el valor de la propiedad subTotalMontoGravadoI3.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubTotalMontoGravadoI3(BigDecimal value) {
                this.subTotalMontoGravadoI3 = value;
            }

            /**
             * Obtiene el valor de la propiedad subTotaITBIS.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubTotaITBIS() {
                return subTotaITBIS;
            }

            /**
             * Define el valor de la propiedad subTotaITBIS.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubTotaITBIS(BigDecimal value) {
                this.subTotaITBIS = value;
            }

            /**
             * Obtiene el valor de la propiedad subTotaITBIS3.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubTotaITBIS3() {
                return subTotaITBIS3;
            }

            /**
             * Define el valor de la propiedad subTotaITBIS3.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubTotaITBIS3(BigDecimal value) {
                this.subTotaITBIS3 = value;
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
