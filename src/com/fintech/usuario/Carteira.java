package com.fintech.usuario;

public class Carteira extends Usuario {
	
	private int codigoCarteira;
	private double saldo;
	
	public Carteira (String nome, String email, int telefone, String senha) {
		super(nome, email, telefone, senha);
		this.saldo = 0;
	}
	
	public Carteira() {}
	
	public int getNumeroConta() {
		return codigoCarteira;
	}
	public void setNumeroConta(int numeroConta) {
		this.codigoCarteira = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
