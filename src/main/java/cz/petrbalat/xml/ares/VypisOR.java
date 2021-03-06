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
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Výpis z obchodního rejstříku podle ARES
 *
 * <p>Java class for vypis_OR complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="vypis_OR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UVOD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}uvod" minOccurs="0"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zakladni_udaje_OR"/>
 *         &lt;element name="REG" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}registrace"/>
 *         &lt;element name="CIN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cinnosti" minOccurs="0"/>
 *         &lt;element name="EX" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OSK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KAP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}kapital" minOccurs="0"/>
 *         &lt;element name="SO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}statutarni_organ" minOccurs="0"/>
 *         &lt;element name="SOS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}sos" minOccurs="0"/>
 *         &lt;element name="SOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}sok" minOccurs="0"/>
 *         &lt;element name="SOP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}sop" minOccurs="0"/>
 *         &lt;element name="PRE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}predstavenstvo" minOccurs="0"/>
 *         &lt;element name="SOZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}szo" minOccurs="0"/>
 *         &lt;element name="SR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spravni_rada" minOccurs="0"/>
 *         &lt;element name="NAD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nadace" minOccurs="0"/>
 *         &lt;element name="NF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nadacni_fond" minOccurs="0"/>
 *         &lt;element name="LI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}likvidace" minOccurs="0"/>
 *         &lt;element name="PRO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}prokura" minOccurs="0"/>
 *         &lt;element name="Reditele_ops" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}reditele_ops" minOccurs="0"/>
 *         &lt;element name="DR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}dozorci_rada" minOccurs="0"/>
 *         &lt;element name="Kontrolni_komise" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}kontrolni_komise" minOccurs="0"/>
 *         &lt;element name="REI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}revizori" minOccurs="0"/>
 *         &lt;element name="SBV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spolecnici_bez_vkladu" minOccurs="0"/>
 *         &lt;element name="SSV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spolecnici_s_vkladem" minOccurs="0"/>
 *         &lt;element name="AKI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}akcionari" minOccurs="0"/>
 *         &lt;element name="Z_SP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zakladatele_SP" minOccurs="0"/>
 *         &lt;element name="Z_OPS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zakladatele_OPS" minOccurs="0"/>
 *         &lt;element name="Z_OZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zrizovatele_OZ" minOccurs="0"/>
 *         &lt;element name="Z_PR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zrizovatele_PR" minOccurs="0"/>
 *         &lt;element name="NAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nastupci_zrizovatele" minOccurs="0"/>
 *         &lt;element name="Z_N" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zrizovatele_nadace" minOccurs="0"/>
 *         &lt;element name="VOU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ved_oz" minOccurs="0"/>
 *         &lt;element name="KME" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}komanditiste" minOccurs="0"/>
 *         &lt;element name="DCI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}druzstevnici" minOccurs="0"/>
 *         &lt;element name="KPI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}komplementari" minOccurs="0"/>
 *         &lt;element name="CLS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}clenove_sdruzeni" minOccurs="0"/>
 *         &lt;element name="KV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurzy_vyrovnani" minOccurs="0"/>
 *         &lt;element name="OZY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}odstepne_zavody" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_OR", propOrder = {
  "uvod",
  "zau",
  "reg",
  "cin",
  "ex",
  "osk",
  "kap",
  "so",
  "sos",
  "sok",
  "sop",
  "pre",
  "soz",
  "sr",
  "nad",
  "nf",
  "li",
  "pro",
  "rediteleOps",
  "dr",
  "kontrolniKomise",
  "rei",
  "sbv",
  "ssv",
  "aki",
  "zsp",
  "zops",
  "zoz",
  "zpr",
  "nau",
  "zn",
  "vou",
  "kme",
  "dci",
  "kpi",
  "cls",
  "kv",
  "ozy"
})
public class VypisOR {

