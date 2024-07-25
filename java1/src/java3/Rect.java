package java3;

public class Rect implements Shape {
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public void draw() {
		System.out.println(x + ", " + y + "위치에 사각형 그리기");
	}
	
	@Override
	public void paint(String color) {
		System.out.println(color + " 색상으로 사각형 칠하기");
	}
	
	public static double getArea(double w, double h) {
//		System.out.println("x + ", " + y); 에러 -> 인스턴스 변수 사용 못한다.
		return w*h;
	}
}
