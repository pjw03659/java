package 연습문제;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사과 구매 갯수 입력:");
		int apple_count=sc.nextInt();
		System.out.print("사과 한 개당 가격 입력:");
		int apple_amount=sc.nextInt();
		System.out.print("딸기 구매 갯수 입력:");
		int berry_count=sc.nextInt();
		System.out.print("딸기 한 개당 가격 입력:");
		int berry_amount=sc.nextInt();
		System.out.println("-------------");
		int total_apple= apple_count * apple_amount;
		int total_berry= berry_count * berry_amount;
		int total= total_apple + total_berry;
		System.out.println("사과 구매 가격은 "+total_apple+"입니다.");
		System.out.println("딸기 구매 가격은 "+total_berry+"입니다.");
		System.out.println("전체 구매 가격은 "+total+"입니다.");
		sc.close();
	}

}
