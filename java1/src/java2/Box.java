package java2;

public class Box extends Shape {
	// 사각형 넓이 구하는 기능
	public double getArea() {
		return x*y;
	}
	
	public void getArea(int x, int y) { //오버로딩
		System.out.println("넓이: " + x*y);
	}
	

}
