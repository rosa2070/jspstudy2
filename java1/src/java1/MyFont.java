package java1;

public class MyFont {
	private String fontName; //글꼴체
	private int fontSize; //글꼴크기	
	
	public MyFont() {
		fontName="궁서체";
		fontSize=12;
	}
	
	public MyFont(String fontName, int fontSize) {
		this.fontName = fontName;
		this.fontSize = fontSize;
	}

	
	public void setData(String fontName,int fontSize) {
		this.fontName=fontName;
		this.fontSize=fontSize;
	}	
	//글꼴크기 변경
	public void setFontSize(int fontSize) {
		if(fontSize<0) {
			System.out.println("크기설정오류");
			return;
		}
		this.fontSize=fontSize;
	}
	
	public void showInfo() {
		System.out.println("글꼴체:" + fontName);
		System.out.println("글꼴크기:" + fontSize);
	} 
}