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
 * Finanční úřad (vz_podnik.k_fu)
 *
 * <p>Java class for financni_urad complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="financni_urad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KFU" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="NFU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nazev_FU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financni_urad", propOrder = {
  "kfu",
  "nfu"
})
public class FinancniUrad {

  @XmlElement(name = "KFU")
  protected short kfu;
  @XmlElement(name = "NFU", required = true)
  protected String nfu;

  /**
   * Gets the value of the kfu property.
   */
  public short getKFU() {
    return kfu;
  }

  /**
   * Sets the value of the kfu property.
   */
  public void setKFU(short value) {
    this.kfu = value;
  }

  /**
   * Gets the value of the nfu property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getNFU() {
    return nfu;
  }

  /**
   * Sets the value of the nfu property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setNFU(String value) {
    this.nfu = value;
  }

}
