package br.com.recode.servlet;

import java.io.IOException;

import br.com.recode.dao.LoginDAO;
import br.com.recode.model.Login;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
	
		Login login = new Login(usuario,senha);
		
		try {
			LoginDAO loginDAO = new LoginDAO();
			Login loginBanco = loginDAO.validaLogin(login);
			
			if((loginBanco.getUsuario().equalsIgnoreCase(usuario)) && (loginBanco.getSenha().equalsIgnoreCase(senha))) {
				//response.sendRedirect("/WEB-INF/view/sistema.jsp");
				request.getRequestDispatcher("/WEB-INF/view/sistema.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("/WEB-INF/view/erroLogin.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
