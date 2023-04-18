package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = {3, 4, 5, 1, 2};
		int k=5;
		
		Arrays.sort(num);
		
		int answer =0;
		answer = num[num.length-k];
		System.out.println(answer);
	}

}
