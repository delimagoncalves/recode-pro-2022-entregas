package br.com.recode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.recode.conexao.ConnectionFactory;
import br.com.recode.model.Destino;


public class DestinoDAO {

	Connection conexao = ConnectionFactory.createConnectionFactory();
	private String sql;
	
	public void cadastrar(Destino destino) {
		
		String estado = destino.getEstado();
		String cidade = destino.getCidade();
		double valor_diaria = destino.getValorDiaria();	
		
		sql = "insert into Destino (estado, cidade, valor_diaria) values (?,?,?)";
		try {
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.setString(1, estado);
			statement.setString(2, cidade);
			statement.setDouble(3, valor_diaria);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void listarDestinos() {
		try {
			
			sql = "select * from Destino";
			
			PreparedStatement statement = conexao.prepareStatement(sql);
			
			ResultSet resultSet = statement.executeQuery();
			
			System.out.println("ID\tESTADO\t\tCIDADE\t\t\ttDIÁRIA");
			
			while(resultSet.next()) {
				int idDestino = resultSet.getInt("id_destino");
				String estado = resultSet.getString("estado");
				String cidade = resultSet.getString("cidade");
				double diaria = resultSet.getDouble("valor_diaria");
				System.out.println(idDestino+"\t"+estado+"\t\t"+cidade+"\t\t\t"+diaria);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removerDestino(int idDestino) {
		
		sql = "delete from Destino where id_destino = ?";
		
		try {
			
			PreparedStatement statement = conexao.prepareStatement(sql);
			
			statement.setInt(1, idDestino);
			statement.execute();
			System.out.println("Destino removido com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizarDestino(int idDestino) {
		
		
	}
}
