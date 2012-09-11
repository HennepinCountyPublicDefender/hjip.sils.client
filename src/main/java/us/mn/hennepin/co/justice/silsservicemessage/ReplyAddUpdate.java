
package us.mn.hennepin.co.justice.silsservicemessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://www.co.hennepin.mn.us/Common}MessageReplyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice/SILSServiceMessage}ActionResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "actionResult"
})
@XmlRootElement(name = "ReplyAddUpdate")
public class ReplyAddUpdate
    extends MessageReplyType
{

    @XmlElement(name = "ActionResult")
    protected List<ActionResult> actionResult;
    @XmlAttribute(name = "sourceText", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
    protected String sourceText;

    /**
     * Gets the value of the actionResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionResult }
     * 
     * 
     */
    public List<ActionResult> getActionResult() {
        if (actionResult == null) {
            actionResult = new ArrayList<ActionResult>();
        }
        return this.actionResult;
    }

    /**
     * Gets the value of the sourceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceText() {
        return sourceText;
    }

    /**
     * Sets the value of the sourceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceText(String value) {
        this.sourceText = value;
    }

}
