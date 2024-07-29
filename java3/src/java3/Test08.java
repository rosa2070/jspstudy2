package java3;

import java.util.ArrayList;

import data.MyUser;

/*
 * 회원아이디, 이름, 이메일, 적립금(int) 정보를 갖는 클래스를 만드세요.(MyUser)
 * - ArrayList에 회원정보를 담고 Stream을 사용해서 전체 데이터를 출력해 보세요
 * - Stream을 사용해서 아이디순으로 정렬해서 출력해 보세요
 * - 적립금이 3000이상인 회원들을 적립금이 높은순으로 출력해 보세요
 * - 전체 회원들의 적립금의 합계금액을 구해서 출력해 보세요.
 */
public class Test08 {
	public static void main(String[] args) {
		ArrayList<MyUser> userList = new ArrayList<MyUser>();
		
        userList.add(new MyUser("user001", "홍길동", "hong@example.com", 1000));
        userList.add(new MyUser("user002", "이길동", "lee@example.com", 2000));
        userList.add(new MyUser("user003", "김길동", "kim@example.com", 3000));
        userList.add(new MyUser("user004", "박길동", "park@example.com", 4000));
        userList.add(new MyUser("user005", "최길동", "choi@example.com", 5000));
        
        
        
        
		
	}

}
