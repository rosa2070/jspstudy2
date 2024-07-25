package java1;

public class TestMain1 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setData(1, 10, "홍길동", 100);
		s.printStudent();
		
		Student s1 = new Student(2, 40, "이길동", 10);
		s1.printStudent();

	}

}
