package test.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import data.service.SqlSessionFactoryService;
import test.vo.BoardVo;

public class BoardDao {
	private SqlSessionFactory sFactory;
	private final String NAMESPACE="mybatis.BoardMapper";
	
	private static BoardDao instance=new BoardDao();
	public static BoardDao getInstance() {
		return instance;
	}
	private BoardDao() {
		sFactory=SqlSessionFactoryService.getSqlSessionFactory();
	}
	
	public int insert(BoardVo vo) {
		SqlSession sqlSession=null;
		try {
			sqlSession=sFactory.openSession();
			int n=sqlSession.insert(NAMESPACE + ".insert",vo);
			sqlSession.commit();
			return n;
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	public List<BoardVo> selectList(HashMap<String, String> map){
		SqlSession sqlSession=null;
		try {
			sqlSession=sFactory.openSession();
//			List<BoardVo> list= sqlSession.selectList(NAMESPACE +".selectList");
//			return list;
			return sqlSession.selectList(NAMESPACE +".selectList", map);
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	public BoardVo selectOne(int num) {
		SqlSession sqlSession=null;
		try {
			sqlSession= sFactory.openSession();
			return sqlSession.selectOne(NAMESPACE +".selectOne",num);
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	public int update(BoardVo vo) {
		SqlSession sqlSession=null;
		try {
			sqlSession=sFactory.openSession();
			int n=sqlSession.insert(NAMESPACE + ".update",vo);
			sqlSession.commit();
			return n;
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	
	public List<BoardVo> searchList(HashMap<String, String> map) {
		SqlSession sqlSession = null;
		try {
			sqlSession = sFactory.openSession();
			return sqlSession.selectList(NAMESPACE + ".searchList", map);
		} finally {
			if(sqlSession != null) sqlSession.close();
		}
	}
}
















