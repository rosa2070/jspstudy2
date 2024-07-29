package data;

public class MyUser {
    private String userId;
    private String name;
    private String email;
    private int points; //적립금
    
    
	public MyUser(String userId, String name, String email, int points) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.points = points;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
    
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "회원아이디: " + userId + ", 이름: " + name + 
				", 이메일: " + email + ", 적립금: " + points;
	}
    

}
