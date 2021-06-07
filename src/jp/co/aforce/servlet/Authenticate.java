package jp.co.aforce.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet/authenticate"})
public class Authenticate extends HttpServlet{

	public void doPost(HttpServletRequest request , HttpServletResponse response)
	throws ServletException , IOException{
		request.getRequestDispatcher("/jsp/success.jsp").forward(request , response);
	}
	
	public void doGet(HttpServletRequest request , HttpServletResponse response)
	throws ServletException , IOException{
	}
}
