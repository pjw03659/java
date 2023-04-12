package 프로그래머스기본;

import java.util.*;

public class 문자열길이배열로 {

	public static void main(String[] args) {
		String[] strlist = { "I", "Love", "Programmers." };

		Solution9 sol = new Solution9();
		int[] answer = sol.solution(strlist);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution9 {
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		for(int i=0; i<strlist.length;i++) {
			answer[i]=strlist[i].length();
		}
		
		return answer;
	}
}