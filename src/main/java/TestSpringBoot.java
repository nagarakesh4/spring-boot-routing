import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class TestSpringBoot {

    String baseText = "This project showcases how easily to get started with Spring-Boot project and using its powerful features for developing any spring application.";
    
    
    @RequestMapping("/")
    String greet() {
        return baseText+"Hello World! - This is the base URL";
    }

	@RequestMapping("/query/{id}")
    String venkata(@PathVariable("id") final String id) {
        
        return baseText+"\nThis output uses PathVariable in Spring to showcase how to show the input parameter given by the user. You have entered "+id;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestSpringBoot.class, args);
    }

}