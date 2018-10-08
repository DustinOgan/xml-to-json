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