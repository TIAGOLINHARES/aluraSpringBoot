package br.com.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "novaEmpresa", urlPatterns = { "/novaEmpresa" })
public class NovaEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NovaEmpresaServelet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Cadastrando nova Empresa");
		String novaEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
		
		empresa.setNome(novaEmpresa);
		
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		
		// Chamando JSP
		
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		rd.forward(request, response);

	}

}