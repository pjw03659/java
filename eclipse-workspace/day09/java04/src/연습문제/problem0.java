package 연습문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class problem0 {
		
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setSize(500, 800);
		f.setLayout(flow);
		Font font1 = new Font("D2Coding", 1, 30);
		Font font2 = new Font("D2Coding", 1, 20);
		
		JLabel title = new JLabel(); //제목
		title.setText("K-pop 인기투표");
		title.setFont(font1);
		
		JLabel music1= new JLabel(); //1번 후보
		music1.setText("1.New Jeans - Ditto");
		music1.setFont(font2);
		JLabel music2= new JLabel();//2번 후보
		music2.setText("2.윤하 - 사건의 지평선");
		music2.setFont(font2);
		JLabel music3= new JLabel();//3번 후보
		music3.setText("3.테이 - Monologue");
		music3.setFont(font2);
		
		
		
		JLabel vote1= new JLabel(); //n명 표시
		JLabel vote2= new JLabel();
		JLabel vote3= new JLabel();
		vote1.setFont(font2);
		vote2.setFont(font2);
		vote3.setFont(font2);
		
		
		JButton b1= new JButton(); //버튼 생성
		JButton b2= new JButton();
		JButton b3= new JButton();
		
		ImageIcon icon1=new ImageIcon("newjeans.jpg"); //사진 불러오기
		ImageIcon icon2=new ImageIcon("yoonha.jpg");
		ImageIcon icon3=new ImageIcon("tei.jpg");
		
		b1.setIcon(icon1);//버튼에 사진 넣기
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		b1.addActionListener(new ActionListener() {
			int newjeans=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				newjeans++;
				vote1.setText(newjeans+"표");
				
			}
		});
		b2.addActionListener(new ActionListener() {
			int yoonha=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				yoonha++;
				vote2.setText(yoonha+"표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int tei=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				tei++;
				vote3.setText(tei+"표");
			}
		});
		
		
		f.add(title);
		
		f.add(b1);
		f.add(music1);
		f.add(vote1);
		
		
		f.add(b2);
		f.add(music2);
		f.add(vote2);
	
		
		f.add(b3);
		f.add(music3);
		f.add(vote3);
		
		f.setVisible(true);
	}

}
