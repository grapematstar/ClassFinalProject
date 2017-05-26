package gyum_02.cybercampus.online.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CC_OnlineController {
	
	@RequestMapping(value="/cc_gotoOnlineMain.do",method=RequestMethod.GET)
	public ModelAndView cc_gotoOnlineQuizMain(){
		ModelAndView mav=new ModelAndView("/cybercampus/cc_03.onlineQuiz/cc_onlineQuiz_main");
		return mav;
	}
	@RequestMapping(value="/cc_gotoOnlineQuizWrite.do",method=RequestMethod.GET)
	public ModelAndView cc_gotoOnlineQuizWrite(){
		ModelAndView mav=new ModelAndView("/cybercampus/cc_03.onlineQuiz/cc_onlineQuizQuestion_write");
		return mav;
	}
	public ModelAndView cc_gotoOnlineQuizUpdate(){
		ModelAndView mav=new ModelAndView("/cybercampus/cc_0f3.onlineQuiz/cc_onlineQuizQuestion_update");
		return mav;
	}
}
