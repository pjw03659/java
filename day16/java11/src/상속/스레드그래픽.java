package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame{

	JLabel count, image, time;
	public static void main(String[] args) {
		스레드그래픽 f = new 스레드그래픽();
		
	}
	public 스레드그래픽() {
		setTitle("내 스레드 그래픽");
		setSize(500,250);
		setVisible(true);
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding",Font.BOLD,30);
		setLayout(flow);
		getContentPane().setBackground(Color.green);
		ImageIcon icon = new ImageIcon("1.png");
		count = new JLabel("카운터");
		image = new JLabel(icon);
		time = new JLabel("시분초");
		
		count.setFont(font);
		time.setFont(font);
		
		count_Thread2 count2= new count_Thread2();
		image_Thread2 image2= new image_Thread2();
		timer_Thread2 timer2 = new  timer_Thread2();
		
		
		add(count);
		add(image);
		add(time);
		
		count2.start();
		image2.start();
		timer2.start();
		
		
		
	}
	
	public class count_Thread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트>> "+i);
				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김");
				}
			}
			
		}
	}

	public class image_Thread2 extends Thread {
		
		
		@Override
		public void run() {
			String[] images= {"1.png","2.png","3.png","4.png","5.png"};
			
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				if(i==4) {
					i=-1;
				}
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김");
				}
			}
			
		}
	}
	public class timer_Thread2 extends Thread {
		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date= new Date();
				
				time.setText("타이머>> "+date);
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김");
				}
			}
			
		}
	}

}
