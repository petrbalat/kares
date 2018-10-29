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
 * Specifikace činností všech typů
 *
 * <p>Java class for cinnosti complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cinnosti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DKC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PCI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UNF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cinnosti", propOrder = {
  "pp",
  "dkc",
  "pc",
  "pci",
  "un",
  "unf"
})
public class Cinnosti {

  @XmlElement(name = "PP")
  protected List<Texty> pp;
  @XmlElement(name = "DKC")
  protected List<Texty> dkc;
  @XmlElement(name = "PC")
  protected List<Texty> pc;
  @XmlElement(name = "PCI")
  protected List<Texty> pci;
  @XmlElement(name = "UN")
  protected List<Texty> un;
  @XmlElement(name = "UNF")
  protected List<Texty> unf;

  /**
   * Gets the value of the pp property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the pp property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPP().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Texty }
   */
  public List<Texty> getPP() {
    if (pp == null) {
      pp = new ArrayList<Texty>();
    }
    return this.pp;
  }

  /**
   * Gets the value of the dkc property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the dkc property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDKC().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Texty }
   */
  public List<Texty> getDKC() {
    if (dkc == null) {
      dkc = new ArrayList<Texty>();
    }
    return this.dkc;
  }

  /**
   * Gets the value of the pc property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the pc property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPC().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Texty }
   */
  public List<Texty> getPC() {
    if (pc == null) {
      pc = new ArrayList<Texty>();
    }
    return this.pc;
  }

  /**
   * Gets the value of the pci property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the pci property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPCI().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Texty }
   */
  public List<Texty> getPCI() {
    if (pci == null) {
      pci = new ArrayList<Texty>();
    }
    return this.pci;
  }

  /**
   * Gets the value of the un property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the un property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUN().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Texty }
   */
  public List<Texty> getUN() {
    if (un == null) {
      un = new ArrayList<Texty>();
    }
    return this.un;
  }

  /**
   * Gets the value of the unf property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the unf property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUNF().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Texty }
   */
  public List<Texty> getUNF() {
    if (unf == null) {
      unf = new ArrayList<Texty>();
    }
    return this.unf;
  }

}
