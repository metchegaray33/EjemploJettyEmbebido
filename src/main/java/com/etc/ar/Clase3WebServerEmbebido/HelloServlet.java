package com.etc.ar.Clase3WebServerEmbebido;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Prueba nueva
 * @author Usuario
 *
 */
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");	
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("Hello World");
		
	}
	

}
