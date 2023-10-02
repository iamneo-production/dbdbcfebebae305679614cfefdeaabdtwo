
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
    @Value("${test.property}")
    private String javaHome;

    @GetMapping("/")
    public String test(){

        return javaHome;

    }
}