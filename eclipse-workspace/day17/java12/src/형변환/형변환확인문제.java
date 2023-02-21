package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		System.out.println(me);
		int money = (Integer)me.get(0);
		System.out.println(money+2000);
		
		double height = (Double)me.get(1);
		System.out.println(height+10);
		
		boolean breakfast = (Boolean)me.get(2);
		if(breakfast==true) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		char gender = (char)me.get(3);
		if(gender=='남') {
			System.out.println("주민번호는 1, 3이에요");
		}else {
			System.out.println("주민번호는 2, 4이에요");
		}
	}

}
