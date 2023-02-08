package 연습문제;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값을 입력하세요:");
		int start_num= sc.nextInt();
		System.out.print("종료값을 입력하세요:");
		int final_num= sc.nextInt();
		System.out.print("점프값을 입력하세요:");
		int jump_num= sc.nextInt();
		int i=0;
		int sum=0;
		for(i = start_num;i<=final_num ;i=i+jump_num) {
			sum=sum+i;
			if(sum>100) {
				break;
			}
		}
		System.out.println("결과값은 "+sum+"입니다.");
	}

}
