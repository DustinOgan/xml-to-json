import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@XmlAccessorType(XmlAccessType.FIELD)
public class Result{

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

}


/*
    <?xml version="1.0" encoding="UTF-8"?>
    <result>
        <message>Step 1 [GET : /Entitlements?mediaId={visualId}] FAIL: took 221 ms
        -> [Match content of [statusCode]] Comparison failed. Path: [$['statusCode']]; Expected value: [201]; Actual value: [200].</message>
        <name>GET : /Entitlements?mediaId={visualId}</name>
        <order>2</order>
        <started>21:25:53.117</started>
        <status>FAIL</status>
        <timeTaken>221</timeTaken>
    </result>
*/