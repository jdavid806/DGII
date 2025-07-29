//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.07.29 a las 10:54:17 AM COT 
//


package com.medicalsoft.infrastructure.dgii.generated.ecf31;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoMonedaType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoMonedaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CHY"/&gt;
 *     &lt;enumeration value="XDR"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="SCP"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="VEF"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoMonedaType")
@XmlEnum
public enum TipoMonedaType {

    BRL,
    CAD,
    CHF,
    CHY,
    XDR,
    DKK,
    EUR,
    GBP,
    JPY,
    NOK,
    SCP,
    SEK,
    USD,
    VEF,
    HTG,
    MXN;

    public String value() {
        return name();
    }

    public static TipoMonedaType fromValue(String v) {
        return valueOf(v);
    }

}
