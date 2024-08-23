package test.dto;

import java.sql.Date;

public class Member {
	private String userid;
	private String pwd;
	private String email;
	private Date regdate;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String userid, String pwd, String email, Date regdate) {
		super();
		this.userid = userid;
		this.pwd = pwd;
		this.email = email;
		this.regdate = regdate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	

}
