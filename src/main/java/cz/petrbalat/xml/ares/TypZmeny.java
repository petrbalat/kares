//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 11:04:38 AM CEST 
//


package cz.petrbalat.xml.ares;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Číselník typů změn v OR
 *
 * <p>Java class for typ_zmeny complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="typ_zmeny">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="K" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zmena_kod"/>
 *         &lt;element name="T" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typ_zmeny", propOrder = {
  "k",
  "t"
})
public class TypZmeny {

  @XmlElement(name = "K")
  protected int k;
  @XmlElement(name = "T")
  protected String t;

  /**
   * Gets the value of the k property.
   */
  public int getK() {
    return k;
  }

  /**
   * Sets the value of the k property.
   */
  public void setK(int value) {
    this.k = value;
  }

  /**
   * Gets the value of the t property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getT() {
    return t;
  }

  /**
   * Sets the value of the t property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setT(String value) {
    this.t = value;
  }

}
