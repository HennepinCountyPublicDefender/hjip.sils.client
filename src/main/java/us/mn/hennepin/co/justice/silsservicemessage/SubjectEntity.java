
package us.mn.hennepin.co.justice.silsservicemessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gov.ojp.it.jxdm._3_0.ActivityType;
import gov.ojp.it.jxdm._3_0.AddressType;
import gov.ojp.it.jxdm._3_0.PersonOtherIDType;
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
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}SubjectEntityID"/>
 *         &lt;element name="Subject" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.co.hennepin.mn.us/Justice}SubjectType">
 *                 &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
 *                 &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LocationAddress" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}AddressType">
 *                 &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
 *                 &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PersonOtherID" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}PersonOtherIDType">
 *                 &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
 *                 &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
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
 *                           &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
 *                           &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
 *                 &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subjectEntityID",
    "subject",
    "locationAddress",
    "personOtherID",
    "trackingOffense"
})
@XmlRootElement(name = "SubjectEntity")
public class SubjectEntity {

    @XmlElement(name = "SubjectEntityID", namespace = "http://www.co.hennepin.mn.us/Justice", required = true, nillable = true)
    protected SubjectEntityID subjectEntityID;
    @XmlElement(name = "Subject", required = true)
    protected List<SubjectEntity.Subject> subject;
    @XmlElement(name = "LocationAddress")
    protected List<SubjectEntity.LocationAddress> locationAddress;
    @XmlElement(name = "PersonOtherID")
    protected List<SubjectEntity.PersonOtherID> personOtherID;
    @XmlElement(name = "TrackingOffense")
    protected List<SubjectEntity.TrackingOffense> trackingOffense;
    @XmlAttribute(name = "lastUpdateDateTime", namespace = "http://www.co.hennepin.mn.us/Common")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDateTime;

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
     * {@link SubjectEntity.Subject }
     * 
     * 
     */
    public List<SubjectEntity.Subject> getSubject() {
        if (subject == null) {
            subject = new ArrayList<SubjectEntity.Subject>();
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
     * {@link SubjectEntity.LocationAddress }
     * 
     * 
     */
    public List<SubjectEntity.LocationAddress> getLocationAddress() {
        if (locationAddress == null) {
            locationAddress = new ArrayList<SubjectEntity.LocationAddress>();
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
     * {@link SubjectEntity.PersonOtherID }
     * 
     * 
     */
    public List<SubjectEntity.PersonOtherID> getPersonOtherID() {
        if (personOtherID == null) {
            personOtherID = new ArrayList<SubjectEntity.PersonOtherID>();
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
     * {@link SubjectEntity.TrackingOffense }
     * 
     * 
     */
    public List<SubjectEntity.TrackingOffense> getTrackingOffense() {
        if (trackingOffense == null) {
            trackingOffense = new ArrayList<SubjectEntity.TrackingOffense>();
        }
        return this.trackingOffense;
    }

    /**
     * Gets the value of the lastUpdateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * Sets the value of the lastUpdateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDateTime(XMLGregorianCalendar value) {
        this.lastUpdateDateTime = value;
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
     *       &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
     *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
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

        @XmlAttribute(name = "lastUpdateDateTime", namespace = "http://www.co.hennepin.mn.us/Common")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdateDateTime;
        @XmlAttribute(name = "sourceText", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
        protected String sourceText;

        /**
         * Gets the value of the lastUpdateDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdateDateTime() {
            return lastUpdateDateTime;
        }

        /**
         * Sets the value of the lastUpdateDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdateDateTime(XMLGregorianCalendar value) {
            this.lastUpdateDateTime = value;
        }

        /**
         * Gets the value of the sourceText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceText() {
            return sourceText;
        }

        /**
         * Sets the value of the sourceText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceText(String value) {
            this.sourceText = value;
        }

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
     *       &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
     *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
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

        @XmlAttribute(name = "lastUpdateDateTime", namespace = "http://www.co.hennepin.mn.us/Common")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdateDateTime;
        @XmlAttribute(name = "sourceText", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
        protected String sourceText;

        /**
         * Gets the value of the lastUpdateDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdateDateTime() {
            return lastUpdateDateTime;
        }

        /**
         * Sets the value of the lastUpdateDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdateDateTime(XMLGregorianCalendar value) {
            this.lastUpdateDateTime = value;
        }

        /**
         * Gets the value of the sourceText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceText() {
            return sourceText;
        }

        /**
         * Sets the value of the sourceText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceText(String value) {
            this.sourceText = value;
        }

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
     *       &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
     *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
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

        @XmlAttribute(name = "lastUpdateDateTime", namespace = "http://www.co.hennepin.mn.us/Common")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdateDateTime;
        @XmlAttribute(name = "sourceText", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
        protected String sourceText;

        /**
         * Gets the value of the lastUpdateDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdateDateTime() {
            return lastUpdateDateTime;
        }

        /**
         * Sets the value of the lastUpdateDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdateDateTime(XMLGregorianCalendar value) {
            this.lastUpdateDateTime = value;
        }

        /**
         * Gets the value of the sourceText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceText() {
            return sourceText;
        }

        /**
         * Sets the value of the sourceText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceText(String value) {
            this.sourceText = value;
        }

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
     *                 &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
     *                 &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
     *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
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
        protected List<SubjectEntity.TrackingOffense.Activity> activity;
        @XmlAttribute(name = "lastUpdateDateTime", namespace = "http://www.co.hennepin.mn.us/Common")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdateDateTime;
        @XmlAttribute(name = "sourceText", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
        protected String sourceText;

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
         * {@link SubjectEntity.TrackingOffense.Activity }
         * 
         * 
         */
        public List<SubjectEntity.TrackingOffense.Activity> getActivity() {
            if (activity == null) {
                activity = new ArrayList<SubjectEntity.TrackingOffense.Activity>();
            }
            return this.activity;
        }

        /**
         * Gets the value of the lastUpdateDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdateDateTime() {
            return lastUpdateDateTime;
        }

        /**
         * Sets the value of the lastUpdateDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdateDateTime(XMLGregorianCalendar value) {
            this.lastUpdateDateTime = value;
        }

        /**
         * Gets the value of the sourceText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceText() {
            return sourceText;
        }

        /**
         * Sets the value of the sourceText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceText(String value) {
            this.sourceText = value;
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
         *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
         *       &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
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

            @XmlAttribute(name = "sourceText", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
            protected String sourceText;
            @XmlAttribute(name = "lastUpdateDateTime", namespace = "http://www.co.hennepin.mn.us/Common")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar lastUpdateDateTime;

            /**
             * Gets the value of the sourceText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceText() {
                return sourceText;
            }

            /**
             * Sets the value of the sourceText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceText(String value) {
                this.sourceText = value;
            }

            /**
             * Gets the value of the lastUpdateDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLastUpdateDateTime() {
                return lastUpdateDateTime;
            }

            /**
             * Sets the value of the lastUpdateDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLastUpdateDateTime(XMLGregorianCalendar value) {
                this.lastUpdateDateTime = value;
            }

        }

    }

}
