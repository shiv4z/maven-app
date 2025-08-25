package in.tech.shiv.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Optional base path
public class WelcomeRestController {

    @GetMapping("/") // Maps to /api/
    public String welcome() {
        return "Welcome To Spring Boot with Jenkins";
    }

    @GetMapping("/greet") // Maps to /api/greet
    public String greet() {
        return "Good Morning! Best of luck";
    }
}
