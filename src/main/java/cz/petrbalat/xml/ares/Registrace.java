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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o registraci subjektu u soudů
 * 
 * <p>Java class for registrace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spisova_znacka" maxOccurs="unbounded"/>
 *         &lt;element name="SOR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrace", propOrder = {
    "sz",
    "sor"
})
public class Registrace {

    @XmlElement(name = "SZ", required = true)
    protected List<SpisovaZnacka> sz;
    @XmlElement(name = "SOR")
    protected Stav sor;

    /**
     * Gets the value of the sz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpisovaZnacka }
     * 
     * 
     */
    public List<SpisovaZnacka> getSZ() {
        if (sz == null) {
            sz = new ArrayList<SpisovaZnacka>();
        }
        return this.sz;
    }

    /**
     * Gets the value of the sor property.
     * 
     * @return
     *     possible object is
     *     {@link Stav }
     *     
     */
    public Stav getSOR() {
        return sor;
    }

    /**
     * Sets the value of the sor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stav }
     *     
     */
    public void setSOR(Stav value) {
        this.sor = value;
    }

}
