
package gov.ojp.it.jxdm.mn_offense._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffenseLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OffenseLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OffenseLevelCodeType", namespace = "http://www.it.ojp.gov/jxdm/mn_offense/1.0")
@XmlEnum
public enum OffenseLevelCodeType {


    /**
     * Felony
     * 
     */
    F,

    /**
     * Gross Misdemeanor
     * 
     */
    G,

    /**
     * Misdemeanor
     * 
     */
    M,

    /**
     * Petty Misdemeanor
     * 
     */
    P;

    public String value() {
        return name();
    }

    public static OffenseLevelCodeType fromValue(String v) {
        return valueOf(v);
    }

}
