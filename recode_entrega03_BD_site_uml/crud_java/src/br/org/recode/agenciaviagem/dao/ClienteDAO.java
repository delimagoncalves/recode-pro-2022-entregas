package br.org.recode.agenciaviagem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.org.recode.agenciaviagem.conexao.Conexao;

public class ClienteDAO {

	private String sql;
	private Connection conexao = Conexao.createConnectionToMySQL();

	public int cadastrar(ArrayList<String> parametrosCLiente) {

		String nome = parametrosCLiente.get(0);
		String sobrenome = parametrosCLiente.get(1);
		String cpf = parametrosCLiente.get(2);
		String dataNasc = parametrosCLiente.get(3);
		String telFixo = parametrosCLiente.get(4);
		String telMovel = parametrosCLiente.get(5);
		String endereco = parametrosCLiente.get(6);

		sql = "insert into Cliente (nome,sobrenome, cpf, data_nasc, endereco, tel_fixo, tel_movel) values (?,?,?,?,?,?,?)";
		try {
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.setString(1, nome);
			statement.setString(2, sobrenome);
			statement.setString(3, cpf);
			statement.setString(4, dataNasc);
			statement.setString(5, endereco);
			statement.setString(6, telFixo);
			statement.setString(7, telMovel);
			statement.execute();
			System.out.println("Cliente cadastrado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return 1;
	}

	public void listarClientes() {
		sql = "select * from Cliente";
		try {

			PreparedStatement statement = conexao.prepareStatement(sql);

			ResultSet resultSet = statement.executeQuery();

			System.out.println("ID\tNOME\tSORENOME\tCPF\t\tNASCIMENTO\tTELEFONE\tCELULAR\t\tENDERECO");

			while (resultSet.next()) {

				int idCliente = resultSet.getInt("id_cliente");
				String nome = resultSet.getString("nome");
				String sobrenome = resultSet.getString("sobrenome");
				String cpf = resultSet.getString("cpf");
				String dataNasc = resultSet.getString("data_nasc");
				String telFixo = resultSet.getString("tel_fixo");
				String telMovel = resultSet.getString("tel_movel");
				String endereco = resultSet.getString("endereco");

				System.out.println(idCliente + "\t" + nome + "\t" + sobrenome + "\t\t" + cpf + "\t\t" + dataNasc
						+ "\t\t" + telFixo + "\t\t" + telMovel + "\t\t" + endereco);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removerCliente(int opcao) {

		sql = "delete from Cliente where id_cliente = ?";

		try {

			PreparedStatement statement = conexao.prepareStatement(sql);

			statement.setInt(1, opcao);
			statement.execute();
			System.out.println("Cliente removido com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void atualizarCliente(int idCliente, ArrayList<String> cliente) {

		sql = "update Cliente set nome = ?, sobrenome = ?, cpf =?, data_nasc = ?, endereco = ? ,tel_fixo = ?, tel_movel = ?  where id_cliente = ?";

		try {

			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.setString(1, cliente.get(0));
			statement.setString(2, cliente.get(1));
			statement.setString(3, cliente.get(2));
			statement.setString(4, cliente.get(3));
			statement.setString(5, cliente.get(4));
			statement.setString(6, cliente.get(5));
			statement.setString(7, cliente.get(6));
			statement.setInt(8, idCliente);
			
			statement.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
