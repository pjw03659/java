package 상속;

import java.util.Date;

public class timer_Thread extends Thread {
	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			Date date= new Date();
			
			System.out.println("타이머>> "+date);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		}
		
	}
}
