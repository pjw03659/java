package 상속;

public class 예외처리1 {

	public static void main(String[] args) {
		// 실행할 때 에러가 발생해서 프로그램이 멈추는 것을 막기 위한 것.
		System.out.println("1.나는 프린트 될 거야");
		try {
			System.out.println("2.문제 발생 코드 >>"+10/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("에러 발생함");
			System.out.println(e.getMessage());
		}
		System.out.println("3.나는 과연 실행이 될까요???");

	}

}
