package 프로그래머스;

import java.util.Scanner;

public class 배열의평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Solution sol = new Solution();
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		
		double answer = sol.solution(numbers); //int
		System.out.println(answer);
		sc.close();
	}
}

class Solution{
	public double solution(int[] numbers) {
		double answer=0;
		int size = numbers.length;
		int sum =0;
		for(int x:numbers) {
			sum=sum+x;
		}
		answer=(double)sum/size;
		return answer;
	}
}