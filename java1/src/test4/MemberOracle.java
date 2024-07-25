package test4;

public class MemberOracle implements MemberDao {
	public void conn() {
		System.out.println("오라클 DB접속");
	}
	
	public void insert(String m) {
		System.out.println("오라클 명령어를 사용해서 " + m + "회원추가");
	}
	
	public void select(String m) {
		System.out.println("오라클 명령어를 사용해서 " + m + "회원조회");
	}

	public void update(String m) {
		System.out.println("오라클 명령어를 사용해서 " + m + "회원수정");
	}
	
	public void delete(String m) {
		System.out.println("오라클 명령어를 사용해서 " + m + "회원삭제");
	}
	
	public void disconn() {
		System.out.println("오라클 db접속 해제...");
	}

}
