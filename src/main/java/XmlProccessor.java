import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlProccessor {

    public static void processClassToXml(Result result)throws JAXBException, FileNotFoundException{    
            JAXBContext contextObj = JAXBContext.newInstance(Result.class);
            Marshaller marshallerObj = contextObj.createMarshaller();
            marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallerObj.marshal(result, new FileOutputStream("Result.xml"));        
    }


    public static void processTestResultsClassToXml(TestStepResults result)throws JAXBException, FileNotFoundException{    
        JAXBContext contextObj = JAXBContext.newInstance(TestStepResults.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshallerObj.marshal(result, new FileOutputStream("TestStepResult.xml"));        
    }

    public static void processTestCaseClassToXml(TestCase result)throws JAXBException, FileNotFoundException{    
        JAXBContext contextObj = JAXBContext.newInstance(TestCase.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshallerObj.marshal(result, new FileOutputStream("TestCase.xml"));        
    }

    public static TestCase proccessXmlToTestCaseClass(String filePath) throws JAXBException {
        File xmlFile = new File(filePath);
        JAXBContext jaxbContext = JAXBContext.newInstance(TestCase.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        TestCase result = (TestCase) unmarshaller.unmarshal(xmlFile);
        return result;
    }

    public static void processTestSuiteResultsClassToXml(TestSuiteResults result)throws JAXBException, FileNotFoundException{    
        JAXBContext contextObj = JAXBContext.newInstance(TestSuiteResults.class);
        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
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