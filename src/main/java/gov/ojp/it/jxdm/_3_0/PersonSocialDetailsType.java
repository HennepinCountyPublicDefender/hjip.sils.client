
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.ojp.it.jxdm.nibrs_misc._1.EthnicityCodeType;


/**
 * A structure that describes the social characteristics of a person.
 * 
 * <p>Java class for PersonSocialDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonSocialDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonEthnicityCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonSocialDetailsType", propOrder = {
    "personEthnicityCode"
})
public class PersonSocialDetailsType
    extends SuperType
{

    @XmlElement(name = "PersonEthnicityCode", nillable = true)
    protected EthnicityCodeType personEthnicityCode;

    /**
     * A code identifying a person's cultural lineage.
     * 
     * @return
     *     possible object is
     *     {@link EthnicityCodeType }
     *     
     */
    public EthnicityCodeType getPersonEthnicityCode() {
        return personEthnicityCode;
    }

    /**
     * Sets the value of the personEthnicityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicityCodeType }
     *     
     */
    public void setPersonEthnicityCode(EthnicityCodeType value) {
        this.personEthnicityCode = value;
    }

}
