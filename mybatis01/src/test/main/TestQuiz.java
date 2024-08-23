package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.dto.Member;

// member테이블과 연동해서 회원조회/수정/삭제/추가 해보세요.
public class TestQuiz {
	public static void main(String[] args) {
		String resource="data/mybatis/mybatis-config.xml";
		
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sFactory = new SqlSessionFactoryBuilder().build(is);
			SqlSession sqlSession = sFactory.openSession();
			// 원하는 작업 하기
//			Member mem = new Member("rosa", "1224", "rosa@naver.com", null);
//			sqlSession.insert("data.mybatis.MemberMapper.join", mem);
//			sqlSession.commit();
//			System.out.println("회원등록 성공!!!");
			
//			int n = sqlSession.delete("data.mybatis.MemberMapper.remove", "rosa");
//			sqlSession.commit();
//			System.out.println(n + "명의 회원이 삭제되었습니다...");
			
//			Member mem = new Member("rosa", "1234", "jaeeun@naver.com", null);
//			int n = sqlSession.update("data.mybatis.MemberMapper.edit", mem);
//			System.out.println(n + "명의 회원정보 수정됨...");
//			sqlSession.commit();
//			sqlSession.close();
			
//			List<Member> list = sqlSession.selectList("data.mybatis.MemberMapper.selectAll");
//			System.out.println("<< 전체 회원 목록 >>");
//			for(Member mem : list) {
//				System.out.println("아이디:" + mem.getUserid());
//				System.out.println("비밀번호:" + mem.getPwd());
//				System.out.println("이메일:" + mem.getEmail());
//				System.out.println("가입일:" + mem.getRegdate());
//				System.out.println();
//			}
			
			Member mem = sqlSession.selectOne("data.mybatis.MemberMapper.getinfo", "rosa");
			if (mem == null) {
				System.out.println("검색된 회원정보가 없어요...");
			} else {
				System.out.println("<< 조회된 회원 정보 >>");
				System.out.println("아이디:" + mem.getUserid());
				System.out.println("비밀번호:" + mem.getEmail());
				System.out.println("이메일:" + mem.getPwd());
				System.out.println("가입일:" + mem.getRegdate());
				System.out.println();
			}
			sqlSession.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
