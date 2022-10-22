package com.fintech.usuario;

public class Contratado extends Usuario {
	
	private int cpf_cnpj;
	private int idade;
	
	public Contratado (String nome, String email, int senha, int cpf_cnpj, int idade) {
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
		this.cpf_cnpj = cpf_cnpj;
		this.idade = idade;
		System.out.println("Usuário/a " + this.getNome() + " criado/a com sucesso!");
		
	}
	
	public void transferirSaldo(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public void buscarContratado() {
		System.out.println("Dados do/a usuário/a:\n"
				+ "Nome: " + this.getNome()
				+ "\nEmail: " + this.getEmail()
				+ "\nCPF/CNPJ: " + this.getCpf_cnpj()
				+ "\nTelefone: " + this.getTelefone()
				+ "\nIdade: " + this.idade);
	}

	public int getCpf_cnpj() {
		return cpf_cnpj;
	}

	public int getIdade() {
		return idade;
	}		
}
