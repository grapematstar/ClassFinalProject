package gyum_02.sugang.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gyum_02.sugang.model.SugangDAO;
import gyum_02.sugang.model.SugangDTO;

@Controller
public class SugangController {

	@Autowired
	private SugangDAO sugangDao;
	
	@RequestMapping("/sg_index.do")
	public ModelAndView sugangList(){
		List<SugangDTO> list = sugangDao.sugangList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("sugang/sg_index");
		return mav;
	}
	
}
