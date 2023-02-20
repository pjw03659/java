package 연습문제;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class galaga extends JFrame {

	public static void main(String[] args) {
		galaga g = new galaga();

	}

	public galaga() {
		setTitle("Galaga");
		setSize(2000, 1000);
		setLayout(null);
		getContentPane().setBackground(Color.black);

		myThread g1 = new myThread("111.png", 0, 400);
		myThread g2 = new myThread("111.png", 100, 400);
		myThread g3 = new myThread("111.png", 200, 400);
		myThread g4 = new myThread("111.png", 300, 400);
		myThread g5 = new myThread("111.png", 400, 400);
		myThread g6 = new myThread("111.png", 500, 400);
		myThread g7 = new myThread("111.png", 600, 400);
		myThread g8 = new myThread("111.png", 700, 400);
		myThread g9 = new myThread("111.png", 800, 400);
		myThread g10 = new myThread("111.png", 900, 400);

		g1.start();
		g2.start();
		g3.start();
		g4.start();
		g5.start();
		g6.start();
		g7.start();
		g8.start();
		g9.start();
		g10.start();
		myThread g11 = new myThread("111.png", 0, 300);
		myThread g22 = new myThread("111.png", 100, 300);
		myThread g33 = new myThread("111.png", 200, 300);
		myThread g44 = new myThread("111.png", 300, 300);
		myThread g55 = new myThread("111.png", 400, 300);
		myThread g66 = new myThread("111.png", 500, 300);
		myThread g77 = new myThread("111.png", 600, 300);
		myThread g88 = new myThread("111.png", 700, 300);
		myThread g99 = new myThread("111.png", 800, 300);
		myThread g100 = new myThread("111.png", 900, 300);
		
		g11.start();
		g22.start();
		g33.start();
		g44.start();
		g55.start();
		g66.start();
		g77.start();
		g88.start();
		g99.start();
		g100.start();
		
		myThread g111 = new myThread("222.png", 200, 200);
		myThread g222 = new myThread("222.png", 300, 200);
		myThread g333 = new myThread("222.png", 400, 200);
		myThread g444 = new myThread("222.png", 500, 200);
		myThread g555 = new myThread("222.png", 600, 200);
		myThread g666 = new myThread("222.png", 700, 200);
		
		g111.start();
		g222.start();
		g333.start();
		g444.start();
		g555.start();
		g666.start();
		
		myThread g1111 = new myThread("222.png", 200, 100);
		myThread g2222 = new myThread("222.png", 300, 100);
		myThread g3333 = new myThread("222.png", 400, 100);
		myThread g4444 = new myThread("222.png", 500, 100);
		myThread g5555 = new myThread("222.png", 600, 100);
		myThread g6666 = new myThread("222.png", 700, 100);
		
		
		g1111.start();
		g2222.start();
		g3333.start();
		g4444.start();
		g5555.start();
		g6666.start();
		myThread g11111 = new myThread("333.png", 300, 0);
		myThread g22222 = new myThread("333.png", 400, 0);
		myThread g33333 = new myThread("333.png", 500, 0);
		myThread g44444 = new myThread("333.png", 600, 0);
		
		
		
		g11111.start();
		g22222.start();
		g33333.start();
		g44444.start();
		myThread g00 = new myThread("444.png", 500, 650);
		g00.start();

		
		setVisible(true);

	}

	public class myThread extends Thread {
		int x, y;
		JLabel label;

		public myThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 0, 0);
			add(label);
		}

		@Override
		public void run() {
			while (true) {
				
					for (int i = 0; i < 6; i++) {
						int move = 100;
						x = x + move;
						label.setBounds(x, y, 100, 100);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
					y = y + 100;
				
				
					for (int i = 0; i < 6; i++) {
						int move = 100;
						x = x - move;
						label.setBounds(x, y, 100, 100);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				
					y=y+100;
			}
		}
	}

}
