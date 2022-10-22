package com.fintech.usuario;

public class Contratante extends Usuario {	
	
	private int cnpj;
	
	public Contratante (String nome, String email, int senha, int cnpj) {
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
		this.cnpj = cnpj;
		System.out.println("Usuário/a " + this.getNome() + " criado/a com sucesso!");
	}
	
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
		
	public void realizarPagamento(double valor, int cpf_cnpj) {
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public void buscarContratante() {
		System.out.println("Dados do/a usuário/a:\n"
				+ "Nome: " + this.getNome()
				+ "\nEmail: " + this.getEmail()
				+ "\nCNPJ: " + this.getCnpj()
				+ "\nTelefone: " + this.getTelefone());
	}

	public int getCnpj() {
		return cnpj;
	}
	
}
