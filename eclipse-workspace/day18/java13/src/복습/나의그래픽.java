package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 200);
		JButton b = new JButton("나를 눌러");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었음.");
				
			}
		});
		f.add(b);
		
		f.setVisible(true);
		
	}

}
