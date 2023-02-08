package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=1000;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		String sum2="";
		for (int i = 0; i < 3; i++) {
			String data=JOptionPane.showInputDialog("가고 싶은 곳 입력");
			sum2=sum2+data+" ";
			
		}System.out.println(sum2);
	}
	

}
