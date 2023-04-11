package 프로그래머스;

public class 배열의연산3 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution4 {
	public int solution(int[] numbers) {
		int answer = 0;
		answer = numbers[9]+numbers[8]+numbers[7];
		return answer;
	}
}
