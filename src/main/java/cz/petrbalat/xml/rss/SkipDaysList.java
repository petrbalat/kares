package cz.petrbalat.xml.rss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for SkipDaysList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SkipDaysList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day" type="{}SkipDay" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkipDaysList", propOrder = {
  "day"
})

public class SkipDaysList {

  @XmlSchemaType(name = "string")

  protected List<SkipDay> day;

  /**
   * Gets the value of the day property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the day property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDay().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link SkipDay }
   */

  public List<SkipDay> getDay() {
    if (day == null) {
      day = new ArrayList<SkipDay>();
    }
    return this.day;
  }

}
