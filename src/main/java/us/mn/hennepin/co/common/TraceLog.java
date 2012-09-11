
package us.mn.hennepin.co.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}TraceRequestIndicator"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}LogMessage" maxOccurs="unbounded" minOccurs="0"/>
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
    "traceRequestIndicator",
    "logMessage"
})
@XmlRootElement(name = "TraceLog")
public class TraceLog {

    @XmlElement(name = "TraceRequestIndicator")
    protected boolean traceRequestIndicator;
    @XmlElement(name = "LogMessage")
    protected List<LogMessageType> logMessage;

    /**
     * Gets the value of the traceRequestIndicator property.
     * 
     */
    public boolean isTraceRequestIndicator() {
        return traceRequestIndicator;
    }

    /**
     * Sets the value of the traceRequestIndicator property.
     * 
     */
    public void setTraceRequestIndicator(boolean value) {
        this.traceRequestIndicator = value;
    }

    /**
     * Gets the value of the logMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogMessageType }
     * 
     * 
     */
    public List<LogMessageType> getLogMessage() {
        if (logMessage == null) {
            logMessage = new ArrayList<LogMessageType>();
        }
        return this.logMessage;
    }

}
