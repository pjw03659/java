package 반복문;

import javax.swing.JOptionPane;

public class for2 {

	public static void main(String[] args) {
		for(;;) {//무한루프
			System.out.println("잘쓰지 않음");
			String data = JOptionPane.showInputDialog("종료할까요? y를 입력");
			if(data.equals("y")) {
				System.out.println("안녕히가세요!!");
				break;
			}
		}
		

	}

}
