package kr.co.fmos.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderCont {
	public OrderCont() {
		System.out.println("-----OrderCont()객체 생성됨");
	}//OrderCont() end
	
	@Autowired
	OrderDAO orderDao;
	
	@GetMapping("/confirm.do")
	public String confirm() {
		return "order/confirm";
	}//confirm() end
	
	@GetMapping("/msgView.do")
	public String msgView() {
		return "order/msgView";
	}//confirm() end
}//class end