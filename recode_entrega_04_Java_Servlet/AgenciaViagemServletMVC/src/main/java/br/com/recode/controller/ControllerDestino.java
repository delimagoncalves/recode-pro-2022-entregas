package br.com.recode.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControllerDestino extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcao = request.getParameter("opcaoDestino");
		
		switch (opcao) {
		case "cadastrar":
			request.getRequestDispatcher("/WEB-INF/view/destino/cadastrarDestino.jsp").forward(request, response);
			break;
		case "listar":
			break;
		
		case "remover":
			break;
		
		case "atualizar":
			break;
		}
	}

}
