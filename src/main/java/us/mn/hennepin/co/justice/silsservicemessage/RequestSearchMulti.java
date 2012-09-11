
package us.mn.hennepin.co.justice.silsservicemessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.ojp.it.jxdm._3_0.ActivityIdType;


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
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice/SILSServiceMessage}RequestSearchPersonID" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice/SILSServiceMessage}RequestSearchActivityID" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice/SILSServiceMessage}RequestSearchName" minOccurs="0"/>
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
    "requestSearchPersonID",
    "requestSearchActivityID",
    "requestSearchName"
})
@XmlRootElement(name = "RequestSearchMulti")
public class RequestSearchMulti {

    @XmlElement(name = "RequestSearchPersonID")
    protected List<RequestSearchPersonID> requestSearchPersonID;
    @XmlElement(name = "RequestSearchActivityID")
    protected List<ActivityIdType> requestSearchActivityID;
    @XmlElement(name = "RequestSearchName")
    protected RequestSearchName requestSearchName;

    /**
     * Gets the value of the requestSearchPersonID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestSearchPersonID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestSearchPersonID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestSearchPersonID }
     * 
     * 
     */
    public List<RequestSearchPersonID> getRequestSearchPersonID() {
        if (requestSearchPersonID == null) {
            requestSearchPersonID = new ArrayList<RequestSearchPersonID>();
        }
        return this.requestSearchPersonID;
    }

    /**
     * Gets the value of the requestSearchActivityID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestSearchActivityID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestSearchActivityID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityIdType }
     * 
     * 
     */
    public List<ActivityIdType> getRequestSearchActivityID() {
        if (requestSearchActivityID == null) {
            requestSearchActivityID = new ArrayList<ActivityIdType>();
        }
        return this.requestSearchActivityID;
    }

    /**
     * Gets the value of the requestSearchName property.
     * 
     * @return
     *     possible object is
     *     {@link RequestSearchName }
     *     
     */
    public RequestSearchName getRequestSearchName() {
        return requestSearchName;
    }

    /**
     * Sets the value of the requestSearchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestSearchName }
     *     
     */
    public void setRequestSearchName(RequestSearchName value) {
        this.requestSearchName = value;
    }

}
