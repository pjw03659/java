package 프로그래머스;

import java.util.Arrays;

public class 배열의연산4 {
	//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 	90
	//{1, 2, 3, 4, 5, 9, 10} 			90
	//{-30, -20, 3, 4, 5, 9, 10}		600
	//두 수를 곱했을 때 가장 큰 숫자.
	//배열이 오름차순으로 정렬이 되어 있는 상태!
	
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		//int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numbers = {4, 3, 2, 7, 5, 10, 8, 9};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution6 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		int answer = numbers[numbers.length-2]
					*numbers[numbers.length-1];
		
		
		
		return answer;
	}
}
