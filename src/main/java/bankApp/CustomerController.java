package bankApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CustomerController {

	@RequestMapping("/bank")
	public @ResponseBody String welcome(){
		return "Welcome to the Bank";
	}
}
