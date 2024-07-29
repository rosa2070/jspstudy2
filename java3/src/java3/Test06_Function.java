package java3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

import data.Person;
import data.Student;

/*
 * Function 인터페이스
 * R apply(T t) 추상메소드를 갖는다.
 */
public class Test06_Function {
	public static void main(String[] args) {
		//Function<파라미터타입, 리턴타입>
		Function<Integer, Double> fun1 = new Function<Integer, Double>() {
			
			@Override
			public Double apply(Integer t) {
				return t/2.0;
			}
		};
		double a = fun1.apply(100);
		System.out.println(a);
		//람다식으로 바꿔보세요.
		Function<Integer, Double> fun2 = t -> t/2.0;
		double b = fun2.apply(100);
		System.out.println(b);
		
		Function<Student, String> func3 = (t) -> {
			if (t.getScore() >= 90) return "A";
			else if (t.getScore() >= 80) return "B";
			else return "F";
		};
		String result = func3.apply(new Student(1, "이길동", 80));
		System.out.println("학점:" + result);
		
		
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		list1.add(new Student(10, "홍길동", 100));
		list1.add(new Student(2, "이길동", 80));
		list1.add(new Student(31, "삼길동", 90));
		list1.add(new Student(11, "오길동", 70));
		list1.add(new Student(22, "사길동", 50));
		list1.add(new Student(30, "칠길동", 90));
		//<R> Stream<R> map(Function(? super T, ? extends R> mapper)
//		Function<Student, String> func1 = (t) -> {
//			return t.getName();
//		};
//		list1.stream().map(func1).forEach(t-> System.out.println(t));
		list1.stream().map(t->t.getName()).forEach(t->System.out.println(t));
		
		//이름/점수만 스트림 객체로 만들기
		Function<Student, HashMap<String, Object>> f1 = new Function<Student, HashMap<String, Object>>() {

			@Override
			public HashMap<String, Object> apply(Student t) {
				HashMap<String, Object> hm = new HashMap<String, Object>();
				hm.put("name", t.getName());
				hm.put("score", t.getScore());
				return hm;
			}
		};
		list1.stream().map(f1).forEach(t -> {
			String name = (String)t.get("name");
			Integer score = (Integer)t.get("score");
			System.out.println(name + ":" + score);
		});
		
		//ArrayList에 Person객체를 담아보세요.
		ArrayList<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("홍길동", 100));
		list2.add(new Person("이길동", 80));
		list2.add(new Person("삼길동", 90));
		list2.add(new Person("오길동", 20));
		list2.add(new Person("사길동", 17));
		list2.add(new Person("칠길동", 19));
		//1. age값이 20이상인 사람들만 출력되도록 해보세요. filter()
		System.out.println("나이가 20이상인 사람들...");
		list2.stream().filter(p->p.getAge()>=20).forEach(p-> System.out.println(p));
		
		//2. 이름값들만 출력되도록 해보세요. map()
		System.out.println("<< 이름만 출력 >>");
		list2.stream().map(t -> t.getName()).forEach(p -> System.out.println(p));
		
		//나이가 20이상인 사람의 수
		long cnt = list2.stream().filter(t->t.getAge()>=20).count();
		System.out.println(cnt);
		//나이합 구하기
		int sum = list2.stream().mapToInt(t->t.getAge()).sum();
		System.out.println("총나이합:" + sum);
		
		
		
		
	}

}
