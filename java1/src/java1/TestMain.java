package java1;

public class TestMain {
	public static void main(String[] args) {
		//MyFont객체를 생성하고 값 설정후 정보를 출력해 보세요
//		MyFont f=new MyFont();
//		f.setData("굴림체", 10);
//		f.setFontSize(20);
//		f.showInfo();
		MyFont f=new MyFont();
//		f.fontName="궁서체";
//		f.showInfo();
		//객체 생성하고 정보를 출력해 보세요.
		MyFont f1 = new MyFont("굴림체", 12);
		f1.showInfo();
	}
}
