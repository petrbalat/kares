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
 * Hlavní tabulka úpadců - slouží zejména pro rozlišení, o jakého úpadce se jedná
 * 
 * <p>Java class for k_upadce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_upadce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S_upadce" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PFC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pfc"/>
 *         &lt;element name="K_eksubj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}k_eksubj" minOccurs="0"/>
 *         &lt;element name="K_cosoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}k_cosoba" minOccurs="0"/>
 *         &lt;element name="SKO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_upadce_CEU"/>
 *         &lt;element name="SVY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_upadce_CEU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_upadce", propOrder = {
    "sUpadce",
    "pfc",
    "kEksubj",
    "kCosoba",
    "sko",
    "svy"
})
public class KUpadce {

    @XmlElement(name = "S_upadce")
    protected int sUpadce;
    @XmlElement(name = "PFC", required = true)
    @XmlSchemaType(name = "string")
    protected Pfc pfc;
    @XmlElement(name = "K_eksubj")
    protected KEksubj kEksubj;
    @XmlElement(name = "K_cosoba")
    protected KCosoba kCosoba;
    @XmlElement(name = "SKO", required = true)
    @XmlSchemaType(name = "string")
    protected StavUpadceCEU sko;
    @XmlElement(name = "SVY", required = true)
    @XmlSchemaType(name = "string")
    protected StavUpadceCEU svy;

    /**
     * Gets the value of the sUpadce property.
     * 
     */
    public int getSUpadce() {
        return sUpadce;
    }

    /**
     * Sets the value of the sUpadce property.
     * 
     */
    public void setSUpadce(int value) {
        this.sUpadce = value;
    }

    /**
     * Gets the value of the pfc property.
     * 
     * @return
     *     possible object is
     *     {@link Pfc }
     *     
     */
    public Pfc getPFC() {
        return pfc;
    }

    /**
     * Sets the value of the pfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pfc }
     *     
     */
    public void setPFC(Pfc value) {
        this.pfc = value;
    }

    /**
     * Gets the value of the kEksubj property.
     * 
     * @return
     *     possible object is
     *     {@link KEksubj }
     *     
     */
    public KEksubj getKEksubj() {
        return kEksubj;
    }

    /**
     * Sets the value of the kEksubj property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEksubj }
     *     
     */
    public void setKEksubj(KEksubj value) {
        this.kEksubj = value;
    }

    /**
     * Gets the value of the kCosoba property.
     * 
     * @return
     *     possible object is
     *     {@link KCosoba }
     *     
     */
    public KCosoba getKCosoba() {
        return kCosoba;
    }

    /**
     * Sets the value of the kCosoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link KCosoba }
     *     
     */
    public void setKCosoba(KCosoba value) {
        this.kCosoba = value;
    }

    /**
     * Gets the value of the sko property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU }
     *     
     */
    public StavUpadceCEU getSKO() {
        return sko;
    }

    /**
     * Sets the value of the sko property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU }
     *     
     */
    public void setSKO(StavUpadceCEU value) {
        this.sko = value;
    }

    /**
     * Gets the value of the svy property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU }
     *     
     */
    public StavUpadceCEU getSVY() {
        return svy;
    }

    /**
     * Sets the value of the svy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU }
     *     
     */
    public void setSVY(StavUpadceCEU value) {
        this.svy = value;
    }

}
