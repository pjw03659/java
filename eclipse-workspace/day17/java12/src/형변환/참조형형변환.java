package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add(100);
		list.add(11.22);
		list.add(new JButton ("나는 버튼"));
		
		String name = (String)list.get(0);
		
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		
		int age = (Integer)list.get(1);
		System.out.println(age+1);
		
		double jumsu =(Double)list.get(2);
		System.out.println(jumsu+10);
		
		//JButton b = (Jbutton)list.get(3);
		//b.setText("나는 진짜 버튼");
	}

}
