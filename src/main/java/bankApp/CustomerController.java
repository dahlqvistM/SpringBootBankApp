package bankApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

	 private static final String template = "Hello, %s!";
	
	@RequestMapping("/bank")
	public String welcome(){
		System.out.println("Accesed Welcome Test");
		return "Welcome to the Bank";
	}
	
	@RequestMapping("/getcustomer")
	public Customer customer(@RequestParam(value="username", defaultValue="World") String username) {
        return new Customer(null, null, String.format(template, username), username, username, username);
    }
}
