package kr.co.fmos.order;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {
	public OrderDAO() {
		System.out.println("-----OrderDAO()객체 생성됨");
	}//OrderDAO() end
	
	@Autowired
	SqlSession sqlSession;
	
	
}//class end