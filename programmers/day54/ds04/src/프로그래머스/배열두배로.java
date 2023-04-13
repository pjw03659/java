package 프로그래머스;

public class 배열두배로 {
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		Solution1 sol = new Solution1();
		int[] answer = sol.solution(n);
		System.out.println(answer);
	}

}

class Solution1 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
			answer[i]=numbers[i]*2;
		}
        
        
        return answer;
    }
}