package 연습문제;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class myThread extends Thread {
	int x, y;
	JLabel label;
	
	public myThread(String file, int x, int y) {
		this.x=x;
		this.y=y;
		ImageIcon icon = new ImageIcon(file);
		label=new JLabel();
		label.setIcon(icon);
		label.setBounds(x,y,100,100);
		
	}
	
	
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			int move = 50;
			x = x + move;
			label.setBounds(x, y, 100, 100);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(x>600) {
			for (int i = 0; i < 10; i++) {
				int move = 50;
				x = x - move;
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}

