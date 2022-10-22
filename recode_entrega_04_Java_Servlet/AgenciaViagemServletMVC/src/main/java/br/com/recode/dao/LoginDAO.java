package br.com.recode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

import br.com.recode.conexao.ConnectionFactory;
import br.com.recode.model.Login;

public class LoginDAO {

	private String sql;
	private Connection conexao = ConnectionFactory.createConnectionFactory();

	public Login validaLogin(Login login) {

		sql = "select usuario, senha from login where usuario = ?";

		String usuario = "", senha = "";
		

		try {
			PreparedStatement statement = conexao.prepareStatement(sql);

			statement.setString(1, login.getUsuario());
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				usuario = resultSet.getString("usuario");
				senha = resultSet.getString("senha");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 

		return new Login(usuario,senha);
	}

}
