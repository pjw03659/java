package 프로그래머스기본;

public class 피자나눠먹기1 {
	public static void main(String[] args) {
		int n = 15;
		Solution2 sol = new Solution2();
		int answer = sol.solution(n);
		System.out.println(answer);
	}

}

class Solution2 {
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