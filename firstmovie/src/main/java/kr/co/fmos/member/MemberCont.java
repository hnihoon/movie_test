package kr.co.fmos.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberCont {

	public MemberCont() {
		System.out.println("-----MemberCont()객체생성됨");
	}//end
	
	@Autowired
	private MemberDAO memberDao;
	
	@GetMapping("/login.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/login");
		return mav;
	}//list() end
	
	@GetMapping("/member.do")
	public String member(HttpSession session) {
		return "/member/member";
	}
	
	@PostMapping("/insert")
	public String memberInsert(MemberDTO dto) {
	    memberDao.memberInsert(dto);

	    return "redirect:/main";
	}
	
	@PostMapping("idcheckproc.do")
	@ResponseBody
	public String idCheckForm(HttpServletRequest req) {
		String member_id = req.getParameter("memid").trim();
		System.out.println(req.getParameter("memid").trim());
		String result = memberDao.idcheck(member_id);
		return result;
	}
	
	@PostMapping("emailcheck.do")
	@ResponseBody
	public String emailCheckForm(HttpServletRequest req) {
		String member_email = req.getParameter("mememail").trim();
		String result = memberDao.emailcheck(member_email);
		return result;
	}
	
	 @PostMapping("/login.do") 
	 public ModelAndView login(HttpServletResponse response ,MemberDTO dto , HttpSession session, @RequestParam(name = "idcheckbox", defaultValue = "2")String idcheckbox, HttpServletRequest request) { 
		 ModelAndView mav = new ModelAndView();
		 int check = memberDao.membercheck(dto);
		 
		 if(check == 1) { 
			 if(idcheckbox.equals("1")) { 
				 Cookie idcookie = new Cookie("c_id",dto.getMember_id()); 
				 Cookie chcookie = new Cookie("idcheck", idcheckbox);
				 idcookie.setMaxAge(Integer.MAX_VALUE);
				 chcookie.setMaxAge(Integer.MAX_VALUE);
				 response.addCookie(idcookie); 
				 response.addCookie(chcookie); 
			 }else { 
			     Cookie idcookie = new Cookie("c_id", ""); 
				 Cookie chcookie = new Cookie("idcheck", "");
				 idcookie.setMaxAge(0);
				 chcookie.setMaxAge(0);
				 response.addCookie(idcookie); 
				 response.addCookie(chcookie); 				 
			 }
			 
			 mav.addObject("msg1", "<script>alert('환영합니다')</script>");
			 session.setAttribute("s_id", dto.getMember_id());
			 session.setAttribute("s_pw", dto.getMember_pw()); 
		 } else {
			 mav.addObject("msg1", "<script>alert('아이디 혹은 비밀번호가 틀렸습니다.')</script>");
			 //session.setAttribute("s_id", "guest"); 
			 //session.setAttribute("s_pw", "guest");
		 }
		 mav.setViewName("msgView"); 
		 return mav; 
	 }
	 	
	@GetMapping("/logout.do")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg1", "<script>alert('로그아웃 되셨습니다.')</script>");
		session.removeAttribute("s_id");
		session.removeAttribute("s_pw");
		mav.setViewName("msgView");
		return mav;
	}
	
	
}//class end