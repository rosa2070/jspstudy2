package test.main;

import java.util.List;

import test.dao.MovieDao;
import test.dao.MovieMapperDao;
import test.vo.MovieVo;

public class TestMain2 {
	public static void main(String[] args) {
		MovieMapperDao dao=new MovieMapperDao();
//		int n=dao.insert(new MovieVo(0,"hello","테스트..","최감독"));
//		System.out.println(n +" 개의 영화등록완료!");
		
		System.out.println();
		
		//영화삭제하기
		
		//영화번호로 영화정보 조회하기
		MovieVo vo =dao.select(41);
		if(vo!=null) {
			System.out.println("조회된 정보...");
			System.out.println("영화번호:" + vo.getMnum());
			System.out.println("영화제목:" + vo.getTitle());	
			System.out.println("영화감독:" + vo.getDirector());
			System.out.println("내용:" + vo.getContent());
		}
		//영화정보 수정하기
		int n2=dao.update(new MovieVo(41, "헬로","업데이트","나감독"));
		System.out.println(n2 +"개의 영화정보 수정완료");
		
	    List<MovieVo> list=dao.list();
	    list.forEach(m->{
	    	System.out.println("영화번호:" + m.getMnum());
			System.out.println("영화제목:" + m.getTitle());	
			System.out.println("영화감독:" + m.getDirector());
			System.out.println("내용:" + m.getContent());
			System.out.println();
	    });
	}
}







