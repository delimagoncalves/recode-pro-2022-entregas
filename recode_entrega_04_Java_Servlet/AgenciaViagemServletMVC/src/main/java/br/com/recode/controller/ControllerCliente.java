package br.com.recode.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControllerCliente extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcao = request.getParameter("opcaoCliente");
		
		switch (opcao) {
		case "cadastrar":
			
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
