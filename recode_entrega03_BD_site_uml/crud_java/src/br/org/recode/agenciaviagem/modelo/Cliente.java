package br.org.recode.agenciaviagem.modelo;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String cpf;
	private String dataNasc;
	private String endereco;
	
	public Cliente(String nome, String cpf, String dataNasc, String endereco, String telFixo, String telMovel) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.telFixo = telFixo;
		this.telMovel = telMovel;
	}
	public Cliente(int idCliente, String nome, String cpf, String dataNasc, String endereco, String telFixo,
			String telMovel) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.telFixo = telFixo;
		this.telMovel = telMovel;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelFixo() {
		return telFixo;
	}
	public String getTelMovel() {
		return telMovel;
	}
	private String telFixo;
	private String telMovel;

}
