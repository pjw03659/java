package 프로그래머스;

import java.util.Arrays;

public class 배열뒤집기 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		Solution2 sol = new Solution2();
		int[] answer = sol.solution(numbers);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution2 {
    public int[] solution(int[] num_list) {
    	int[] answer = new int[num_list.length];
    	int j = num_list.length - 1; //마지막 index부터 시작 
		for(int i = 0; i < num_list.length; i++) {
			answer[j] = num_list[i];
			j--;
		}
        return answer;
    }}