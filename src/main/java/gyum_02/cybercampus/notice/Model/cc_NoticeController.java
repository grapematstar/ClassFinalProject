package gyum_02.cybercampus.notice.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class cc_NoticeController {

	@RequestMapping(value="/cc_gotoClass.do",method=RequestMethod.GET)
	public ModelAndView cc_goClass(){
		ModelAndView mav=new ModelAndView("/cybercampus/cc_class/cc_01.notice/cc_notice_list");
		return mav;
	}
	
	@RequestMapping(value="/cc_gotoContent.do",method=RequestMethod.GET)
	public ModelAndView cc_goContent(){
		ModelAndView mav=new ModelAndView("/cybercampus/cc_class/cc_01.notice/cc_notice_content");
		return mav;
	}
	
	@RequestMapping(value="/cc_gotoUpdate.do",method=RequestMethod.GET)
	public ModelAndView cc_goUpdate(){
		ModelAndView mav=new ModelAndView("/cybercampus/cc_class/cc_01.notice/cc_notice_update");
		return mav;
	}
	
	@RequestMapping(value="/cc_gotoWrite.do",method=RequestMethod.GET)
	public ModelAndView cc_goWrite(){
		ModelAndView mav=new ModelAndView("/cybercampus/cc_class/cc_01.notice/cc_notice_write");
		return mav;
	}
}
