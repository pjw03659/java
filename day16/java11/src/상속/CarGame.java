package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	public static void main(String[] args) {
		CarGame f = new CarGame();

	}
	
	
	public CarGame(){
		setTitle("나의 자동차게임");
		setSize(700,450);
		setLayout(null);
		
		MyThread car1 =new MyThread("car01.png",100,0);
		MyThread car2 =new MyThread("car02.png",100,150);
		MyThread car3 =new MyThread("car03.png",100,300);
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}
		
	
	public class MyThread extends Thread{
		int x, y;
		JLabel label;
		
		public MyThread(String file, int x, int y) {
			this.x=x;
			this.y=y;
			ImageIcon icon = new ImageIcon(file);
			label=new JLabel();
			label.setIcon(icon);
			label.setBounds(x,y,150,100);
			add(label);
			
		}
		
		
		
		
		@Override
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50);
				x = x + move;
				label.setBounds(x, y, 150, 100);
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
