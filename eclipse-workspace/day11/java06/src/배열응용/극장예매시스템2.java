package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 극장예매시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800,700);
		f.getContentPane().setBackground(Color.green);
		
		JButton[] btn = new JButton[100];
		
		f.setTitle("극장예매시스템");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("D2Coding",Font.BOLD,20);
		
		JLabel result= new JLabel("결과 보이는곳");
		result.setForeground(Color.magenta);
		result.setFont(font);
		
		int[] seat=new int[btn.length];//예약 여부 저장하는 배열, 0:예약x, 1:예약
		
		
		for (int i = 0; i < btn.length; i++) {
			btn[i]=new JButton(""+(i));
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//클린한 버튼의 글자를 가지고 와줌.
					String text= e.getActionCommand();
					
					int no = Integer.parseInt(text);
					if(seat[no]==1) {
						seat[no]=0;
						btn[no].setBackground(Color.white);
					}else {
						seat[no]=1;
						result.setText(text+"번이 예약되었습니다.");
						btn[no].setBackground(Color.red);
						
					}
					
				}
			});
		}
		for (int i = 0; i < btn.length; i++) {
			btn[i].setFont(font);
			f.add(btn[i]);
		}
		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);
		JLabel result2 = new JLabel("결과 보이는곳");
		result2.setForeground(Color.magenta);
		result2.setFont(font);
		total.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				int count=0;
				for (int i = 0; i < seat.length; i++) {
					if(seat[i]==1) {
						count++;
					}
				}
				result2.setText(count+"개 예약 되었습니다. 금액은 "+(10000*count)+"원 입니다.");
			}
		});
		f.add(total);
		f.add(result2);
		f.setVisible(true);
		

	}

}
