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
import java.util.ArrayList;
import java.util.List;


/**
 * Klasifikace ekonomických činností (CZ-NACE) ČSÚ
 *
 * <p>Java class for nace complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="nace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NACE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}kod_nace" maxOccurs="unbounded"/>
 *         &lt;element name="Nazev_NACE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nazev_nace" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nace", propOrder = {
  "nace",
  "nazevNACE"
})
public class Nace {

  @XmlElement(name = "NACE", required = true)
  protected List<KodNace> nace;
  @XmlElement(name = "Nazev_NACE")
  protected String nazevNACE;

  /**
   * Gets the value of the nace property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the nace property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNACE().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link KodNace }
   */
  public List<KodNace> getNACE() {
    if (nace == null) {
      nace = new ArrayList<KodNace>();
    }
    return this.nace;
  }

  /**
   * Gets the value of the nazevNACE property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getNazevNACE() {
    return nazevNACE;
  }

  /**
   * Sets the value of the nazevNACE property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setNazevNACE(String value) {
    this.nazevNACE = value;
  }

}
