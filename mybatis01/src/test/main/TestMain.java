package test.main;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.dto.Members;

public class TestMain {
	public static void main(String[] args) {
		String resource="data/mybatis/mybatis-config.xml";
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sFactory = new SqlSessionFactoryBuilder().build(is);
			SqlSession sqlSession = sFactory.openSession();
			// 원하는 작업 하기
			Members mem = new Members(2, "홍길동", "010", "서울", null);
			sqlSession.insert("join", mem);
			sqlSession.commit();
			System.out.println("회원등록 성공!!!");
//			int n = sqlSession.delete("remove", 1);
//			sqlSession.commit();
//			System.out.println(n + "명의 회원이 삭제되었습니다...");
			
			//회원번호 1번인 회원정보 임의의 정보로 수정해 보세요(이름, 전화, 주소)
//			Members mem = new Members(1, "김수정", "011", "부산", null);
//			int n = sqlSession.update("edit", mem);
//			System.out.println(n + "명의 회원정보 수정됨...");
//			sqlSession.commit();
//			sqlSession.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
