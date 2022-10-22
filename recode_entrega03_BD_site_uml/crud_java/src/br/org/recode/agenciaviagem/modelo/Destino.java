package br.org.recode.agenciaviagem.modelo;

public class Destino {

	private int idDestino;
	private String estado;
	private String cidade;
	private double valorDiaria;
		
	public Destino(String estado, String cidade, double valorDiaria) {
		super();
		this.estado = estado;
		this.cidade = cidade;
		this.valorDiaria = valorDiaria;
	}
	public Destino(int idDestino, String estado, String cidade, double valorDiaria) {
		super();
		this.idDestino = idDestino;
		this.estado = estado;
		this.cidade = cidade;
		this.valorDiaria = valorDiaria;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public String getEstado() {
		return estado;
	}
	public String getCidade() {
		return cidade;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	
	
}
