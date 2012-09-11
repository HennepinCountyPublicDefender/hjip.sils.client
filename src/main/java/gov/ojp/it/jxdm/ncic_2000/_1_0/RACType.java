
package gov.ojp.it.jxdm.ncic_2000._1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RACType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RACType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="W"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RACType", namespace = "http://www.it.ojp.gov/jxdm/ncic_2000/1.0.1")
@XmlEnum
public enum RACType {


    /**
     * ASIAN
     * 
     */
    A,

    /**
     * BLACK
     * 
     */
    B,

    /**
     * AMERICAN INDIAN
     * 
     */
    I,

    /**
     * UNKNOWN
     * 
     */
    U,

    /**
     * WHITE
     * 
     */
    W;

    public String value() {
        return name();
    }

    public static RACType fromValue(String v) {
        return valueOf(v);
    }

}
