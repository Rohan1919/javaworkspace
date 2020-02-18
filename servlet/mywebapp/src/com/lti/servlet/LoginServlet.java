package com.lti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.login.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		UserService userService=new UserService();
		//System.out.println(username+" "+password); value is coming 
		boolean isValid= userService.isValidUser(username,password);
		System.out.println(isValid);  //false is coming
	//	response.sendRedirect("welcome.html");

		
		if(isValid){
			String rememberme=request.getParameter("rememberme");
			
			if(rememberme!=null && rememberme.equals("yes")){
				Cookie c1=new Cookie("uname",username);
				c1.setMaxAge(60*60);
				Cookie c2=new Cookie("pass",password);
				c2.setMaxAge(60*60);//1 hr
				response.addCookie(c1);
				response.addCookie(c2);
			}
		     response.sendRedirect("welcome.html");
		}
		else{
			response.sendRedirect("login.html");
		}
		
	}

}
