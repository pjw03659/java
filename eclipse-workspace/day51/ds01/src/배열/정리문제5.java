package 배열;


public class 정리문제5 {

	public static void main(String[] args) {
		String s4 ="2056521";
		
		char result= s4.charAt(0);
		
		if(result=='1'||result=='3') {
			System.out.println("남자입니다.");
		}else if(result=='2'||result=='4') {
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}

}
