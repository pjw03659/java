package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000,800);
		f.setLayout(null);
		JButton[] buttons = new JButton[500];
		Random random=new Random();
		Color[] colors= {Color.red,Color.blue, Color.green, Color.gray, Color.yellow};
		for (int i = 0; i < buttons.length; i++) {
			int x=random.nextInt(1000);
			int y=random.nextInt(800);
			int z=random.nextInt(5);
			buttons[i]= new JButton("버튼 "+i);
			buttons[i].setBounds(x,y,100,50);
			buttons[i].setBackground(colors[z]);
			f.add(buttons[i]);
			
		}
		int z=random.nextInt(5);
		f.setBackground(Color.red);
		f.getContentPane().setBackground(Color.yellow);
		
		f.setVisible(true);

	}

}
