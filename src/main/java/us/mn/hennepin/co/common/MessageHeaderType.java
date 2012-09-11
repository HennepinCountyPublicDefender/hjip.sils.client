
package us.mn.hennepin.co.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Structure for metadata commonly used to administer message processing and debugging.
 * 
 * <p>Java class for MessageHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}MessageSender"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}MessageSentDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ApplicationMessageID" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}MessageTypeText" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}RequestReply" minOccurs="0"/>
 *         &lt;element name="CommentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeaderType", propOrder = {
    "messageSender",
    "messageSentDateTime",
    "applicationMessageID",
    "messageTypeText",
    "requestReply",
    "commentText"
})
public class MessageHeaderType {

    @XmlElement(name = "MessageSender", required = true)
    protected MessagePartyType messageSender;
    @XmlElement(name = "MessageSentDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageSentDateTime;
    @XmlElement(name = "ApplicationMessageID")
    protected String applicationMessageID;
    @XmlElement(name = "MessageTypeText")
    protected String messageTypeText;
    @XmlElement(name = "RequestReply")
    protected RequestReplyType requestReply;
    @XmlElement(name = "CommentText")
    protected String commentText;

    /**
     * Gets the value of the messageSender property.
     * 
     * @return
     *     possible object is
     *     {@link MessagePartyType }
     *     
     */
    public MessagePartyType getMessageSender() {
        return messageSender;
    }

    /**
     * Sets the value of the messageSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagePartyType }
     *     
     */
    public void setMessageSender(MessagePartyType value) {
        this.messageSender = value;
    }

    /**
     * Gets the value of the messageSentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageSentDateTime() {
        return messageSentDateTime;
    }

    /**
     * Sets the value of the messageSentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageSentDateTime(XMLGregorianCalendar value) {
        this.messageSentDateTime = value;
    }

    /**
     * Gets the value of the applicationMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationMessageID() {
        return applicationMessageID;
    }

    /**
     * Sets the value of the applicationMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationMessageID(String value) {
        this.applicationMessageID = value;
    }

    /**
     * Gets the value of the messageTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTypeText() {
        return messageTypeText;
    }

    /**
     * Sets the value of the messageTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTypeText(String value) {
        this.messageTypeText = value;
    }

    /**
     * Gets the value of the requestReply property.
     * 
     * @return
     *     possible object is
     *     {@link RequestReplyType }
     *     
     */
    public RequestReplyType getRequestReply() {
        return requestReply;
    }

    /**
     * Sets the value of the requestReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestReplyType }
     *     
     */
    public void setRequestReply(RequestReplyType value) {
        this.requestReply = value;
    }

    /**
     * Gets the value of the commentText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

}
