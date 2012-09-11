
package gov.ojp.it.jxdm._3_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes a unit which conducts some sort of business or operations.
 * 
 * <p>Java class for OrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}OrganizationName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}OrganizationIncorporatedIndicator" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", propOrder = {
    "organizationName",
    "organizationIncorporatedIndicator"
})
public class OrganizationType
    extends SuperType
{

    @XmlElement(name = "OrganizationName", nillable = true)
    protected List<TextType> organizationName;
    @XmlElement(name = "OrganizationIncorporatedIndicator", nillable = true)
    protected List<Boolean> organizationIncorporatedIndicator;

    /**
     * A name of an organization.Gets the value of the organizationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getOrganizationName() {
        if (organizationName == null) {
            organizationName = new ArrayList<TextType>();
        }
        return this.organizationName;
    }

    /**
     * True if an organization is incorporated (e.g., corporation); false otherwise (e.g., proprietorship or partnership).Gets the value of the organizationIncorporatedIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationIncorporatedIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationIncorporatedIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getOrganizationIncorporatedIndicator() {
        if (organizationIncorporatedIndicator == null) {
            organizationIncorporatedIndicator = new ArrayList<Boolean>();
        }
        return this.organizationIncorporatedIndicator;
    }

}
