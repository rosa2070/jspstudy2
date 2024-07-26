package java3;

import java.util.ArrayList;

//Person객체를 3개 ArrayList에 담고 전체 데이터를 출력해 보세요.
public class TestMain2 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		Person p1 = new Person("홍길동", 10);
		list.add(p1);
		list.add(new Person("이길동", 20));
		list.add(new Person("삼길동", 30));
		
		for(int i=0; i<list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p.getName() + "," + p.getAge());
		}	
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			Person p = list.get(i);
			//위와 동일한 내용이 출력되도록 코드를 작성해 보세요.
			System.out.println(p);
		}
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		if (s1.equals(s2)) {
			System.out.println("두 문자열이 같아요");
		}
		
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		if(s3.equals(s4)) {
			System.out.println("두 문자열이 같아요");
		}
		
		Person p2 = new Person("홍길동", 10);
		Person p3 = new Person("홍길동", 10);
		// 두 객체의 멤버변수 값이 같으면 실행되도록 코드 추가해 보세요.
		if(p2.equals(p3)) {
			System.out.println("두 사람은 같아요");
		}
		
	}
}
