package model.domain.dto;

public class Member {
	private String id;	// 아이디
	private String name;	//이름
	private String pw;	//비밀번호
	private String email;	//이메일
	private String tel;	//전화번호
	private int point;	//포인트
	
	public Member(String id, String name, String pw, String email, String tel, int point) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", pw=" + pw + ", email=" + email + ", tel=" + tel + ", point="
				+ point + "]";
	}
}
