package 프로젝트_11조;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login_UI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,700);
		f.setTitle("로그인 화면");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("D2Coding",Font.BOLD,40);
		Font font2 = new Font("D2Coding",Font.BOLD,80);
	
		
		JLabel l1 = new JLabel("아이디");
		JLabel l2 = new JLabel("패스워드");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		
		JButton b1 = new JButton("로그인");
		JButton b2 = new JButton("회원 가입");
		JButton b3 = new JButton("회원 탈퇴");
		
		
		
		
		
		
		l1.setFont(font1);
		l2.setFont(font1);
		t1.setFont(font1);
		t2.setFont(font1);
		b1.setFont(font2);
		b2.setFont(font1);
		b3.setFont(font1);
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		
		
		
	
		
		f.setVisible(true);
	}

}
