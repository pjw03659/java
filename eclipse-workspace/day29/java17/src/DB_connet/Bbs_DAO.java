package DB_connet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Bbs_DAO {
	public void insert(BbsVO bag) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			String sql = "insert into hr.BBS values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getNo());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getWriter());
			ps.setString(4, bag.getContent());

			System.out.println("3.SQL문 객체로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(BbsVO bag) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			String sql = "delete from hr.BBS where no =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,bag.getNo());
			System.out.println("3.SQL문 객체로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(BbsVO bag) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");

			String sql = "update hr.BBS set content =? where NO =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(2, bag.getNo());
			ps.setString(1, bag.getContent());
			System.out.println("3.SQL문 객체로 만들어주기");

			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public BbsVO one (int no) {
		ResultSet rs = null; //항목명+결과 데이터를 담고 있는 테이블
		BbsVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			
			String sql = "select * from hr.BBS where NO = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) {
				System.out.println("검색 결과 있음 성공.");
			
				int no2= rs.getInt(1);
				String title= rs.getString(2);
				String writer= rs.getString(3);
				String content= rs.getString(4);
				System.out.println(no2+" "
								+title+" "
								+writer+" "
								+content+" ");
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setWriter(writer);
				bag.setContent(content);
				
			}else {
				System.out.println("검색 결과 없음.");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;
	}
}
