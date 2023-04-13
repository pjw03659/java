package 프로그래머스;

import java.util.Arrays;

public class 짝수는싫어요 {
	public static void main(String[] args) {
		int n = 10;

		Solution3 sol = new Solution3();
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution3 {
    public int[] solution(int n) {
    	 int size=0;
         if(n%2==0){
             size=n/2;
         } else {
             size=n/2+1;
         }
         
         int[] answer = new int[size];
         int number=0;
         for(int i=1; i<=n;i++){
             if(i%2!=0){
                 answer[number]=i;
                 number++;
             }
         }
         return answer;
    }}