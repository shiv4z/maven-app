package in.tech.shiv.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping
	public String welcome() {
		return "Welcome To Spring boot with Jenkins";
		
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Good Morning !, Best of luck";
	}
}
