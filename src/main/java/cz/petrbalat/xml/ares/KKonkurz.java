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
 * Základní údaje o konkurzu z Centrální evidence úpadců  (tab. k_konkurz a dále)
 * 
 * <p>Java class for k_konkurz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_konkurz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="K_klic" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}k_klic"/>
 *         &lt;element name="K_upadce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}k_upadce"/>
 *         &lt;element name="Poradi" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SKO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_konkurzu_CEU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_konkurz", propOrder = {
    "kKlic",
    "kUpadce",
    "poradi",
    "sko"
})
public class KKonkurz {

    @XmlElement(name = "K_klic", required = true)
    protected KKlic kKlic;
    @XmlElement(name = "K_upadce", required = true)
    protected KUpadce kUpadce;
    @XmlElement(name = "Poradi")
    protected short poradi;
    @XmlElement(name = "SKO", required = true)
    @XmlSchemaType(name = "string")
    protected StavKonkurzuCEU sko;

    /**
     * Gets the value of the kKlic property.
     * 
     * @return
     *     possible object is
     *     {@link KKlic }
     *     
     */
    public KKlic getKKlic() {
        return kKlic;
    }

    /**
     * Sets the value of the kKlic property.
     * 
     * @param value
     *     allowed object is
     *     {@link KKlic }
     *     
     */
    public void setKKlic(KKlic value) {
        this.kKlic = value;
    }

    /**
     * Gets the value of the kUpadce property.
     * 
     * @return
     *     possible object is
     *     {@link KUpadce }
     *     
     */
    public KUpadce getKUpadce() {
        return kUpadce;
    }

    /**
     * Sets the value of the kUpadce property.
     * 
     * @param value
     *     allowed object is
     *     {@link KUpadce }
     *     
     */
    public void setKUpadce(KUpadce value) {
        this.kUpadce = value;
    }

    /**
     * Gets the value of the poradi property.
     * 
     */
    public short getPoradi() {
        return poradi;
    }

    /**
     * Sets the value of the poradi property.
     * 
     */
    public void setPoradi(short value) {
        this.poradi = value;
    }

    /**
     * Gets the value of the sko property.
     * 
     * @return
     *     possible object is
     *     {@link StavKonkurzuCEU }
     *     
     */
    public StavKonkurzuCEU getSKO() {
        return sko;
    }

    /**
     * Sets the value of the sko property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKonkurzuCEU }
     *     
     */
    public void setSKO(StavKonkurzuCEU value) {
        this.sko = value;
    }

}
