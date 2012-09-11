
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes a person who is involved or suspected of being involved in an incident or criminal activity.
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
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}SubjectID"/>
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
    "subjectID"
})
public class SubjectType
    extends PersonType
{

    @XmlElement(name = "SubjectID", required = true, nillable = true)
    protected SubjectIDType subjectID;

    /**
     * Gets the value of the subjectID property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectIDType }
     *     
     */
    public SubjectIDType getSubjectID() {
        return subjectID;
    }

    /**
     * Sets the value of the subjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectIDType }
     *     
     */
    public void setSubjectID(SubjectIDType value) {
        this.subjectID = value;
    }

}
