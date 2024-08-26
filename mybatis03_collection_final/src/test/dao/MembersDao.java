package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import data.service.SqlSessionFactoryService;
import test.dto.Members;

public class MembersDao {
	private SqlSessionFactory factory=SqlSessionFactoryService.getSqlSessionFactory();
	
	public int insert(Members vo) {
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			//매퍼클래스 얻어오기
			MembersMapper mapper= sqlSession.getMapper(MembersMapper.class);
			int n=mapper.insert(vo);
			sqlSession.commit();
			return n;
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	public List<Members> selectAll(){
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			MembersMapper mapper= sqlSession.getMapper(MembersMapper.class);
			return mapper.selectAll();
	    }finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	public int delete(int num) {
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			//매퍼클래스 얻어오기
			MembersMapper mapper= sqlSession.getMapper(MembersMapper.class);
			int n=mapper.delete(num);
			sqlSession.commit();
			return n;
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	
	public int update(Members vo) {
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			//매퍼클래스 얻어오기
			MembersMapper mapper= sqlSession.getMapper(MembersMapper.class);
			int n=mapper.update(vo);
			sqlSession.commit();
			return n;
		}finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
	public Members selectOne(int num){
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			MembersMapper mapper= sqlSession.getMapper(MembersMapper.class);
			return mapper.selectOne(num);
	    }finally {
			if(sqlSession!=null) sqlSession.close();
		}
	}
}









