package 연습문제;

import javax.swing.JOptionPane;

public class problem1 {

	public static void main(String[] args) {
		String password="pass";
		String password2=JOptionPane.showInputDialog("암호를 대시오");
		
		if(password2.equals(password)){
			System.out.println("들어오세요");
		}else {
			System.out.println("나가세요");
		}
		
		String menu= JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는?(자장면, 라면, 회에서 선택)");
		
		switch(menu) {
		case "자장면":
			System.out.println("중국집으로 가요");
			break;
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		case "회":
			System.out.println("횟집으로 가요");
			break;
		default:
			System.out.println("그냥 안먹어요");
			break;
		}
		
		String x=JOptionPane.showInputDialog("정수를 입력하세요1");
		String y=JOptionPane.showInputDialog("정수를 입력하세요1");
		int x1 =Integer.parseInt(x);
		int y1 =Integer.parseInt(y);
		if(x1>y1) {
			System.out.println(x1+"이 "+y1+"보다 큽니다.");
		}else if(x1==y1) {
			System.out.println(x1+"(와)과 "+y1+"(은)는 같습니다.");
		}else {
			System.out.println(x1+"(은)는 "+y1+"보다 작습니다.");
		}
			
		String no= "A100EX";
		char first= no.charAt(0);
		switch(first) {
		case 'A':
			System.out.println("기획부입니다.");
			break;
		case 'B':
			System.out.println("총부부입니다.");
			break;
		case 'C':
			System.out.println("개발부입니다.");
			break;
		default:
			System.out.println("해당부서 없음");
			break;
		}
	}

}
