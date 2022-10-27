package com.fintech.usuario;

public class Contratante extends Usuario {	
	
	private long cnpj;
	
	public Contratante (String nome, String email, int telefone, String senha, int cnpj) {
		super(nome, email, telefone, senha);
		this.cnpj = cnpj;
		System.out.println("Usuário/a " + this.getNome() + " criado/a com sucesso!");
	}
	
	public Contratante() {}
	
	/*public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
		
	public void realizarPagamento(double valor, int cpf_cnpj) {
		this.setSaldo(this.getSaldo() - valor);
	}*/
	
	public void buscarContratante() {
		System.out.println("Dados do/a usuário/a:\n"
				+ "Nome: " + this.getNome()
				+ "\nEmail: " + this.getEmail()
				+ "\nCNPJ: " + this.getCnpj()
				+ "\nTelefone: " + this.getTelefone());
	}

	public long getCnpj() {
		return cnpj;
	}
	
}
