package test4;

public class TestMain1 {
	public static void main(String[] args) {
		MemberDao m = MemberFactory.getDao();
		System.out.println("<< 관리자 페이지 >>");
		m.insert("홍길동");
		m.select("홍길동");
		m.update("홍길동");
		m.delete("홍길동");
	}
}
