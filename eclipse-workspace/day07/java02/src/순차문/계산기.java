package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함.
		//FlowLayout
		FlowLayout flow = new FlowLayout(); 
		//f에 배치해주는 부품을 쓰겠다고 조립.(설정)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		ImageIcon icon = new ImageIcon("cal.jpg");
		
		JLabel img1 = new JLabel(icon);
		
		JLabel text1 = new JLabel();
		text1.setText("숫자1");
		JLabel text2 = new JLabel();
		text2.setText("숫자2");
		
		JTextField input1 = new JTextField(25);
		input1.setText("");
		JTextField input2 = new JTextField(25);
		input2.setText("");
		
		Font font =new Font("함초롱바탕", 1, 30);
		text1.setFont(font);
		input1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);		
		
		b1.setBackground(Color.blue);//배경색
		b1.setForeground(Color.yellow);//글자색
		b2.setBackground(Color.blue);//배경색
		b2.setForeground(Color.yellow);//글자색
		b3.setBackground(Color.blue);//배경색
		b3.setForeground(Color.yellow);//글자색
		b4.setBackground(Color.blue);//배경색
		b4.setForeground(Color.yellow);//글자색
		
		input1.setBackground(Color.yellow);//배경색
		input1.setForeground(Color.black);//글자색
		input2.setBackground(Color.yellow);//배경색
		input2.setForeground(Color.black);//글자색
		
		
		f.add(img1);
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		f.setVisible(true);
	}
}
