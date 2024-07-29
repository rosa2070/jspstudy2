package java3;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

import data.Student;

public class Test05 {
	public static void main(String[] args) {
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(10, "홍길동", 100));
		list1.add(new Student(2, "이길동", 80));
		list1.add(new Student(31, "삼길동", 90));
		list1.add(new Student(11, "오길동", 70));
		list1.add(new Student(22, "사길동", 50));
		list1.add(new Student(30, "칠길동", 90));
		//번호가 짝수인 학생들만 출력하기
		Stream<Student> s1 = list1.stream();
		//boolean test(T t)
		Predicate<Student> predicate = (Student t) -> { // true가 리턴된 요소들만 Stream으로 만들어줌
			if(t.getNum()%2 == 0) 
				return true;
			else 
				return false;
		};
		s1.filter(predicate).forEach(t -> System.out.println(t));
		
		System.out.println();
		//점수가 80점 이상인 학생들만 출력되도록 해보세요.
//		Predicate<Student> predicate1 = (Student t) -> {
//			return t.getScore() >= 80;
//		};
//		list1.stream().filter(predicate1).forEach(t -> System.out.println(t));
		System.out.println("점수가 80점 이상인 학생..............");
		list1.stream().filter(t->t.getScore()>=80).forEach(t-> System.out.println(t));
		

	}

}
