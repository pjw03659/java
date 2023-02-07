package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기1 {

	public static void main(String[] args) {
		//자주 사용하지 않는 부품을 만들어보자
		//틀!이 있어서 그 틀을 가지고 찍어서
		//new: 틀을 가지고 찍어낼때 사용
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b1= new JButton();
		b1.setText("나는 버튼1");
		
		f.add(b1);
		
		f.setVisible(true);
	}

}
