
package us.mn.hennepin.co.common;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.mn.hennepin.co.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ThreadName_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ThreadName");
    private final static QName _OrganizationName_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "OrganizationName");
    private final static QName _MessageSender_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "MessageSender");
    private final static QName _CodeText_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "CodeText");
    private final static QName _CodeDescription_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "CodeDescription");
    private final static QName _ContactEmailID_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ContactEmailID");
    private final static QName _EventDateTime_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "EventDateTime");
    private final static QName _RequestReply_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "RequestReply");
    private final static QName _MessageTypeText_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "MessageTypeText");
    private final static QName _LogLevelText_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "LogLevelText");
    private final static QName _LogEvent_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "LogEvent");
    private final static QName _ApplicationMessageID_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ApplicationMessageID");
    private final static QName _AuditInfo_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "AuditInfo");
    private final static QName _ID_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ID");
    private final static QName _MessageSentDateTime_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "MessageSentDateTime");
    private final static QName _ActionTypeText_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ActionTypeText");
    private final static QName _EventTimeMilliseconds_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "EventTimeMilliseconds");
    private final static QName _ContactName_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ContactName");
    private final static QName _ContactPhoneNumber_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ContactPhoneNumber");
    private final static QName _UserRoleText_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "UserRoleText");
    private final static QName _LogMessage_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "LogMessage");
    private final static QName _UserID_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "UserID");
    private final static QName _CorrelationID_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "CorrelationID");
    private final static QName _ReplyToQueueManagerName_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ReplyToQueueManagerName");
    private final static QName _ParentApplicationName_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ParentApplicationName");
    private final static QName _ApplicationName_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ApplicationName");
    private final static QName _TraceRequestIndicator_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "TraceRequestIndicator");
    private final static QName _ReplyToQueueName_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "ReplyToQueueName");
    private final static QName _EnvironmentCode_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "EnvironmentCode");
    private final static QName _MessageHeader_QNAME = new QName("http://www.co.hennepin.mn.us/Common", "MessageHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.mn.hennepin.co.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogMessageType }
     * 
     */
    public LogMessageType createLogMessageType() {
        return new LogMessageType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link MessageHeaderType }
     * 
     */
    public MessageHeaderType createMessageHeaderType() {
        return new MessageHeaderType();
    }

    /**
     * Create an instance of {@link TraceLogType }
     * 
     */
    public TraceLogType createTraceLogType() {
        return new TraceLogType();
    }

    /**
     * Create an instance of {@link AuditInfoType }
     * 
     */
    public AuditInfoType createAuditInfoType() {
        return new AuditInfoType();
    }

    /**
     * Create an instance of {@link MessageReplyType }
     * 
     */
    public MessageReplyType createMessageReplyType() {
        return new MessageReplyType();
    }

    /**
     * Create an instance of {@link LogEventType }
     * 
     */
    public LogEventType createLogEventType() {
        return new LogEventType();
    }

    /**
     * Create an instance of {@link RequestReplyType }
     * 
     */
    public RequestReplyType createRequestReplyType() {
        return new RequestReplyType();
    }

    /**
     * Create an instance of {@link TraceLog }
     * 
     */
    public TraceLog createTraceLog() {
        return new TraceLog();
    }

    /**
     * Create an instance of {@link MessagePartyType }
     * 
     */
    public MessagePartyType createMessagePartyType() {
        return new MessagePartyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ThreadName")
    public JAXBElement<String> createThreadName(String value) {
        return new JAXBElement<String>(_ThreadName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "OrganizationName")
    public JAXBElement<String> createOrganizationName(String value) {
        return new JAXBElement<String>(_OrganizationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessagePartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "MessageSender")
    public JAXBElement<MessagePartyType> createMessageSender(MessagePartyType value) {
        return new JAXBElement<MessagePartyType>(_MessageSender_QNAME, MessagePartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "CodeText")
    public JAXBElement<String> createCodeText(String value) {
        return new JAXBElement<String>(_CodeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "CodeDescription")
    public JAXBElement<String> createCodeDescription(String value) {
        return new JAXBElement<String>(_CodeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ContactEmailID")
    public JAXBElement<String> createContactEmailID(String value) {
        return new JAXBElement<String>(_ContactEmailID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "EventDateTime")
    public JAXBElement<XMLGregorianCalendar> createEventDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestReplyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "RequestReply")
    public JAXBElement<RequestReplyType> createRequestReply(RequestReplyType value) {
        return new JAXBElement<RequestReplyType>(_RequestReply_QNAME, RequestReplyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "MessageTypeText")
    public JAXBElement<String> createMessageTypeText(String value) {
        return new JAXBElement<String>(_MessageTypeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "LogLevelText")
    public JAXBElement<String> createLogLevelText(String value) {
        return new JAXBElement<String>(_LogLevelText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "LogEvent")
    public JAXBElement<LogEventType> createLogEvent(LogEventType value) {
        return new JAXBElement<LogEventType>(_LogEvent_QNAME, LogEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ApplicationMessageID")
    public JAXBElement<String> createApplicationMessageID(String value) {
        return new JAXBElement<String>(_ApplicationMessageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "AuditInfo")
    public JAXBElement<AuditInfoType> createAuditInfo(AuditInfoType value) {
        return new JAXBElement<AuditInfoType>(_AuditInfo_QNAME, AuditInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ID")
    public JAXBElement<BigInteger> createID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "MessageSentDateTime")
    public JAXBElement<XMLGregorianCalendar> createMessageSentDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MessageSentDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ActionTypeText")
    public JAXBElement<String> createActionTypeText(String value) {
        return new JAXBElement<String>(_ActionTypeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "EventTimeMilliseconds")
    public JAXBElement<BigDecimal> createEventTimeMilliseconds(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EventTimeMilliseconds_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ContactName")
    public JAXBElement<String> createContactName(String value) {
        return new JAXBElement<String>(_ContactName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ContactPhoneNumber")
    public JAXBElement<String> createContactPhoneNumber(String value) {
        return new JAXBElement<String>(_ContactPhoneNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "UserRoleText")
    public JAXBElement<String> createUserRoleText(String value) {
        return new JAXBElement<String>(_UserRoleText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "LogMessage")
    public JAXBElement<LogMessageType> createLogMessage(LogMessageType value) {
        return new JAXBElement<LogMessageType>(_LogMessage_QNAME, LogMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "UserID")
    public JAXBElement<String> createUserID(String value) {
        return new JAXBElement<String>(_UserID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "CorrelationID")
    public JAXBElement<String> createCorrelationID(String value) {
        return new JAXBElement<String>(_CorrelationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ReplyToQueueManagerName")
    public JAXBElement<String> createReplyToQueueManagerName(String value) {
        return new JAXBElement<String>(_ReplyToQueueManagerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ParentApplicationName")
    public JAXBElement<String> createParentApplicationName(String value) {
        return new JAXBElement<String>(_ParentApplicationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ApplicationName")
    public JAXBElement<String> createApplicationName(String value) {
        return new JAXBElement<String>(_ApplicationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "TraceRequestIndicator")
    public JAXBElement<Boolean> createTraceRequestIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_TraceRequestIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "ReplyToQueueName")
    public JAXBElement<String> createReplyToQueueName(String value) {
        return new JAXBElement<String>(_ReplyToQueueName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "EnvironmentCode")
    public JAXBElement<String> createEnvironmentCode(String value) {
        return new JAXBElement<String>(_EnvironmentCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.co.hennepin.mn.us/Common", name = "MessageHeader")
    public JAXBElement<MessageHeaderType> createMessageHeader(MessageHeaderType value) {
        return new JAXBElement<MessageHeaderType>(_MessageHeader_QNAME, MessageHeaderType.class, null, value);
    }

}