  @XmlElement(name = "UVOD")
  protected Uvod uvod;
  @XmlElement(name = "ZAU", required = true)
  protected ZakladniUdajeOR zau;
  @XmlElement(name = "REG", required = true)
  protected Registrace reg;
  @XmlElement(name = "CIN")
  protected Cinnosti cin;
  @XmlElement(name = "EX")
  protected List<Texty> ex;
  @XmlElement(name = "OSK")
  protected List<Texty> osk;
  @XmlElement(name = "KAP")
  protected Kapital kap;
  @XmlElement(name = "SO")
  protected StatutarniOrgan so;
  @XmlElement(name = "SOS")
  protected Sos sos;
  @XmlElement(name = "SOK")
  protected Sok sok;
  @XmlElement(name = "SOP")
  protected Sop sop;
  @XmlElement(name = "PRE")
  protected Predstavenstvo pre;
  @XmlElement(name = "SOZ")
  protected Szo soz;
  @XmlElement(name = "SR")
  protected SpravniRada sr;
  @XmlElement(name = "NAD")
  protected Nadace nad;
  @XmlElement(name = "NF")
  protected NadacniFond nf;
  @XmlElement(name = "LI")
  protected Likvidace li;
  @XmlElement(name = "PRO")
  protected Prokura pro;
  @XmlElement(name = "Reditele_ops")
  protected RediteleOps rediteleOps;
  @XmlElement(name = "DR")
  protected DozorciRada dr;
  @XmlElement(name = "Kontrolni_komise")
  protected KontrolniKomise kontrolniKomise;
  @XmlElement(name = "REI")
  protected Revizori rei;
  @XmlElement(name = "SBV")
  protected SpolecniciBezVkladu sbv;
  @XmlElement(name = "SSV")
  protected SpolecniciSVkladem ssv;
  @XmlElement(name = "AKI")
  protected Akcionari aki;
  @XmlElement(name = "Z_SP")
  protected ZakladateleSP zsp;
  @XmlElement(name = "Z_OPS")
  protected ZakladateleOPS zops;
  @XmlElement(name = "Z_OZ")
  protected ZrizovateleOZ zoz;
  @XmlElement(name = "Z_PR")
  protected ZrizovatelePR zpr;
  @XmlElement(name = "NAU")
  protected NastupciZrizovatele nau;
  @XmlElement(name = "Z_N")
  protected ZrizovateleNadace zn;
  @XmlElement(name = "VOU")
  protected VedOz vou;
  @XmlElement(name = "KME")
  protected Komanditiste kme;
  @XmlElement(name = "DCI")
  protected Druzstevnici dci;
  @XmlElement(name = "KPI")
  protected Komplementari kpi;
  @XmlElement(name = "CLS")
  protected ClenoveSdruzeni cls;
  @XmlElement(name = "KV")
  protected KonkurzyVyrovnani kv;
  @XmlElement(name = "OZY")
  protected List<OdstepneZavody> ozy;

  /**
   * Gets the value of the uvod property.
   *
   * @return possible object is
   * {@link Uvod }
   */
  public Uvod getUVOD() {
    return uvod;
  }

  /**
   * Sets the value of the uvod property.
   *
   * @param value allowed object is
   *              {@link Uvod }
   */
  public void setUVOD(Uvod value) {
    this.uvod = value;
  }

  /**
   * Gets the value of the zau property.
   *
   * @return possible object is
   * {@link ZakladniUdajeOR }
   */
  public ZakladniUdajeOR getZAU() {
    return zau;
  }

  /**
   * Sets the value of the zau property.
   *
   * @param value allowed object is
   *              {@link ZakladniUdajeOR }
   */
  public void setZAU(ZakladniUdajeOR value) {
    this.zau = value;
  }

  /**
   * Gets the value of the reg property.
   *
   * @return possible object is
   * {@link Registrace }
   */
  public Registrace getREG() {
    return reg;
  }

  /**
   * Sets the value of the reg property.
   *
   * @param value allowed object is
   *              {@link Registrace }
   */
  public void setREG(Registrace value) {
    this.reg = value;
  }

  /**
   * Gets the value of the cin property.
   *
   * @return possible object is
   * {@link Cinnosti }
   */
  public Cinnosti getCIN() {
    return cin;
  }

  /**
   * Sets the value of the cin property.
   *
   * @param value allowed object is
   *              {@link Cinnosti }
   */
  public void setCIN(Cinnosti value) {
    this.cin = value;
  }

  /**
   * Gets the value of the ex property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the ex property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEX().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Texty }
   */
  public List<Texty> getEX() {
    if (ex == null) {
      ex = new ArrayList<Texty>();
    }
    return this.ex;
  }

