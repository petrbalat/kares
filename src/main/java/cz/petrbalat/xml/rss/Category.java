package cz.petrbalat.xml.rss;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Category complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Category">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
  "value"
})

public class Category {

  @XmlValue

  protected String value;
  @XmlAttribute(name = "domain")

  protected String domain;

  /**
   * Gets the value of the value property.
   *
   * @return possible object is
   * {@link String }
   */

  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is
   *              {@link String }
   */

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Gets the value of the domain property.
   *
   * @return possible object is
   * {@link String }
   */

  public String getDomain() {
    return domain;
  }

  /**
   * Sets the value of the domain property.
   *
   * @param value allowed object is
   *              {@link String }
   */

  public void setDomain(String value) {
    this.domain = value;
  }

}
