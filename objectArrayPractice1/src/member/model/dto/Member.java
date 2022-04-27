package member.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
	
	public Member() {}
	
	public Member(String id, String name) {
		this(id, name, null, null,  ' ', 0);
	}
	
	public Member(String id, String name, String password, String email,
			char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	public String memberInfo() {
		return id + " " + name + " " + password + " " + email +
				" " + gender + " " + age;
	}
}
