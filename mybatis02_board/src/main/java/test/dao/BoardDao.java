package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import data.service.SqlSessionFactoryService;
import test.vo.BoardVo;

public class BoardDao {
	private SqlSessionFactory sFactory;
	private final String NAMESPACE = "mybatis.BoardMapper";
	
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance() {
		return instance;
	}
	
	private BoardDao() {
		sFactory = SqlSessionFactoryService.getSqlSessionFactory();
	}
	
	public int insert(BoardVo vo) {
		SqlSession sqlSession = null;
		
		try {
			sqlSession = sFactory.openSession();
			int n = sqlSession.insert(NAMESPACE + ".insert", vo);
			sqlSession.commit();
			return n;
		} finally {
			if(sqlSession!=null) sqlSession.close();

		}
		
	}
	
	public List<BoardVo> selectList() {
		SqlSession sqlSession = null;
		try {
			sqlSession = sFactory.openSession();
//			List<BoardVo> list = sqlSession.selectList(NAMESPACE + ".selectList");
//			return list;
			return sqlSession.selectList(NAMESPACE + ".selectList");
		} finally {
			if (sqlSession != null) sqlSession.close();
		}
	}
	
	public int delete(int num) {
		SqlSession sqlSession = null;
		
		try {
			sqlSession = sFactory.openSession();
			int n = sqlSession.delete(NAMESPACE + ".delete", num);
			sqlSession.commit();
			return n;
		} finally {
			if (sqlSession != null) sqlSession.close();
		}
	}

}
