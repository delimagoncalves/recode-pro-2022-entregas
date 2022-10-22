package br.com.recode.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String opcao = request.getParameter("opcaoSistema");
		
		switch (opcao) {
		case "cliente": 
			request.getRequestDispatcher("WEB-INF/view/menuCliente.jsp").forward(request, response);
			break;
		
		case "destino": 
			request.getRequestDispatcher("WEB-INF/view/menuDestino.jsp").forward(request, response);
			break;
		}
	}
	
}
