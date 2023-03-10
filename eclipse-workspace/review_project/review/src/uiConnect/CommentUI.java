package uiConnect;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dbConnect.CommentDao;

public class CommentUI {

	public void open() {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(450, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Color backC = new Color(250, 245, 224);
		f.getContentPane().setBackground(backC);

		Font font = new Font("돋움", Font.BOLD, 30);
		Font font2 = new Font("돋움", Font.BOLD, 20);

		JLabel l = new JLabel("댓글");
		l.setFont(font);

		JTextArea t1 = new JTextArea(15, 25);
		t1.setEditable(false);

		JTextField t2 = new JTextField(20);
		t1.setFont(font2);
		t2.setFont(font2);

		RoundedButton b1 = new RoundedButton("입력");
		b1.setFont(font2);

		// 원래 있던 댓글 불러오기
		CommentDao dao = new CommentDao();
		ArrayList<CommentVO> list0 = dao.list(); // ArrayList<MemberVO>
		for (int i = 0; i < list0.size(); i++) {
			t1.append(list0.get(i).getWriter() + ": " + list0.get(i).getContent() + "\n");

		}

		// 댓글 추가
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("sign up");
				Main main = new Main();
				// 댓글 목록에서 가장 큰 번호를 불러와 1을 더해서 자동 번호 생성
				CommentDao dao = new CommentDao();
				ArrayList<CommentVO> list = dao.listOrder(); // ArrayList<MemberVO>

				int last_no = list.get(0).getComment_no();
				System.out.println(last_no);

				int comment_no = last_no + 1;
				System.out.println(comment_no);

				String writer = main.getId();
				Post_UI1 pu = new Post_UI1();
				int post_no = pu.getPost_no();
				String content = t2.getText();

				// 1. 가방 생성
				CommentVO bag = new CommentVO();
				// 2. 가방에 값 넣어주기
				bag.setComment_no(comment_no);
				bag.setWriter(writer);
				bag.setPost_no(post_no);
				bag.setContent(content);

				int result = dao.insert(bag);

				if (result == 1) {
					JOptionPane.showMessageDialog(f, "댓글추가 성공");

					t1.append(writer + ": " + content + "\n");
					t2.setText("");
				} else {

					JOptionPane.showMessageDialog(f, "댓글을 입력해주세요");
				} // action
			}
		});

		f.add(l);
		f.add(t1);
		f.add(t2);
		f.add(b1);

		f.setVisible(true);

	}

}
