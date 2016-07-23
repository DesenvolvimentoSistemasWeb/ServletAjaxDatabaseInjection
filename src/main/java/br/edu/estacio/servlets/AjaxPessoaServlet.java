package br.edu.estacio.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.estacio.model.Pessoa;
import br.edu.estacio.services.PessoasService;

/**
 * Servlet implementation class AjaxServlet
 */
@WebServlet(value="/ajax")
public class AjaxPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@EJB
	private PessoasService pessoasService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxPessoaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoasService.addPessoa(pessoa);
				
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("Você digitou:"+nome);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
