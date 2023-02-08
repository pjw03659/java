package 연습문제;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		String id="root";
		String pw="1234";
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id_check=sc.next();
		System.out.print("패스워드 입력:");
		String pw_check=sc.next();
		if((id_check.equals(id))&&(pw_check.equals(pw))){
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		sc.close();
	}

}
