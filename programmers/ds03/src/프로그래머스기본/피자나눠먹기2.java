package 프로그래머스기본;

public class 피자나눠먹기2 {
	public static void main(String[] args) {
		int n = 4;
		int slice = 6;
		Solution4 sol = new Solution4();
		int answer = sol.solution(slice, n);
		System.out.println(answer);
	}

}

class Solution4 {
    public int solution(int slice, int n) {
    	int answer = 0;
        int max=0;
        for(int i=1; i<=slice && i<=n ; i++) {
        	if(slice % i ==0 && n % i ==0) {
        		max=i;
        	}
        }
        answer = (slice*n)/max;
        
        return answer;
    }
}