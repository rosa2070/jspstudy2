package java3;
/*
 * public ArrayList(Collection<? extends E> c)
 * -> Collection<? extends E> c : E타입의 클래스를 담은 Collection 객체이거나 E타입의 자식클래스를 담은
 * Collection 객체
 */

import java.util.ArrayList;
import java.util.Vector;

class AA {
	private int a;
	public AA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
}
class BB extends AA {
	private int b;
	public BB(int a, int b) {
		super(a);
		this.b = b;
	}
	public int getB() {
		return b;
	}
}
public class TestMain6 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("개나리");
		vec.add("진달래");
		vec.add("무궁화");
		//public ArrayList<Collection<? extends E> c)
		ArrayList<String> list1 = new ArrayList<String>(vec); //가능
		list1.add("장미꽃");
		for(String s: list1) {
			System.out.println(s);
		}
		ArrayList<AA> list2 = new ArrayList<AA>();
		list2.add(new AA(1));
		list2.add(new AA(2));
		list2.add(new AA(3));
		
		ArrayList<AA> list3 = new ArrayList<AA>(list2); //가능
		for(AA i: list3) {
			System.out.println(i.getA());
		}
		
		ArrayList<BB> list4 = new ArrayList<BB>();
		list4.add(new BB(10, 20));
		list4.add(new BB(30, 40));
		list4.add(new BB(50, 50));
		ArrayList<AA> list5 = new ArrayList<AA>(list4);//가능
		//BB정보도 출력되도록 코드 추가하기
		for(AA a : list5) {
			BB b = (BB)a;
			System.out.println(b.getA() + "," + b.getB());
		}
		
		
		
		
	}
}
