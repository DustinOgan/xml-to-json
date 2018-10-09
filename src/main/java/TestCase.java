import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class TestCase{

    @XmlElement
    @JsonProperty
    String reason;

    @XmlElement
    @JsonProperty
    String startTime;
    
    @XmlElement
    @JsonProperty
    String status;

    @XmlElement
    @JsonProperty
    String testCaseId;
    
    @XmlElement
    @JsonProperty
    String testCaseName;

    @XmlElement
    @JsonProperty
    String timetaken;
    
    @XmlElement
    @JsonProperty
    ArrayList<TestStepResults> testStepResults;

    @XmlElement
    @JsonProperty
    ArrayList<TestStepParameters> testStepParameters;

    @XmlElement
    @JsonProperty
    ArrayList<FailedTestSteps> failedTestSteps;
}
