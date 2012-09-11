
package us.mn.hennepin.co.justice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gov.ojp.it.jxdm._3_0.AddressType;
import gov.ojp.it.jxdm._3_0.PersonNameType;
import gov.ojp.it.jxdm._3_0.PersonPhysicalDetailsType;
import gov.ojp.it.jxdm._3_0.PersonSocialDetailsType;
import us.mn.hennepin.co.common.IndicatorCodeType;


/**
 * Structure for returning SILS summary search results.
 * 
 * <p>Java class for SubjectSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}SubjectEntityID" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}SubjectTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonName" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}NoMiddleNameIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonBirthDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonPhysicalDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonSocialDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}LocationAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectSummaryType", propOrder = {
    "subjectEntityID",
    "subjectTypeCode",
    "personName",
    "noMiddleNameIndicator",
    "personBirthDate",
    "personPhysicalDetails",
    "personSocialDetails",
    "locationAddress"
})
@XmlSeeAlso({
    us.mn.hennepin.co.justice.silsservicemessage.SearchPersonIDResult.SubjectSummary.class,
    us.mn.hennepin.co.justice.silsservicemessage.SearchActivityIDResult.SubjectSummary.class,
    us.mn.hennepin.co.justice.silsservicemessage.SearchNameResult.SubjectSummary.class
})
public class SubjectSummaryType {

    @XmlElement(name = "SubjectEntityID", nillable = true)
    protected SubjectEntityID subjectEntityID;
    @XmlElement(name = "SubjectTypeCode")
    protected String subjectTypeCode;
    @XmlElement(name = "PersonName", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected PersonNameType personName;
    @XmlElement(name = "NoMiddleNameIndicator")
    protected IndicatorCodeType noMiddleNameIndicator;
    @XmlElement(name = "PersonBirthDate", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar personBirthDate;
    @XmlElement(name = "PersonPhysicalDetails", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected PersonPhysicalDetailsType personPhysicalDetails;
    @XmlElement(name = "PersonSocialDetails", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected PersonSocialDetailsType personSocialDetails;
    @XmlElement(name = "LocationAddress", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected AddressType locationAddress;

    /**
     * Gets the value of the subjectEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectEntityID }
     *     
     */
    public SubjectEntityID getSubjectEntityID() {
        return subjectEntityID;
    }

    /**
     * Sets the value of the subjectEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectEntityID }
     *     
     */
    public void setSubjectEntityID(SubjectEntityID value) {
        this.subjectEntityID = value;
    }

    /**
     * Gets the value of the subjectTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectTypeCode() {
        return subjectTypeCode;
    }

    /**
     * Sets the value of the subjectTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectTypeCode(String value) {
        this.subjectTypeCode = value;
    }

    /**
     * A name by which a person is known. 
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the noMiddleNameIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorCodeType }
     *     
     */
    public IndicatorCodeType getNoMiddleNameIndicator() {
        return noMiddleNameIndicator;
    }

    /**
     * Sets the value of the noMiddleNameIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorCodeType }
     *     
     */
    public void setNoMiddleNameIndicator(IndicatorCodeType value) {
        this.noMiddleNameIndicator = value;
    }

    /**
     * A date a person was born.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonBirthDate() {
        return personBirthDate;
    }

    /**
     * Sets the value of the personBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonBirthDate(XMLGregorianCalendar value) {
        this.personBirthDate = value;
    }

    /**
     * A set of details about the physical appearance of a person.
     * 
     * @return
     *     possible object is
     *     {@link PersonPhysicalDetailsType }
     *     
     */
    public PersonPhysicalDetailsType getPersonPhysicalDetails() {
        return personPhysicalDetails;
    }

    /**
     * Sets the value of the personPhysicalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonPhysicalDetailsType }
     *     
     */
    public void setPersonPhysicalDetails(PersonPhysicalDetailsType value) {
        this.personPhysicalDetails = value;
    }

    /**
     * A set of details about the social characteristics of a person.
     * 
     * @return
     *     possible object is
     *     {@link PersonSocialDetailsType }
     *     
     */
    public PersonSocialDetailsType getPersonSocialDetails() {
        return personSocialDetails;
    }

    /**
     * Sets the value of the personSocialDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonSocialDetailsType }
     *     
     */
    public void setPersonSocialDetails(PersonSocialDetailsType value) {
        this.personSocialDetails = value;
    }

    /**
     * Details about the place in which a person lives.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getLocationAddress() {
        return locationAddress;
    }

    /**
     * Sets the value of the locationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setLocationAddress(AddressType value) {
        this.locationAddress = value;
    }

}
