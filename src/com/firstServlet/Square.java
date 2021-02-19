package com.firstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.util.http.parser.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Square extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		//we have to get the value which you have set to req object;
		//we have to do typecast because it is returning the 
		/*int sq=(int) req.getAttribute("key");
		sq=sq*sq;
		out.println("Square Value is:"+sq);*/
		
		/*int sq=Integer.parseInt(req.getParameter("k"));
		sq=sq*sq;
		out.println("The Result is:"+sq);*/
		
		/*HttpSession session=req.getSession();
		int k=(int)session.getAttribute("k");
		k=k*k;
		out.println("The Result is:"+k);*/
		
		
		int k=0;
		jakarta.servlet.http.Cookie[] cookies=req.getCookies();
		for(jakarta.servlet.http.Cookie c:cookies)
		{
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
		}
		k=k*k;
		out.println("The Result is:"+k);
				
		
		
		
	}

}
