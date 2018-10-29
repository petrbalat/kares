package cz.petrbalat.xml.rss;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Image complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Image">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="width" type="{}ImageWidth" minOccurs="0"/>
 *         &lt;element name="height" type="{}ImageHeight" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {

})

public class Image {

  @XmlElement(required = true)
  @XmlSchemaType(name = "anyURI")

  protected String url;
  @XmlElement(required = true)

  protected String title;
  @XmlElement(required = true)
  @XmlSchemaType(name = "anyURI")

  protected String link;
  @XmlElement(defaultValue = "88")
  @XmlSchemaType(name = "positiveInteger")

  protected Integer width;
  @XmlElement(defaultValue = "31")
  @XmlSchemaType(name = "positiveInteger")

  protected Integer height;

  protected String description;

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

  /**
   * Gets the value of the title property.
   *
   * @return possible object is
   * {@link String }
   */

  public String getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   *
   * @param value allowed object is
   *              {@link String }
   */

  public void setTitle(String value) {
    this.title = value;
  }

  /**
   * Gets the value of the link property.
   *
   * @return possible object is
   * {@link String }
   */

  public String getLink() {
    return link;
  }

  /**
   * Sets the value of the link property.
   *
   * @param value allowed object is
   *              {@link String }
   */

  public void setLink(String value) {
    this.link = value;
  }

  /**
   * Gets the value of the width property.
   *
   * @return possible object is
   * {@link Integer }
   */

  public Integer getWidth() {
    return width;
  }

  /**
   * Sets the value of the width property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */

  public void setWidth(Integer value) {
    this.width = value;
  }

  /**
   * Gets the value of the height property.
   *
   * @return possible object is
   * {@link Integer }
   */

  public Integer getHeight() {
    return height;
  }

  /**
   * Sets the value of the height property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */

  public void setHeight(Integer value) {
    this.height = value;
  }

  /**
   * Gets the value of the description property.
   *
   * @return possible object is
   * {@link String }
   */

  public String getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   *
   * @param value allowed object is
   *              {@link String }
   */

  public void setDescription(String value) {
    this.description = value;
  }

}