  /**
   * Gets the value of the osk property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the osk property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getOSK().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Texty }
   */
  public List<Texty> getOSK() {
    if (osk == null) {
      osk = new ArrayList<Texty>();
    }
    return this.osk;
  }

  /**
   * Gets the value of the kap property.
   *
   * @return possible object is
   * {@link Kapital }
   */
  public Kapital getKAP() {
    return kap;
  }

  /**
   * Sets the value of the kap property.
   *
   * @param value allowed object is
   *              {@link Kapital }
   */
  public void setKAP(Kapital value) {
    this.kap = value;
  }

  /**
   * Gets the value of the so property.
   *
   * @return possible object is
   * {@link StatutarniOrgan }
   */
  public StatutarniOrgan getSO() {
    return so;
  }

  /**
   * Sets the value of the so property.
   *
   * @param value allowed object is
   *              {@link StatutarniOrgan }
   */
  public void setSO(StatutarniOrgan value) {
    this.so = value;
  }

  /**
   * Gets the value of the sos property.
   *
   * @return possible object is
   * {@link Sos }
   */
  public Sos getSOS() {
    return sos;
  }

  /**
   * Sets the value of the sos property.
   *
   * @param value allowed object is
   *              {@link Sos }
   */
  public void setSOS(Sos value) {
    this.sos = value;
  }

  /**
   * Gets the value of the sok property.
   *
   * @return possible object is
   * {@link Sok }
   */
  public Sok getSOK() {
    return sok;
  }

  /**
   * Sets the value of the sok property.
   *
   * @param value allowed object is
   *              {@link Sok }
   */
  public void setSOK(Sok value) {
    this.sok = value;
  }

  /**
   * Gets the value of the sop property.
   *
   * @return possible object is
   * {@link Sop }
   */
  public Sop getSOP() {
    return sop;
  }

  /**
   * Sets the value of the sop property.
   *
   * @param value allowed object is
   *              {@link Sop }
   */
  public void setSOP(Sop value) {
    this.sop = value;
  }

  /**
   * Gets the value of the pre property.
   *
   * @return possible object is
   * {@link Predstavenstvo }
   */
  public Predstavenstvo getPRE() {
    return pre;
  }

  /**
   * Sets the value of the pre property.
   *
   * @param value allowed object is
   *              {@link Predstavenstvo }
   */
  public void setPRE(Predstavenstvo value) {
    this.pre = value;
  }

  /**
   * Gets the value of the soz property.
   *
   * @return possible object is
   * {@link Szo }
   */
  public Szo getSOZ() {
    return soz;
  }

  /**
   * Sets the value of the soz property.
   *
   * @param value allowed object is
   *              {@link Szo }
   */
  public void setSOZ(Szo value) {
    this.soz = value;
  }

  /**
   * Gets the value of the sr property.
   *
   * @return possible object is
   * {@link SpravniRada }
   */
  public SpravniRada getSR() {
    return sr;
  }

  /**
   * Sets the value of the sr property.
   *
   * @param value allowed object is
   *              {@link SpravniRada }
   */
  public void setSR(SpravniRada value) {
    this.sr = value;
  }

  /**
   * Gets the value of the nad property.
   *
   * @return possible object is
   * {@link Nadace }
   */
  public Nadace getNAD() {
    return nad;
  }

  /**
   * Sets the value of the nad property.
   *
   * @param value allowed object is
   *              {@link Nadace }
   */
  public void setNAD(Nadace value) {
    this.nad = value;
  }

  /**
   * Gets the value of the nf property.
   *
   * @return possible object is
   * {@link NadacniFond }
   */
  public NadacniFond getNF() {
    return nf;
  }

  /**
   * Sets the value of the nf property.
   *
   * @param value allowed object is
   *              {@link NadacniFond }
   */
  public void setNF(NadacniFond value) {
    this.nf = value;
  }

  /**
   * Gets the value of the li property.
   *
   * @return possible object is
   * {@link Likvidace }
   */
  public Likvidace getLI() {
    return li;
  }

  /**
   * Sets the value of the li property.
   *
   * @param value allowed object is
   *              {@link Likvidace }
   */
  public void setLI(Likvidace value) {
    this.li = value;
  }

