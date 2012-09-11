
package us.mn.hennepin.co.justice.silsservicemessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.mn.hennepin.co.common.MessageReplyType;


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
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice/SILSServiceMessage}SubjectEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReplyStatus" type="{http://www.co.hennepin.mn.us/Common}MessageReplyType" minOccurs="0"/>
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
    "subjectEntity",
    "replyStatus"
})
@XmlRootElement(name = "ReplySearchDetail")
public class ReplySearchDetail {

    @XmlElement(name = "SubjectEntity")
    protected List<SubjectEntity> subjectEntity;
    @XmlElement(name = "ReplyStatus")
    protected MessageReplyType replyStatus;

    /**
     * Gets the value of the subjectEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectEntity }
     * 
     * 
     */
    public List<SubjectEntity> getSubjectEntity() {
        if (subjectEntity == null) {
            subjectEntity = new ArrayList<SubjectEntity>();
        }
        return this.subjectEntity;
    }

    /**
     * Gets the value of the replyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReplyType }
     *     
     */
    public MessageReplyType getReplyStatus() {
        return replyStatus;
    }

    /**
     * Sets the value of the replyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReplyType }
     *     
     */
    public void setReplyStatus(MessageReplyType value) {
        this.replyStatus = value;
    }

}
