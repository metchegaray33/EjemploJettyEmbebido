package com.etc.ar.Clase3WebServerEmbebido;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    //    System.out.println( "Hello World!" );
        
    
    	/**
    	 * Declaro el server en las siguientes 4 líneas para poder levantarlo
    	 */
    	
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/hello");//digo donde voy a estar escuchando siempre en /hello aca
        server.setHandler(context);

        /**
         * Le decimos al jetty cuales son los servlet que hay que instalar y le decimos la expresion regular que define 
         * que request van a ser atendidos por este servlet.Puedo tener distintos path y ser atendidos.
         */
         //
      
      //  context.addServlet(new ServletHolder(new HelloServlet()), "/simple");
    

        server.start();
        
    }
}
