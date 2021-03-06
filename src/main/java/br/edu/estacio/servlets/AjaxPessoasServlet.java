package br.edu.estacio.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.edu.estacio.services.PessoasService;

/**
 * Servlet implementation class AjaxPessoasServlet
 */
@WebServlet(value="/pessoas")
public class AjaxPessoasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Gson gson = new Gson();
	
	@EJB 
	private PessoasService pessoasService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxPessoasServlet() {
        super();

        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
        String jsonList = gson.toJson(pessoasService.getPessoas());
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(jsonList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
