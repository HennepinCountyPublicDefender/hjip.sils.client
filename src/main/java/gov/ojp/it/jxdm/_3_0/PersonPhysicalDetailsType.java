
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.ojp.it.jxdm.ncic_2000._1_0.RACType;
import gov.ojp.it.jxdm.ncic_2000._1_0.SEXType;


/**
 * A structure that describes the physical appearance of a person.
 * 
 * <p>Java class for PersonPhysicalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPhysicalDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonSexCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonRaceCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPhysicalDetailsType", propOrder = {
    "personSexCode",
    "personRaceCode"
})
public class PersonPhysicalDetailsType
    extends SuperType
{

    @XmlElement(name = "PersonSexCode", nillable = true)
    protected SEXType personSexCode;
    @XmlElement(name = "PersonRaceCode", nillable = true)
    protected RACType personRaceCode;

    /**
     * A code identifying the gender or sex of a person.
     * 
     * @return
     *     possible object is
     *     {@link SEXType }
     *     
     */
    public SEXType getPersonSexCode() {
        return personSexCode;
    }

    /**
     * Sets the value of the personSexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEXType }
     *     
     */
    public void setPersonSexCode(SEXType value) {
        this.personSexCode = value;
    }

    /**
     * A code identifying the race of a person.
     * 
     * @return
     *     possible object is
     *     {@link RACType }
     *     
     */
    public RACType getPersonRaceCode() {
        return personRaceCode;
    }

    /**
     * Sets the value of the personRaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RACType }
     *     
     */
    public void setPersonRaceCode(RACType value) {
        this.personRaceCode = value;
    }

}
