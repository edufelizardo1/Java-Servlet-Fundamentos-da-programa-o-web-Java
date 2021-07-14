package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi", loadOnStartup = 1)
public class OlaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void OiMundoServlet() {
		System.out.println("Criando Oi Mundo Servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Olá mundo, Escrevendo o primeiro Servlet");
		out.println("</body>");
		out.println("</html>");
		System.out.println("O servlet OiMundoServlet foi chamado.");

	}

}
