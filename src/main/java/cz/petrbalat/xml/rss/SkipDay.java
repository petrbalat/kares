package cz.petrbalat.xml.rss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkipDay.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SkipDay">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Monday"/>
 *     &lt;enumeration value="Tuesday"/>
 *     &lt;enumeration value="Wednesday"/>
 *     &lt;enumeration value="Thursday"/>
 *     &lt;enumeration value="Friday"/>
 *     &lt;enumeration value="Saturday"/>
 *     &lt;enumeration value="Sunday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "SkipDay")
@XmlEnum

public enum SkipDay {

  @XmlEnumValue("Monday")
  MONDAY("Monday"),
  @XmlEnumValue("Tuesday")
  TUESDAY("Tuesday"),
  @XmlEnumValue("Wednesday")
  WEDNESDAY("Wednesday"),
  @XmlEnumValue("Thursday")
  THURSDAY("Thursday"),
  @XmlEnumValue("Friday")
  FRIDAY("Friday"),
  @XmlEnumValue("Saturday")
  SATURDAY("Saturday"),
  @XmlEnumValue("Sunday")
  SUNDAY("Sunday");
  private final String value;

  SkipDay(String v) {
    value = v;
  }

  public static SkipDay fromValue(String v) {
    for (SkipDay c : SkipDay.values()) {
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
