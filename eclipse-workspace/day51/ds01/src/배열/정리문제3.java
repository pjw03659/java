package 배열;



public class 정리문제3 {

	public static void main(String[] args) {
		String s1 ="참좋다";
		String s2 ="진짜좋다";
		
		if(s1.equals(s2)) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
		if(s1.length()> s2.length()) {
			System.out.println("s1의 글자수가 더 많습니다.");
		}else if(s1.length()== s2.length()) {
			System.out.println("s1과 s2의 글자수가 같습니다.");
		}else {
			System.out.println("s2의 글자수가 더 많습니다.");
		}
	}

}
