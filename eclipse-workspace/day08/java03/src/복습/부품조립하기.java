package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class 부품조립하기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l = new JLabel(); //윗글자
		l.setText("당신이 생각한 숫자를 입력하세요.");
		
		JTextField text = new JTextField(20);
		text.setText("숫자를 입력하세요");
		JButton b = new JButton(); //버튼
		b.setText("숫자 맞추기 게임");
		Font font = new Font("D2Coding", 1, 20);
		
		l.setFont(font);
		l.setForeground(Color .CYAN);
		text.setFont(font);
		b.setBackground(Color .darkGray);
		b.setForeground(Color .white);
	
		
		f.add(l);
		f.add(text);
		f.add(b);
		
		f.setVisible(true);

	}

}
