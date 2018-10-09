import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.junit.Test;

public class JsonWriterTest {
    @Test
    public void testClassToJson() throws JsonGenerationException, JsonMappingException, IOException {
        TestSuiteResults testSuiteResults = buildFakeData();
        JsonWriter.classToJsonMapper(testSuiteResults);
    }

    @Test
    public void testXmlToClassToJson() throws JAXBException, JsonGenerationException, JsonMappingException, IOException {
        TestSuiteResults testSuiteResults = XmlProccessor.proccessXmlToClass("TestSuiteResultSample.xml");
        JsonWriter.classToJsonMapper(testSuiteResults);
    }
        
    private TestSuiteResults buildFakeData() {
        return buildTestSuiteResults(buildTestCase(buildTestStepResults(buildResult())));

    }

    private ArrayList<Result> buildResult() {
        Result result = Result.builder().message("message").name("name").order("order").started("started")
                .status("status").timeTaken("timeTaken").build();
        ArrayList<Result> results = new ArrayList<Result>();
        results.add(result);
        return results;
    }

    private ArrayList<TestStepResults> buildTestStepResults(ArrayList<Result> result) {
        TestStepResults testStepResult = TestStepResults.builder().result(result).build();
        ArrayList<TestStepResults> testStepResultArray = new ArrayList<TestStepResults>();
        testStepResultArray.add(testStepResult);
        return testStepResultArray;
    }

    private ArrayList<TestCase> buildTestCase(ArrayList<TestStepResults> testStepResults) {
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