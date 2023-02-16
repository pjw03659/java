package 연습문제;

public class 딸 {
	String name;
	char gender;
	static int count;
	static int 아빠지갑= 100000;
	public 딸(String name, char gender) {
		this.name = name;
		this.gender = gender;
		count++;
		아빠지갑-=1000;
	}
	public void tv보다() {
		System.out.println("쇼파에서 tv를 보다.");
	}
	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
	
}
