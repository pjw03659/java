package 제어문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		//프로그램을 어떤 순서대로 짜야할까?
		//1.입력:데이터를 가지고 온다
		//2.처리:특정한 작업을 수행
		//3.출력:처리한 내용을 보여준다.
		
		//입력(input)
		String sports= JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String day= JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		//처리
		String result= day+"에 저는 " + sports + "(을)를 합니다.";
		
		//출력
		System.out.println(result);
  }
}