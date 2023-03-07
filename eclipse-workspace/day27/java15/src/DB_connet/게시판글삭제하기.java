package DB_connet;

import java.util.Scanner;

public class 게시판글삭제하기 {

	public static void main(String[] args) {
		//입력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 게시글의 no를 입력하세요.");

		int no = sc.nextInt();
		
		
		MemberDAO_BBS dao = new MemberDAO_BBS();
		dao.delete(no);
		

	}

}
