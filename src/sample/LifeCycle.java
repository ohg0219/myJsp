package sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeCycle() {
        System.out.println("LifeServlet의 생성자 호출됨.");
    }

    //호출시 한번 생성됨
    @Override
    public void init() throws ServletException {
    	System.out.println("init 호출됨.");
    }
    
    //한번 생성되어 스레드에 올라간 후 요청이 있을때마다 실행된다.
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("service 호출됨.");
    }
    
    //종료시 한번 수행됨
    @Override
    public void destroy() {
    	System.out.println("destroy 호출됨.");
    }
    
    
    
}
