import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class FirstApp {

   @RequestMapping("/")
   String home() {
	return "Spring boot first app welcomes you...!";
   }

  public static void main(String args[]) throws Exception {
	SpringApplication.run(FirstApp.class, args);
  }
}
