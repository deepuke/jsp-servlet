package com.demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Annotation instead of Web.xml
@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		int num = Integer.parseInt(req.getParameter("res"));
//		int num = (int) req.getAttribute("num");
		PrintWriter out = res.getWriter();
		out.println("Square of the added number is "+ (num*num));
	}

}
