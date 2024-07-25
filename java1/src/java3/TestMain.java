package java3;

public class TestMain {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.setX(100);
		r.setY(200);
		r.draw();
		r.paint("빨강");
		
		double a = Rect.getArea(10, 20);
		System.out.println("사각형넓이: " + a);
		//PI 출력해 보세요.
		System.out.println("PI==>" + Shape.PI);
	}

}
