package com.fintech.projeto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Projeto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int codigoProjeto;
	private String nomeProjeto;
	private Calendar dataCriacao;
	
	public Projeto (int codigo, String nome, Calendar data) {
		this.codigoProjeto = codigo;
		this.nomeProjeto = nome;
		this.dataCriacao = data;
	}
	
	public Projeto() {};
	
	public void adicionarContratado(int cpf_cnpj) {
		
	}	

	public int getCodigoProjeto() {
		return codigoProjeto;
	}

	public void setCodigoProjeto(int codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	
	
	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		return "Projeto [codigo = " + codigoProjeto + " nome= " + nomeProjeto + " data= " +sdf.format(dataCriacao.getTime()) + "]";
	}
}
