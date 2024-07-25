package java1;

//Person을 상속받아 학생번호와 점수가 추가되고 정보를 출력하는 기능이 있는 메소드를 추가해 보세요.
//TestMain클래스에서 Student객체 생성하고 정보 출력해 보세요
public class Student extends Person {
	private int snum;
	private int score;
	
	public Student() {
		super("김아무", 10);
	}
	
	public Student(int snum, int score, String name, int age) {
		super(name, age);
		this.snum = snum;
		this.score = score;
	}

	public void setData(int snum, int score, String name, int age) {
		this.snum = snum;
		this.score = score;
		setName(name);
		setAge(age);
	}
	
	public void printStudent() {
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("학생번호: " + snum);
		System.out.println("점수: " + score);
	}

}
