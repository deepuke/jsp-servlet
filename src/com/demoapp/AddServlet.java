package com.demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Annotation instead of XML.
@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));

		int result = a + b;
		// Getting params from servlet context
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("Name");
		System.out.println(name);

		/*// Getting params from servlet config
		ServletConfig scg = getServletConfig();
		String cname = scg.getInitParameter(name);
		System.out.println(cname);*/

		res.sendRedirect("sq?res=" + result);

		// req.setAttribute("num", result);
		// RequestDispatcher rd = req.getRequestDispatcher("sq");
		// rd.forward(req, res);

		// PrintWriter out = res.getWriter();
		// out.println("Result is "+result);
	}

}
