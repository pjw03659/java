package 화면;

import javax.swing.JOptionPane;

import 자바db연결.MemberDAO3;
import 자바db연결.MemberVO;

public class StartUI {
	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디입력");
		String pw = JOptionPane.showInputDialog("패스워드입력");
		
		MemberDAO3 dao= new MemberDAO3();
		MemberVO bag = new MemberVO();
		
		bag.setId(id);
		bag.setPw(pw);
		int result= dao.login(bag);
		if(result==0) {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}else {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		}
		
	}
}
