
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}PersonType">
 *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}lastUpdatedDate"/>
 *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}lastUpdatedTime"/>
 *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}sourceText"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PersonAlias
    extends PersonType
{

    @XmlAttribute(name = "lastUpdatedDate", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdatedDate;
    @XmlAttribute(name = "lastUpdatedTime", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lastUpdatedTime;
    @XmlAttribute(name = "sourceText", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
    protected String sourceText;

    /**
     * Gets the value of the lastUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * Sets the value of the lastUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedDate(XMLGregorianCalendar value) {
        this.lastUpdatedDate = value;
    }

    /**
     * Gets the value of the lastUpdatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * Sets the value of the lastUpdatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedTime(XMLGregorianCalendar value) {
        this.lastUpdatedTime = value;
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
