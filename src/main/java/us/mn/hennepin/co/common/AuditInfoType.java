
package us.mn.hennepin.co.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes who is responsible for transaction event.
 * 
 * <p>Java class for AuditInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}UserID" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}UserRoleText" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}ActionTypeText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditInfoType", propOrder = {
    "userID",
    "userRoleText",
    "actionTypeText"
})
public class AuditInfoType {

    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "UserRoleText")
    protected String userRoleText;
    @XmlElement(name = "ActionTypeText")
    protected String actionTypeText;

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

    /**
     * Gets the value of the userRoleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRoleText() {
        return userRoleText;
    }

    /**
     * Sets the value of the userRoleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRoleText(String value) {
        this.userRoleText = value;
    }

    /**
     * Gets the value of the actionTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTypeText() {
        return actionTypeText;
    }

    /**
     * Sets the value of the actionTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTypeText(String value) {
        this.actionTypeText = value;
    }

}
