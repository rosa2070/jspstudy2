package test4;

public class TestMain {
	public static void main(String[] args) {
		//MemberOracle m = new MemberOracle();
		//MemberMySQL m = new MemberMySQL();
//		MemberDao m = new MemberDao(); // 에러 -> 인터페이스는 객체를 생성할 수 없다.
		//MemberDao m = new MemberOracle(); // 인터페이스는 자식객체는 참조할 수 있다.
		MemberDao m = MemberFactory.getDao();
		System.out.println("<< 사용자 페이지 >>");
		m.insert("홍길동");
		m.select("홍길동");
		m.update("홍길동");
		m.delete("홍길동");
	}

}
