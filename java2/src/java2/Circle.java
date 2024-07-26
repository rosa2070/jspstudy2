package java2;

public class Circle extends Shape{
	@Override
	public void paint(String color) {
		System.out.println(color +"타원 칠하기");
	}
	@Override
	public void draw() {
		System.out.println("타원 그리기");
	}
	public void semicircle() {
		System.out.println("반원 그리기");
	}
}
