package com.ezenac.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.SendResult;

/**
 * Servlet implementation class join
 */
@WebServlet("/join")
public class join1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public join1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String hire_date = request.getParameter("hire_date");
		String emp_no = request.getParameter("emp_no");
		
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String uid = "ex01";
		String pwd = "0311";
		String sql = "insert into employee values(?,?,?,?,?,?,?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,uid, pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			UserDTO user = new UserDTO();
			user.setId(id);
			user.setName(name);
			user.setAddr(addr);
			user.setPhone(phone);
			user.setEmail(email);
			user.setHire_date(hire_date);
			user.setEmp_no(emp_no);
			
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getAddr());
			pstmt.setString(4, user.getPhone());
			pstmt.setString(5, user.getEmail());
			pstmt.setString(6, user.getHire_date());
			pstmt.setString(7, user.getEmp_no());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("ezenac/join.jsp");
		dis.forward(request, response);
		
	
	}

}
