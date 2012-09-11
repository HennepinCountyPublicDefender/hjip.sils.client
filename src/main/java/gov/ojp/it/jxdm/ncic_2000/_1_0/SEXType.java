
package gov.ojp.it.jxdm.ncic_2000._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SEXType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SEXType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SEXType", namespace = "http://www.it.ojp.gov/jxdm/ncic_2000/1.0.1")
@XmlEnum
public enum SEXType {


    /**
     * FEMALE
     * 
     */
    F,

    /**
     * MALE
     * 
     */
    M,

    /**
     * UNKNOWN - FOR UNIDENTIFIED ONLY
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static SEXType fromValue(String v) {
        return valueOf(v);
    }

}
