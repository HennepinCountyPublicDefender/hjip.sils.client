
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure that describes the inherent and frequently associated characteristics of a  person.
 * 
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonName" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonBirthDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonPhysicalDetails" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonSocialDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "personName",
    "personBirthDate",
    "personPhysicalDetails",
    "personSocialDetails"
})
@XmlSeeAlso({
    PersonAlias.class,
    gov.ojp.it.jxdm._3_0.SubjectType.class,
    us.mn.hennepin.co.justice.SubjectType.class
})
public class PersonType
    extends SuperType
{

    @XmlElement(name = "PersonName", nillable = true)
    protected PersonNameType personName;
    @XmlElement(name = "PersonBirthDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar personBirthDate;
    @XmlElement(name = "PersonPhysicalDetails", nillable = true)
    protected PersonPhysicalDetailsType personPhysicalDetails;
    @XmlElement(name = "PersonSocialDetails", nillable = true)
    protected PersonSocialDetailsType personSocialDetails;

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

}
