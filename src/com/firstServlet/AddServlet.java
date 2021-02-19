package com.firstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	//service() is the method provided by the Server.
	//HttpServletRequest and HttpServelt 
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		//we have to fetch the values from the client
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//if we do this then result is print in console
		//System.out.println("result is"+k);
		//but we got a page who send that page ,servlet is return the res object with a page.
		//if we want to print on the page;
		//then we have to use the res.getWriter();
		//this returns the printwriter
		/*PrintWriter out=res.getWriter();
		out.println("result is: "+k);*/
		//i want to call the another servlet from here
		//we use request Dispatcher or redirect
		
		//square is the url.
		//if we want to send the data to another servlet we use Session Management
		
		//also by setting the Attribute to the req object
		/*req.setAttribute("key",k);
		RequestDispatcher rq=req.getRequestDispatcher("square");
		//we have to forward the req and res objects also
		rq.forward(req, res);*/
		
		//SendRedirect.
		
		res.sendRedirect("square?k="+k);
		
	}

	
}
