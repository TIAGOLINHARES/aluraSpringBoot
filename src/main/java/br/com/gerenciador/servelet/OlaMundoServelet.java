package br.com.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi
@WebServlet(urlPatterns ="/oi" )

public class OlaMundoServelet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Helooooo worddddddd");
		out.println("</body>");
		out.println("</html>");
		
		
		System.out.println("O Servelet Ola mundo foi chamado");
		
	}
	

}
