
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDTypeText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDIssuingAuthorityText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityIdType", propOrder = {
    "id",
    "idTypeText",
    "idIssuingAuthorityText"
})
@XmlSeeAlso({
    ActivityID.class
})
public class ActivityIdType {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "IDTypeText", required = true)
    protected String idTypeText;
    @XmlElement(name = "IDIssuingAuthorityText")
    protected String idIssuingAuthorityText;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTypeText() {
        return idTypeText;
    }

    /**
     * Sets the value of the idTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTypeText(String value) {
        this.idTypeText = value;
    }

    /**
     * Gets the value of the idIssuingAuthorityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDIssuingAuthorityText() {
        return idIssuingAuthorityText;
    }

    /**
     * Sets the value of the idIssuingAuthorityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDIssuingAuthorityText(String value) {
        this.idIssuingAuthorityText = value;
    }

}
