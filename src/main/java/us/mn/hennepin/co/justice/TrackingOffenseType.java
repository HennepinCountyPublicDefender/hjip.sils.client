
package us.mn.hennepin.co.justice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure for describing an incident or offense.
 * 
 * <p>Java class for TrackingOffenseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingOffenseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}CaseTrackingID" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}OffenseDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IncidentCategoryTypeText" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IncidentLevelText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingOffenseType", propOrder = {
    "caseTrackingID",
    "offenseDate",
    "incidentCategoryTypeText",
    "incidentLevelText"
})
@XmlSeeAlso({
    us.mn.hennepin.co.justice.silsservicemessage.Action.TrackingOffense.class,
    us.mn.hennepin.co.justice.silsservicemessage.SubjectEntity.TrackingOffense.class
})
public class TrackingOffenseType {

    @XmlElement(name = "CaseTrackingID", nillable = true)
    protected CaseTrackingID caseTrackingID;
    @XmlElement(name = "OffenseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar offenseDate;
    @XmlElement(name = "IncidentCategoryTypeText", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected String incidentCategoryTypeText;
    @XmlElement(name = "IncidentLevelText", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected String incidentLevelText;

    /**
     * Gets the value of the caseTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link CaseTrackingID }
     *     
     */
    public CaseTrackingID getCaseTrackingID() {
        return caseTrackingID;
    }

    /**
     * Sets the value of the caseTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseTrackingID }
     *     
     */
    public void setCaseTrackingID(CaseTrackingID value) {
        this.caseTrackingID = value;
    }

    /**
     * Gets the value of the offenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOffenseDate() {
        return offenseDate;
    }

    /**
     * Sets the value of the offenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOffenseDate(XMLGregorianCalendar value) {
        this.offenseDate = value;
    }

    /**
     * Gets the value of the incidentCategoryTypeText property.
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
