package data.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryService {
	private static SqlSessionFactory sqlSessionFactory;
	
	static { //static 블록 -> static 멤버를 초기화
		try {
			String resource="mybatis/mybatis-config.xml";
			InputStream is = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
