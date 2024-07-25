package java2;

public class TestMain {
	public static void main(String[] args) {
		Box b = new Box();
		b.setX(100);
		b.setY(200);
		double a = b.getArea();
		System.out.println("사각형 넓이 : " + a);
		
		Triangle t = new Triangle();
		t.setX(100);
		t.setY(200);
		double a1 = t.getArea();
		System.out.println("삼각형의 넓이는 " + a1);
	}

}
