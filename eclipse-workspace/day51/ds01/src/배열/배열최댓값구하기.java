package 배열;


import java.util.Arrays;
import java.util.Random;

public class 배열최댓값구하기 {

	public static void main(String[] args) {
		int[] n = new int[10];
		Random r = new Random(100);
		
		for (int i = 0; i < n.length; i++) {
			n[i]= r.nextInt(1000);
		}
		
		Arrays.sort(n);
		
		System.out.println("최댓값은 "+ n[9]);
		System.out.println("최댓값은 "+ n[0]);
	}

}
