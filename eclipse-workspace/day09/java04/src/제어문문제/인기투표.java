package 제어문문제;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
		int iu=0, newJeans=0, bts=0;
		System.out.println("인기투표 시스템");
		System.out.println("==========");
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >>");
			int data=sc.nextInt();//1,2,3,4 응답
			if(data==4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			switch(data) {
			case 1:
				iu++;
				break;
			case 2:
				bts++;
				break;
			case 3:
				newJeans++;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 1,2,3,4 중 하나로 입력해주세요");
				break;
			}
		}
		System.out.println("-----------");
		System.out.println("아이유: "+iu+"명");
		System.out.println("BTS: "+bts+"명");
		System.out.println("newJeans: "+newJeans+"명");
		System.out.println("-----------");
		sc.close();
	}

}
