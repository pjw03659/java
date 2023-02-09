package 복습;

import java.util.Scanner;

public class 제어문정리 {

	public static void main(String[] args) {
		//1번 문제
//		String id="root";
//		String pw="1234";
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디 입력:");
//		String id_check=sc.next();
//		System.out.print("패스워드 입력:");
//		String pw_check=sc.next();
//		if((id_check.equals(id))&&(pw_check.equals(pw))){
//			System.out.println("로그인 성공!");
//		} else {
//			System.out.println("로그인 실패!");
//		}
//		sc.close();
//	
	
		//2번 문제
//		
//		System.out.print("사과 구매 갯수 입력:");
//		int apple_count=sc.nextInt();
//		System.out.print("사과 한 개당 가격 입력:");
//		int apple_amount=sc.nextInt();
//		System.out.print("딸기 구매 갯수 입력:");
//		int berry_count=sc.nextInt();
//		System.out.print("딸기 한 개당 가격 입력:");
//		int berry_amount=sc.nextInt();
//		System.out.println("-------------");
//		int total_apple= apple_count * apple_amount;
//		int total_berry= berry_count * berry_amount;
//		int total= total_apple + total_berry;
//		System.out.println("사과 구매 가격은 "+total_apple+"입니다.");
//		System.out.println("딸기 구매 가격은 "+total_berry+"입니다.");
//		System.out.println("전체 구매 가격은 "+total+"입니다.");
//		sc.close();
	
		//3번 문제
		
//		
//		System.out.print("시작값을 입력하세요:");
//		int start_num= sc.nextInt();
//		System.out.print("종료값을 입력하세요:");
//		int final_num= sc.nextInt();
//		int i=0;
//		int sum=0;
//		for(i = start_num;i<=final_num ;i++) {
//			sum=sum+i;
//		}
//		System.out.println("시작값부터 종료값을 더하면 "+sum+"입니다.");
//		sc.close();
	 
	
		//4번문제
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



