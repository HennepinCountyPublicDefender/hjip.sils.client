
package us.mn.hennepin.co.justice.silsservicemessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.ojp.it.jxdm._3_0.ActivityType;
import gov.ojp.it.jxdm._3_0.AddressType;
import gov.ojp.it.jxdm._3_0.PersonOtherIDType;
import us.mn.hennepin.co.justice.SILSActionType;
import us.mn.hennepin.co.justice.SubjectEntityID;
import us.mn.hennepin.co.justice.SubjectType;
import us.mn.hennepin.co.justice.TrackingOffenseType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionTypeText" type="{http://www.co.hennepin.mn.us/Justice}SILSActionType"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}SubjectEntityID" minOccurs="0"/>
 *         &lt;element name="Subject" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.co.hennepin.mn.us/Justice}SubjectType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LocationAddress" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}AddressType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PersonOtherID" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}PersonOtherIDType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TrackingOffense" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.co.hennepin.mn.us/Justice}TrackingOffenseType">
 *                 &lt;sequence>
 *                   &lt;element name="Activity" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}ActivityType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "actionTypeText",
    "subjectEntityID",
    "subject",
    "locationAddress",
    "personOtherID",
    "trackingOffense"
})
@XmlRootElement(name = "Action")
public class Action {

    @XmlElement(name = "ActionTypeText", required = true)
    protected SILSActionType actionTypeText;
    @XmlElement(name = "SubjectEntityID", namespace = "http://www.co.hennepin.mn.us/Justice", nillable = true)
    protected SubjectEntityID subjectEntityID;
    @XmlElement(name = "Subject")
    protected List<Action.Subject> subject;
    @XmlElement(name = "LocationAddress")
    protected List<Action.LocationAddress> locationAddress;
    @XmlElement(name = "PersonOtherID")
    protected List<Action.PersonOtherID> personOtherID;
    @XmlElement(name = "TrackingOffense")
    protected List<Action.TrackingOffense> trackingOffense;

    /**
     * Gets the value of the actionTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link SILSActionType }
     *     
     */
    public SILSActionType getActionTypeText() {
        return actionTypeText;
    }

    /**
     * Sets the value of the actionTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SILSActionType }
     *     
     */
    public void setActionTypeText(SILSActionType value) {
        this.actionTypeText = value;
    }

    /**
     * Gets the value of the subjectEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectEntityID }
     *     
     */
    public SubjectEntityID getSubjectEntityID() {
        return subjectEntityID;
    }

    /**
     * Sets the value of the subjectEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectEntityID }
     *     
     */
    public void setSubjectEntityID(SubjectEntityID value) {
        this.subjectEntityID = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action.Subject }
     * 
     * 
     */
    public List<Action.Subject> getSubject() {
        if (subject == null) {
            subject = new ArrayList<Action.Subject>();
        }
        return this.subject;
    }

    /**
     * Gets the value of the locationAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action.LocationAddress }
     * 
     * 
     */
    public List<Action.LocationAddress> getLocationAddress() {
        if (locationAddress == null) {
            locationAddress = new ArrayList<Action.LocationAddress>();
        }
        return this.locationAddress;
    }

    /**
     * Gets the value of the personOtherID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personOtherID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonOtherID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action.PersonOtherID }
     * 
     * 
     */
    public List<Action.PersonOtherID> getPersonOtherID() {
        if (personOtherID == null) {
            personOtherID = new ArrayList<Action.PersonOtherID>();
        }
        return this.personOtherID;
    }

    /**
     * Gets the value of the trackingOffense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingOffense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingOffense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action.TrackingOffense }
     * 
     * 
     */
    public List<Action.TrackingOffense> getTrackingOffense() {
        if (trackingOffense == null) {
            trackingOffense = new ArrayList<Action.TrackingOffense>();
        }
        return this.trackingOffense;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}AddressType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LocationAddress
        extends AddressType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}PersonOtherIDType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PersonOtherID
        extends PersonOtherIDType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.co.hennepin.mn.us/Justice}SubjectType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Subject
        extends SubjectType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.co.hennepin.mn.us/Justice}TrackingOffenseType">
     *       &lt;sequence>
     *         &lt;element name="Activity" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}ActivityType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "activity"
    })
    public static class TrackingOffense
        extends TrackingOffenseType
    {

        @XmlElement(name = "Activity")
        protected List<Action.TrackingOffense.Activity> activity;

        /**
         * Gets the value of the activity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Action.TrackingOffense.Activity }
         * 
         * 
         */
        public List<Action.TrackingOffense.Activity> getActivity() {
            if (activity == null) {
                activity = new ArrayList<Action.TrackingOffense.Activity>();
            }
            return this.activity;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}ActivityType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Activity
            extends ActivityType
        {


        }

    }

}
