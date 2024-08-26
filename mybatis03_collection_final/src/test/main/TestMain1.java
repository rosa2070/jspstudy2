package test.main;

import java.util.List;

import test.dao.MovieDao;
import test.vo.CommentsVo;
import test.vo.MovieCommentsVo;

public class TestMain1 {
	public static void main(String[] args) {
		MovieDao dao=MovieDao.getInstance();
		List<MovieCommentsVo> list= dao.commList2();
		for(MovieCommentsVo vo:list) {
			System.out.println("-----------------------------------");
			System.out.println("영화번호:" + vo.getMnum());
			System.out.println("영화제목:" + vo.getTitle());
			System.out.println("영화감독:" + vo.getDirector());
			System.out.println();
			List<CommentsVo> clist=vo.getCommList();
			for(CommentsVo c:clist) {
				System.out.println("댓글작성자:"+ c.getId());
				System.out.println("댓글내용:" + c.getComments());
				System.out.println();
			}
			System.out.println("------------------------------------");
		}
	}
}
