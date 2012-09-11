
package us.mn.hennepin.co.justice.silsservicemessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gov.ojp.it.jxdm._3_0.RangeAgeMeasureType;
import gov.ojp.it.jxdm.ncic_2000._1_0.RACType;
import gov.ojp.it.jxdm.ncic_2000._1_0.SEXType;
import gov.ojp.it.jxdm.nibrs_misc._1.EthnicityCodeType;
import us.mn.hennepin.co.common.IndicatorCodeType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonSurName"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonGivenName" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonMiddleName" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonBirthDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonRaceCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonEthnicityCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonSexCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.it.ojp.gov/jxdm/3.0.2}PersonAgeMeasure.Range" minOccurs="0"/>
 *         &lt;element name="SoundexSearchIndicator" type="{http://www.co.hennepin.mn.us/Common}IndicatorCodeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice}SubjectTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personSurName",
    "personGivenName",
    "personMiddleName",
    "personBirthDate",
    "personRaceCode",
    "personEthnicityCode",
    "personSexCode",
    "personAgeMeasureRange",
    "soundexSearchIndicator",
    "subjectTypeCode"
})
@XmlRootElement(name = "RequestSearchName")
public class RequestSearchName {

    @XmlElement(name = "PersonSurName", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", required = true, nillable = true)
    protected String personSurName;
    @XmlElement(name = "PersonGivenName", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected String personGivenName;
    @XmlElement(name = "PersonMiddleName", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected String personMiddleName;
    @XmlElement(name = "PersonBirthDate", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar personBirthDate;
    @XmlElement(name = "PersonRaceCode", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected RACType personRaceCode;
    @XmlElement(name = "PersonEthnicityCode", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected EthnicityCodeType personEthnicityCode;
    @XmlElement(name = "PersonSexCode", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected SEXType personSexCode;
    @XmlElement(name = "PersonAgeMeasure.Range", namespace = "http://www.it.ojp.gov/jxdm/3.0.2", nillable = true)
    protected RangeAgeMeasureType personAgeMeasureRange;
    @XmlElement(name = "SoundexSearchIndicator")
    protected IndicatorCodeType soundexSearchIndicator;
    @XmlElement(name = "SubjectTypeCode", namespace = "http://www.co.hennepin.mn.us/Justice")
    protected String subjectTypeCode;

    /**
     * Gets the value of the personSurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSurName() {
        return personSurName;
    }

    /**
     * Sets the value of the personSurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSurName(String value) {
        this.personSurName = value;
    }

    /**
     * Gets the value of the personGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonGivenName() {
        return personGivenName;
    }

    /**
     * Sets the value of the personGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonGivenName(String value) {
        this.personGivenName = value;
    }

    /**
     * Gets the value of the personMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonMiddleName() {
        return personMiddleName;
    }

    /**
     * Sets the value of the personMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonMiddleName(String value) {
        this.personMiddleName = value;
    }

    /**
     * Gets the value of the personBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonBirthDate() {
        return personBirthDate;
    }

    /**
     * Sets the value of the personBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonBirthDate(XMLGregorianCalendar value) {
        this.personBirthDate = value;
    }

    /**
     * Gets the value of the personRaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link RACType }
     *     
     */
    public RACType getPersonRaceCode() {
        return personRaceCode;
    }

    /**
     * Sets the value of the personRaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RACType }
     *     
     */
    public void setPersonRaceCode(RACType value) {
        this.personRaceCode = value;
    }

    /**
     * Gets the value of the personEthnicityCode property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicityCodeType }
     *     
     */
    public EthnicityCodeType getPersonEthnicityCode() {
        return personEthnicityCode;
    }

    /**
     * Sets the value of the personEthnicityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicityCodeType }
     *     
     */
    public void setPersonEthnicityCode(EthnicityCodeType value) {
        this.personEthnicityCode = value;
    }

    /**
     * Gets the value of the personSexCode property.
     * 
     * @return
     *     possible object is
     *     {@link SEXType }
     *     
     */
    public SEXType getPersonSexCode() {
        return personSexCode;
    }

    /**
     * Sets the value of the personSexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEXType }
     *     
     */
    public void setPersonSexCode(SEXType value) {
        this.personSexCode = value;
    }

    /**
     * Gets the value of the personAgeMeasureRange property.
     * 
     * @return
     *     possible object is
     *     {@link RangeAgeMeasureType }
     *     
     */
    public RangeAgeMeasureType getPersonAgeMeasureRange() {
        return personAgeMeasureRange;
    }

    /**
     * Sets the value of the personAgeMeasureRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeAgeMeasureType }
     *     
     */
    public void setPersonAgeMeasureRange(RangeAgeMeasureType value) {
        this.personAgeMeasureRange = value;
    }

    /**
     * Gets the value of the soundexSearchIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorCodeType }
     *     
     */
    public IndicatorCodeType getSoundexSearchIndicator() {
        return soundexSearchIndicator;
    }

    /**
     * Sets the value of the soundexSearchIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorCodeType }
     *     
     */
    public void setSoundexSearchIndicator(IndicatorCodeType value) {
        this.soundexSearchIndicator = value;
    }

    /**
     * Gets the value of the subjectTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectTypeCode() {
        return subjectTypeCode;
    }

    /**
     * Sets the value of the subjectTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectTypeCode(String value) {
        this.subjectTypeCode = value;
    }

}
