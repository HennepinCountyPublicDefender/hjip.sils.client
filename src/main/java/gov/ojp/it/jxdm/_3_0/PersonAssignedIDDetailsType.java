
package gov.ojp.it.jxdm._3_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes a set of identifications issued to a person.
 * 
 * <p>Java class for PersonAssignedIDDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonAssignedIDDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonOtherID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonAssignedIDDetailsType", propOrder = {
    "personOtherID"
})
public class PersonAssignedIDDetailsType
    extends SuperType
{

    @XmlElement(name = "PersonOtherID", nillable = true)
    protected List<PersonOtherID> personOtherID;

    /**
     * Gets the value of the personOtherID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personOtherID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonOtherID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonOtherID }
     * 
     * 
     */
    public List<PersonOtherID> getPersonOtherID() {
        if (personOtherID == null) {
            personOtherID = new ArrayList<PersonOtherID>();
        }
        return this.personOtherID;
    }

}
