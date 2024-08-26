package test.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import data.service.SqlSessionFactoryService;
import test.vo.MovieCommentsVo;

public class MovieDao {
	private SqlSessionFactory factory = null;
	private final String NAMESPACE="mybatis.MovieMapper";
	
	private static MovieDao instance = new MovieDao();
	private MovieDao() {
		factory = SqlSessionFactoryService.getSqlSessionFactory();
	}
	public static MovieDao getInstance() {
		return instance;
	}
	
	public List<HashMap<String, Object>> commList1() {
		SqlSession sqlSession = null;
		try {
			sqlSession = factory.openSession();
			List<HashMap<String, Object>> list = sqlSession.selectList(NAMESPACE + ".commList1");
			return list;
		} finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	
	public List<MovieCommentsVo> commList2() {
		SqlSession sqlSession = null;
		try {
			sqlSession=factory.openSession();
			List<MovieCommentsVo> list = sqlSession.selectList(NAMESPACE + ".commList2");
			return list;
		} finally {
			if (sqlSession != null) sqlSession.close();
		}
	}
	
	

}
