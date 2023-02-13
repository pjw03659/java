package 배열복습;

import java.util.Random;

public class 토익채점문제 {

	public static void main(String[] args) {
		int[] answer=new int[990];
		int[] my_answer=new int[990];
		int score=0;
		Random r = new Random(42);
		
		System.out.println("번호 : \t답안\t내답");
		for (int i = 0; i < answer.length; i++) {
			answer[i]=r.nextInt(4)+1;
			my_answer[i]=r.nextInt(4)+1;
			System.out.println(i+" : \t"+answer[i]+"  <->  "+my_answer[i] );
			if(answer[i]==my_answer[i]){
				score++;
			}
		}
		System.out.println("내 점수는 "+score+"점 입니다.");
	}

}
