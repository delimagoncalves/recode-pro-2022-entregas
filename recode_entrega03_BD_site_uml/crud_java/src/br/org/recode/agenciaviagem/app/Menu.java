package br.org.recode.agenciaviagem.app;

import java.util.ArrayList;
import java.util.Scanner;

import br.org.recode.agenciaviagem.dao.ClienteDAO;
import br.org.recode.agenciaviagem.dao.DestinoDAO;

public class Menu {
	
	private static int opcao;
	private static Scanner scan = new Scanner(System.in);
	
	public static void exibirMenu() {
		System.out.println("--------------------");
		System.out.println("    NG - VIAGENS");
		System.out.println("--------------------");
		System.out.println("  SELECIONE A OPÇÃO:");
		System.out.println("--------------------");
		System.out.println("(1)CADASTRAR");
		System.out.println("(2)CONSULTAR");
		System.out.println("(3)ALTERAR");
		System.out.println("(4)REMOVER");
		System.out.println("(5)REALIZAR COMPRA(NÃO ESTÁ DISPONÍVEL)");
		System.out.println("(0)SAIR");
		System.out.print("DIGITE AQUI: ");
	}

	public static void menuOpcaoCadastro() {
		System.out.println();
		System.out.println("O QUE DESEJA CADASTRAR?");
		System.out.println("(1) CLIENTE");
		System.out.println("(2) DESTINO");
		System.out.println("(3) VOLTAR");
		System.out.print("DIGITE AQUI:");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1: 
			ArrayList<String> parametrosCliente = menuCadCliente();
			ClienteDAO clienteDAO = new ClienteDAO();
			clienteDAO.cadastrar(parametrosCliente);
			break;
		case 2:
			ArrayList<String> parametrosDestibo = menuCadDestino();
			DestinoDAO destinoDAO = new DestinoDAO();
			destinoDAO.cadastrar(parametrosDestibo);
			break;
		
		default:
			System.out.println("Opção Inválida");
			menuOpcaoCadastro();
			break;
		}
		
	}

	private static ArrayList<String> menuCadDestino() {
		ArrayList<String> lista = new ArrayList<String>();
		System.out.println("----------------------------------------");
		System.out.println("       -(CADASTRO DE DESTINOS)-");
		System.out.println("----------------------------------------");
		scan.nextLine();
		System.out.println("ESTADO, APENAS A SIGLA DO ESTADO: ");
		String estado = scan.next();
		lista.add(estado);
		System.out.println("CIDADE: ");
		String cidade = scan.next();
		lista.add(cidade);
		System.out.println("VALOR DIÁRIA: ");
		double diaria = scan.nextDouble();
		lista.add(String.valueOf(diaria));
		return lista;
	}

	private static ArrayList<String> menuCadCliente() {
		ArrayList<String> lista = new ArrayList<String>();
		System.out.println("----------------------------------------");
		System.out.println("       -(CADASTRO DE CLIENTES)-");
		System.out.println("----------------------------------------");
		scan.nextLine();
		System.out.println("NOME: ");
		String nome = scan.next();
		lista.add(nome);
		System.out.println("SOBRENOME: ");
		String sobrenome = scan.next();
		lista.add(sobrenome);
		System.out.println("CPF(APENAS NÚMEROS): ");
		String cpf = scan.next();
		lista.add(cpf);
		System.out.println("DATA DE NASCIMENTO(DD/MM/AAAA): ");
		String dataNasc = scan.next();
		lista.add(dataNasc);
		System.out.println("ENDEREÇO: ");
		String endereco = scan.next();
		lista.add(endereco);
		System.out.println("TELEFONE FIXO(APENAS NÚMEROS): ");
		String telFixo = scan.next();
		lista.add(telFixo);
		System.out.println("TELEFONE MÓVEL(APENAS NÚMEROS): ");
		String telMovel = scan.next();
		lista.add(telMovel);
		return lista;
	}

	public static void menuOpcaoConsulta() {
		System.out.println();
		System.out.println("O QUE DESEJA CONSULTAR?");
		System.out.println("(1) CLIENTE");
		System.out.println("(2) DESTINO");
		System.out.println("(3) VOLTAR");
		System.out.print("DIGITE AQUI:");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1: 
			ClienteDAO clienteDAO = new ClienteDAO();
			System.out.println();
			System.out.println(("------CLIENTES CADASTRADOS NO SISTEMA--------------"));
			System.out.println(("---------------------------------------------------"));
			clienteDAO.listarClientes();
			break;
		case 2:
			DestinoDAO destinoDAO = new DestinoDAO();
			System.out.println();
			System.out.println(("------DESTINOS CADASTRADOS NO SISTEMA--------------"));
			System.out.println(("---------------------------------------------------------------------------------"));
			destinoDAO.listarDestinos();
			break;
		default:
			System.out.println("Opção Inválida");
			menuOpcaoCadastro();
			break;
		}
		
	}

	public static void menuAtualizar() {
		System.out.println();
		System.out.println("O QUE DESEJA ATUALIZAR?");
		System.out.println("(1) CLIENTE");
		System.out.println("(2) DESTINO");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1: 
			ClienteDAO clienteDAO = new ClienteDAO();
			System.out.println();
			System.out.println(("------CLIENTES CADASTRADOS NO SISTEMA--------------"));
			System.out.println(("---------------------------------------------------"));
			clienteDAO.listarClientes();
			System.out.println("-----------------------------------------------------");
			System.out.println("DIGITE O (ID) DO CLIENTE PARA ATUALIZAR: ");
			int idCliente = scan.nextInt();
			ArrayList<String> cliente = menuCadCliente();
			clienteDAO.atualizarCliente(idCliente,cliente);
			System.out.println("Cadastro atualizado com sucesso!");
			break;
		case 2:
			DestinoDAO destinoDAO = new DestinoDAO();
			System.out.println();
			System.out.println(("------DESTINOS CADASTRADOS NO SISTEMA--------------"));
			System.out.println(("---------------------------------------------------------------------------------"));
			destinoDAO.listarDestinos();
			System.out.println("DIGITE O (ID) DO DESTINO PARA ATUALIZAR: ");
			int idDestino = scan.nextInt();
			destinoDAO.atualizarDestino(idDestino);
			System.out.println("Cadastro atualizado com sucesso!");
			break;
		default:
			System.out.println("Opção Inválida");
			menuOpcaoCadastro();
			break;
		}
		
	}

	public static void menuRemover() {
		System.out.println();
		System.out.println("O QUE DESEJA REMOVER?");
		System.out.println("(1) CLIENTE");
		System.out.println("(2) DESTINO");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1: 
			ClienteDAO clienteDAO = new ClienteDAO();
			System.out.println();
			System.out.println(("------CLIENTES CADASTRADOS NO SISTEMA--------------"));
			System.out.println(("---------------------------------------------------"));
			clienteDAO.listarClientes();
			System.out.println("-----------------------------------------------------");
			System.out.println("DIGITE O (ID) DO CLIENTE PARA REMOVER: ");
			int idCliente = scan.nextInt();
			clienteDAO.removerCliente(idCliente);
			break;
		case 2:
			DestinoDAO destinoDAO = new DestinoDAO();
			System.out.println();
			System.out.println(("------DESTINOS CADASTRADOS NO SISTEMA--------------"));
			System.out.println(("---------------------------------------------------------------------------------"));
			destinoDAO.listarDestinos();
			System.out.println("DIGITE O (ID) DO DESTINO PARA REMOVER: ");
			int idDestino = scan.nextInt();
			destinoDAO.removerDestino(idDestino);
			break;
		default:
			System.out.println("Opção Inválida");
			menuOpcaoCadastro();
			break;
		}

		
	}
	
	

	
}
