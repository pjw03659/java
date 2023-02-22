package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		applecomputer com1 = new applecomputer();
		bananacomputer com2 = new bananacomputer();
		
		com1.cpu();
		com1.ram();
		com1.battery();
		
		com2.cpu();
		com2.ram();
		com2.battery();
		
	}

}
