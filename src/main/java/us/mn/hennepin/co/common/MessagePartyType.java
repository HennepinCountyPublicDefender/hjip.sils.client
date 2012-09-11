
package us.mn.hennepin.co.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure for identifying party participating in message exchange.
 * 
 * <p>Java class for MessagePartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessagePartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}OrganizationName"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ApplicationName"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ContactName"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ContactPhoneNumber"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ContactEmailID" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}UserID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessagePartyType", propOrder = {
    "organizationName",
    "applicationName",
    "contactName",
    "contactPhoneNumber",
    "contactEmailID",
    "userID"
})
public class MessagePartyType {

    @XmlElement(name = "OrganizationName", required = true)
    protected String organizationName;
    @XmlElement(name = "ApplicationName", required = true)
    protected String applicationName;
    @XmlElement(name = "ContactName", required = true)
    protected String contactName;
    @XmlElement(name = "ContactPhoneNumber", required = true)
    protected String contactPhoneNumber;
    @XmlElement(name = "ContactEmailID")
    protected String contactEmailID;
    @XmlElement(name = "UserID")
    protected String userID;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the applicationName property.
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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    /**
     * Sets the value of the contactPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhoneNumber(String value) {
        this.contactPhoneNumber = value;
    }

    /**
     * Gets the value of the contactEmailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmailID() {
        return contactEmailID;
    }

    /**
     * Sets the value of the contactEmailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmailID(String value) {
        this.contactEmailID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
