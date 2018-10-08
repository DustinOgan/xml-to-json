import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name ="testCase")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestCase{

    @XmlElement
    String reason;

    @XmlElement
    String startTime;
    
    @XmlElement
    String status;

    @XmlElement
    String testCaseId;
    
    @XmlElement
    String testCaseName;

    @XmlElement
    String timetaken;
    
    @XmlElement
    ArrayList<TestStepResults> testStepResults;
}
