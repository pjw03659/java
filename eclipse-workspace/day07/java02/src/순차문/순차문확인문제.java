package 순차문;

import javax.swing.JOptionPane;

public class 순차문확인문제 {

	public static void main(String[] args) {
		//기본 순차문 --> 입력->출력-->추력
		String height= JOptionPane.showInputDialog("키를 입력하시오(m단위)");
		String weight= JOptionPane.showInputDialog("몸무게를 입력하시오(kg단위)");
		
		double height1= Double.parseDouble(height);
		double weight1= Double.parseDouble(weight);
		double result=weight1/(height1*height1);
		System.out.println(result);
	}

}
