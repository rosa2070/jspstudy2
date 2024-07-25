package test4;
// DAO클래스가 가져야할 기본 기능들의 목록을 제시
public interface MemberDao {
	void conn();
	void insert(String m);
	void select(String m);
	void update(String m);
	void delete(String m);
	void disconn();


}
