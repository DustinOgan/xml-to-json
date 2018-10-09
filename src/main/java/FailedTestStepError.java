import javax.xml.bind.annotation.XmlElement;
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
    String detail;
    
    @XmlElement
    String icon;
    
    @XmlElement
    String testCaseName;
    
    @XmlElement
    String testSuiteName;
}