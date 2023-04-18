package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;

public class K번째큰수_문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[size];
		for(int i=0; i< size; i++) {
			num[i]=sc.nextInt();
		}
		
		Arrays.sort(num);
		
		int answer =0;
		answer = num[num.length-k];
		System.out.println(answer);
	}

}
