package java3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestMain3_HashSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("이길동");
		set.add("삼길동");
		set.add("삼길동");
		
		//public Iterator<E> iterator()
		Iterator<String> a = set.iterator();
		while (a.hasNext()) {
			//E next()
			String s = a.next();
			System.out.println(s);
		}
		
		ArrayList<Person> list = new ArrayList<Person>();
		Person p1 = new Person("홍길동", 10);
		list.add(p1);
		list.add(new Person("이길동", 20));
		list.add(new Person("삼길동", 30));
		
		// public iterator<E> iterator() 메소드 사용해서 출력해 보세요
		Iterator<Person> b = list.iterator();
		while(b.hasNext()) {
			Person p = b.next();
			System.out.println(p);
		}
	}

}
