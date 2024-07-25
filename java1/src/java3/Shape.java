package java3;
// Shape를 상속받는 사각형 클래스를 만들고 사용해 보세요.
/*
 * [ 인터페이스(***) ]
 * - 자식클래스들이 가져야 할 기능들의 목록을 제시(뼈대역할, 기본틀)
 * - 상수와 추상메소드들로 이루어 진다.(jdk8.0이상에서는 default메소드기능이 추가됨)
 * - 만드는 형식
 *  interface 인터페이스명 {
 *		상수;
 *		추상메소드()
 *		default 리턴형 메소드명() {실행코드; ..}
 *	}
 * - 인터페이스는 객체를 생성할 수는 없지만 자식객체를 참조할 수는 있다.
 * - 사용이유
 * 	1. 자식클래스들이 가져야 할 기능들의 뼈대를 제공
 *  2. 클래스에서 다중상속이 지원되지 않지만 인터페이스는 다중상속이 가능하다.
 *  3. 인터페이스를 적절히 사용함으로써 유지보수가 수월해 진다.
 */
public interface Shape {
	double PI = 3.141592; // public final static 
	public abstract void draw(); //public abstract 
	void paint(String color);
	default void changePos() {
		System.out.println("위치 변경하기");
	}
}
