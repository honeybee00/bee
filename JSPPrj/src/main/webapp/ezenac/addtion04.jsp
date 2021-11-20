<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>


<!-- ------------------------------------------------------------ -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="join.jsp">되돌아가기</a>
	<table>
	<%
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "ex01";
	String pwd = "0311";
	String sql = "SELECT * FROM employee";
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection con = DriverManager.getConnection(url,uid, pwd);
	
	Statement stmt = con.createStatement();
	
	ResultSet rs = stmt.executeQuery(sql);
	
	while(rs.next()) {
		String bookId = rs.getString("id");
		String bookName = rs.getString("name");
		String publisher = rs.getString("addr");
		String price = rs.getString("phone");
		String email = rs.getString("email");
		String hire_date = rs.getString("hire_date");
		String emp_no = rs.getString("emp_no");
%>
		<tr>
			<td><%=bookId %></td>
			<td><%=bookName %></td>
			<td><%=publisher %></td>
			<td><%=price %></td>
			<td><%=email %></td>
			<td><%=hire_date %></td>
			<td><%=emp_no %></td>
		</tr>
	
	<%
	}
	%>
	</table>
</body>
</html>