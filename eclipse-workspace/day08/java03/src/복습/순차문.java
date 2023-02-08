package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x1= JOptionPane.showInputDialog("숫자를 입력하세요.1");
		String y1= JOptionPane.showInputDialog("숫자를 입력하세요.2");
		
		int x = Integer.parseInt(x1);
		int y = Integer.parseInt(y1);
		
		System.out.println((double)x/y);	
	}

}
