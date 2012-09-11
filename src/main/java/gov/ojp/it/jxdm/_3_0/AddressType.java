
package gov.ojp.it.jxdm._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import gov.ojp.it.jxdm.usps_states._1.USStateCodeType;


/**
 * A structure that describes a postal location to which paper mail can be directed.
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.it.ojp.gov/jxdm/3.0.2}SuperType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}LocationStreet" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}LocationCityName" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}LocationStateCode.USPostalService" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}LocationPostalCodeID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "locationStreet",
    "locationCityName",
    "locationStateCodeUSPostalService",
    "locationPostalCodeID"
})
@XmlSeeAlso({
    us.mn.hennepin.co.justice.silsservicemessage.Action.LocationAddress.class,
    us.mn.hennepin.co.justice.silsservicemessage.SubjectEntity.LocationAddress.class
})
public class AddressType
    extends SuperType
{

    @XmlElement(name = "LocationStreet", nillable = true)
    protected StreetType locationStreet;
    @XmlElement(name = "LocationCityName", nillable = true)
    protected String locationCityName;
    @XmlElement(name = "LocationStateCode.USPostalService", nillable = true)
    protected USStateCodeType locationStateCodeUSPostalService;
    @XmlElement(name = "LocationPostalCodeID", nillable = true)
    protected PostalIDType locationPostalCodeID;

    /**
     * Details about a street.
     * 
     * @return
     *     possible object is
     *     {@link StreetType }
     *     
     */
    public StreetType getLocationStreet() {
        return locationStreet;
    }

    /**
     * Sets the value of the locationStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetType }
     *     
     */
    public void setLocationStreet(StreetType value) {
        this.locationStreet = value;
    }

    /**
     * A name of a city or town.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCityName() {
        return locationCityName;
    }

    /**
     * Sets the value of the locationCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCityName(String value) {
        this.locationCityName = value;
    }

    /**
     * Gets the value of the locationStateCodeUSPostalService property.
     * 
     * @return
     *     possible object is
     *     {@link USStateCodeType }
     *     
     */
    public USStateCodeType getLocationStateCodeUSPostalService() {
        return locationStateCodeUSPostalService;
    }

    /**
     * Sets the value of the locationStateCodeUSPostalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link USStateCodeType }
     *     
     */
    public void setLocationStateCodeUSPostalService(USStateCodeType value) {
        this.locationStateCodeUSPostalService = value;
    }

    /**
     * Gets the value of the locationPostalCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link PostalIDType }
     *     
     */
    public PostalIDType getLocationPostalCodeID() {
        return locationPostalCodeID;
    }

    /**
     * Sets the value of the locationPostalCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalIDType }
     *     
     */
    public void setLocationPostalCodeID(PostalIDType value) {
        this.locationPostalCodeID = value;
    }

}
