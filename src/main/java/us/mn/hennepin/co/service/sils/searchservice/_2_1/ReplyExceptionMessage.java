
package us.mn.hennepin.co.service.sils.searchservice._2_1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2012-07-31T20:55:17.737-05:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "ReplyServiceException", targetNamespace = "http://www.co.hennepin.mn.us/Justice/SILSServiceMessage")
public class ReplyExceptionMessage extends Exception {
    
    private us.mn.hennepin.co.justice.silsservicemessage.ReplyServiceException replyServiceException;

    public ReplyExceptionMessage() {
        super();
    }
    
    public ReplyExceptionMessage(String message) {
        super(message);
    }
    
    public ReplyExceptionMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ReplyExceptionMessage(String message, us.mn.hennepin.co.justice.silsservicemessage.ReplyServiceException replyServiceException) {
        super(message);
        this.replyServiceException = replyServiceException;
    }

    public ReplyExceptionMessage(String message, us.mn.hennepin.co.justice.silsservicemessage.ReplyServiceException replyServiceException, Throwable cause) {
        super(message, cause);
        this.replyServiceException = replyServiceException;
    }

    public us.mn.hennepin.co.justice.silsservicemessage.ReplyServiceException getFaultInfo() {
        return this.replyServiceException;
    }
}
