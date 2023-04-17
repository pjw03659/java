package 문자열;

public class 김서방찾기 {

	public static void main(String[] args) {
		String[] seoul= {"Jane","Kim"};
		Solution1 sol = new Solution1();
		String answer =sol.solution(seoul);
		System.out.println(answer);
	}
}
class Solution1 {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                answer="김서방은 "+i+"에 있다";
            }
        }
        
        return answer;
    }
}