  /**
   * Gets the value of the pro property.
   *
   * @return possible object is
   * {@link Prokura }
   */
  public Prokura getPRO() {
    return pro;
  }

  /**
   * Sets the value of the pro property.
   *
   * @param value allowed object is
   *              {@link Prokura }
   */
  public void setPRO(Prokura value) {
    this.pro = value;
  }

  /**
   * Gets the value of the rediteleOps property.
   *
   * @return possible object is
   * {@link RediteleOps }
   */
  public RediteleOps getRediteleOps() {
    return rediteleOps;
  }

  /**
   * Sets the value of the rediteleOps property.
   *
   * @param value allowed object is
   *              {@link RediteleOps }
   */
  public void setRediteleOps(RediteleOps value) {
    this.rediteleOps = value;
  }

  /**
   * Gets the value of the dr property.
   *
   * @return possible object is
   * {@link DozorciRada }
   */
  public DozorciRada getDR() {
    return dr;
  }

  /**
   * Sets the value of the dr property.
   *
   * @param value allowed object is
   *              {@link DozorciRada }
   */
  public void setDR(DozorciRada value) {
    this.dr = value;
  }

  /**
   * Gets the value of the kontrolniKomise property.
   *
   * @return possible object is
   * {@link KontrolniKomise }
   */
  public KontrolniKomise getKontrolniKomise() {
    return kontrolniKomise;
  }

  /**
   * Sets the value of the kontrolniKomise property.
   *
   * @param value allowed object is
   *              {@link KontrolniKomise }
   */
  public void setKontrolniKomise(KontrolniKomise value) {
    this.kontrolniKomise = value;
  }

  /**
   * Gets the value of the rei property.
   *
   * @return possible object is
   * {@link Revizori }
   */
  public Revizori getREI() {
    return rei;
  }

  /**
   * Sets the value of the rei property.
   *
   * @param value allowed object is
   *              {@link Revizori }
   */
  public void setREI(Revizori value) {
    this.rei = value;
  }

  /**
   * Gets the value of the sbv property.
   *
   * @return possible object is
   * {@link SpolecniciBezVkladu }
   */
  public SpolecniciBezVkladu getSBV() {
    return sbv;
  }

  /**
   * Sets the value of the sbv property.
   *
   * @param value allowed object is
   *              {@link SpolecniciBezVkladu }
   */
  public void setSBV(SpolecniciBezVkladu value) {
    this.sbv = value;
  }

  /**
   * Gets the value of the ssv property.
   *
   * @return possible object is
   * {@link SpolecniciSVkladem }
   */
  public SpolecniciSVkladem getSSV() {
    return ssv;
  }

  /**
   * Sets the value of the ssv property.
   *
   * @param value allowed object is
   *              {@link SpolecniciSVkladem }
   */
  public void setSSV(SpolecniciSVkladem value) {
    this.ssv = value;
  }

  /**
   * Gets the value of the aki property.
   *
   * @return possible object is
   * {@link Akcionari }
   */
  public Akcionari getAKI() {
    return aki;
  }

  /**
   * Sets the value of the aki property.
   *
   * @param value allowed object is
   *              {@link Akcionari }
   */
  public void setAKI(Akcionari value) {
    this.aki = value;
  }

  /**
   * Gets the value of the zsp property.
   *
   * @return possible object is
   * {@link ZakladateleSP }
   */
  public ZakladateleSP getZSP() {
    return zsp;
  }

  /**
   * Sets the value of the zsp property.
   *
   * @param value allowed object is
   *              {@link ZakladateleSP }
   */
  public void setZSP(ZakladateleSP value) {
    this.zsp = value;
  }

  /**
   * Gets the value of the zops property.
   *
   * @return possible object is
   * {@link ZakladateleOPS }
   */
  public ZakladateleOPS getZOPS() {
    return zops;
  }

  /**
   * Sets the value of the zops property.
   *
   * @param value allowed object is
   *              {@link ZakladateleOPS }
   */
  public void setZOPS(ZakladateleOPS value) {
    this.zops = value;
  }

