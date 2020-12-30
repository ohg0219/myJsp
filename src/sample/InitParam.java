package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String company;
	private String manager;
	private String tel;
	private String email;
	
    @Override
    public void init() throws ServletException {
    	System.out.println("초기화 메서드 수행됨");
    	company = getServletContext().getInitParameter("company");
    	manager = getServletContext().getInitParameter("manager");
    	tel = getServletConfig().getInitParameter("tel");
    	email = getServletConfig().getInitParameter("email");
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws 
    IOException, ServletException {
    	response.setContentType("text/html; charset=utf-8");
    	PrintWriter out = response.getWriter();
    	try {
			out.println("<html>");
			out.println("<body>");
			out.println("<li>회사명 : "+company+"</il>");
			out.println("<li>담당자 : "+manager+"</il>");
			out.println("<li>전화번호 : "+tel+"</il>");
			out.println("<li>이메일 : "+email+"</il>");
			out.println("</body>");
			out.println("</html>");
			
		} finally {
			out.close();
		}
    	
	}
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	processRequest(request, response);
    }
    
}
