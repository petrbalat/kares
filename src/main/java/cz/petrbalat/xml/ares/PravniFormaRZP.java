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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Právní forma včetně popisných položek
 * 
 * <p>Java class for pravni_forma_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pravni_forma_RZP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KPF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_pravni_formy"/>
 *         &lt;element name="NPF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_pravni_formy" minOccurs="0"/>
 *         &lt;element name="ZPF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zkraceny_nazev_PF" minOccurs="0"/>
 *         &lt;element name="PFO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pf_osoba" minOccurs="0"/>
 *         &lt;element name="TZU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}tzu_osoba" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pravni_forma_RZP", propOrder = {
    "kpf",
    "npf",
    "zpf",
    "pfo",
    "tzu"
})
public class PravniFormaRZP {

    @XmlElement(name = "KPF")
    protected short kpf;
    @XmlElement(name = "NPF")
    protected String npf;
    @XmlElement(name = "ZPF")
    protected String zpf;
    @XmlElement(name = "PFO")
    @XmlSchemaType(name = "string")
    protected PfOsoba pfo;
    @XmlElement(name = "TZU")
    @XmlSchemaType(name = "string")
    protected TzuOsoba tzu;

    /**
     * Gets the value of the kpf property.
     * 
     */
    public short getKPF() {
        return kpf;
    }

    /**
     * Sets the value of the kpf property.
     * 
     */
    public void setKPF(short value) {
        this.kpf = value;
    }

    /**
     * Gets the value of the npf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPF() {
        return npf;
    }

    /**
     * Sets the value of the npf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPF(String value) {
        this.npf = value;
    }

    /**
     * Gets the value of the zpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZPF() {
        return zpf;
    }

    /**
     * Sets the value of the zpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZPF(String value) {
        this.zpf = value;
    }

    /**
     * Gets the value of the pfo property.
     * 
     * @return
     *     possible object is
     *     {@link PfOsoba }
     *     
     */
    public PfOsoba getPFO() {
        return pfo;
    }

    /**
     * Sets the value of the pfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PfOsoba }
     *     
     */
    public void setPFO(PfOsoba value) {
        this.pfo = value;
    }

    /**
     * Gets the value of the tzu property.
     * 
     * @return
     *     possible object is
     *     {@link TzuOsoba }
     *     
     */
    public TzuOsoba getTZU() {
        return tzu;
    }

    /**
     * Sets the value of the tzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TzuOsoba }
     *     
     */
    public void setTZU(TzuOsoba value) {
        this.tzu = value;
    }

}
