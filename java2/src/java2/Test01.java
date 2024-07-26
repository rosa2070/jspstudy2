package java2;

public class Test01 {
	public static void main(String[] args) {
		Box b=new Box();
		b.draw();
		Shape s=b; //부모객체는 자식객체를 참조할 수 있다.(형변환하지 않는다.)
		s.draw();
		Shape s1=new Circle();
		s1.draw();
	//	s1.semicircle();//자식객체에서 추가된 기능은 접근할 수 없다.
		Circle c1=(Circle)s1;//자식객체는 부모객체를 참조할 수 있다 -> 반드시 강제형변환 해야 한다.
		c1.semicircle();
		printer(b);
		printer(c1);
	}
	public static void printer(Shape b) {
		System.out.println("프린터로 인쇄해요");
		b.draw();
	}
//	public static void printer(Box b) {
//		System.out.println("프린터로 인쇄해요");
//		b.draw();
//	}
//	public static void printer(Circle c) {
//		System.out.println("프린터로 인쇄해요");
//		c.draw();
//	}
}
