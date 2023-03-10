package uiConnect;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import dbConnect.reservationDAO;

public class reservationUI2 {

	public void open() {

		JFrame f = new JFrame();
		f.setTitle("예약 목록");
		f.setSize(515, 500);

		reservationDAO dao = new reservationDAO();

		ArrayList<reservationVO> reserveList = dao.rList();

		String[] header = { "예약번호", "예약자 ID", "인원", "예약 장소", "예약 시간" };
		Object[][] all = new String[reserveList.size()][5];

		if (reserveList.size() == 0) {
			System.out.println("검색결과 없음. ");
		} else {
			System.out.println("검색결과는 전체 " + reserveList.size() + "개 입니다.");
			for (int i = 0; i < all.length; i++) { // 13개의 가방,13개의 행
				all[i][0] = String.valueOf(reserveList.get(i).getR_num());
				all[i][1] = reserveList.get(i).getR_id();
				all[i][2] = reserveList.get(i).getR_people();
				all[i][3] = reserveList.get(i).getR_place();
				all[i][4] = reserveList.get(i).getR_time();
			}
		} // else

		Color backC = new Color(250, 245, 224);
		Color btnC = new Color(251, 206, 177);
		Color fontC = new Color(247, 99, 12);
		
		Font font = new Font("돋움", Font.BOLD, 20);

		DefaultTableModel model = new DefaultTableModel(all, header);
		JTable table = new JTable(model);
		table.setBackground(btnC);
		table.setGridColor(backC);
		table.setSelectionBackground(backC);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(480, 400));
		table.setRowHeight(100);

		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
		}

		f.setLayout(new FlowLayout());
		f.getContentPane().setBackground(backC);
		
		JButton dbtn = new RoundedButton("삭제");
		dbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (table.getSelectedRow() == -1) {
					return;
				} else {
					TableModel data = table.getModel();
					int num = Integer.parseInt((String) data.getValueAt(table.getSelectedRow(), 0));
					System.out.println(num);
					model.removeRow(table.getSelectedRow());
					dao.delete(num);
				}

			}

		});

		f.add(scroll);
		f.add(dbtn);
		
		dbtn.setForeground(fontC);
		dbtn.setBackground(btnC);
		dbtn.setFont(font);
		dbtn.setBorderPainted(false);
		
		f.setLocation(600, 300);
		f.setVisible(true);
	}

}
