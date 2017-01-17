package edu.mum.login.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.mum.login.domain.User;
import edu.mum.login.service.UserAuthenticationService;

public class LoginServlet extends HttpServlet  {


	private UserAuthenticationService uas = new UserAuthenticationService();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean loginStatus = uas.authenticateUser(userName, password);			
		
		if(loginStatus){
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
										
			HttpSession userSession = request.getSession();
			userSession.setAttribute("currentSessionUser", user);
			
			response.sendRedirect("welcome.jsp");
		}
		else{
			//Set a errorMessage flag 
            request.setAttribute("errorMessage", "UserName and/or password incorrect.");			
            request.getRequestDispatcher("/login.jsp").forward(request, response);			
		}
	}
	
}
