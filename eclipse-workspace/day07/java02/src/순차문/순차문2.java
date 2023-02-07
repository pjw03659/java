package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		//기본 순차문 --> 입력->출력-->추력
		String data1= JOptionPane.showInputDialog("정수를 입력하시오1");
		String data2= JOptionPane.showInputDialog("정수를 입력하시오2");
//		int data11 =Integer.parseInt(data1);
//		int data22 =Integer.parseInt(data2);
//		int result= (data11+data22);
//		System.out.println(result);
		
		double data33= Double.parseDouble(data1);
		double data44= Double.parseDouble(data2);
		double result2=data33+data44;
		System.out.println(result2);
	}

}
