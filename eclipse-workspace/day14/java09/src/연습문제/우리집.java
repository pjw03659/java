package 연습문제;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순",'여');
		System.out.println(d1);
		System.out.println("딸이 "+딸.count+"명 입니다.");
		딸 d2 = new 딸("홍길진",'여');
		System.out.println(d2);
		System.out.println("딸이 "+딸.count+"명 입니다.");
		System.out.println("아빠 지갑에 남은 돈은 "+딸.아빠지갑 +"원 입니다.");
	}

}
