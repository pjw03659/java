package 형변환;

import java.util.ArrayList;
import java.util.List;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		//많은 양의 데이터를 다루는 부품류를 콜렉션이라 함 
		//종류가 많다.
	
		//배열+사이즈조절+타입 아무거나 넣을 수 있는 ArrayList
		ArrayList list = new ArrayList(); //참조형 변수
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
	
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		//중간에 삽입
		list.add(0,"김길동");
		System.out.println(list);
		//제거
		list.remove(0); //파괴함수
		System.out.println(list);
		
		
		
	}
	

}
