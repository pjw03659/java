package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000,800);
		JButton[] buttons =new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i]= new JButton("버튼 "+i);
		}
		
		f.setLayout(null);
		Random random = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x =random.nextInt(1000);
			int y =random.nextInt(800);
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);
		}
		f.setVisible(true);

	}

}
