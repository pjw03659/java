package DB_connet;

public class MemberVO {
	//MemberVO 가방에 넣은 데이터는 Member 테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌.
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//하나의 변수당 set/get 하나씩 만들어줌.
	//가방에 하나씩 값을 넣어주어야함. -> setter
	public void setId(String id) {
		this.id=id;
	}	
		
	//가방에 하나씩 값을 꺼내주어야함. ->getter
	public String getId() {
		return id;
	}
		
	public void setPw(String pw) {
		this.pw = pw;
	}	
		
	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
