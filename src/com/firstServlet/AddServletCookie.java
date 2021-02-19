package com.firstServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServletCookie extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		//here we are using the Cookie for passing the values from one servlet to another
		//cookie takes only String
		Cookie cookie=new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("square");
		
	}

}
