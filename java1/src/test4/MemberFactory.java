package test4;

public class MemberFactory {
	public static MemberDao getDao() {
		MemberDao m = new MemberMySQL();
		return m;
	}

}
