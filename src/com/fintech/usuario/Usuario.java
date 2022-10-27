package com.fintech.usuario;

abstract class Usuario {
	
	private String nome;
	private String email;
	private int telefone;
	private String senha;
	
	public Usuario (String nome, String email, int telefone, String senha) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}
	
	public Usuario() {}
	
	/*public void consultarSaldo() {
		System.out.println("O saldo atual do/a usuário/a " + this.nome + " é R$ " + this.saldo);
	}*/
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
