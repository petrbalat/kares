package cz.petrbalat.xml.rss;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Guid complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Guid">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="isPermaLink" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Guid", propOrder = {
  "value"
})

public class Guid {

  @XmlValue

  protected String value;
  @XmlAttribute(name = "isPermaLink")

  protected Boolean isPermaLink;

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
   * Gets the value of the isPermaLink property.
   *
   * @return possible object is
   * {@link Boolean }
   */

  public boolean isIsPermaLink() {
    if (isPermaLink == null) {
      return true;
    } else {
      return isPermaLink;
    }
  }

  /**
   * Sets the value of the isPermaLink property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */

  public void setIsPermaLink(Boolean value) {
    this.isPermaLink = value;
  }

}
