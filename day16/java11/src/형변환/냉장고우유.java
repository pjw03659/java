package 형변환;

import java.util.LinkedList;

public class 냉장고우유 {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("어제 상한 우유");
		milk.add("오늘 신선한 우유");
		milk.add("내일 더 신선한 우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}

}
