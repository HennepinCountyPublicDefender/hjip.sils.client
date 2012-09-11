
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes a place in which a person lives.
 * 
 * <p>Java class for ResidenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}LocationType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidenceType")
@XmlSeeAlso({
    Residence.class
})
public class ResidenceType
    extends LocationType
{


}
