package 배열;

import java.util.Arrays;
import java.util.Random;


public class 정리문제2 {

	public static void main(String[] args) {
		int[] numbers= new int[20];
		Random r = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]= r.nextInt(900);
		}
		Arrays.sort(numbers);
		System.out.println("최댓값: "+ numbers[19]);
	}

}
