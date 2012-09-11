
package us.mn.hennepin.co.justice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import gov.ojp.it.jxdm._3_0.PersonType;
import us.mn.hennepin.co.common.IndicatorCodeType;


/**
 * Structure for describing HC criminal justice subject personna.
 * 
 * <p>Java class for SubjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}PersonType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}NoMiddleNameIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}SubjectTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectType", propOrder = {
    "noMiddleNameIndicator",
    "subjectTypeCode"
})
@XmlSeeAlso({
    us.mn.hennepin.co.justice.silsservicemessage.Action.Subject.class,
    us.mn.hennepin.co.justice.silsservicemessage.SubjectEntity.Subject.class
})
public class SubjectType
    extends PersonType
{

    @XmlElement(name = "NoMiddleNameIndicator")
    protected IndicatorCodeType noMiddleNameIndicator;
    @XmlElement(name = "SubjectTypeCode")
    protected String subjectTypeCode;

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

}
