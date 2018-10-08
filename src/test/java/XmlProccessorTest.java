import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;
import org.junit.Test;
import static org.junit.Assert.*;

public class XmlProccessorTest {
    
    @Test public void testProccessMethod2() throws FileNotFoundException, JAXBException {
        Result result = Result.builder().message("fart").name("p").order("q").started("x").status("i").timeTaken("zS").build();
        ArrayList<Result> results = new ArrayList<Result>();
        results.add(result);
        TestStepResults tsResults = TestStepResults.builder().result(results).build();
        XmlProccessor.processTestResultsClassToXml(tsResults);
    }
    
    @Test public void testProccessXMLtoClass() throws JAXBException {
        TestStepResults fileResult =  XmlProccessor.proccessXmlToClass("TestStepResult.xml");
        Result firstResult = fileResult.result.get(0);
        assertTrue(firstResult.name.equals("p"));

    }

}