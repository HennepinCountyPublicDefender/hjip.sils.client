
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure that describes details about an activity or process that occurs.
 * 
 * <p>Java class for ActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}ActivityID"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}ActivityDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}ActivityTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityType", propOrder = {
    "activityID",
    "activityDate",
    "activityTime"
})
@XmlSeeAlso({
    IncidentType.class,
    CaseType.class,
    us.mn.hennepin.co.justice.silsservicemessage.Action.TrackingOffense.Activity.class,
    us.mn.hennepin.co.justice.silsservicemessage.SubjectEntity.TrackingOffense.Activity.class
})
public class ActivityType
    extends SuperType
{

    @XmlElement(name = "ActivityID", required = true, nillable = true)
    protected ActivityID activityID;
    @XmlElement(name = "ActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityDate;
    @XmlElement(name = "ActivityTime", nillable = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar activityTime;

    /**
     * An identifier that uniquely refers to an activity or process that occurred.
     * 
     * @return
     *     possible object is
     *     {@link ActivityID }
     *     
     */
    public ActivityID getActivityID() {
        return activityID;
    }

    /**
     * Sets the value of the activityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityID }
     *     
     */
    public void setActivityID(ActivityID value) {
        this.activityID = value;
    }

    /**
     * A date of an activity that occurs at a singular point in time or a start date of an activity that occurs over a period of time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDate(XMLGregorianCalendar value) {
        this.activityDate = value;
    }

    /**
     * A time of an activity that occurs at a singular point in time or a start time of an activity that occurs over a period of time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityTime() {
        return activityTime;
    }

    /**
     * Sets the value of the activityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityTime(XMLGregorianCalendar value) {
        this.activityTime = value;
    }

}
