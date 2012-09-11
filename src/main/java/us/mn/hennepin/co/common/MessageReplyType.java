
package us.mn.hennepin.co.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import us.mn.hennepin.co.justice.silsservicemessage.ReplyAddUpdate;


/**
 * Structure for reply status message.
 * 
 * <p>Java class for MessageReplyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageReplyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageStatusText" type="{http://www.co.hennepin.mn.us/Common}MessageStatusTextType"/>
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageReplyType", propOrder = {
    "messageStatusText",
    "messageText"
})
@XmlSeeAlso({
    ReplyAddUpdate.class
})
public class MessageReplyType {

    @XmlElement(name = "MessageStatusText", required = true)
    protected MessageStatusTextType messageStatusText;
    @XmlElement(name = "MessageText", required = true)
    protected String messageText;

    /**
     * Gets the value of the messageStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusTextType }
     *     
     */
    public MessageStatusTextType getMessageStatusText() {
        return messageStatusText;
    }

    /**
     * Sets the value of the messageStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusTextType }
     *     
     */
    public void setMessageStatusText(MessageStatusTextType value) {
        this.messageStatusText = value;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

}
