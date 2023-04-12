package 프로그래머스기본;

public class 피자나눠먹기3 {
	public static void main(String[] args) {
		int n = 12;
		int slice = 6;
		Solution3 sol = new Solution3();
		int answer = sol.solution(slice, n);
		System.out.println(answer);
	}

}

class Solution3 {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n<= slice) {
        	answer=1;
        }else if(n% slice==0) {
        	answer = n/ slice;
        }else {
        	answer = n / slice +1;
        }
        
        return answer;
    }
}