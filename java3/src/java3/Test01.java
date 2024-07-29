package java3;
/*
 * [ 람다식 ]
 * - jdk1.8 버전에서 추가된 기능
 * - 메소드를 하나의 식으로 간단하게 표현한 것
 * - 형식)
 * 	(자료형 변수)->{메소드 실행코드;}
 *  - 함수형 인터페이스에서만 람다식을 사용할 수 있다.
 *  - 함수형 인터페이스 : 추상메소드를 하나만 갖고 있는 인터페이스 (예:Runnable)
 * 
 */
@FunctionalInterface
interface Shape{
	void draw();
	default void paint() {System.out.println("색칠하기");}
}
interface MyMath{
	int add(int a,int b);
}
@FunctionalInterface
interface MyCircle{
	double getArea(double r);
}
public class Test01 {
	public static void main(String[] args) {	
		// MyCircle을 람다식을 사용해 구현하고 사용해 보세요.
		MyCircle mc=new MyCircle() {	
			@Override
			public double getArea(double r) {
				return r*r*3.14;
			}
		};
		System.out.println("원의넓이:" + mc.getArea(10.0));
//		MyCircle mc1=(r)->{
//			return r*r*3.14;
//		};
		MyCircle mc1=r->r*r*3.14;
		System.out.println("원의넓이:" + mc1.getArea(5.0));
		
		// Shape를 익명의 내부클래스로 만들어 보기
		Shape box=new Shape() {
			@Override
			public void draw() {
				System.out.println("사각형그리기");
			}
		};
		box.draw();
		
		//Shape를 람다식을 사용해서 구현하고 draw()함수가 호출되도록 해보세요
		Shape circle=()->{
			System.out.println("타원그리기");
		};
		circle.draw();
		
		//익명의 내부클래스
		MyMath mm=new MyMath() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		int n=mm.add(1, 2);
		System.out.println("두수합:" + n);
		
		//람다식
//		MyMath mm1=(int a,int b)->{
//			return a+b;
//		};
//		MyMath mm1=(a,b)->{	return a+b;}; //파라미터 타입생략가능
		MyMath mm1=(a,b)->a+b;//실행문장이 딱하나인경우는 {}생략가능 / 메소드실행문장이 return문만 있는경우
		                      //return문도 생략가능
		int n1=mm1.add(2, 3);
		System.out.println(n1);
		
		
	}
}






