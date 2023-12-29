package kr.co.fmos.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cart")
public class CartCont {

	public CartCont() {
		System.out.println("-----CartCont()객체 생성됨");
	}//end
	
	@Autowired
	private CartDAO cartDao;
	
	@PostMapping("/insert.do")
	public String cartInsert(@ModelAttribute CartDTO cartDto, HttpSession session) {
		cartDao.cartInsert(cartDto);
		return "redirect:/cart/list";
	}//cartInsert() end
	
	
	@RequestMapping("/list.do")
	public ModelAndView list() {
		/* String 회원아이디 = ""; */
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("cart/list");
		mav.addObject("list", cartDao.cartList());
		return mav;
		}//list() end
	
}//class end