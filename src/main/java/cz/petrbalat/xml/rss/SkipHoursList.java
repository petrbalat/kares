package cz.petrbalat.xml.rss;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SkipHoursList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SkipHoursList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hour" type="{}SkipHour" maxOccurs="24" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkipHoursList", propOrder = {
  "hour"
})

public class SkipHoursList {

  @XmlElement(type = Integer.class)
  @XmlSchemaType(name = "nonNegativeInteger")

  protected List<Integer> hour;

  /**
   * Gets the value of the hour property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the hour property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getHour().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Integer }
   */

  public List<Integer> getHour() {
    if (hour == null) {
      hour = new ArrayList<Integer>();
    }
    return this.hour;
  }

}
