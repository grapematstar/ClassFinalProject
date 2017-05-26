package gyum_02.member.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import gyum_02.member.model.StudentMemberDAO;
import gyum_02.member.model.StudentMemberDAOImple;
import gyum_02.member.model.StudentMemberDTO;

@Controller
public class my_memberController {

	@Autowired
	private StudentMemberDAO studentDao;
	
	@RequestMapping(value="/studentmemberJoin.do", method=RequestMethod.GET)
	public ModelAndView studentMemberAddForm(StudentMemberDTO dto){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("memberjoin/studentmemberJoin");
		return mav;
	}
	
	@RequestMapping(value="/studentmemberJoin.do", method=RequestMethod.POST)
	public ModelAndView studentMemberAddSubmit(StudentMemberDTO dto){
		ModelAndView mav = new ModelAndView();
		
		if(dto.getId()==null||dto.getId().equals("")){
			mav.addObject("msg", "ID�� �Է��ϼ���");
			mav.addObject("location", "");
			mav.setViewName("msg");
			return mav;
		}
		
		int result = studentDao.studentAdd(dto);
		
		if(result>0){
			mav.addObject("msg","ȸ�����ԿϷ�");
			mav.addObject("location", "/gyum_02/");
			mav.setViewName("msg");
		}else{
			mav.addObject("msg", "ȸ�����Խ���");
			mav.addObject("location", "");
			mav.setViewName("msg");
		}
		return mav;
	}
	
}
