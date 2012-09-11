
package us.mn.hennepin.co.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndicatorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndicatorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndicatorCodeType")
@XmlEnum
public enum IndicatorCodeType {

    Y,
    N;

    public String value() {
        return name();
    }

    public static IndicatorCodeType fromValue(String v) {
        return valueOf(v);
    }

}
