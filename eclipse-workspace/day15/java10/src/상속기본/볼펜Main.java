package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 pen = new 볼펜(2500,"pentel",0.5);
		
		pen.사다();
		pen.글을쓰다();
		System.out.println(pen);
	}

}
