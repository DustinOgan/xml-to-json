import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlProccessor {
     public static void proccessClassToXml(TestSuiteResults result)throws JAXBException, FileNotFoundException{    
        
        JAXBContext contextObj = JAXBContext.newInstance(TestSuiteResults.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshallerObj.setProperty("jaxb.encoding", "UTF-8");
        marshallerObj.marshal(result, new FileOutputStream("TestSuiteResults.xml"));        
    }

    public static TestSuiteResults proccessXmlToClass(String filePath) throws JAXBException {
        File xmlFile = new File(filePath);
        JAXBContext jaxbContext = JAXBContext.newInstance(TestSuiteResults.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        TestSuiteResults result = (TestSuiteResults) unmarshaller.unmarshal(xmlFile);
        return result;
    }
}