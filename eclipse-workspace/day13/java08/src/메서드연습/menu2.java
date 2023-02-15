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



public class menu2 {
	static int count;
	static int udon_count;
	static int jjam_count;
	static int jja_count;
	static final int PRICE1 = 6000;
	static final int PRICE2 = 5500;
	static final int PRICE3 = 5000;

	static int index = 0;

	public static void main(String[] args) {
		String[] img = { "001.png", "002.png", "003.png" };
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setTitle("우동: "+udon_count+" 짬뽕: "+jjam_count+" 짜장: "+jja_count);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font font2 = new Font("D2Coding", Font.BOLD, 30);

		ImageIcon icon = new ImageIcon(img[0]);

		int total = 0;
		int total_count = 0;
		
		total = count * PRICE1;
		
		JLabel l1 = new JLabel("개수:");
		l1.setFont(font);

		JLabel l2 = new JLabel();
		l2.setFont(font2);
		l2.setText(total_count + "개");
		
		JLabel l3 = new JLabel(icon);
		JLabel l4 = new JLabel("결제금액" + total + "원");
		l4.setFont(font2);
		JButton btn1 = new JButton("우동");
		btn1.setFont(font);
		btn1.setBackground(Color.YELLOW);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = 0;
				ImageIcon icon = new ImageIcon(img[index]);
				l3.setIcon(icon);
				count++;
				udon_count++;
				f.setTitle("우동: "+udon_count+" 짬뽕: "+jjam_count+" 짜장: "+jja_count);
				l2.setText(count + "개");
				l4.setText("결제금액:"+((udon_count * PRICE1)+(jjam_count * PRICE2)+(jja_count*PRICE3))+"원");
			}
		});

		JButton btn2 = new JButton("짬뽕");
		btn2.setFont(font);
		btn2.setBackground(Color.cyan);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = 1;
				ImageIcon icon = new ImageIcon(img[index]);
				l3.setIcon(icon);
				count++;
				jjam_count++;
				f.setTitle("우동: "+udon_count+" 짬뽕: "+jjam_count+" 짜장: "+jja_count);
				l2.setText(count + "개");
				l4.setText("결제금액:"+((udon_count * PRICE1)+(jjam_count * PRICE2)+(jja_count*PRICE3))+"원");
			}
		});
		
		JButton btn3 = new JButton("짜장");
		btn3.setFont(font);
		btn3.setBackground(Color.magenta);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = 2;
				ImageIcon icon = new ImageIcon(img[index]);
				l3.setIcon(icon);
				count++;
				jja_count++;
				f.setTitle("우동: "+udon_count+" 짬뽕: "+jjam_count+" 짜장: "+jja_count);
				l2.setText(count + "개");
				l4.setText("결제금액:"+((udon_count * PRICE1)+(jjam_count * PRICE2)+(jja_count*PRICE3))+"원");
			}
		});

		total = count * PRICE1;
		
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
