package 문자열;
import java.util.*;

public class String에서Char배열에옮기기2 {
	public static void main(String[] args) {
		String s= "s205621";
		char c1 =s.charAt(3);
		char c2 =s.charAt(4);
		
		String s2 =String.valueOf(c1)+String.valueOf(c2);
		System.out.println(s2);

		System.out.println(s.substring(3,5));
		
		char[] result = new char[2];
		s.getChars(3, 5, result, 0);
		System.out.println(Arrays.toString(result));
		
		char[] result2 = new char[s.length()];
		s.getChars(0, s.length(), result2, 0);
		System.out.println(Arrays.toString(result2));
		
		String[] all = s.split("");
		System.out.println(Arrays.toString(all));
	}
}
	