package us.mn.hennepin.co.service.sils.searchservice._2_1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2012-07-31T20:55:17.797-05:00
 * Generated source version: 2.6.1
 * 
 */
@WebServiceClient(name = "SILSSearchService", 
                  wsdlLocation = "https://hjip.co.hennepin.mn.us/silsws/services/SubjectSearchPort/wsdl/SILSSearchService-v2-1.wsdl",
                  targetNamespace = "http://www.co.hennepin.mn.us/service/sils/SearchService/2.1") 
public class SILSSearchService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.co.hennepin.mn.us/service/sils/SearchService/2.1", "SILSSearchService");
    public final static QName SubjectSearchPort = new QName("http://www.co.hennepin.mn.us/service/sils/SearchService/2.1", "SubjectSearchPort");
    static {
        URL url = null;
        try {
            url = new URL("https://hjip.co.hennepin.mn.us/silsws/services/SubjectSearchPort/wsdl/SILSSearchService-v2-1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SILSSearchService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://hjip.co.hennepin.mn.us/silsws/services/SubjectSearchPort/wsdl/SILSSearchService-v2-1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SILSSearchService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SILSSearchService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SILSSearchService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SubjectSearchPort
     */
    @WebEndpoint(name = "SubjectSearchPort")
    public SubjectSearchPort getSubjectSearchPort() {
        return super.getPort(SubjectSearchPort, SubjectSearchPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SubjectSearchPort
     */
    @WebEndpoint(name = "SubjectSearchPort")
    public SubjectSearchPort getSubjectSearchPort(WebServiceFeature... features) {
        return super.getPort(SubjectSearchPort, SubjectSearchPort.class, features);
    }

}
