package 프로그래머스기본;

public class 양꼬치 {
	public static void main(String[] args) {
		int n = 64;
		int k = 6;
		Solution1 sol = new Solution1();
		int answer = sol.solution(n, k);
		System.out.println(answer);
	}

}

class Solution1 {
	public int solution(int n, int k) {
		int answer = 0;
		int total=0;
		total = n*12000+k*2000-(n/10)*2000;
		answer=total;
		
		return answer;
	}
}