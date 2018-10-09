import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
public class FailedTestStepError
{
    @XmlElement
    @JsonProperty
    String detail;
    
    @XmlElement
    @JsonProperty
    String icon;
    
    @XmlElement
    @JsonProperty
    String testCaseName;
    
    @XmlElement
    @JsonProperty
    String testSuiteName;
}