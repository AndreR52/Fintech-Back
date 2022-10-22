package com.fintech.nota;

public class NotaFiscal {
	
	private String nomeContratado;
	private int cpf_cnpjContratado;
	private String nomeContratante;
	private int cnpjContratante;
	private double valorNota;
	private String descricaoServico;
	
	public NotaFiscal (String nomeContratado, int cpf_cnpj, String nomeContratante, int cnpj, double valorNota, String descricaoServico) {
		this.nomeContratado = nomeContratado;
		this.cpf_cnpjContratado = cpf_cnpj;
		this.nomeContratante = nomeContratante;
		this.cnpjContratante = cnpj;
		this.valorNota = valorNota;
		this.descricaoServico = descricaoServico;
	}
	
	public void enviarNota() {
		
	}

	public String getNomeContratado() {
		return nomeContratado;
	}

	public void setNomeContratado(String nomeContratado) {
		this.nomeContratado = nomeContratado;
	}

	public int getCpf_cnpjContratado() {
		return cpf_cnpjContratado;
	}

	public void setCpf_cnpjContratado(int cpf_cnpjContratado) {
		this.cpf_cnpjContratado = cpf_cnpjContratado;
	}

	public String getNomeContratante() {
		return nomeContratante;
	}

	public void setNomeContratante(String nomeContratante) {
		this.nomeContratante = nomeContratante;
	}

	public int getCnpjContratante() {
		return cnpjContratante;
	}

	public void setCnpjContratante(int cnpjContratante) {
		this.cnpjContratante = cnpjContratante;
	}

	public double getValorNota() {
		return valorNota;
	}

	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
}
