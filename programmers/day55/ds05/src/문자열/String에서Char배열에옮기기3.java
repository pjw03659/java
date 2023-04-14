package 문자열;
import java.util.*;

public class String에서Char배열에옮기기3 {
	public static void main(String[] args) {
		String sno= "2056521";
		char c1=sno.charAt(sno.length()-1);
		if(c1=='1') {
			System.out.println("서대문구 출생");
		}else {
			System.out.println("다른 구 출생");
		}
		char c2 =sno.charAt(4);
		char c3 =sno.charAt(5);
		int val = (int)(c2-'0')+ (int)(c3-'0');
		System.out.println(val);
		if(val<10) {
			System.out.println("유효한 주민번호");
		}else {
			System.out.println("유효하지 않은 주민번호");
		}
		String[] stringArray = sno.split("");
		int count=0;
		for(String s: stringArray) {
			if(s.equals("5")) {
				count++;
			}
		}
		System.out.println(count);

		int count2=0;
		for (int i = 0; i < stringArray.length; i++) {
			char c=sno.charAt(i);
			if(c=='5') {
				count2++;
			}
		}
		System.out.println(count2);
	}
}
	