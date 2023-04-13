package 컬렉션;
import java.util.*;
public class 배열과컬렉션변환 {

	public static void main(String[] args) {
		int[] s = {5,2,1,9,11,15,17};
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		intPrint(s);
		
		String[] s2 = { "aaa","bbb","ccc"};
		stringPrint(s2);
		
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
		
		System.out.println(list.indexOf("ccc"));
		
		System.out.println(list.lastIndexOf("aaa"));

		list.set(2,"ggg");
		
		System.out.println(list);
		
		
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
