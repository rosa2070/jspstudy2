package java3;

import java.util.ArrayList;
import java.util.function.Function;

/*
 * 메소드 참조 : 메소드를 참조해서 매개변수의 정보 및 리턴타입을 알아내어 람다식에서 불필요한 매개변수를 제거함
 */
class Math {
	int abs(int a) { return a>0?a:-a;}
	static int pow(int a) { return a * a;}
}
public class Test07 {
	public static void main(String[] args) {
		Function<Integer, Integer> f4 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return Math.pow(t);
			}
		};
		System.out.println(f4.apply(10));
		Function<Integer, Integer> f5 = t->Math.pow(t);
		System.out.println(f5.apply(40));
		
		Function<Integer, Integer> f6 = Math::pow; //static메소드는 클래스 이름으로 메소드 참조
		System.out.println(f6.apply(4));
		
		Math m = new Math();
		Function<Integer, Integer> f1 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return m.abs(t);
			}
		};
		int n = f1.apply(-10);
		System.out.println(n);
//		Function<Integer, Integer> f2 = (t) -> {
//			return m.abs(t);
//		};
		Function<Integer, Integer> f2 = t->m.abs(t);
		int n1 = f2.apply(-5);
		System.out.println(n1);
		
		Function<Integer, Integer> f3 = m::abs; //객체이름으로 메소드를 참조함
		System.out.println(f3.apply(-100));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("진달래");
		list.add("개나리");
		list.add("무궁화");
		// list.forEach(t -> System.out.println(t));
		list.forEach(System.out::println);
	}

}
