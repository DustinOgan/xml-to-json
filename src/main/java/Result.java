import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    @JsonProperty
    String message;
    
    @XmlElement
    @JsonProperty
    String name;

    @XmlElement
    @JsonProperty
    String order;

    @XmlElement
    @JsonProperty
    String started;
    
    @XmlElement
    @JsonProperty
    String status;
    
    @XmlElement
    @JsonProperty
    String timeTaken;

}