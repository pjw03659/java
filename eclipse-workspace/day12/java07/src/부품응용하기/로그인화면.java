package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {
	public static void main(String[] args) {
		//font, flow
		//jframe, imageicon, imagelabel
		//idlabel, pwlabel, id입력값, pw입력값
		//로그인 버튼, reset버튼
		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(500, 700);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.green);
		
		Font font = new Font("D2coding",1,30);
	
		JLabel top = new JLabel();
		JLabel id = new JLabel("아    이     디");
		JLabel pw = new JLabel("패  스  워  드");
		id.setFont(font);
		pw.setFont(font);
		
		
		
		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		top.setIcon(icon1);
		
		
		
		JTextField idText = new JTextField(15);		
		JTextField pwText = new JTextField(15);	
		idText.setFont(font);
		pwText.setFont(font);
		
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				if((id2.equals("root"))&&(pw2.equals("1234"))){
					JOptionPane.showMessageDialog(f, "로그인 성공!");
					일기장쓰기 diary =new 일기장쓰기();
					diary.open();
					f.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패!");
				}
				
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				idText.setText("");
				pwText.setText("");
				
			}
		});
		
		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login); f.add(reset);
		
		
		
		
		f.setVisible(true);
	}
}
