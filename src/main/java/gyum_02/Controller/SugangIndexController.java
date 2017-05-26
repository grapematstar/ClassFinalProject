package gyum_02.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SugangIndexController {

	@RequestMapping("/sg_index.do")
	public ModelAndView sgIndex(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sugang/sg_index");
		return mav;
	}
	
	@RequestMapping("/sg_favorCart.do")
	public ModelAndView sgfavorCart(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sugang/sg_favorCart");
		return mav;
	}
}
