package test.main;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.dto.Members;

public class TestMain1 {
	public static void main(String[] args) {
		String resource="data/mybatis/mybatis-config.xml";
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sFactory = new SqlSessionFactoryBuilder().build(is);
			SqlSession sqlSession = sFactory.openSession();
//			List<Members> list = sqlSession.selectList("selectAll");
//			System.out.println("<< 전체 회원 목록 >>");
//			for(Members mem : list) {
//				System.out.println("회원번호:" + mem.getNum());
//				System.out.println("이름:" + mem.getName());
//				System.out.println("전화번호:" + mem.getPhone());
//				System.out.println("주소:" + mem.getAddr());
//				System.out.println("가입일:" + mem.getRegdate());
//				System.out.println();
//			}
			Members mem = sqlSession.selectOne("getinfo", 10);
			if(mem == null) {
				System.out.println("검색된 회원정보가 없어요...");
			} else {
				System.out.println("<< 조회된 회원 정보 >>");
				System.out.println("회원번호:" + mem.getNum());
				System.out.println("이름:" + mem.getName());
				System.out.println("전화번호:" + mem.getPhone());
				System.out.println("주소:" + mem.getAddr());
				System.out.println("가입일:" + mem.getRegdate());
				System.out.println();
			}
			sqlSession.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
