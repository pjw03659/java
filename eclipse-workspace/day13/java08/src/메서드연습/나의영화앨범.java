package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {

	static int index = 0; // 현재 0부터 시작

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타2", "교섭", "바빌론" };
		String[] img = { "001.jpg", "002.jpg", "003.jpg", "004.jpg", "005.jpg" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };

		JFrame f = new JFrame();
		f.setSize(445, 500);
		f.getContentPane().setBackground(Color.green);

		Font font = new Font("D2Coding", Font.BOLD, 40);
		Font font2 = new Font("D2Coding", Font.BOLD, 20);

		ImageIcon icon = new ImageIcon(img[0]);

		JLabel top = new JLabel(title[0]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel(icon);
		center.setFont(font);
		f.add(center, BorderLayout.CENTER);

		JLabel under = new JLabel(jumsu[0] + "");
		under.setFont(font);
		under.setHorizontalAlignment(0);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton("<<");
		left.setFont(font2);
		f.add(left, BorderLayout.WEST);
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (index != 0) {
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--;
				} else {
					JOptionPane.showMessageDialog(f, "첫 페이지 입니다.");
				}
			}
		});

		JButton right = new JButton(">>");
		right.setFont(font2);
		f.add(right, BorderLayout.EAST);
		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (index != 4) {
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++;
				} else {
					JOptionPane.showMessageDialog(f, "마지막 페이지 입니다.");
				}
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
