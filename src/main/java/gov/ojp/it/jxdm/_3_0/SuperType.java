
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes metadata common to most other structures.
 * 
 * <p>Java class for SuperType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuperType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.it.ojp.gov/jxdm/3.0.2}SuperTypeMetadata"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuperType")
@XmlSeeAlso({
    IDType.class,
    PersonNameType.class,
    StreetType.class,
    PersonAssignedIDDetailsType.class,
    PersonPhysicalDetailsType.class,
    PersonSocialDetailsType.class,
    IncidentCategoryType.class,
    LocationType.class,
    OrganizationType.class,
    RangeMeasureType.class,
    PersonType.class,
    AddressType.class,
    ActivityType.class
})
public class SuperType {


}
