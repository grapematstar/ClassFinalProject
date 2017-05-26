package gyum_02.cybercampus.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class cc_indexController {
	
	@RequestMapping(value="/cc_index.do",method=RequestMethod.GET)
	public String cc_index(){
		return "/cybercampus/cc_index";
	}
	
}
