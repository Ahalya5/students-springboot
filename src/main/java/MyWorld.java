import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWorld {
    @GetMapping ("/MyWorld")
    public String MyWorld(){
        return "wlecome myworld in my life";
    }
}
