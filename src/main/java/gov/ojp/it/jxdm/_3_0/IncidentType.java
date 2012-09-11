
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes a criminal or non-criminal activity that occurred.
 * 
 * <p>Java class for IncidentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}ActivityType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IncidentCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentType", propOrder = {
    "incidentCategory"
})
public class IncidentType
    extends ActivityType
{

    @XmlElement(name = "IncidentCategory", nillable = true)
    protected IncidentCategoryType incidentCategory;

    /**
     * Details that describe a general category or classification of an incident.
     * 
     * @return
     *     possible object is
     *     {@link IncidentCategoryType }
     *     
     */
    public IncidentCategoryType getIncidentCategory() {
        return incidentCategory;
    }

    /**
     * Sets the value of the incidentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentCategoryType }
     *     
     */
    public void setIncidentCategory(IncidentCategoryType value) {
        this.incidentCategory = value;
    }

}
