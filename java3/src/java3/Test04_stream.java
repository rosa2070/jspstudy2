package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import data.Person;
import data.Student;

/*
 * < Stream >
 * - JDK1.8버전부터 지원됨
 * - Collection객체들의 for문이나 iterator를 사용하는 것을 추상화해서 통일된 방식으로
 *   처리하도록 구현함
 * - 자주 사용되는 데이터 처리들을 정의해 놓음
 * - 스트림의 구조
 *   1. 스트림 생성
 *   2. 중개연산
 *   3. 최종연산
 *   
 */
public class Test04_stream {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("개나리");
		list.add("진달래");
		list.add("무궁화");
		
//		Stream<String> s1 = list.stream();
//		Stream<String> s2 = s1.sorted();
//		s2.forEach(null);
		list.stream().sorted().forEach(t -> System.out.println(t));
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(10, "홍길동", 100));
		list1.add(new Student(2, "이길동", 80));
		list1.add(new Student(31, "삼길동", 90));
		Stream<Student> s1 = list1.stream();
		s1.forEach(t -> System.out.println(t.getNum() + "," + t.getName() + "," + t.getScore()));
		//s1.sorted().forEach(t -> System.out.println(t)); // 에러발생. 스트림은 1번만 사용가능
		//점수가 높은순으로 정렬해서 출력하기
		list1.stream().sorted().forEach(t -> System.out.println(t));
		
		//ArrayList에 Person객체를 3개 담고 stream을 사용해서 이름순으로 정렬해서 출력되도록 해보세요.
		ArrayList<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("홍길동", 10));
		list2.add(new Person("김길동", 13));
		list2.add(new Person("최길동", 10));
		list2.stream().sorted().forEach(t -> System.out.println(t));
		
		int[] a = {20, 10, 50};
		IntStream s2 = Arrays.stream(a); //int배열을 스트림으로 얻어오기
		s2.sorted().forEach(t -> System.out.println(t));
		
		
		
	}

}
