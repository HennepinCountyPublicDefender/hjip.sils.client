
package us.mn.hennepin.co.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure for code value and corresponding description.
 * 
 * <p>Java class for CodedElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}CodeText"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Common}CodeDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedElementType", propOrder = {
    "codeText",
    "codeDescription"
})
public abstract class CodedElementType {

    @XmlElement(name = "CodeText", required = true)
    protected String codeText;
    @XmlElement(name = "CodeDescription")
    protected String codeDescription;

    /**
     * Gets the value of the codeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeText() {
        return codeText;
    }

    /**
     * Sets the value of the codeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeText(String value) {
        this.codeText = value;
    }

    /**
     * Gets the value of the codeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDescription() {
        return codeDescription;
    }

    /**
     * Sets the value of the codeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDescription(String value) {
        this.codeDescription = value;
    }

}
