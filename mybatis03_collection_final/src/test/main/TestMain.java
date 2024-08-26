package test.main;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import test.dao.MovieDao;

public class TestMain {
	public static void main(String[] args) {
		MovieDao dao=MovieDao.getInstance();
		List<HashMap<String,Object>> list= dao.commList1();
		for(int i=0;i<list.size();i++) {
		  HashMap<String,Object> map= list.get(i);
		  BigDecimal mnum=(BigDecimal) map.get("MNUM");
		  String title=(String)map.get("TITLE");
		  String director=(String)map.get("DIRECTOR");
		  BigDecimal num=(BigDecimal) map.get("NUM");
		  String id=(String)map.get("ID");
		  String comments=(String)map.get("COMMENTS");
		  System.out.println("영화번호:" + mnum);
		  System.out.println("제목:" + title);
		  System.out.println("감독:" + director);
		  System.out.println("댓글번호:" + num);
		  System.out.println("아이디:" + id);
		  System.out.println("댓글내용:" + comments);
		  System.out.println();
		  
		}
	}
}







