package java3;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Map
 * - Key와 Value가 한쌍으로 저장되는 자료구조 인터페이스
 * - Key값은 중복될 수 없고 value값은 중복될 수 있다.
 * 
 * HashMap (Map을 구현한 클래스)
 * - 주요메소드
 * public V put(K key, V value) : Key와 value를 한쌍으로 저장
 * public V get(Object key) : Key에 해당하는 Value를 리턴
 */
public class TestMain4_Map {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "홍길동");
		map.put(2, "이길동");
		map.put(3, "삼길동");
		Scanner s = new Scanner(System.in);
		System.out.println("조회할 학생번호");
		int n = s.nextInt();
		String s1 = map.get(n);
		System.out.println(s1);
		
	}

}
