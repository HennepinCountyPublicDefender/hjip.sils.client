
package gov.ojp.it.jxdm.nibrs_misc._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EthnicityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EthnicityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EthnicityCodeType", namespace = "http://www.it.ojp.gov/jxdm/nibrs_misc/1.0")
@XmlEnum
public enum EthnicityCodeType {


    /**
     * Hispanic
     * 
     */
    H,

    /**
     * non Hispanic
     * 
     */
    N,

    /**
     * unknown
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static EthnicityCodeType fromValue(String v) {
        return valueOf(v);
    }

}
