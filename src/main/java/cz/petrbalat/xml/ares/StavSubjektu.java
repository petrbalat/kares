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
 * <p>Java class for stav_subjektu.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stav_subjektu">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aktivní"/>
 *     &lt;enumeration value="Zaniklý"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "stav_subjektu")
@XmlEnum
public enum StavSubjektu {

  @XmlEnumValue("Aktivn\u00ed")
  AKTIVNÍ("Aktivn\u00ed"),
  @XmlEnumValue("Zanikl\u00fd")
  ZANIKLÝ("Zanikl\u00fd");
  private final String value;

  StavSubjektu(String v) {
    value = v;
  }

  public static StavSubjektu fromValue(String v) {
    for (StavSubjektu c : StavSubjektu.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  public String value() {
    return value;
  }

}
