package cz.petrbalat.xml.rss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloudProtocol.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CloudProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xml-rpc"/>
 *     &lt;enumeration value="http-post"/>
 *     &lt;enumeration value="soap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "CloudProtocol")
@XmlEnum

public enum CloudProtocol {

  @XmlEnumValue("xml-rpc")
  XML_RPC("xml-rpc"),
  @XmlEnumValue("http-post")
  HTTP_POST("http-post"),
  @XmlEnumValue("soap")
  SOAP("soap");
  private final String value;

  CloudProtocol(String v) {
    value = v;
  }

  public static CloudProtocol fromValue(String v) {
    for (CloudProtocol c : CloudProtocol.values()) {
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
