package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		int iu=0, newJeans=0, bts=0;
		
		for(int i=0; i<10; i++) {
			String reply= JOptionPane.showInputDialog("인기투표!! (1:아이유, 2:뉴진스, 3:BTS)");
			switch(reply) {
			case "1":
				iu++;
				break;
			case "2":
				newJeans++;
				break;
			case "3":
				bts++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2또는 3을 입력하세요");
				i--;
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "아이유:"+iu+"명\n"+"뉴진스:"+newJeans+"명\n"+"BTS:"+bts+"명\n","인기투표 결과!",JOptionPane.INFORMATION_MESSAGE);
		
		

	}

}
