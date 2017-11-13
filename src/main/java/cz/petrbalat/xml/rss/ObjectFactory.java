
package cz.petrbalat.xml.rss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import java.math.BigInteger;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.petrbalat.xml.rss package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RssChannelImage_QNAME = new QName("", "image");
    private final static QName _RssChannelCopyright_QNAME = new QName("", "copyright");
    private final static QName _RssChannelSkipHours_QNAME = new QName("", "skipHours");
    private final static QName _RssChannelLastBuildDate_QNAME = new QName("", "lastBuildDate");
    private final static QName _RssChannelLink_QNAME = new QName("", "link");
    private final static QName _RssChannelRating_QNAME = new QName("", "rating");
    private final static QName _RssChannelDescription_QNAME = new QName("", "description");
    private final static QName _RssChannelGenerator_QNAME = new QName("", "generator");
    private final static QName _RssChannelLanguage_QNAME = new QName("", "language");
    private final static QName _RssChannelTitle_QNAME = new QName("", "title");
    private final static QName _RssChannelManagingEditor_QNAME = new QName("", "managingEditor");
    private final static QName _RssChannelWebMaster_QNAME = new QName("", "webMaster");
    private final static QName _RssChannelPubDate_QNAME = new QName("", "pubDate");
    private final static QName _RssChannelTtl_QNAME = new QName("", "ttl");
    private final static QName _RssChannelSkipDays_QNAME = new QName("", "skipDays");
    private final static QName _RssChannelCloud_QNAME = new QName("", "cloud");
    private final static QName _RssChannelTextInput_QNAME = new QName("", "textInput");
    private final static QName _RssChannelDocs_QNAME = new QName("", "docs");
    private final static QName _RssChannelCategory_QNAME = new QName("", "category");
    private final static QName _RssItemComments_QNAME = new QName("", "comments");
    private final static QName _RssItemEnclosure_QNAME = new QName("", "enclosure");
    private final static QName _RssItemAuthor_QNAME = new QName("", "author");
    private final static QName _RssItemGuid_QNAME = new QName("", "guid");
    private final static QName _RssItemSource_QNAME = new QName("", "source");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.petrbalat.xml.rss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rss }
     * 
     */
    public Rss createRss() {
        return new Rss();
    }

    /**
     * Create an instance of {@link RssChannel }
     * 
     */
    public RssChannel createRssChannel() {
        return new RssChannel();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link SkipDaysList }
     * 
     */
    public SkipDaysList createSkipDaysList() {
        return new SkipDaysList();
    }

    /**
     * Create an instance of {@link SkipHoursList }
     * 
     */
    public SkipHoursList createSkipHoursList() {
        return new SkipHoursList();
    }

    /**
     * Create an instance of {@link Enclosure }
     * 
     */
    public Enclosure createEnclosure() {
        return new Enclosure();
    }

    /**
     * Create an instance of {@link Guid }
     * 
     */
    public Guid createGuid() {
        return new Guid();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link RssItem }
     * 
     */
    public RssItem createRssItem() {
        return new RssItem();
    }

    /**
     * Create an instance of {@link Cloud }
     * 
     */
    public Cloud createCloud() {
        return new Cloud();
    }

    /**
     * Create an instance of {@link TextInput }
     * 
     */
    public TextInput createTextInput() {
        return new TextInput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Image }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "image", scope = RssChannel.class)
    public JAXBElement<Image> createRssChannelImage(Image value) {
        return new JAXBElement<Image>(_RssChannelImage_QNAME, Image.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "copyright", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelCopyright(String value) {
        return new JAXBElement<String>(_RssChannelCopyright_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SkipHoursList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "skipHours", scope = RssChannel.class)
    public JAXBElement<SkipHoursList> createRssChannelSkipHours(SkipHoursList value) {
        return new JAXBElement<SkipHoursList>(_RssChannelSkipHours_QNAME, SkipHoursList.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lastBuildDate", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelLastBuildDate(String value) {
        return new JAXBElement<String>(_RssChannelLastBuildDate_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "link", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelLink(String value) {
        return new JAXBElement<String>(_RssChannelLink_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rating", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelRating(String value) {
        return new JAXBElement<String>(_RssChannelRating_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelDescription(String value) {
        return new JAXBElement<String>(_RssChannelDescription_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "generator", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelGenerator(String value) {
        return new JAXBElement<String>(_RssChannelGenerator_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "language", scope = RssChannel.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRssChannelLanguage(String value) {
        return new JAXBElement<String>(_RssChannelLanguage_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelTitle(String value) {
        return new JAXBElement<String>(_RssChannelTitle_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "managingEditor", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelManagingEditor(String value) {
        return new JAXBElement<String>(_RssChannelManagingEditor_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "webMaster", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelWebMaster(String value) {
        return new JAXBElement<String>(_RssChannelWebMaster_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pubDate", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelPubDate(String value) {
        return new JAXBElement<String>(_RssChannelPubDate_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ttl", scope = RssChannel.class)
    public JAXBElement<BigInteger> createRssChannelTtl(BigInteger value) {
        return new JAXBElement<BigInteger>(_RssChannelTtl_QNAME, BigInteger.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SkipDaysList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "skipDays", scope = RssChannel.class)
    public JAXBElement<SkipDaysList> createRssChannelSkipDays(SkipDaysList value) {
        return new JAXBElement<SkipDaysList>(_RssChannelSkipDays_QNAME, SkipDaysList.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cloud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cloud", scope = RssChannel.class)
    public JAXBElement<Cloud> createRssChannelCloud(Cloud value) {
        return new JAXBElement<Cloud>(_RssChannelCloud_QNAME, Cloud.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "textInput", scope = RssChannel.class)
    public JAXBElement<TextInput> createRssChannelTextInput(TextInput value) {
        return new JAXBElement<TextInput>(_RssChannelTextInput_QNAME, TextInput.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "docs", scope = RssChannel.class)
    public JAXBElement<String> createRssChannelDocs(String value) {
        return new JAXBElement<String>(_RssChannelDocs_QNAME, String.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "category", scope = RssChannel.class)
    public JAXBElement<Category> createRssChannelCategory(Category value) {
        return new JAXBElement<Category>(_RssChannelCategory_QNAME, Category.class, RssChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "comments", scope = RssItem.class)
    public JAXBElement<String> createRssItemComments(String value) {
        return new JAXBElement<String>(_RssItemComments_QNAME, String.class, RssItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Enclosure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enclosure", scope = RssItem.class)
    public JAXBElement<Enclosure> createRssItemEnclosure(Enclosure value) {
        return new JAXBElement<Enclosure>(_RssItemEnclosure_QNAME, Enclosure.class, RssItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "author", scope = RssItem.class)
    public JAXBElement<String> createRssItemAuthor(String value) {
        return new JAXBElement<String>(_RssItemAuthor_QNAME, String.class, RssItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "link", scope = RssItem.class)
    public JAXBElement<String> createRssItemLink(String value) {
        return new JAXBElement<String>(_RssChannelLink_QNAME, String.class, RssItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description", scope = RssItem.class)
    public JAXBElement<String> createRssItemDescription(String value) {
        return new JAXBElement<String>(_RssChannelDescription_QNAME, String.class, RssItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Guid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "guid", scope = RssItem.class)
    public JAXBElement<Guid> createRssItemGuid(Guid value) {
        return new JAXBElement<Guid>(_RssItemGuid_QNAME, Guid.class, RssItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Source }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "source", scope = RssItem.class)
    public JAXBElement<Source> createRssItemSource(Source value) {
        return new JAXBElement<Source>(_RssItemSource_QNAME, Source.class, RssItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title", scope = RssItem.class)
    public JAXBElement<String> createRssItemTitle(String value) {
        return new JAXBElement<String>(_RssChannelTitle_QNAME, String.class, RssItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "category", scope = RssItem.class)
    public JAXBElement<Category> createRssItemCategory(Category value) {
        return new JAXBElement<Category>(_RssChannelCategory_QNAME, Category.class, RssItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pubDate", scope = RssItem.class)
    public JAXBElement<String> createRssItemPubDate(String value) {
        return new JAXBElement<String>(_RssChannelPubDate_QNAME, String.class, RssItem.class, value);
    }

}
