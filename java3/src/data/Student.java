package data;

public class Student implements Comparable<Student>{
	private int num;
	private String name;
	private int score;
	private Student() {}
	public Student(int num, String name, int score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "num:" + num + ",name:" + name + ",score:" + score;
	}
	
	@Override
	public int compareTo(Student o) {
		// 번호 순서대로 정렬(오름차순)
//		if(num>o.num) {
//			return 1;
//		} else if (num<o.num) {
//			return -1;
//		} else {
//			return 0;
//		}
		// 점수로 내림차순 정렬
		if(score>o.score) {
			return -1;
		} else if (score < o.score){
			return 1;
		} else {
			return 0;
		}
		
		
	}
	
	

}
