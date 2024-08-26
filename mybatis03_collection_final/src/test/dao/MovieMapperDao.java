package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import data.service.SqlSessionFactoryService;
import test.vo.MovieVo;

public class MovieMapperDao {
	private SqlSessionFactory factory=null;
	
	public MovieMapperDao() {
		factory=SqlSessionFactoryService.getSqlSessionFactory();
	}
	public List<MovieVo> list(){
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			MovieMapper mapper= sqlSession.getMapper(MovieMapper.class);
			return mapper.list();
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	public int insert(MovieVo vo) {
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			MovieMapper mapper= sqlSession.getMapper(MovieMapper.class);
			int n=mapper.insert(vo);
			sqlSession.commit();
			return n;
		}finally {
			sqlSession.close();
		}
	}
	public int delete(int mnum) {
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			MovieMapper mapper= sqlSession.getMapper(MovieMapper.class);
			int n=mapper.delete(mnum);
			sqlSession.commit();
			return n;
		}finally {
			sqlSession.close();
		}
	}
	public int update(MovieVo vo) {
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			MovieMapper mapper= sqlSession.getMapper(MovieMapper.class);
			int n=mapper.update(vo);
			sqlSession.commit();
			return n;
		}finally {
			sqlSession.close();
		}
	}
	public MovieVo select(int mnum){
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			MovieMapper mapper= sqlSession.getMapper(MovieMapper.class);
			return mapper.select(mnum);
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
}









