import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;
import org.junit.Test;
import static org.junit.Assert.*;

public class XmlProccessorTest {

    @Test
    public void testClassToXml() throws FileNotFoundException, JAXBException {
        TestSuiteResults testSuiteResults = buildFakeData();
        // TestSuiteResults testSuiteResults = buildTestSuiteResults();
        XmlProccessor.proccessClassToXml(testSuiteResults);
    }

    @Test
    public void testXmlToClass() throws JAXBException {
        TestSuiteResults fileResult = XmlProccessor.proccessXmlToClass("TestSuiteResultSample.xml");
        ArrayList<TestCase> testCaseArray = fileResult.getTestCase();
        TestCase singleTestCase = testCaseArray.get(0);
        ArrayList<TestStepResults> testStepResultsList = singleTestCase.getTestStepResults();
        TestStepResults testStepResult = testStepResultsList.get(0);
        Result singleResult = testStepResult.getResult().get(0);
        assertTrue(singleResult.status.equals("FAIL"));

    }

    private TestSuiteResults buildFakeData(){
        return
        buildTestSuiteResults(buildTestCase(buildTestStepResults(buildResult())));
        
        
    }
    private ArrayList<Result> buildResult(){
        Result result = Result.builder().message("message").name("name").order("order").started("started")
        .status("status").timeTaken("timeTaken").build();
        ArrayList<Result> results = new ArrayList<Result>();
        results.add(result);
        return results; 
    }

    private ArrayList<TestStepResults> buildTestStepResults(ArrayList<Result> result){
        TestStepResults testStepResult = TestStepResults.builder().result(result).build();
        ArrayList<TestStepResults> testStepResultArray = new ArrayList<TestStepResults>();
        testStepResultArray.add(testStepResult);
        return testStepResultArray;
    }

    private ArrayList<TestCase> buildTestCase(ArrayList<TestStepResults> testStepResults){
        TestCase tcase = TestCase.builder().reason("reason").startTime("startTime").status("status")
                .testCaseId("testCaseId").testCaseName("testCaseName").testStepResults(testStepResults).build();
        ArrayList<TestCase> testCaseArray = new ArrayList<TestCase>();
        testCaseArray.add(tcase);
        return testCaseArray;
    }
    private TestSuiteResults buildTestSuiteResults(ArrayList<TestCase> testCases) {
        TestSuiteResults testSuiteResults = TestSuiteResults.builder().testCase(testCases).build();
        return testSuiteResults;
    }

}