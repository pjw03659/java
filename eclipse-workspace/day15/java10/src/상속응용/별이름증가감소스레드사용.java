package 상속응용;

public class 별이름증가감소스레드사용 {

	public static void main(String[] args) {
		star 별 = new star();
		이름스레드 이름 = new 이름스레드();
		증가스레드 증가 = new 증가스레드();
		감소스레드 감소 = new 감소스레드();
		
		별.start();
		이름.start();
		증가.start();
		감소.start();

	}

}
