package 반복문;

import javax.swing.JOptionPane;

public class 누적연습 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=5;i<=300;i++) {
			if(i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	
		String sum2="";
		for(int i=0;i<4;i++) {
				String data= JOptionPane.showInputDialog("먹고 싶은 음식 4가지 입력");
				sum2=sum2+data+" ";
				
			}
		System.out.println(sum2);
		}

	}
