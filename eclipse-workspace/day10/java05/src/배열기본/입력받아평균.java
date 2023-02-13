package 배열기본;

import javax.swing.JOptionPane;

public class 입력받아평균 {
	public static void main(String[] args) {
		int[] num= new int[5];
	
		for(int i=0; i<num.length; i++) {
			String data =JOptionPane.showInputDialog("숫자 입력");
			num[i]=Integer.parseInt(data);
			}
		for (int x : num) {
			System.out.print(x+ " ");
		}
		System.out.println();
		
		int sum=0;
		
		for (int x : num) {
			sum=sum+x;	
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+(sum/num.length));
		
		int sum2=0;
		for (int x : num) {
			if(x>=300) {
				sum2=sum2+x;	
			}
		}
		System.out.println("300이상되는 숫자들의 합은: "+sum2);
		
		int count=0;
		
		for(int x : num) {
			if(x>=300) {
				System.out.println("300이 넘는 index:num["+count+"]");
			}
			count++;
		}
	}
}
