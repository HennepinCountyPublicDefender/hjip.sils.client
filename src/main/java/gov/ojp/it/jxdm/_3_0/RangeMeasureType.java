
package gov.ojp.it.jxdm._3_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes a minimum - maximum range between two measured values.
 * 
 * <p>Java class for RangeMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeMeasureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}RangeMinimumMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}RangeMaximumMeasure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeMeasureType", propOrder = {
    "rangeMinimumMeasure",
    "rangeMaximumMeasure"
})
@XmlSeeAlso({
    RangeAgeMeasureType.class
})
public class RangeMeasureType
    extends SuperType
{

    @XmlElement(name = "RangeMinimumMeasure", nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rangeMinimumMeasure;
    @XmlElement(name = "RangeMaximumMeasure", nillable = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rangeMaximumMeasure;

    /**
     * A minimum measure value on a range measure.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeMinimumMeasure() {
        return rangeMinimumMeasure;
    }

    /**
     * Sets the value of the rangeMinimumMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeMinimumMeasure(BigInteger value) {
        this.rangeMinimumMeasure = value;
    }

    /**
     * A maximum measure value on a range measure.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeMaximumMeasure() {
        return rangeMaximumMeasure;
    }

    /**
     * Sets the value of the rangeMaximumMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeMaximumMeasure(BigInteger value) {
        this.rangeMaximumMeasure = value;
    }

}
