package sample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Source")
public class Source extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Source Start");
		//페이지 이동
		//1. forward 방식으로 이동
		RequestDispatcher view = request.getRequestDispatcher("Destination");
		request.setAttribute("name", "홍길동");
		request.setAttribute("age", "30");
		view.forward(request, response);
		
		
		//2. redirect 방식으로 이동
		//response.sendRedirect("Destination");
		
		//forward 방식
		// URL이 그대로 유지된다.
		// request , response 객체가 그대로 사용된다. 
		
		//redirect 방식
		// URL이 변한다.
		// request , response 객체가 새로 생성된다.
		
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
