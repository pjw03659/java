package 자바db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	public void insert() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password ="oracle";
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");
			
			
			String sql = "insert into hr.MEMBER values ('win7', 'win7', 'win7', 'win7')";
			PreparedStatement ps= con.prepareStatement(sql);
			System.out.println("3.SQL문 객체로 만들어주기");
			
			ps.executeUpdate();
			System.out.println("4.SQL문 전송 성공");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
