//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 11:04:38 AM CEST 
//


package cz.petrbalat.xml.ares;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Kombinované angažmá -  rozsirena PO je s více FO
 * 
 * <p>Java class for organ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}financni_urad" minOccurs="0"/>
 *         &lt;element name="DIC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}dic" minOccurs="0"/>
 *         &lt;element name="Zkr_statu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zkr_statu" minOccurs="0"/>
 *         &lt;element name="NS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_statu" minOccurs="0"/>
 *         &lt;element name="KPF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_pravni_formy" minOccurs="0"/>
 *         &lt;element name="NPF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_pravni_formy" minOccurs="0"/>
 *         &lt;element name="A" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Organ_FO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}organ_FO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organ", propOrder = {
    "ico",
    "of",
    "fu",
    "dic",
    "zkrStatu",
    "ns",
    "kpf",
    "npf",
    "a",
    "organFO"
})
public class Organ {

    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "OF")
    protected String of;
    @XmlElement(name = "FU")
    protected FinancniUrad fu;
    @XmlElement(name = "DIC")
    protected Dic dic;
    @XmlElement(name = "Zkr_statu")
    protected String zkrStatu;
    @XmlElement(name = "NS")
    protected String ns;
    @XmlElement(name = "KPF")
    protected Short kpf;
    @XmlElement(name = "NPF")
    protected String npf;
    @XmlElement(name = "A")
    protected AdresaARES a;
    @XmlElement(name = "Organ_FO")
    protected List<OrganFO> organFO;
    @XmlAttribute(name = "dod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute(name = "ddo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICO() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICO(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the of property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOF() {
        return of;
    }

    /**
     * Sets the value of the of property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOF(String value) {
        this.of = value;
    }

    /**
     * Gets the value of the fu property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad }
     *     
     */
    public FinancniUrad getFU() {
        return fu;
    }

    /**
     * Sets the value of the fu property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad }
     *     
     */
    public void setFU(FinancniUrad value) {
        this.fu = value;
    }

    /**
     * Gets the value of the dic property.
     * 
     * @return
     *     possible object is
     *     {@link Dic }
     *     
     */
    public Dic getDIC() {
        return dic;
    }

    /**
     * Sets the value of the dic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dic }
     *     
     */
    public void setDIC(Dic value) {
        this.dic = value;
    }

    /**
     * Gets the value of the zkrStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZkrStatu() {
        return zkrStatu;
    }

    /**
     * Sets the value of the zkrStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZkrStatu(String value) {
        this.zkrStatu = value;
    }

    /**
     * Gets the value of the ns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNS() {
        return ns;
    }

    /**
     * Sets the value of the ns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNS(String value) {
        this.ns = value;
    }

    /**
     * Gets the value of the kpf property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKPF() {
        return kpf;
    }

    /**
     * Sets the value of the kpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKPF(Short value) {
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
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setA(AdresaARES value) {
        this.a = value;
    }

    /**
     * Gets the value of the organFO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organFO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganFO }
     * 
     * 
     */
    public List<OrganFO> getOrganFO() {
        if (organFO == null) {
            organFO = new ArrayList<OrganFO>();
        }
        return this.organFO;
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDod(XMLGregorianCalendar value) {
        this.dod = value;
    }

    /**
     * Gets the value of the ddo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdo() {
        return ddo;
    }

    /**
     * Sets the value of the ddo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDdo(XMLGregorianCalendar value) {
        this.ddo = value;
    }

}
