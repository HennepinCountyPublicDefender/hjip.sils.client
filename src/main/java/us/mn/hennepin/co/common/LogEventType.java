
package us.mn.hennepin.co.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Structure for describing a processing event during course of message exchange.  Calling application and application name will be same for top level event.
 * 
 * <p>Java class for LogEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExceptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventLocation" type="{http://www.co.hennepin.mn.us/Common}LocationType" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}EventTimeMilliseconds"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}EventDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}LogLevelText"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}EnvironmentCode"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ThreadName" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ApplicationName"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ParentApplicationName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogEventType", propOrder = {
    "messageText",
    "exceptionText",
    "eventLocation",
    "eventTimeMilliseconds",
    "eventDateTime",
    "logLevelText",
    "environmentCode",
    "threadName",
    "applicationName",
    "parentApplicationName"
})
public class LogEventType {

    @XmlElement(name = "MessageText", required = true)
    protected String messageText;
    @XmlElement(name = "ExceptionText")
    protected String exceptionText;
    @XmlElement(name = "EventLocation")
    protected LocationType eventLocation;
    @XmlElement(name = "EventTimeMilliseconds", required = true)
    protected BigDecimal eventTimeMilliseconds;
    @XmlElement(name = "EventDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "LogLevelText", required = true)
    protected String logLevelText;
    @XmlElement(name = "EnvironmentCode", required = true)
    protected String environmentCode;
    @XmlElement(name = "ThreadName")
    protected String threadName;
    @XmlElement(name = "ApplicationName", required = true)
    protected String applicationName;
    @XmlElement(name = "ParentApplicationName", required = true)
    protected String parentApplicationName;

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

    /**
     * Gets the value of the exceptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionText() {
        return exceptionText;
    }

    /**
     * Sets the value of the exceptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionText(String value) {
        this.exceptionText = value;
    }

    /**
     * Gets the value of the eventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getEventLocation() {
        return eventLocation;
    }

    /**
     * Sets the value of the eventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setEventLocation(LocationType value) {
        this.eventLocation = value;
    }

    /**
     * Gets the value of the eventTimeMilliseconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEventTimeMilliseconds() {
        return eventTimeMilliseconds;
    }

    /**
     * Sets the value of the eventTimeMilliseconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEventTimeMilliseconds(BigDecimal value) {
        this.eventTimeMilliseconds = value;
    }

    /**
     * Gets the value of the eventDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
    }

    /**
     * Gets the value of the logLevelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogLevelText() {
        return logLevelText;
    }

    /**
     * Sets the value of the logLevelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogLevelText(String value) {
        this.logLevelText = value;
    }

    /**
     * Gets the value of the environmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentCode() {
        return environmentCode;
    }

    /**
     * Sets the value of the environmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentCode(String value) {
        this.environmentCode = value;
    }

    /**
     * Gets the value of the threadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadName() {
        return threadName;
    }

    /**
     * Sets the value of the threadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadName(String value) {
        this.threadName = value;
    }

    /**
     * Event source or service application system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the parentApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentApplicationName() {
        return parentApplicationName;
    }

    /**
     * Sets the value of the parentApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentApplicationName(String value) {
        this.parentApplicationName = value;
    }

}
