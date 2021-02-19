package com.firstServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet1 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		//here we are using the session for passing the values from one servlet to another
		HttpSession session=req.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("square");
		
	}

}
