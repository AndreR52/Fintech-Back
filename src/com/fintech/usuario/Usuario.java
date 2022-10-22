package com.fintech.usuario;

public class Usuario {
	
	private String nome;
	private String email;
	private int telefone;
	private int senha;
	private double saldo;
	
	public void consultarSaldo() {
		System.out.println("O saldo atual do/a usuário/a " + this.nome + " é R$ " + this.saldo);
	}
	
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

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
