package java3;

import java.util.ArrayList;

/*
 * ArrayList 
 * - 객체를 배열처럼 관리해주는 기능을 갖는 클래스
 * 
 */
public class TestMain1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("이길동");
		list.add("삼길동");
		list.add("삼길동");
	//	list.add(1);
		
		for(int i=0;i<list.size();i++) {
			//public E get(int index)
		    String o=list.get(i);
		    System.out.println(o);
		}
		
	}
}
