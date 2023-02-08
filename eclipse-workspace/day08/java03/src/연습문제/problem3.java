package 연습문제;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값을 입력하세요:");
		int start_num= sc.nextInt();
		System.out.print("종료값을 입력하세요:");
		int final_num= sc.nextInt();
		int i=0;
		int sum=0;
		for(i = start_num;i<=final_num ;i++) {
			sum=sum+i;
		}
		System.out.println("시작값부터 종료값을 더하면 "+sum+"입니다.");
	}

}
