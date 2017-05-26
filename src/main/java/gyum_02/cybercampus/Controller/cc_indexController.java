package gyum_02.cybercampus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cc_indexController {
	
	@RequestMapping("/cc_index.do")
	public String cc_index(){
		return "/cybercampus/cc_index";
	}
}
