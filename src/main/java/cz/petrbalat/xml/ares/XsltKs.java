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
 * <p>Java class for xslt_ks.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="xslt_ks">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="klient"/>
 *     &lt;enumeration value="server"/>
 *     &lt;enumeration value="savexml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "xslt_ks")
@XmlEnum
public enum XsltKs {

  @XmlEnumValue("klient")
  KLIENT("klient"),
  @XmlEnumValue("server")
  SERVER("server"),
  @XmlEnumValue("savexml")
  SAVEXML("savexml");
  private final String value;

  XsltKs(String v) {
    value = v;
  }

  public static XsltKs fromValue(String v) {
    for (XsltKs c : XsltKs.values()) {
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
