import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class TestSuiteResults {
    String message;
    String name;
    String order;
    String started;
    String status;
    String timeTaken;
}