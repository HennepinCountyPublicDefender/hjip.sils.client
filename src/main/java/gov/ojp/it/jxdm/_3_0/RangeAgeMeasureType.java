
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that represents a minimum - maximum range between two age measures.
 * 
 * <p>Java class for RangeAgeMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeAgeMeasureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}RangeMeasureType">
 *       &lt;attribute ref="{http://www.it.ojp.gov/jxdm/3.0.2}ageUnitCode"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeAgeMeasureType")
public class RangeAgeMeasureType
    extends RangeMeasureType
{

    @XmlAttribute(name = "ageUnitCode", namespace = "http://www.it.ojp.gov/jxdm/3.0.2")
    protected String ageUnitCode;

    /**
     * Gets the value of the ageUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeUnitCode() {
        return ageUnitCode;
    }

    /**
     * Sets the value of the ageUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeUnitCode(String value) {
        this.ageUnitCode = value;
    }

}
