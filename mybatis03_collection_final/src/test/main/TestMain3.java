package test.main;

import java.util.List;

import test.dao.MembersDao;
import test.dto.Members;

//members 테이블과 연동해서 CRUD하는 프로그램 작성하기 Mapper interface사용해 보세요.(3:40)
//공유폴더 퀴즈-> 0826 폴더에 코드 올리세요
public class TestMain3 {
	public static void main(String[] args) {
		MembersDao dao=new MembersDao();
		//dao.insert(new MembersVo(1,"김자바", "010", "대구", null));
		//dao.update(new MembersVo(1,"김java", "011", "서울", null));
		dao.delete(0);
		//System.out.println("등록완료!");
		List<Members> list= dao.selectAll();
		for(Members vo:list) {
			System.out.println(vo);
		}
	}
}
