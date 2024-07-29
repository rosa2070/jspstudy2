package java3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("개나리");
		list.add("진달래");
		list.add("무궁화");
		//public void forEach(Consumer<? super E> action)
		Consumer<String> action = new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		};
		list.forEach(action);
		
		//람다식으로 바꿔보세요.
//		Consumer<String> a = (t) -> {
//			System.out.println(t);
//		};
//		Consumer<String> a = t -> System.out.println(t);
//		list.forEach(a);
		list.forEach(t -> System.out.println(t));
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "홍길동");
		map.put(2, "이길동");
		map.put(3, "삼길동");
		
		//public void forEach(BiConsumer<? super K,? super V> action)
//		BiConsumer<Integer, String> action1 = new BiConsumer<Integer, String>() {
//			
//			@Override
//			public void accept(Integer t, String u) {
//				System.out.println(t + ":" + u);
//				
//			}
//		};
//		map.forEach(action1);
		
		//람다식으로 바꿔보기
		map.forEach((t,u) -> {
			System.out.println(t + ":" + u);
		});
		
		//HashSet에 3명의 학생이름을 저장하고 forEach메소드를 사용해서 전체 이름을 출력해 보세요.
		HashSet<String> hs = new HashSet<String>();
		hs.add("김길동");
		hs.add("이영희");
		hs.add("이철수");
//		hs.forEach((String t) -> {
//			System.out.println(t);
//		});
		hs.forEach(t -> System.out.println(t));
		
	}

}
