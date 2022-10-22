package br.org.recode.agenciaviagem.main;

import java.sql.Connection;
import java.util.Scanner;

import br.org.recode.agenciaviagem.app.Menu;
import br.org.recode.agenciaviagem.conexao.Conexao;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Menu.exibirMenu();
		int opcao = scan.nextInt();
		while(opcao != 0) {
			if(opcao == 1) {
				Menu.menuOpcaoCadastro();
				break;
			}else if(opcao == 2) {
				Menu.menuOpcaoConsulta();
				break;
			}else if(opcao == 3){
				Menu.menuAtualizar();
				break;
			}else if(opcao == 4) {
				Menu.menuRemover();
				break;
			} else if(opcao == 5){
				System.exit(0);
			}else {
				System.out.println("Opção Inválida!");
			}
			Menu.exibirMenu();
			opcao = scan.nextInt();
		}
	}
}
