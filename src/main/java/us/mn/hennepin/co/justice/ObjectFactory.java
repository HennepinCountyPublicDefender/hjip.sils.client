
package us.mn.hennepin.co.justice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import us.mn.hennepin.co.common.IndicatorCodeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.mn.hennepin.co.justice package. 
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

    private final static QName _IdentityTheftIndicator_QNAME = new QName("http://www.co.hennepin.mn.us/Justice", "IdentityTheftIndicator");
    private final static QName _CaseTrackingID_QNAME = new QName("http://www.co.hennepin.mn.us/Justice", "CaseTrackingID");
    private final static QName _TrackingOffense_QNAME = new QName("http://www.co.hennepin.mn.us/Justice", "TrackingOffense");
    private final static QName _SubjectTypeCode_QNAME = new QName("http://www.co.hennepin.mn.us/Justice", "SubjectTypeCode");
    private final static QName _SubjectEntityID_QNAME = new QName("http://www.co.hennepin.mn.us/Justice", "SubjectEntityID");
    private final static QName _OffenseDate_QNAME = new QName("http://www.co.hennepin.mn.us/Justice", "OffenseDate");
    private final static QName _NoMiddleNameIndicator_QNAME = new QName("http://www.co.hennepin.mn.us/Justice", "NoMiddleNameIndicator");
    private final static QName _IdentificationMethodText_QNAME = new QName("http://www.co.hennepin.mn.us/Justice", "IdentificationMethodText");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.mn.hennepin.co.justice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubjectEntityID }
     * 
     */
    public SubjectEntityID createSubjectEntityID() {
        return new SubjectEntityID();
    }

    /**
     * Create an instance of {@link CaseTrackingID }
     * 
     */
    public CaseTrackingID createCaseTrackingID() {
        return new CaseTrackingID();
    }

    /**
     * Create an instance of {@link SubjectType }
     * 
     */
    public SubjectType createSubjectType() {
        return new SubjectType();
    }

    /**
     * Create an instance of {@link TrackingOffenseType }
     * 
     */
    public TrackingOffenseType createTrackingOffenseType() {
        return new TrackingOffenseType();
    }

    /**
     * Create an instance of {@link SubjectSummaryType }
     * 
     */
    public SubjectSummaryType createSubjectSummaryType() {
        return new SubjectSummaryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndicatorCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Justice", name = "IdentityTheftIndicator")
    public JAXBElement<IndicatorCodeType> createIdentityTheftIndicator(IndicatorCodeType value) {
        return new JAXBElement<IndicatorCodeType>(_IdentityTheftIndicator_QNAME, IndicatorCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseTrackingID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Justice", name = "CaseTrackingID")
    public JAXBElement<CaseTrackingID> createCaseTrackingID(CaseTrackingID value) {
        return new JAXBElement<CaseTrackingID>(_CaseTrackingID_QNAME, CaseTrackingID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackingOffenseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Justice", name = "TrackingOffense")
    public JAXBElement<TrackingOffenseType> createTrackingOffense(TrackingOffenseType value) {
        return new JAXBElement<TrackingOffenseType>(_TrackingOffense_QNAME, TrackingOffenseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Justice", name = "SubjectTypeCode")
    public JAXBElement<String> createSubjectTypeCode(String value) {
        return new JAXBElement<String>(_SubjectTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectEntityID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Justice", name = "SubjectEntityID")
    public JAXBElement<SubjectEntityID> createSubjectEntityID(SubjectEntityID value) {
        return new JAXBElement<SubjectEntityID>(_SubjectEntityID_QNAME, SubjectEntityID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Justice", name = "OffenseDate")
    public JAXBElement<XMLGregorianCalendar> createOffenseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OffenseDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndicatorCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Justice", name = "NoMiddleNameIndicator")
    public JAXBElement<IndicatorCodeType> createNoMiddleNameIndicator(IndicatorCodeType value) {
        return new JAXBElement<IndicatorCodeType>(_NoMiddleNameIndicator_QNAME, IndicatorCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Justice", name = "IdentificationMethodText")
    public JAXBElement<String> createIdentificationMethodText(String value) {
        return new JAXBElement<String>(_IdentificationMethodText_QNAME, String.class, null, value);
    }

}
