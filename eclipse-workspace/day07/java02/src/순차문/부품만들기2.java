package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함.
		//FlowLayout
		FlowLayout flow = new FlowLayout(); 
		//f에 배치해주는 부품을 쓰겠다고 조립.(설정)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		JButton b2 = new JButton();
		b2.setText("나는 버튼2");
		
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		JTextField input1 = new JTextField(10);
		input1.setText("10자 이내로");
		JTextField input2 = new JTextField(10);
		input2.setText("10자 이내로");
		
		Font font =new Font("궁서", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		b1.setBackground(Color.red);//배경색
		b1.setForeground(Color.white);//글자색
		b2.setBackground(Color.red);//배경색
		b2.setForeground(Color.white);//글자색
		input1.setBackground(Color.red);//배경색
		input1.setForeground(Color.white);//글자색
		input2.setBackground(Color.red);//배경색
		input2.setForeground(Color.white);//글자색
		
		ImageIcon icon = new ImageIcon("flag.jpg");
		ImageIcon icon2 = new ImageIcon("grape.jpg");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		
		f.setVisible(true);
	}
}
