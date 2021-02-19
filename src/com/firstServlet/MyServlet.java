package com.firstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		
		//Servlet Context
		
		
		ServletContext ctx=getServletContext();
		String str=ctx.getInitParameter("name");
		out.println("context"+str);
		
		
		//Servlet Config
		
		ServletConfig fg=getServletConfig();
		String st=fg.getInitParameter("name");
		out.println("config"+st);
		
	}
	

}
