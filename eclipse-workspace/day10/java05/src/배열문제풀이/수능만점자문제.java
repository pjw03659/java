package 배열문제풀이;

import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jumsu= new int[10000];
		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i]= r.nextInt(451);
		}
		
		int max_count=0;
		int min_count=0;
		int total=0;
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i]==0) {
				min_count++;
			}
			if(jumsu[i]==450) {
				max_count++;
			}
			total=total+jumsu[i];
		}
		double avg= (double)total/10000;
		int avg_50=0;
		System.out.println("만점자:" +max_count+"명 입니다.");
		System.out.println("0점:" +min_count+"명 입니다.");
		System.out.println("평균:" +avg+"점 입니다.");
		for (int i = 0; i < jumsu.length; i++) {
			if((jumsu[i]<=(avg+50))&&(jumsu[i]>=(avg-50))) {
				avg_50++;
			}
		}
		System.out.println("평균 +-50점인 학생은 "+avg_50+"명 입니다.");
	}

}
