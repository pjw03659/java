package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r = new Random();
		int target = r.nextInt(100);
		int count =0;
		while(true) {
			System.out.print("생각한 값 입력:");
			int data =sc.nextInt();
			count++;
			if(data==target) {
				System.out.println("정답 입니다.");
				System.out.println("시도한 횟수: "+count);
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("오답입니다.");
				if(data>target) {
					System.out.println("숫자가 너무 큽니다. Down!");
				} else {
					System.out.println("숫자가 너무 작습니다. UP!");
				}
			}
		}
		sc.close();
	}

}
