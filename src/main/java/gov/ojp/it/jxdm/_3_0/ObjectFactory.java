
package gov.ojp.it.jxdm._3_0;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import gov.ojp.it.jxdm.mn_offense._1.OffenseLevelCodeType;
import gov.ojp.it.jxdm.ncic_2000._1_0.LSTAType;
import gov.ojp.it.jxdm.ncic_2000._1_0.RACType;
import gov.ojp.it.jxdm.ncic_2000._1_0.SEXType;
import gov.ojp.it.jxdm.nibrs_misc._1.EthnicityCodeType;
import gov.ojp.it.jxdm.usps_states._1.USStateCodeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.ojp.it.jxdm._3_0 package. 
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

    private final static QName _OrganizationIncorporatedIndicator_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "OrganizationIncorporatedIndicator");
    private final static QName _StreetFullText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "StreetFullText");
    private final static QName _IDEffectiveDate_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IDEffectiveDate");
    private final static QName _PersonSuffixName_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonSuffixName");
    private final static QName _LocationStateCodeUSPostalService_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "LocationStateCode.USPostalService");
    private final static QName _PersonStateID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonStateID");
    private final static QName _PersonAgeMeasureRange_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonAgeMeasure.Range");
    private final static QName _PersonOtherID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonOtherID");
    private final static QName _PersonBirthDate_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonBirthDate");
    private final static QName _IDJurisdictionCodeNcicLIS_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IDJurisdictionCode.ncicLIS");
    private final static QName _PersonFullName_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonFullName");
    private final static QName _ActivityTime_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "ActivityTime");
    private final static QName _IncidentCategoryTypeText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IncidentCategoryTypeText");
    private final static QName _PersonAgeMeasure_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonAgeMeasure");
    private final static QName _PersonGivenName_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonGivenName");
    private final static QName _PersonAlias_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonAlias");
    private final static QName _Subject_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "Subject");
    private final static QName _ActivityID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "ActivityID");
    private final static QName _PersonSocialDetails_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonSocialDetails");
    private final static QName _PersonPhysicalDetails_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonPhysicalDetails");
    private final static QName _LocationCityName_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "LocationCityName");
    private final static QName _LocationStateName_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "LocationStateName");
    private final static QName _PersonSexCode_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonSexCode");
    private final static QName _LocationPostalCodeID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "LocationPostalCodeID");
    private final static QName _PersonFBIID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonFBIID");
    private final static QName _IncidentCategory_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IncidentCategory");
    private final static QName _ActivityTypeText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "ActivityTypeText");
    private final static QName _IDJurisdictionText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IDJurisdictionText");
    private final static QName _PersonSSNID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonSSNID");
    private final static QName _IncidentLevelCode_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IncidentLevelCode");
    private final static QName _PersonLicenseID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonLicenseID");
    private final static QName _PersonName_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonName");
    private final static QName _ActivityDate_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "ActivityDate");
    private final static QName _RangeMaximumMeasure_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "RangeMaximumMeasure");
    private final static QName _SubjectID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "SubjectID");
    private final static QName _Offense_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "Offense");
    private final static QName _IDIssuingAuthorityText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IDIssuingAuthorityText");
    private final static QName _ID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "ID");
    private final static QName _IDTypeText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IDTypeText");
    private final static QName _IDSourceText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IDSourceText");
    private final static QName _PersonAFISID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonAFISID");
    private final static QName _RangeMinimumMeasure_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "RangeMinimumMeasure");
    private final static QName _PersonSurName_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonSurName");
    private final static QName _OrganizationName_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "OrganizationName");
    private final static QName _IDTypeCodeText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IDTypeCodeText");
    private final static QName _PersonMiddleName_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonMiddleName");
    private final static QName _PersonAssignedIDDetails_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonAssignedIDDetails");
    private final static QName _PersonRaceCode_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonRaceCode");
    private final static QName _PersonEthnicityCode_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonEthnicityCode");
    private final static QName _IDJurisdictionCodeNcicLSTA_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IDJurisdictionCode.ncicLSTA");
    private final static QName _IDJurisdictionCode_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IDJurisdictionCode");
    private final static QName _CaseTrackingID_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "CaseTrackingID");
    private final static QName _Residence_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "Residence");
    private final static QName _LocationAddress_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "LocationAddress");
    private final static QName _IncidentLevelText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "IncidentLevelText");
    private final static QName _PersonNameSoundexText_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "PersonNameSoundexText");
    private final static QName _LocationStreet_QNAME = new QName("http://www.it.ojp.gov/jxdm/3.0.2", "LocationStreet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.ojp.it.jxdm._3_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResidenceType }
     * 
     */
    public ResidenceType createResidenceType() {
        return new ResidenceType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link StreetType }
     * 
     */
    public StreetType createStreetType() {
        return new StreetType();
    }

    /**
     * Create an instance of {@link AgeMeasureType }
     * 
     */
    public AgeMeasureType createAgeMeasureType() {
        return new AgeMeasureType();
    }

    /**
     * Create an instance of {@link CaseTrackingIDType }
     * 
     */
    public CaseTrackingIDType createCaseTrackingIDType() {
        return new CaseTrackingIDType();
    }

    /**
     * Create an instance of {@link RangeAgeMeasureType }
     * 
     */
    public RangeAgeMeasureType createRangeAgeMeasureType() {
        return new RangeAgeMeasureType();
    }

    /**
     * Create an instance of {@link PersonAssignedIDDetailsType }
     * 
     */
    public PersonAssignedIDDetailsType createPersonAssignedIDDetailsType() {
        return new PersonAssignedIDDetailsType();
    }

    /**
     * Create an instance of {@link SubjectIDType }
     * 
     */
    public SubjectIDType createSubjectIDType() {
        return new SubjectIDType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link ActivityType }
     * 
     */
    public ActivityType createActivityType() {
        return new ActivityType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link ActivityID }
     * 
     */
    public ActivityID createActivityID() {
        return new ActivityID();
    }

    /**
     * Create an instance of {@link PersonOtherIDType }
     * 
     */
    public PersonOtherIDType createPersonOtherIDType() {
        return new PersonOtherIDType();
    }

    /**
     * Create an instance of {@link PersonAlias }
     * 
     */
    public PersonAlias createPersonAlias() {
        return new PersonAlias();
    }

    /**
     * Create an instance of {@link SuperType }
     * 
     */
    public SuperType createSuperType() {
        return new SuperType();
    }

    /**
     * Create an instance of {@link RangeMeasureType }
     * 
     */
    public RangeMeasureType createRangeMeasureType() {
        return new RangeMeasureType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link CaseType }
     * 
     */
    public CaseType createCaseType() {
        return new CaseType();
    }

    /**
     * Create an instance of {@link IncidentType }
     * 
     */
    public IncidentType createIncidentType() {
        return new IncidentType();
    }

    /**
     * Create an instance of {@link Residence }
     * 
     */
    public Residence createResidence() {
        return new Residence();
    }

    /**
     * Create an instance of {@link PersonNameTextType }
     * 
     */
    public PersonNameTextType createPersonNameTextType() {
        return new PersonNameTextType();
    }

    /**
     * Create an instance of {@link PersonSocialDetailsType }
     * 
     */
    public PersonSocialDetailsType createPersonSocialDetailsType() {
        return new PersonSocialDetailsType();
    }

    /**
     * Create an instance of {@link PostalIDType }
     * 
     */
    public PostalIDType createPostalIDType() {
        return new PostalIDType();
    }

    /**
     * Create an instance of {@link IDType }
     * 
     */
    public IDType createIDType() {
        return new IDType();
    }

    /**
     * Create an instance of {@link IncidentCategoryType }
     * 
     */
    public IncidentCategoryType createIncidentCategoryType() {
        return new IncidentCategoryType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link PersonOtherID }
     * 
     */
    public PersonOtherID createPersonOtherID() {
        return new PersonOtherID();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link ActivityIdType }
     * 
     */
    public ActivityIdType createActivityIdType() {
        return new ActivityIdType();
    }

    /**
     * Create an instance of {@link PersonPhysicalDetailsType }
     * 
     */
    public PersonPhysicalDetailsType createPersonPhysicalDetailsType() {
        return new PersonPhysicalDetailsType();
    }

    /**
     * Create an instance of {@link SubjectType }
     * 
     */
    public SubjectType createSubjectType() {
        return new SubjectType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "OrganizationIncorporatedIndicator")
    public JAXBElement<Boolean> createOrganizationIncorporatedIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_OrganizationIncorporatedIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "StreetFullText")
    public JAXBElement<String> createStreetFullText(String value) {
        return new JAXBElement<String>(_StreetFullText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IDEffectiveDate")
    public JAXBElement<XMLGregorianCalendar> createIDEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IDEffectiveDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonSuffixName")
    public JAXBElement<String> createPersonSuffixName(String value) {
        return new JAXBElement<String>(_PersonSuffixName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USStateCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "LocationStateCode.USPostalService")
    public JAXBElement<USStateCodeType> createLocationStateCodeUSPostalService(USStateCodeType value) {
        return new JAXBElement<USStateCodeType>(_LocationStateCodeUSPostalService_QNAME, USStateCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonStateID")
    public JAXBElement<IDType> createPersonStateID(IDType value) {
        return new JAXBElement<IDType>(_PersonStateID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeAgeMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonAgeMeasure.Range")
    public JAXBElement<RangeAgeMeasureType> createPersonAgeMeasureRange(RangeAgeMeasureType value) {
        return new JAXBElement<RangeAgeMeasureType>(_PersonAgeMeasureRange_QNAME, RangeAgeMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonOtherID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonOtherID")
    public JAXBElement<PersonOtherID> createPersonOtherID(PersonOtherID value) {
        return new JAXBElement<PersonOtherID>(_PersonOtherID_QNAME, PersonOtherID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonBirthDate")
    public JAXBElement<XMLGregorianCalendar> createPersonBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonBirthDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IDJurisdictionCode.ncicLIS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIDJurisdictionCodeNcicLIS(String value) {
        return new JAXBElement<String>(_IDJurisdictionCodeNcicLIS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonFullName")
    public JAXBElement<String> createPersonFullName(String value) {
        return new JAXBElement<String>(_PersonFullName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "ActivityTime")
    public JAXBElement<XMLGregorianCalendar> createActivityTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivityTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IncidentCategoryTypeText")
    public JAXBElement<String> createIncidentCategoryTypeText(String value) {
        return new JAXBElement<String>(_IncidentCategoryTypeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonAgeMeasure")
    public JAXBElement<AgeMeasureType> createPersonAgeMeasure(AgeMeasureType value) {
        return new JAXBElement<AgeMeasureType>(_PersonAgeMeasure_QNAME, AgeMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonGivenName")
    public JAXBElement<String> createPersonGivenName(String value) {
        return new JAXBElement<String>(_PersonGivenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonAlias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonAlias")
    public JAXBElement<PersonAlias> createPersonAlias(PersonAlias value) {
        return new JAXBElement<PersonAlias>(_PersonAlias_QNAME, PersonAlias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "Subject")
    public JAXBElement<SubjectType> createSubject(SubjectType value) {
        return new JAXBElement<SubjectType>(_Subject_QNAME, SubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "ActivityID")
    public JAXBElement<ActivityID> createActivityID(ActivityID value) {
        return new JAXBElement<ActivityID>(_ActivityID_QNAME, ActivityID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonSocialDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonSocialDetails")
    public JAXBElement<PersonSocialDetailsType> createPersonSocialDetails(PersonSocialDetailsType value) {
        return new JAXBElement<PersonSocialDetailsType>(_PersonSocialDetails_QNAME, PersonSocialDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonPhysicalDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonPhysicalDetails")
    public JAXBElement<PersonPhysicalDetailsType> createPersonPhysicalDetails(PersonPhysicalDetailsType value) {
        return new JAXBElement<PersonPhysicalDetailsType>(_PersonPhysicalDetails_QNAME, PersonPhysicalDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "LocationCityName")
    public JAXBElement<String> createLocationCityName(String value) {
        return new JAXBElement<String>(_LocationCityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "LocationStateName")
    public JAXBElement<String> createLocationStateName(String value) {
        return new JAXBElement<String>(_LocationStateName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SEXType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonSexCode")
    public JAXBElement<SEXType> createPersonSexCode(SEXType value) {
        return new JAXBElement<SEXType>(_PersonSexCode_QNAME, SEXType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "LocationPostalCodeID")
    public JAXBElement<PostalIDType> createLocationPostalCodeID(PostalIDType value) {
        return new JAXBElement<PostalIDType>(_LocationPostalCodeID_QNAME, PostalIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonFBIID")
    public JAXBElement<IDType> createPersonFBIID(IDType value) {
        return new JAXBElement<IDType>(_PersonFBIID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IncidentCategory")
    public JAXBElement<IncidentCategoryType> createIncidentCategory(IncidentCategoryType value) {
        return new JAXBElement<IncidentCategoryType>(_IncidentCategory_QNAME, IncidentCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "ActivityTypeText")
    public JAXBElement<String> createActivityTypeText(String value) {
        return new JAXBElement<String>(_ActivityTypeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IDJurisdictionText")
    public JAXBElement<String> createIDJurisdictionText(String value) {
        return new JAXBElement<String>(_IDJurisdictionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonSSNID")
    public JAXBElement<IDType> createPersonSSNID(IDType value) {
        return new JAXBElement<IDType>(_PersonSSNID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffenseLevelCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IncidentLevelCode")
    public JAXBElement<OffenseLevelCodeType> createIncidentLevelCode(OffenseLevelCodeType value) {
        return new JAXBElement<OffenseLevelCodeType>(_IncidentLevelCode_QNAME, OffenseLevelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonLicenseID")
    public JAXBElement<IDType> createPersonLicenseID(IDType value) {
        return new JAXBElement<IDType>(_PersonLicenseID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "ActivityDate")
    public JAXBElement<XMLGregorianCalendar> createActivityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivityDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "RangeMaximumMeasure")
    public JAXBElement<BigInteger> createRangeMaximumMeasure(BigInteger value) {
        return new JAXBElement<BigInteger>(_RangeMaximumMeasure_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "SubjectID")
    public JAXBElement<SubjectIDType> createSubjectID(SubjectIDType value) {
        return new JAXBElement<SubjectIDType>(_SubjectID_QNAME, SubjectIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "Offense")
    public JAXBElement<IncidentType> createOffense(IncidentType value) {
        return new JAXBElement<IncidentType>(_Offense_QNAME, IncidentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IDIssuingAuthorityText")
    public JAXBElement<String> createIDIssuingAuthorityText(String value) {
        return new JAXBElement<String>(_IDIssuingAuthorityText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "ID")
    public JAXBElement<String> createID(String value) {
        return new JAXBElement<String>(_ID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IDTypeText")
    public JAXBElement<String> createIDTypeText(String value) {
        return new JAXBElement<String>(_IDTypeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IDSourceText")
    public JAXBElement<String> createIDSourceText(String value) {
        return new JAXBElement<String>(_IDSourceText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonAFISID")
    public JAXBElement<IDType> createPersonAFISID(IDType value) {
        return new JAXBElement<IDType>(_PersonAFISID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "RangeMinimumMeasure")
    public JAXBElement<BigInteger> createRangeMinimumMeasure(BigInteger value) {
        return new JAXBElement<BigInteger>(_RangeMinimumMeasure_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonSurName")
    public JAXBElement<String> createPersonSurName(String value) {
        return new JAXBElement<String>(_PersonSurName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "OrganizationName")
    public JAXBElement<TextType> createOrganizationName(TextType value) {
        return new JAXBElement<TextType>(_OrganizationName_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IDTypeCodeText")
    public JAXBElement<String> createIDTypeCodeText(String value) {
        return new JAXBElement<String>(_IDTypeCodeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonMiddleName")
    public JAXBElement<String> createPersonMiddleName(String value) {
        return new JAXBElement<String>(_PersonMiddleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonAssignedIDDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonAssignedIDDetails")
    public JAXBElement<PersonAssignedIDDetailsType> createPersonAssignedIDDetails(PersonAssignedIDDetailsType value) {
        return new JAXBElement<PersonAssignedIDDetailsType>(_PersonAssignedIDDetails_QNAME, PersonAssignedIDDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RACType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonRaceCode")
    public JAXBElement<RACType> createPersonRaceCode(RACType value) {
        return new JAXBElement<RACType>(_PersonRaceCode_QNAME, RACType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EthnicityCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonEthnicityCode")
    public JAXBElement<EthnicityCodeType> createPersonEthnicityCode(EthnicityCodeType value) {
        return new JAXBElement<EthnicityCodeType>(_PersonEthnicityCode_QNAME, EthnicityCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LSTAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IDJurisdictionCode.ncicLSTA")
    public JAXBElement<LSTAType> createIDJurisdictionCodeNcicLSTA(LSTAType value) {
        return new JAXBElement<LSTAType>(_IDJurisdictionCodeNcicLSTA_QNAME, LSTAType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IDJurisdictionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIDJurisdictionCode(String value) {
        return new JAXBElement<String>(_IDJurisdictionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseTrackingIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "CaseTrackingID")
    public JAXBElement<CaseTrackingIDType> createCaseTrackingID(CaseTrackingIDType value) {
        return new JAXBElement<CaseTrackingIDType>(_CaseTrackingID_QNAME, CaseTrackingIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Residence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "Residence")
    public JAXBElement<Residence> createResidence(Residence value) {
        return new JAXBElement<Residence>(_Residence_QNAME, Residence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "LocationAddress")
    public JAXBElement<AddressType> createLocationAddress(AddressType value) {
        return new JAXBElement<AddressType>(_LocationAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "IncidentLevelText")
    public JAXBElement<String> createIncidentLevelText(String value) {
        return new JAXBElement<String>(_IncidentLevelText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "PersonNameSoundexText")
    public JAXBElement<String> createPersonNameSoundexText(String value) {
        return new JAXBElement<String>(_PersonNameSoundexText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.it.ojp.gov/jxdm/3.0.2", name = "LocationStreet")
    public JAXBElement<StreetType> createLocationStreet(StreetType value) {
        return new JAXBElement<StreetType>(_LocationStreet_QNAME, StreetType.class, null, value);
    }

}
