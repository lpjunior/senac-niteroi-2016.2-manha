package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/prd/cadastrar", "/prd/editar", "/prd/buscar", "/prd/listar", "/prd/excluir" })
public class ServletProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String PREFIX = "/prd/";

	public ServletProduto() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// buscar, listar, excluir
		
		if(request.getServletPath().equals(PREFIX + "buscar")) {
			buscar(request, response);
		} else if(request.getServletPath().equals(PREFIX + "listar")) {
			listar(request, response);
		} else if(request.getServletPath().equals(PREFIX + "excluir")) {
			excluir(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// cadastrar, editar
		if(request.getServletPath().equals(PREFIX + "cadastrar")) {
			salvar(request, response);
		} else if(request.getServletPath().equals(PREFIX + "editar")) {
			editar(request, response);
		}
	}
	

	private void salvar(HttpServletRequest request, HttpServletResponse response) 		throws ServletException, IOException {
		response.getWriter().append("Requisição via POST parametro cadastrar");
	}
	
	private void editar(HttpServletRequest request, HttpServletResponse response) 		throws ServletException, IOException {
		response.getWriter().append("Requisição via POST parametro editar");
	}

	private void buscar(HttpServletRequest request, HttpServletResponse response) 		throws ServletException, IOException {
		response.getWriter().append("Requisição via GET parametro buscar");
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) 		throws ServletException, IOException {
		response.getWriter().append("Requisição via GET parametro listar");
	}

	private void excluir(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Requisição via GET parametro excluir");
	}
}