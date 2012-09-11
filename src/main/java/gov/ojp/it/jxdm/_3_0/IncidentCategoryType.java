
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes a general category or classification of an incident.
 * 
 * <p>Java class for IncidentCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentCategoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IncidentCategoryTypeText" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IncidentLevelText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentCategoryType", propOrder = {
    "incidentCategoryTypeText",
    "incidentLevelText"
})
public class IncidentCategoryType
    extends SuperType
{

    @XmlElement(name = "IncidentCategoryTypeText", nillable = true)
    protected String incidentCategoryTypeText;
    @XmlElement(name = "IncidentLevelText", nillable = true)
    protected String incidentLevelText;

    /**
     * A general category of an incident that occurred, e.g., assault, burglary, theft.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCategoryTypeText() {
        return incidentCategoryTypeText;
    }

    /**
     * Sets the value of the incidentCategoryTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCategoryTypeText(String value) {
        this.incidentCategoryTypeText = value;
    }

    /**
     * Gets the value of the incidentLevelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentLevelText() {
        return incidentLevelText;
    }

    /**
     * Sets the value of the incidentLevelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentLevelText(String value) {
        this.incidentLevelText = value;
    }

}
