package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표 {

	static int njs;
	static int yoonha;
	static int tei;
	static String first;
	public static void main(String[] args) {
		String[] img = { "100.jpg", "200.jpg", "300.jpg" };
		JFrame f = new JFrame();
		f.setSize(1050, 500);
		f.setTitle("뉴진스: " + njs + " 윤하: " + yoonha + " 테이: " + tei);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font font2 = new Font("D2Coding", Font.BOLD, 30);

		ImageIcon icon1 = new ImageIcon(img[0]);
		ImageIcon icon2 = new ImageIcon(img[1]);
		ImageIcon icon3 = new ImageIcon(img[2]);

		JLabel l1 = new JLabel("뉴진스:Ditto                 ");
		l1.setFont(font);
		JLabel l2 = new JLabel("윤하:사건의 지평선");
		l2.setFont(font);
		JLabel l3 = new JLabel("                테이:Monologue");
		l3.setFont(font);
		
		JLabel l4 = new JLabel("1위는 "+first+"입니다.");
		l4.setFont(font2);
		
		JButton btn1 = new JButton(icon1);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				njs++;
				f.setTitle("뉴진스: " + njs + " 윤하: " + yoonha + " 테이: " + tei);
				if(njs>yoonha && njs>tei) {
					first="뉴진스:Ditto";
					l4.setText("1위는 "+first+"입니다.");
				}
			}
		});

		JButton btn2 = new JButton(icon2);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yoonha++;
				f.setTitle("뉴진스: " + njs + " 윤하: " + yoonha + " 테이: " + tei);
				if(yoonha>njs && yoonha>tei) {
					first="윤하:사건의 지평선";
					l4.setText("1위는 "+first+"입니다.");
				}
			}
		});
		
		JButton btn3 = new JButton(icon3);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tei++;
				f.setTitle("뉴진스: " + njs + " 윤하: " + yoonha + " 테이: " + tei);
				if(tei>yoonha && tei>njs) {
					first="테이:Monologue";
					l4.setText("1위는 "+first+"입니다.");
				}
			}
		});
		
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		
		f.setVisible(true);
	}

}
