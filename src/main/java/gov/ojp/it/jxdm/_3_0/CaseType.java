
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes an aggregation of information about a set of related activities and occurrences.
 * 
 * <p>Java class for CaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}ActivityType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}CaseTrackingID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseType", propOrder = {
    "caseTrackingID"
})
public class CaseType
    extends ActivityType
{

    @XmlElement(name = "CaseTrackingID", nillable = true)
    protected CaseTrackingIDType caseTrackingID;

    /**
     * A number used to track a case.
     * 
     * @return
     *     possible object is
     *     {@link CaseTrackingIDType }
     *     
     */
    public CaseTrackingIDType getCaseTrackingID() {
        return caseTrackingID;
    }

    /**
     * Sets the value of the caseTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseTrackingIDType }
     *     
     */
    public void setCaseTrackingID(CaseTrackingIDType value) {
        this.caseTrackingID = value;
    }

}
