package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원가입 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(330, 600);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel text1 = new JLabel();
		text1.setText("아이디 입력");
		JLabel text2 = new JLabel();
		text2.setText("패스워드 입력");
		JLabel text3 = new JLabel();
		text3.setText("이름입력");
		JLabel text4 = new JLabel();
		text4.setText("전화번호 입력");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		JButton b1 = new JButton();
		Font font = new Font("D2Coding",1,30);
		
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		input3.setFont(font);
		input4.setFont(font);
		b1.setText("회원가입 처리");
		b1.setFont(font);
		
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id= input1.getText();
				String pw= input2.getText();
				String name= input3.getText();
				String phone= input4.getText();
				JOptionPane.showMessageDialog(f, "아이디: "+id+
												 "\n비밀번호: "+pw+
												 "\n이름: "+name+
												 "\n전화번호: "+phone);
				
				
			}
		});
		
		
		
		f.setVisible(true);

	}
	
}