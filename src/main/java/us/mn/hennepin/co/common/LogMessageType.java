
package us.mn.hennepin.co.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}LogEvent"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}AuditInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogMessageType", propOrder = {
    "logEvent",
    "auditInfo"
})
public class LogMessageType {

    @XmlElement(name = "LogEvent", required = true)
    protected LogEventType logEvent;
    @XmlElement(name = "AuditInfo")
    protected AuditInfoType auditInfo;

    /**
     * Gets the value of the logEvent property.
     * 
     * @return
     *     possible object is
     *     {@link LogEventType }
     *     
     */
    public LogEventType getLogEvent() {
        return logEvent;
    }

    /**
     * Sets the value of the logEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogEventType }
     *     
     */
    public void setLogEvent(LogEventType value) {
        this.logEvent = value;
    }

    /**
     * Gets the value of the auditInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuditInfoType }
     *     
     */
    public AuditInfoType getAuditInfo() {
        return auditInfo;
    }

    /**
     * Sets the value of the auditInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditInfoType }
     *     
     */
    public void setAuditInfo(AuditInfoType value) {
        this.auditInfo = value;
    }

}
