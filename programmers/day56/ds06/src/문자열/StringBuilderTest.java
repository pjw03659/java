package 문자열;

public class StringBuilderTest {
	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		
		System.out.println(s==s2);
		System.out.println(s.contentEquals(s2));
		
		s="haha";
		System.out.println(s==s2);
		System.out.println(s.contentEquals(s2));	
		
		String s3 =s.substring(2);
	}
}
