package 상속응용;

public class 동시프로그램실행2 {
	public static void main(String[] args) {
		달러 d = new 달러();
		골뱅이 g = new 골뱅이();
		엔드 a = new 엔드();
		
		d.run();
		g.run();
		a.run();
	}
}
