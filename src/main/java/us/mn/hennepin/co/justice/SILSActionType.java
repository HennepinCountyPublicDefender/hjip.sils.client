
package us.mn.hennepin.co.justice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SILSActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SILSActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AddSubjectEntityRecords"/>
 *     &lt;enumeration value="AddSubjectEntity"/>
 *     &lt;enumeration value="UpdateSubjectType"/>
 *     &lt;enumeration value="UpdateSubjectPrimary"/>
 *     &lt;enumeration value="UpdateTrackingOffense"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SILSActionType")
@XmlEnum
public enum SILSActionType {

    @XmlEnumValue("AddSubjectEntityRecords")
    ADD_SUBJECT_ENTITY_RECORDS("AddSubjectEntityRecords"),
    @XmlEnumValue("AddSubjectEntity")
    ADD_SUBJECT_ENTITY("AddSubjectEntity"),
    @XmlEnumValue("UpdateSubjectType")
    UPDATE_SUBJECT_TYPE("UpdateSubjectType"),
    @XmlEnumValue("UpdateSubjectPrimary")
    UPDATE_SUBJECT_PRIMARY("UpdateSubjectPrimary"),
    @XmlEnumValue("UpdateTrackingOffense")
    UPDATE_TRACKING_OFFENSE("UpdateTrackingOffense");
    private final String value;

    SILSActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SILSActionType fromValue(String v) {
        for (SILSActionType c: SILSActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
