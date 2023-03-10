package DB_connet;

import java.util.Scanner;

public class 상품등록 {

	public static void main(String[] args) {
		//입력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("id/name/content 순으로 입력하세요.");

		String id =sc.next();
		String name =sc.next();
		String content =sc.next();
		
		ProductDAO dao = new ProductDAO();
		//1.가방 만들기
		ProductVO bag = new ProductVO();
		
		//2.가방에 데이터를 넣는다
		bag.setId(id);
		bag.setName(name);
		bag.setContent(content);
		
		//3.가방 전달
		dao.insert(bag);
		

	}

}
