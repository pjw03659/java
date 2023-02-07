package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		//기본 순차문 --> 입력->출력-->추력
		String data1= JOptionPane.showInputDialog("당신의 취미는?");
		String data2= JOptionPane.showInputDialog("언제 하시나요?");
		String result= data1+" " +data2;
		System.out.println(result);
	}

}
