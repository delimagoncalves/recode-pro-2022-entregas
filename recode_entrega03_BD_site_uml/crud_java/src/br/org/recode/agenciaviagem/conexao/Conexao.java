package br.org.recode.agenciaviagem.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private static Connection connection = null;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "suporte@100";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agencia_viagem";

	public static Connection createConnectionToMySQL() {		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(connection == null) {				
				connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
				//System.out.println("Conectado ao BD");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
}
