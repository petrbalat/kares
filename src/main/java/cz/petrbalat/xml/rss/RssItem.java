
package cz.petrbalat.xml.rss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * An item may represent a "story" -- much like a story in a newspaper or magazine; if so its description is a synopsis of the story, and the link points to the full story. An item may also be complete in itself, if so, the description contains the text (entity-encoded HTML is allowed), and the link and title may be omitted.
 * 
 * <p>Java class for RssItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RssItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *           &lt;element name="author" type="{}EmailAddress" minOccurs="0"/>
 *           &lt;element name="category" type="{}Category" minOccurs="0"/>
 *           &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *           &lt;element name="enclosure" type="{}Enclosure" minOccurs="0"/>
 *           &lt;element name="guid" type="{}Guid" minOccurs="0"/>
 *           &lt;element name="pubDate" type="{}Rfc822FormatDate" minOccurs="0"/>
 *           &lt;element name="source" type="{}Source" minOccurs="0"/>
 *           &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RssItem", propOrder = {
    "titleOrDescriptionOrLink"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class RssItem {

    @XmlElementRefs({
        @XmlElementRef(name = "link", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "source", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "comments", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "guid", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pubDate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "category", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "description", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "author", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enclosure", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Object> titleOrDescriptionOrLink;
    @XmlAnyAttribute
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the titleOrDescriptionOrLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleOrDescriptionOrLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleOrDescriptionOrLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Source }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Guid }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Category }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link Enclosure }{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-03-01T09:39:56+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Object> getTitleOrDescriptionOrLink() {
        if (titleOrDescriptionOrLink == null) {
            titleOrDescriptionOrLink = new ArrayList<Object>();
        }
        return this.titleOrDescriptionOrLink;
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
