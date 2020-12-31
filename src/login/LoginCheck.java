package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mytest","mytest");
			String sql = "select pass from login where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String dbPw = rs.getString("pass");
				if(dbPw.equals(pwd)) {
					HttpSession session = request.getSession();
					session.setAttribute("user", id);
				}else {
					System.err.println("비밀번호 오류");
				}
			}else {
				System.err.println("아이디가 존재하지 않습니다.");
			}
			response.sendRedirect("Login");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로딩실패");
		} catch (SQLException e) {
			System.err.println("데이터베이스 연동문제 발생");
		} finally {
			try {if(rs!=null) rs.close();} catch (SQLException e) { }
			try {if(pstmt!=null) pstmt.close();} catch (SQLException e) { }
			try {if(conn!=null) conn.close();} catch (SQLException e) { }
		}
	}
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
