package 배열;

import java.util.Random;

public class 배열최댓값구하기2 {

	public static void main(String[] args) {
		int[] n = new int[1000];
		Random r = new Random(99);
		
		for (int i = 0; i < n.length; i++) {
			n[i]= r.nextInt(999);
		}
		
		int max=n[0];
		
		for (int i = 0; i < n.length; i++) {
			if(max<n[i]) {
				max=n[i];
			}
		}
		
		System.out.println("최댓값은 "+ max);
	}

}
