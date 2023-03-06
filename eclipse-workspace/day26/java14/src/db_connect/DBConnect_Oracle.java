package db_connect;

import java.sql.DriverManager;

public class DBConnect_Oracle {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password ="oracle";
			DriverManager.getConnection(url, user, password);
			System.out.println("2.오라클 연결 성공.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
