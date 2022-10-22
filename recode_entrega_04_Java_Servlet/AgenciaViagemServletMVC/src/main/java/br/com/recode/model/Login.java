package br.com.recode.model;

public class Login {

	private int idLogin;
	private String usuario;
	private String senha;
	private boolean usuarioPadrao;
	
	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	public int getIdLogin() {
		return idLogin;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	public boolean isUsuarioPadrao() {
		return usuarioPadrao;
	}
	
	
}
