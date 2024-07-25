package java2;
/*
 * 추상클래스
 * - 추상메소드를 갖는 클래스
 * - 객체 생성할 수 없다.
 * - 생성자 가능
 * < 추상메소드 >
 * - 구현부분을 갖지 않는 메소드
 * - 자식클래스에서 반드시 오버라이딩(***)해야 한다
 */
public abstract class Shape {
	protected int x;
	protected int y;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public abstract double getArea();
	
}
