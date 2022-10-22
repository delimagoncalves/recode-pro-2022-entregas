package br.com.recode.servlet.destino;

import java.io.IOException;

import br.com.recode.dao.DestinoDAO;
import br.com.recode.model.Destino;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class CadastrarDestino extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		double diaria = Double.parseDouble(request.getParameter("diaria"));
		
		Destino destino = new Destino(estado, cidade, diaria);
		
		try {
			DestinoDAO destinoDAO = new DestinoDAO();
			destinoDAO.cadastrar(destino);
			request.getRequestDispatcher("/WEB-INF/view/destino/cadSucessoDestino.jsp").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
