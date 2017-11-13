
package cz.petrbalat.xml.rss;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Guid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Guid">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="isPermaLink" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Guid", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Guid {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "isPermaLink")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean isPermaLink;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the isPermaLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isIsPermaLink() {
        if (isPermaLink == null) {
            return true;
        } else {
            return isPermaLink;
        }
    }

    /**
     * Sets the value of the isPermaLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIsPermaLink(Boolean value) {
        this.isPermaLink = value;
    }

}
