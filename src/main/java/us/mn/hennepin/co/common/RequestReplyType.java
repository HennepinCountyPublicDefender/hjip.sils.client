
package us.mn.hennepin.co.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure for technical request reply meta data.
 * 
 * <p>Java class for RequestReplyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestReplyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ReplyToQueueManagerName"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ReplyToQueueName"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}CorrelationID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestReplyType", propOrder = {
    "replyToQueueManagerName",
    "replyToQueueName",
    "correlationID"
})
public class RequestReplyType {

    @XmlElement(name = "ReplyToQueueManagerName", required = true)
    protected String replyToQueueManagerName;
    @XmlElement(name = "ReplyToQueueName", required = true)
    protected String replyToQueueName;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;

    /**
     * Gets the value of the replyToQueueManagerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToQueueManagerName() {
        return replyToQueueManagerName;
    }

    /**
     * Sets the value of the replyToQueueManagerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToQueueManagerName(String value) {
        this.replyToQueueManagerName = value;
    }

    /**
     * Gets the value of the replyToQueueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToQueueName() {
        return replyToQueueName;
    }

    /**
     * Sets the value of the replyToQueueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToQueueName(String value) {
        this.replyToQueueName = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

}
