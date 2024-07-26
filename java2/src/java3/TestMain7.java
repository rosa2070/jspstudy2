package java3;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain7 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("진달래");
		list.add("개나리");
		list.add("무궁화");
		
		Collections.sort(list); // 정렬하기
		
		for(String s : list) {
			System.out.println(s);
		}
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(10, "이길동", 100));
		list1.add(new Student(3, "김길동", 80));
		list1.add(new Student(2, "삼길동", 90));
		Collections.sort(list1);
		for(Student s : list1) {
			System.out.println(s);
		}
		//ArrayList에 Person객체를 3개 담고 나이가 높은 순으로 출력되도록 해보세요.
		ArrayList<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("김길동", 40));
		list2.add(new Person("이길동", 20));
		list2.add(new Person("삼길동", 70));
		Collections.sort(list2);
		for(Person p : list2) {
			System.out.println(p);
		}
	}

}
