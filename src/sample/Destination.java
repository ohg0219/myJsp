package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Destination")
public class Destination extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Destination</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Destination Servlet �Դϴ�.</h1>");
		out.println("<h1>���� �̸��� : "+request.getAttribute("name")+"</h1>");
		String age = (String) request.getAttribute("age");
		out.println("<h1>���� ���̴� : "+age+"</h1>");
		out.println("<h1></h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
