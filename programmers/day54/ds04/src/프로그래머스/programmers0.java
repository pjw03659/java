package 프로그래머스;

public class programmers0 {
	public static void main(String[] args) {
		int n = 15;
		Solution0 sol = new Solution0();
		int answer = sol.solution(n);
		System.out.println(answer);
	}

}

class Solution0 {
    public int solution(int n) {
        int answer = 0;
        if(n%7==0){
            answer= n/7;
        }else {
            answer= n/7 +1;
        }
        
        return answer;
    }
}