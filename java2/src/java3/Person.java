package java3;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	//public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
//		String s = this.name + "," + this.age;
		String s = name + "," + age;
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean a = false;
		
		if(obj instanceof Person) {
			Person p3 = (Person)obj;
			if (name.equals(p3.name) && age==p3.age) {
				a=true;
			}
		}
		return a;
	}
	
	@Override
	public int compareTo(Person o) {
//		if(age>o.age) {
//			return -1;
//		} else if (age < o.age) {
//			return 1;
//		} else {
//			return 0;
//		}
		//return Integer.compare(age, o.age); // 오름차순
		//return Integer.compare(age, o.age)*-1;//내림차순
		
		//return name.compareTo(o.name); //오름차순
		return name.compareTo(o.name)*-1; //내림차순
	}
	
	
}
