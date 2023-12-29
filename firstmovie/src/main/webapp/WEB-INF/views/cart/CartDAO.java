package kr.co.fmos.cart;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Repository
public class CartDAO {
	public CartDAO() {
		System.out.println("-----CartDAO()객체 생성됨");
	}//end
	
	@Autowired
	SqlSession sqlSession;
	
	public int cartInsert(CartDTO dto) {
		return sqlSession.insert("cart.insert", dto);
	}//cartInsert() end
	
	
	public List<CartDTO> cartList() {
		return sqlSession.selectList("cart.list");
	}//list() end
	
	
	
}//class end