package 배열;

import java.util.Arrays;
import java.util.Scanner;


public class 정리문제 {

	public static void main(String[] args) {
		int[] numbers= new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]= sc.nextInt();
		}
		
		Arrays.sort(numbers);
		System.out.println("최솟값: "+ numbers[0]);
		System.out.println("최댓값: "+ numbers[4]);
		
		sc.close();
	}

}
