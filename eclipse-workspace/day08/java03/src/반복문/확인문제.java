package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(330, 350);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", 1, 45);

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		b1.setText("별 10개");
		b2.setText("커피*5");
		b3.setText("커피*우유*3");
		b4.setText("1:짱!");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		// 버튼에다가 액션기능을 추가하겠다고 설정
		// 클릭 액션이 있을때 어떤 부품이 액션처리를 어떻게 할지 코딩해주면 됌.
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String result="";
				for (int i = 0; i < 10; i++) {
					result=result+"*";
				}
				JOptionPane output= new JOptionPane();
				output.showMessageDialog(null, result);
				
			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String result="";
				for (int i = 0; i < 5; i++) {
					result=result+"커피*";
				}
				JOptionPane output= new JOptionPane();
				output.showMessageDialog(null, result);
			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String result="";
				for (int i = 0; i < 5; i++) {
					result=result+"커피*우유\n";
				}
				JOptionPane output= new JOptionPane();
				output.showMessageDialog(null, result);
			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String result="";
				for (int i = 0; i < 3; i++) {
					result=result+(i + 1) + ":짱!\n";
				}
				JOptionPane output= new JOptionPane();
				output.showMessageDialog(null, result);
			}
		});

		f.setVisible(true);
	}

}
