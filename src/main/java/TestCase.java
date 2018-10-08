import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class TestCase{

    String reason;
    String startTime;
    Boolean status;
    String testCaseId;
    String testCaseName;
    String timetaken;
}
