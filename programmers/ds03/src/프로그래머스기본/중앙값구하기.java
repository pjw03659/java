package 프로그래머스기본;

import java.util.Arrays;

public class 중앙값구하기 {
	public static void main(String[] args) {
		int[] n = {5,2,1,9,11,15,17};
		Solution6 sol = new Solution6();
		int answer = sol.solution(n);
		System.out.println(answer);
	}

}

class Solution6 {
    public int solution(int[] n) {
        int answer = 0;
        Arrays.sort(n);
        String s = Arrays.toString(n);
        System.out.println(s);
        System.out.println(n[n.length/2]);
        return answer;
    }
}