package 배열복습;

public class 스트링과배열3 {
	public static void main(String[] args) {
		String s = "    010-245-1234   ";
		s=s.trim();
		String[] s1= s.split("-");
		if(s1[0].equals("011")) {
			System.out.println("SK");
		}else if(s1[0].contentEquals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		if(s1[1].length()>=4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		String num = s1[0]+s1[1]+s1[2];
		if(num.length()>=10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}
	}
}
