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
 * Data dodaná z Ministerstva spravedlnosti
 *
 * <p>Java class for msp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="msp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vk_podnet" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vk_podnet"/>
 *         &lt;element name="Vk_adresa" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vk_adresa" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msp", propOrder = {
  "vkPodnet",
  "vkAdresa"
})
public class Msp {

  @XmlElement(name = "Vk_podnet", required = true)
  protected VkPodnet vkPodnet;
  @XmlElement(name = "Vk_adresa", required = true)
  protected List<VkAdresa> vkAdresa;

  /**
   * Gets the value of the vkPodnet property.
   *
   * @return possible object is
   * {@link VkPodnet }
   */
  public VkPodnet getVkPodnet() {
    return vkPodnet;
  }

  /**
   * Sets the value of the vkPodnet property.
   *
   * @param value allowed object is
   *              {@link VkPodnet }
   */
  public void setVkPodnet(VkPodnet value) {
    this.vkPodnet = value;
  }

  /**
   * Gets the value of the vkAdresa property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the vkAdresa property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getVkAdresa().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link VkAdresa }
   */
  public List<VkAdresa> getVkAdresa() {
    if (vkAdresa == null) {
      vkAdresa = new ArrayList<VkAdresa>();
    }
    return this.vkAdresa;
  }

}
