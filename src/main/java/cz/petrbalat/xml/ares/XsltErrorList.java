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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xslt_error_list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xslt_error_list">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Record_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="E_type" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}error_type"/>
 *                   &lt;element name="E_ID" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}error_kod"/>
 *                   &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xslt_error_list", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3", propOrder = {
    "e"
})
public class XsltErrorList {

    @XmlElement(name = "E")
    protected List<XsltErrorList.E> e;

    /**
     * Gets the value of the e property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsltErrorList.E }
     * 
     * 
     */
    public List<XsltErrorList.E> getE() {
        if (e == null) {
            e = new ArrayList<XsltErrorList.E>();
        }
        return this.e;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Record_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="E_type" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}error_type"/>
     *         &lt;element name="E_ID" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}error_kod"/>
     *         &lt;element name="ET" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recordID",
        "eType",
        "eid",
        "et"
    })
    public static class E {

        @XmlElement(name = "Record_ID", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3")
        protected Integer recordID;
        @XmlElement(name = "E_type", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3", required = true)
        @XmlSchemaType(name = "string")
        protected ErrorType eType;
        @XmlElement(name = "E_ID", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3", required = true)
        @XmlSchemaType(name = "string")
        protected ErrorKod eid;
        @XmlElement(name = "ET", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3", required = true)
        protected String et;

        /**
         * Gets the value of the recordID property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRecordID() {
            return recordID;
        }

        /**
         * Sets the value of the recordID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRecordID(Integer value) {
            this.recordID = value;
        }

        /**
         * Gets the value of the eType property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorType }
         *     
         */
        public ErrorType getEType() {
            return eType;
        }

        /**
         * Sets the value of the eType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorType }
         *     
         */
        public void setEType(ErrorType value) {
            this.eType = value;
        }

        /**
         * Gets the value of the eid property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorKod }
         *     
         */
        public ErrorKod getEID() {
            return eid;
        }

        /**
         * Sets the value of the eid property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorKod }
         *     
         */
        public void setEID(ErrorKod value) {
            this.eid = value;
        }

        /**
         * Gets the value of the et property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getET() {
            return et;
        }

        /**
         * Sets the value of the et property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setET(String value) {
            this.et = value;
        }

    }

}
