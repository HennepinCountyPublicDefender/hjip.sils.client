
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes a name of a person.
 * 
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonGivenName" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonMiddleName" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonSurName" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonSuffixName" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonFullName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "personGivenName",
    "personMiddleName",
    "personSurName",
    "personSuffixName",
    "personFullName"
})
public class PersonNameType
    extends SuperType
{

    @XmlElement(name = "PersonGivenName", nillable = true)
    protected String personGivenName;
    @XmlElement(name = "PersonMiddleName", nillable = true)
    protected String personMiddleName;
    @XmlElement(name = "PersonSurName", nillable = true)
    protected String personSurName;
    @XmlElement(name = "PersonSuffixName", nillable = true)
    protected String personSuffixName;
    @XmlElement(name = "PersonFullName", nillable = true)
    protected String personFullName;

    /**
     * A first name of a person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonGivenName() {
        return personGivenName;
    }

    /**
     * Sets the value of the personGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonGivenName(String value) {
        this.personGivenName = value;
    }

    /**
     * A middle name of a person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonMiddleName() {
        return personMiddleName;
    }

    /**
     * Sets the value of the personMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonMiddleName(String value) {
        this.personMiddleName = value;
    }

    /**
     * A last name or family name of a person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSurName() {
        return personSurName;
    }

    /**
     * Sets the value of the personSurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSurName(String value) {
        this.personSurName = value;
    }

    /**
     * A component that is appended after the family name that distinguishes members of a family with the same given, middle, and last name, (e.g., Jr, Sr, III), or otherwise qualifies the name (e.g., MD, LLD, PhD).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSuffixName() {
        return personSuffixName;
    }

    /**
     * Sets the value of the personSuffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSuffixName(String value) {
        this.personSuffixName = value;
    }

    /**
     * A complete name of a person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFullName() {
        return personFullName;
    }

    /**
     * Sets the value of the personFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFullName(String value) {
        this.personFullName = value;
    }

}
