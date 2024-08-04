package springmvc.controller;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private String username;
	private Long userid;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date userdob;
	private List<String>courses;
	private String gender;
	private String type;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Date getUserdob() {
		return userdob;
	}
	public void setUserdob(Date userdob) {
		this.userdob = userdob;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", userid=" + userid + ", userdob=" + userdob + ", courses=" + courses
				+ ", gender=" + gender + ", type=" + type + "]";
	}
	
	
}
