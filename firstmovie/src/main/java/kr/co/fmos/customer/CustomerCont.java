package kr.co.fmos.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class CustomerCont {

	public CustomerCont() {
		System.out.println("-----ProductCont()객체생성됨");
	}//end
	
	@Autowired
	private CustomerDAO customerDao;
	
	@RequestMapping("/FAQ.do")
	public ModelAndView faqlist(String notice_kind) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("customer/FAQ");
		return mav;
	}
		
	@RequestMapping("/notice.do")
	public ModelAndView noticelist() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("customer/notice");
		return mav;
	}
			
	@RequestMapping("/one_inquiry.do")
	public ModelAndView one_inquirylist() {
	ModelAndView mav = new ModelAndView();
	mav.setViewName("customer/one_inquiry");
	return mav;
	}
				
	@RequestMapping("/lost_inquiry.do")
	public ModelAndView lost_inquirylist() {
	ModelAndView mav = new ModelAndView();
	mav.setViewName("customer/lost_inquiry");
	return mav;
	}	
	@RequestMapping("/rental_inquiry.do")
	public ModelAndView list() {
	ModelAndView mav = new ModelAndView();
	mav.setViewName("customer/rental_inquiry");
	return mav;
	
	}
	
	@GetMapping("/noticeForm.do")
	public String noticeForm(String notice_kind) {
		return "customer/noticeForm";
	}
}//class end