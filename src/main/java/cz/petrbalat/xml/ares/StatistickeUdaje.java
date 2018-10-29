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
import java.math.BigInteger;


/**
 * <p>Java class for statisticke_udaje complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="statisticke_udaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Esa2010" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Esa2010t" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="ISK" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ISE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}institucionarni_sektor" minOccurs="0"/>
 *         &lt;element name="KPP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}kategorie_poctu_pracovniku" minOccurs="0"/>
 *         &lt;element name="Fvi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="Ksni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="Tjz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statisticke_udaje", propOrder = {
  "esa2010",
  "esa2010T",
  "isk",
  "ise",
  "kpp",
  "fvi",
  "ksni",
  "tjz"
})
public class StatistickeUdaje {

  @XmlElement(name = "Esa2010")
  protected BigInteger esa2010;
  @XmlElement(name = "Esa2010t")
  protected String esa2010T;
  @XmlElement(name = "ISK")
  protected BigInteger isk;
  @XmlElement(name = "ISE")
  protected InstitucionarniSektor ise;
  @XmlElement(name = "KPP")
  protected KategoriePoctuPracovniku kpp;
  @XmlElement(name = "Fvi")
  protected String fvi;
  @XmlElement(name = "Ksni")
  protected String ksni;
  @XmlElement(name = "Tjz")
  protected String tjz;

  /**
   * Gets the value of the esa2010 property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getEsa2010() {
    return esa2010;
  }

  /**
   * Sets the value of the esa2010 property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setEsa2010(BigInteger value) {
    this.esa2010 = value;
  }

  /**
   * Gets the value of the esa2010T property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getEsa2010T() {
    return esa2010T;
  }

  /**
   * Sets the value of the esa2010T property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setEsa2010T(String value) {
    this.esa2010T = value;
  }

  /**
   * Gets the value of the isk property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getISK() {
    return isk;
  }

  /**
   * Sets the value of the isk property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setISK(BigInteger value) {
    this.isk = value;
  }

  /**
   * Gets the value of the ise property.
   *
   * @return possible object is
   * {@link InstitucionarniSektor }
   */
  public InstitucionarniSektor getISE() {
    return ise;
  }

  /**
   * Sets the value of the ise property.
   *
   * @param value allowed object is
   *              {@link InstitucionarniSektor }
   */
  public void setISE(InstitucionarniSektor value) {
    this.ise = value;
  }

  /**
   * Gets the value of the kpp property.
   *
   * @return possible object is
   * {@link KategoriePoctuPracovniku }
   */
  public KategoriePoctuPracovniku getKPP() {
    return kpp;
  }

  /**
   * Sets the value of the kpp property.
   *
   * @param value allowed object is
   *              {@link KategoriePoctuPracovniku }
   */
  public void setKPP(KategoriePoctuPracovniku value) {
    this.kpp = value;
  }

  /**
   * Gets the value of the fvi property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getFvi() {
    return fvi;
  }

  /**
   * Sets the value of the fvi property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setFvi(String value) {
    this.fvi = value;
  }

  /**
   * Gets the value of the ksni property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKsni() {
    return ksni;
  }

  /**
   * Sets the value of the ksni property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKsni(String value) {
    this.ksni = value;
  }

  /**
   * Gets the value of the tjz property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTjz() {
    return tjz;
  }

  /**
   * Sets the value of the tjz property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTjz(String value) {
    this.tjz = value;
  }

}
