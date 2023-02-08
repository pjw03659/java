package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		int full=0, nofull=0;
		
		for(int i=0; i<10; i++) {
			String reply= JOptionPane.showInputDialog("배가 부른가요? (배가 부르면 1, 배가 안부르면 2)");
			switch(reply) {
			case "1":
				full++;
				break;
			case "2":
				nofull++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,이나 2를 입력하세요");
				i--;
				break;
			}
		}
		JOptionPane.showMessageDialog(null,"배부른 사람은 "+full+"명, 안배부른 사람은 "+nofull+"명 입니다.");

	}

}
