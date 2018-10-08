import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;
import org.junit.Test;
import static org.junit.Assert.*;

public class XmlProccessorTest {

    @Test
    public void testClassToXml() throws FileNotFoundException, JAXBException {
        Result result = Result.builder().message("message").name("name").order("order").started("started").status("status").timeTaken("timeTaken")
                .build();
        ArrayList<Result> results = new ArrayList<Result>();
        results.add(result);
        TestStepResults testStepResult = TestStepResults.builder().result(results).build();
        ArrayList<TestStepResults> testStepResultArray = new ArrayList<TestStepResults>();
        testStepResultArray.add(testStepResult);
        TestCase tcase = TestCase.builder().reason("reason").startTime("startTime").status("status")
                .testCaseId("testCaseId").testCaseName("testCaseName").testStepResults(testStepResultArray).build();
        XmlProccessor.processTestCaseClassToXml(tcase);
    }

    @Test
    public void testXmlToClass() throws JAXBException {
        TestCase fileResult = XmlProccessor.proccessXmlToTestCaseClass("TestCase.xml");
        ArrayList<TestStepResults> testStepResultsList = fileResult.getTestStepResults();
        TestStepResults testStepResult = testStepResultsList.get(0);
        Result singleResult = testStepResult.getResult().get(0);
        assertTrue(singleResult.name.equals("p"));

    }

}