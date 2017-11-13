
package cz.petrbalat.xml.rss;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Element;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
 *         &lt;element name="channel" type="{}RssChannel"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" fixed="2.0" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "channel",
    "any"
})
@XmlRootElement(name = "rss")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Rss {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected RssChannel channel;
    @XmlAnyElement(lax = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Object> any;
    @XmlAttribute(name = "version", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal version;
    @XmlAnyAttribute
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link RssChannel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    @NotNull
    public RssChannel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RssChannel }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setChannel(RssChannel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getVersion() {
        if (version == null) {
            return new BigDecimal("2.0");
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
