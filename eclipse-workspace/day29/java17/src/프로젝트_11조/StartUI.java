package 프로젝트_11조;

import javax.swing.JOptionPane;

import DB_connet.MemberDAO3;
import DB_connet.MemberVO;

public class StartUI {
	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디입력");
		String pw = JOptionPane.showInputDialog("패스워드입력");
		
		MembersDAO dao= new MembersDAO();
		MembersVO bag = new MembersVO();
		
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
