package 배열심화;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원배열 {

	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setSize(500, 500);
		Random r = new Random();
		String header[] = {"컴퓨터", "영어", "수학", "체육"};
		String contents[][]= new String[50][4];
		for (int i = 0; i < contents.length; i++) {
			for (int j = 0; j < contents[i].length; j++) {
				contents[i][j]=Integer.toString(r.nextInt(100));
			}
		}
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		
		f.setVisible(true);
	}

}
