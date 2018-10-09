import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Builder;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@XmlRootElement(name="testSuiteResults")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName(value ="testSuiteResults")
public class TestSuiteResults {

    @XmlElement
    @JsonProperty
    ArrayList<TestCase> testCase;
}