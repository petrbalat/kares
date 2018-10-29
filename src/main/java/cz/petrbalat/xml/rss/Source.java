package cz.petrbalat.xml.rss;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Source complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Source">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", propOrder = {
  "value"
})

public class Source {

  @XmlValue

  protected String value;
  @XmlAttribute(name = "url")
  @XmlSchemaType(name = "anyURI")

  protected String url;

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
   * Gets the value of the url property.
   *
   * @return possible object is
   * {@link String }
   */

  public String getUrl() {
    return url;
  }

  /**
   * Sets the value of the url property.
   *
   * @param value allowed object is
   *              {@link String }
   */

  public void setUrl(String value) {
    this.url = value;
  }

}
