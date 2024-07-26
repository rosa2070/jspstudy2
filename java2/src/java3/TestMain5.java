package java3;

import java.util.HashMap;

public class TestMain5 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", "javajava");
		map.put("pwd", 1234);
		map.put("email", "java@");
		insert(map);
	}
	
	public static void insert(HashMap<String, Object> map) {
		String id = (String)map.get("id");
		Integer pwd = (Integer) map.get("pwd");
		String email = (String) map.get("email");
		System.out.println(id);
		System.out.println(pwd);
		System.out.println(email);
	}

}
