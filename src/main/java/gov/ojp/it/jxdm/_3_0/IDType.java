
package gov.ojp.it.jxdm._3_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure that describes an identifier of an entity.
 * 
 * <p>Java class for IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}ID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IDTypeText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IDTypeCodeText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IDEffectiveDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IDIssuingAuthorityText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IDJurisdictionText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}IDSourceText" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDType", propOrder = {
    "id",
    "idTypeText",
    "idTypeCodeText",
    "idEffectiveDate",
    "idIssuingAuthorityText",
    "idJurisdictionText",
    "idSourceText"
})
public class IDType
    extends SuperType
{

    @XmlElement(name = "ID", nillable = true)
    protected List<String> id;
    @XmlElement(name = "IDTypeText", nillable = true)
    protected List<String> idTypeText;
    @XmlElement(name = "IDTypeCodeText", nillable = true)
    protected List<String> idTypeCodeText;
    @XmlElement(name = "IDEffectiveDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> idEffectiveDate;
    @XmlElement(name = "IDIssuingAuthorityText", nillable = true)
    protected List<String> idIssuingAuthorityText;
    @XmlElement(name = "IDJurisdictionText", nillable = true)
    protected List<String> idJurisdictionText;
    @XmlElement(name = "IDSourceText", nillable = true)
    protected List<String> idSourceText;

    /**
     * A value that identifies an entity within the identifier domain.Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getID() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

    /**
     * A type of identifier assigned.Gets the value of the idTypeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idTypeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDTypeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDTypeText() {
        if (idTypeText == null) {
            idTypeText = new ArrayList<String>();
        }
        return this.idTypeText;
    }

    /**
     * A textual code representing the type of identifier assigned.Gets the value of the idTypeCodeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idTypeCodeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDTypeCodeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDTypeCodeText() {
        if (idTypeCodeText == null) {
            idTypeCodeText = new ArrayList<String>();
        }
        return this.idTypeCodeText;
    }

    /**
     * A date an identifier becomes effective. This may or may not be the issue date.Gets the value of the idEffectiveDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idEffectiveDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDEffectiveDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getIDEffectiveDate() {
        if (idEffectiveDate == null) {
            idEffectiveDate = new ArrayList<XMLGregorianCalendar>();
        }
        return this.idEffectiveDate;
    }

    /**
     * A name, identifier, or code of an organization or person that has authority over an identifier.Gets the value of the idIssuingAuthorityText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idIssuingAuthorityText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDIssuingAuthorityText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDIssuingAuthorityText() {
        if (idIssuingAuthorityText == null) {
            idIssuingAuthorityText = new ArrayList<String>();
        }
        return this.idIssuingAuthorityText;
    }

    /**
     * An area or region, e.g., state or country, in which an identifier is unique.Gets the value of the idJurisdictionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idJurisdictionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDJurisdictionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDJurisdictionText() {
        if (idJurisdictionText == null) {
            idJurisdictionText = new ArrayList<String>();
        }
        return this.idJurisdictionText;
    }

    /**
     * The locale or organization from which an identification originates.Gets the value of the idSourceText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idSourceText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDSourceText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIDSourceText() {
        if (idSourceText == null) {
            idSourceText = new ArrayList<String>();
        }
        return this.idSourceText;
    }

}
