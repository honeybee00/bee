package kr.co.ezenac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnTest {
	
	Connection conn;
	
	public JdbcConnTest() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String userid = "wdsql";
		String pwd = "0311";
		
		try {
			//드라이버 찾는 부분
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
			
			System.out.println("데이터베이스 연결 준비...");
			conn = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void sqlExecute() throws SQLException {
		String query = "select * from Book";		//SQL문
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println("BOOKID \t BOOKNAME \t\t PUBLISHER \t PRICE");
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getString(3));
				System.out.print("\t" + rs.getInt(4));
				System.out.println();
			}
			
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			conn.close();
		}
		
	}
	
	public static void main(String[] args) throws SQLException {
		JdbcConnTest jConnTest = new JdbcConnTest();
		jConnTest.sqlExecute();
	}	
}


