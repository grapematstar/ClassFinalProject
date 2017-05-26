package gyum_02.member.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gyum_02.member.model.StudentMemberDAO;

@Controller
public class my_loginController {

	@Autowired
	private StudentMemberDAO studentDao;
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public ModelAndView login(@CookieValue(value="cid",defaultValue="noId")String cid){
		ModelAndView mav = new ModelAndView();
		if(!cid.equals("noID")){
			mav.addObject("cid", cid);
		}
		mav.setViewName("/login");
		return mav;
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public ModelAndView loginSubmit(
			@RequestParam(value="id")String userid,
			@RequestParam(value="pwd")String userpwd,
			HttpServletRequest req,
			HttpServletResponse resp){
		ModelAndView mav = new ModelAndView();
		
		int result = studentDao.studentLogin(userid, userpwd);
		
		HttpSession session = req.getSession();
		
		if(result>0){
			session.setAttribute("sid", userid);
			session.setAttribute("spwd", userpwd);
			mav.addObject("msg","·Î±×ÀÎ µÊ");
			mav.addObject("location", "index.jsp");
		}else{
			mav.addObject("msg", "·Î±×ÀÎ ¾ÈµÊ");
			mav.addObject("location","");
		}
		
		mav.setViewName("msg");
		return mav;
	}
}
