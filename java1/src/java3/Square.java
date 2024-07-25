package java3;

public class Square implements Shape {
	int x; 
	int y;
	
	
	@Override
	public void draw() {
		int area = x * y; 
		System.out.println("사각형의 넓이는 " + area);
	}
	
	@Override
	public void paint(String color) {
		// TODO Auto-generated method stub
		System.out.println("사각형의 색은 " + color);
		
	}

}
