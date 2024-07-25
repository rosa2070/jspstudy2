package test4;

public class MemberMySQL implements MemberDao {

	@Override
	public void conn() {
		System.out.println("mysql 서버 접속...");
		
	}

	@Override
	public void insert(String m) {
		System.out.println("MySQL 명령어를 사용해서 " + m + "회원추가");
	}

	@Override
	public void select(String m) {
		System.out.println("MySQL 명령어를 사용해서 " + m + "회원조회");
		
	}

	@Override
	public void update(String m) {
		System.out.println("MySQL 명령어를 사용해서 " + m + "회원수정");
		
	}

	@Override
	public void delete(String m) {
		System.out.println("MySQL 명령어를 사용해서 " + m + "회원삭제");
		
	}

	@Override
	public void disconn() {
		System.out.println("mysql 서버 접속 해제...");
	}
	

}
