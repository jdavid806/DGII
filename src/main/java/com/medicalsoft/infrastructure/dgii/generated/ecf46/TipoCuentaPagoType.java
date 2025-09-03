//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.09.02 a las 02:06:12 PM COT 
//


package com.medicalsoft.infrastructure.dgii.generated.ecf46;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoCuentaPagoType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCuentaPagoType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="AH"/&gt;
 *     &lt;enumeration value="OT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TipoCuentaPagoType")
@XmlEnum
public enum TipoCuentaPagoType {

    CT,
    AH,
    OT;

    public String value() {
        return name();
    }

    public static TipoCuentaPagoType fromValue(String v) {
        return valueOf(v);
    }

}
