package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		// 인덱스, 순서, 
		ArrayList list = new ArrayList();
		list.add("홍길동"); //Object <- String 자동형변환
		list.add(100); //Object <- Integer(랩퍼클래스,포장클래스) <- int (오토박싱)
		list.add(11.2); //Object <- Double <- double
		list.add(new JButton());
		
		String name =(String)list.get(0);
		int age = (Integer)list.get(1);
		
		
		
	}

}
