
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
import us.mn.hennepin.co.common.MessageReplyType;
import us.mn.hennepin.co.justice.SubjectSummaryType;


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
 *         &lt;element name="SubjectSummary" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.co.hennepin.mn.us/Justice}SubjectSummaryType">
 *                 &lt;attribute ref="{http://www.co.hennepin.mn.us/Common}lastUpdateDateTime"/>
 *                 &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice/SILSServiceMessage}RequestSearchPersonID" minOccurs="0"/>
 *         &lt;element name="ReplyStatus" type="{http://www.co.hennepin.mn.us/Common}MessageReplyType" minOccurs="0"/>
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
    "subjectSummary",
    "requestSearchPersonID",
    "replyStatus"
})
@XmlRootElement(name = "SearchPersonIDResult")
public class SearchPersonIDResult {

    @XmlElement(name = "SubjectSummary")
    protected List<SearchPersonIDResult.SubjectSummary> subjectSummary;
    @XmlElement(name = "RequestSearchPersonID")
    protected RequestSearchPersonID requestSearchPersonID;
    @XmlElement(name = "ReplyStatus")
    protected MessageReplyType replyStatus;

    /**
     * Gets the value of the subjectSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPersonIDResult.SubjectSummary }
     * 
     * 
     */
    public List<SearchPersonIDResult.SubjectSummary> getSubjectSummary() {
        if (subjectSummary == null) {
            subjectSummary = new ArrayList<SearchPersonIDResult.SubjectSummary>();
        }
        return this.subjectSummary;
    }

    /**
     * Gets the value of the requestSearchPersonID property.
     * 
     * @return
     *     possible object is
     *     {@link RequestSearchPersonID }
     *     
     */
    public RequestSearchPersonID getRequestSearchPersonID() {
        return requestSearchPersonID;
    }

    /**
     * Sets the value of the requestSearchPersonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestSearchPersonID }
     *     
     */
    public void setRequestSearchPersonID(RequestSearchPersonID value) {
        this.requestSearchPersonID = value;
    }

    /**
     * Gets the value of the replyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReplyType }
     *     
     */
    public MessageReplyType getReplyStatus() {
        return replyStatus;
    }

    /**
     * Sets the value of the replyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReplyType }
     *     
     */
    public void setReplyStatus(MessageReplyType value) {
        this.replyStatus = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.co.hennepin.mn.us/Justice}SubjectSummaryType">
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
    public static class SubjectSummary
        extends SubjectSummaryType
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

}
