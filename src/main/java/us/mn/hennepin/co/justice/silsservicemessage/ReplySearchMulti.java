
package us.mn.hennepin.co.justice.silsservicemessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice/SILSServiceMessage}SearchPersonIDResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice/SILSServiceMessage}SearchActivityIDResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.co.hennepin.mn.us/Justice/SILSServiceMessage}SearchNameResult" minOccurs="0"/>
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
    "searchPersonIDResult",
    "searchActivityIDResult",
    "searchNameResult"
})
@XmlRootElement(name = "ReplySearchMulti")
public class ReplySearchMulti {

    @XmlElement(name = "SearchPersonIDResult")
    protected List<SearchPersonIDResult> searchPersonIDResult;
    @XmlElement(name = "SearchActivityIDResult")
    protected List<SearchActivityIDResult> searchActivityIDResult;
    @XmlElement(name = "SearchNameResult")
    protected SearchNameResult searchNameResult;

    /**
     * Gets the value of the searchPersonIDResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPersonIDResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchPersonIDResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPersonIDResult }
     * 
     * 
     */
    public List<SearchPersonIDResult> getSearchPersonIDResult() {
        if (searchPersonIDResult == null) {
            searchPersonIDResult = new ArrayList<SearchPersonIDResult>();
        }
        return this.searchPersonIDResult;
    }

    /**
     * Gets the value of the searchActivityIDResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchActivityIDResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchActivityIDResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchActivityIDResult }
     * 
     * 
     */
    public List<SearchActivityIDResult> getSearchActivityIDResult() {
        if (searchActivityIDResult == null) {
            searchActivityIDResult = new ArrayList<SearchActivityIDResult>();
        }
        return this.searchActivityIDResult;
    }

    /**
     * Gets the value of the searchNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link SearchNameResult }
     *     
     */
    public SearchNameResult getSearchNameResult() {
        return searchNameResult;
    }

    /**
     * Sets the value of the searchNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchNameResult }
     *     
     */
    public void setSearchNameResult(SearchNameResult value) {
        this.searchNameResult = value;
    }

}
