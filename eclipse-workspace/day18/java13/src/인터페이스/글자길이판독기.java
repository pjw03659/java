package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("문자판독기");
		f.setSize(400, 400);
		f.setLayout(new FlowLayout());
		Font font = new Font("D2Coding",Font.BOLD,20);
		
		JLabel label = new JLabel("문장을 넣으세요");
		JTextArea area = new JTextArea(5,10);
		JButton b1 = new JButton("글자수 카운트");
		JButton b2 = new JButton("글배경색바꾸기");
		JButton b3 = new JButton("글자색바꾸기");
		JButton b4 = new JButton("리셋");
		label.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText();
				JOptionPane.showMessageDialog(f, "글자수는 " + text.length()+"입니다.");
				area.setText(" ");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.yellow);
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.red);
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText(null);
				area.setBackground(Color.white);
				area.setForeground(null);
				
			}
		});
		
		f.add(label);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setVisible(true);

	}

}
