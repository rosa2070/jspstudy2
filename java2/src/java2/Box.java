package java2;

public class Box extends Shape{
	@Override
	public void paint(String color) {
		System.out.println(color +"사각형 칠하기");
	}
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
	public void area(double x,double y) {
		System.out.println("사각형 넓이:" + x*y);
	}
}
