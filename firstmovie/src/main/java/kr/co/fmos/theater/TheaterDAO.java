package kr.co.fmos.theater;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
@Controller
public class TheaterDAO {

	// sql연결	
	@Autowired
	SqlSession sqlSession;
	
	private JdbcTemplate jt;
	
	private StringBuilder sql = null;
	
	public TheaterDAO() {
		System.out.println("-----TheaterDAO() end");
	}//TheaterDAO() end
	
	
	public TheaterregionDTO regionlist(String region_id) {
		return sqlSession.selectOne("theater.regionlist", region_id);
	}
}//class end