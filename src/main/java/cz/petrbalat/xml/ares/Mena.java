//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 11:04:38 AM CEST 
//


package cz.petrbalat.xml.ares;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mena.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mena">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Kč"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="EURO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mena")
@XmlEnum
public enum Mena {

    @XmlEnumValue("K\u010d")
    KČ("K\u010d"),
    USD("USD"),
    DM("DM"),
    GBP("GBP"),
    SK("SK"),
    EUR("EUR"),
    EURO("EURO");
    private final String value;

    Mena(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Mena fromValue(String v) {
        for (Mena c: Mena.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
