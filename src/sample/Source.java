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
		//������ �̵�
		//1. forward ������� �̵�
		RequestDispatcher view = request.getRequestDispatcher("Destination");
		request.setAttribute("name", "ȫ�浿");
		request.setAttribute("age", "30");
		view.forward(request, response);
		
		
		//2. redirect ������� �̵�
		//response.sendRedirect("Destination");
		
		//forward ���
		// URL�� �״�� �����ȴ�.
		// request , response ��ü�� �״�� ���ȴ�. 
		
		//redirect ���
		// URL�� ���Ѵ�.
		// request , response ��ü�� ���� �����ȴ�.
		
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}