  /**
   * Gets the value of the zoz property.
   *
   * @return possible object is
   * {@link ZrizovateleOZ }
   */
  public ZrizovateleOZ getZOZ() {
    return zoz;
  }

  /**
   * Sets the value of the zoz property.
   *
   * @param value allowed object is
   *              {@link ZrizovateleOZ }
   */
  public void setZOZ(ZrizovateleOZ value) {
    this.zoz = value;
  }

  /**
   * Gets the value of the zpr property.
   *
   * @return possible object is
   * {@link ZrizovatelePR }
   */
  public ZrizovatelePR getZPR() {
    return zpr;
  }

  /**
   * Sets the value of the zpr property.
   *
   * @param value allowed object is
   *              {@link ZrizovatelePR }
   */
  public void setZPR(ZrizovatelePR value) {
    this.zpr = value;
  }

  /**
   * Gets the value of the nau property.
   *
   * @return possible object is
   * {@link NastupciZrizovatele }
   */
  public NastupciZrizovatele getNAU() {
    return nau;
  }

  /**
   * Sets the value of the nau property.
   *
   * @param value allowed object is
   *              {@link NastupciZrizovatele }
   */
  public void setNAU(NastupciZrizovatele value) {
    this.nau = value;
  }

  /**
   * Gets the value of the zn property.
   *
   * @return possible object is
   * {@link ZrizovateleNadace }
   */
  public ZrizovateleNadace getZN() {
    return zn;
  }

  /**
   * Sets the value of the zn property.
   *
   * @param value allowed object is
   *              {@link ZrizovateleNadace }
   */
  public void setZN(ZrizovateleNadace value) {
    this.zn = value;
  }

  /**
   * Gets the value of the vou property.
   *
   * @return possible object is
   * {@link VedOz }
   */
  public VedOz getVOU() {
    return vou;
  }

  /**
   * Sets the value of the vou property.
   *
   * @param value allowed object is
   *              {@link VedOz }
   */
  public void setVOU(VedOz value) {
    this.vou = value;
  }

  /**
   * Gets the value of the kme property.
   *
   * @return possible object is
   * {@link Komanditiste }
   */
  public Komanditiste getKME() {
    return kme;
  }

  /**
   * Sets the value of the kme property.
   *
   * @param value allowed object is
   *              {@link Komanditiste }
   */
  public void setKME(Komanditiste value) {
    this.kme = value;
  }

  /**
   * Gets the value of the dci property.
   *
   * @return possible object is
   * {@link Druzstevnici }
   */
  public Druzstevnici getDCI() {
    return dci;
  }

  /**
   * Sets the value of the dci property.
   *
   * @param value allowed object is
   *              {@link Druzstevnici }
   */
  public void setDCI(Druzstevnici value) {
    this.dci = value;
  }

  /**
   * Gets the value of the kpi property.
   *
   * @return possible object is
   * {@link Komplementari }
   */
  public Komplementari getKPI() {
    return kpi;
  }

  /**
   * Sets the value of the kpi property.
   *
   * @param value allowed object is
   *              {@link Komplementari }
   */
  public void setKPI(Komplementari value) {
    this.kpi = value;
  }

  /**
   * Gets the value of the cls property.
   *
   * @return possible object is
   * {@link ClenoveSdruzeni }
   */
  public ClenoveSdruzeni getCLS() {
    return cls;
  }

  /**
   * Sets the value of the cls property.
   *
   * @param value allowed object is
   *              {@link ClenoveSdruzeni }
   */
  public void setCLS(ClenoveSdruzeni value) {
    this.cls = value;
  }

  /**
   * Gets the value of the kv property.
   *
   * @return possible object is
   * {@link KonkurzyVyrovnani }
   */
  public KonkurzyVyrovnani getKV() {
    return kv;
  }

  /**
   * Sets the value of the kv property.
   *
   * @param value allowed object is
   *              {@link KonkurzyVyrovnani }
   */
  public void setKV(KonkurzyVyrovnani value) {
    this.kv = value;
  }

  /**
   * Gets the value of the ozy property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the ozy property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getOZY().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link OdstepneZavody }
   */
  public List<OdstepneZavody> getOZY() {
    if (ozy == null) {
      ozy = new ArrayList<OdstepneZavody>();
    }
    return this.ozy;
  }

}
