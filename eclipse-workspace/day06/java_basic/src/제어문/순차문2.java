package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		//프로그램을 어떤 순서대로 짜야할까?
		//1.입력:데이터를 가지고 온다
		//2.처리:특정한 작업을 수행
		//3.출력:처리한 내용을 보여준다.
		
		//입력(input)
		String name= JOptionPane.showInputDialog("당신의 이름은?");
		
		//처리
		String result= "나의 이름은 "+ name + "입니다.";
		
		//출력
		System.out.println(result);
  }
}