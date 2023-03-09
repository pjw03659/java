package DB_connet;

import java.util.Scanner;

public class 게시판글수정하기 {

	public static void main(String[] args) {
		//입력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 게시글의 no/content 순으로 입력하세요.");

		int no = sc.nextInt();
		String content =sc.next();
		
		
		MemberDAO_BBS dao = new MemberDAO_BBS();
		dao.update(no,content);
		

	}

}
