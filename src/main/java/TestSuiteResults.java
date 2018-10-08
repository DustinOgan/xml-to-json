import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement(name="testSuiteResults")
@XmlAccessorType(XmlAccessType.FIELD)

public class TestSuiteResults {

    @XmlElement
    String message;

    @XmlElement
    String name;

    @XmlElement
    String order;
    
    @XmlElement
    String started;
    
    @XmlElement
    String status;
    
    @XmlElement
    String timeTaken;

    @XmlElement
    ArrayList<TestCase> testCase;
}