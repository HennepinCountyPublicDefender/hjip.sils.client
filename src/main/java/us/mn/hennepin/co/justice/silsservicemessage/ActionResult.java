
package us.mn.hennepin.co.justice.silsservicemessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.mn.hennepin.co.justice.CaseTrackingID;
import us.mn.hennepin.co.justice.SILSActionType;
import us.mn.hennepin.co.justice.SubjectEntityID;


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
 *         &lt;element name="ActionTypeText" type="{http://www.co.hennepin.mn.us/Justice}SILSActionType"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}CaseTrackingID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}SubjectEntityID" minOccurs="0"/>
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
    "actionTypeText",
    "caseTrackingID",
    "subjectEntityID"
})
@XmlRootElement(name = "ActionResult")
public class ActionResult {

    @XmlElement(name = "ActionTypeText", required = true)
    protected SILSActionType actionTypeText;
    @XmlElement(name = "CaseTrackingID", namespace = "http://www.co.hennepin.mn.us/Justice", nillable = true)
    protected List<CaseTrackingID> caseTrackingID;
    @XmlElement(name = "SubjectEntityID", namespace = "http://www.co.hennepin.mn.us/Justice", nillable = true)
    protected SubjectEntityID subjectEntityID;

    /**
     * Gets the value of the actionTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link SILSActionType }
     *     
     */
    public SILSActionType getActionTypeText() {
        return actionTypeText;
    }

    /**
     * Sets the value of the actionTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SILSActionType }
     *     
     */
    public void setActionTypeText(SILSActionType value) {
        this.actionTypeText = value;
    }

    /**
     * Gets the value of the caseTrackingID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseTrackingID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseTrackingID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaseTrackingID }
     * 
     * 
     */
    public List<CaseTrackingID> getCaseTrackingID() {
        if (caseTrackingID == null) {
            caseTrackingID = new ArrayList<CaseTrackingID>();
        }
        return this.caseTrackingID;
    }

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

}
