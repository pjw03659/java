package 화면;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바db연결.BbsVO;
import 자바db연결.Bbs_DAO;

public class BBS_UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(500, 1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel("게시판 id");
		JLabel l2 = new JLabel("게시판 제목");
		JLabel l3 = new JLabel("게시판 내용");
		JLabel l4 = new JLabel("작성자");

		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
	

		JButton b1 = new JButton("게시물 작성 완료");
		JButton b2 = new JButton("게시물 삭제 완료");
		JButton b3 = new JButton("게시물 검색 완료");
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 검색");
				int no2 = Integer.parseInt(t1.getText());

				Bbs_DAO dao = new Bbs_DAO();
				BbsVO bag = dao.one(no2);
				
				if (bag != null) {
					t2.setText(bag.getTitle());
					t3.setText(bag.getWriter());
					t4.setText(bag.getContent());
					t2.setBackground(Color.pink);
					t3.setBackground(Color.pink);
					t4.setBackground(Color.pink);
				} else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					JOptionPane.showMessageDialog(f, "검색결과없음");
				}
			} 
		});

		
		Font font = new Font("D2Coding",Font.BOLD,50);
		//필요한 객체 준비 완료
		
		f.add(l1); f.add(t1);
		f.add(l2); f.add(t2);
		f.add(l3); f.add(t3);
		f.add(l4); f.add(t4);
		f.add(b1); 
		f.add(b2);
		f.add(b3);
		
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		t1.setBackground(Color.yellow);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.blue);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.blue);
		
		b1.setBackground(Color.pink); 
		b1.setForeground(Color.red); 
		b2.setBackground(Color.pink);
		b2.setForeground(Color.red);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.red);
		
		
		f.getContentPane().setBackground(Color.green);
		
		f.setVisible(true);
	}

}
