package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		try{
			out.println("<html><head><title>My First Servlet</title></head><body>");
			out.println("<h2>My First Servlet File</h2><hr color='red'><br>");
			out.println("<p align='center'>������ ");
			out.println(new java.util.Date());
			out.println("�Դϴ�. </p></body></html>");
		}finally{
			out.close();
		}
	}


}
