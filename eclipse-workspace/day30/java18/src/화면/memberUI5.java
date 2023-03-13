package 화면;

import java.util.ArrayList;

import javax.swing.JFrame;

import 자바db연결.MemberDAO3;
import 자바db연결.MemberVO;

public class memberUI5 {

	public static void main(String[] args) {
		// 프로그램 시작하자 마자 db에서 데이터를 가지고 와서
		// 화면을 만들어주고 싶음.
		JFrame f = new JFrame();
		f.setSize(500, 700);

		MemberDAO3 dao = new MemberDAO3();
		ArrayList<MemberVO> list = dao.list(); // ArrayList<MemberVO>

		String[] header = { "아이디", "패스워드", "이름", "전화번호" };
		Object[][] all = new String[list.size()][4];

		if (list.size() == 0) {
			System.out.println("검색결과 없음. ");
		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");
			for (int i = 0; i < all.length; i++) { // 13개의 가방,13개의 행
				all[i][0] = list.get(i).getId();
				all[i][1] = list.get(i).getPw();
				all[i][3] = list.get(i).getName();
				all[i][4] = list.get(i).getTel();
			}
		} // else
		f.setVisible(true);
	}
}
