package com.fintech.nota;

import java.io.Serializable;

/*import com.fintech.usuario.Contratado;
import com.fintech.usuario.Contratante;*/

public class NotaFiscal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int codigoNotaFiscal;
	private String nomeContratado;
	private long cpf_cnpjContratado;
	private String nomeContratante;
	private long cnpjContratante;	
	//private Contratado contratado;
	//private Contratante contratante;
	private double valorNota;
	private String descricaoServico;
	
	public NotaFiscal (int codigo, String nomeContratado, long cpf_cnpj, String nomeContratante, long cnpj, double valorNota, String descricaoServico) {
		this.nomeContratado = nomeContratado;
		this.cpf_cnpjContratado = cpf_cnpj;
		this.nomeContratante = nomeContratante;
		this.cnpjContratante = cnpj;
		this.codigoNotaFiscal = codigo;
		//this.contratado = contratado;
		//this.contratante = contratante;
		this.valorNota = valorNota;
		this.descricaoServico = descricaoServico;
	}
	
	public NotaFiscal() {}
	
	public void enviarNota() {
		
	}

	public String getNomeContratado() {
		return nomeContratado;
	}

	public void setNomeContratado(String nomeContratado) {
		this.nomeContratado = nomeContratado;
	}

	public long getCpf_cnpjContratado() {
		return cpf_cnpjContratado;
	}

	public void setCpf_cnpjContratado(long cpf_cnpjContratado) {
		this.cpf_cnpjContratado = cpf_cnpjContratado;
	}

	public String getNomeContratante() {
		return nomeContratante;
	}

	public void setNomeContratante(String nomeContratante) {
		this.nomeContratante = nomeContratante;
	}

	public long getCnpjContratante() {
		return cnpjContratante;
	}

	public void setCnpjContratante(long cnpjContratante) {
		this.cnpjContratante = cnpjContratante;
	}
	
	public int getCodigoNotaFiscal() {
		return codigoNotaFiscal;
	}

	public void setCodigoNotaFiscal(int codigoNotaFiscal) {
		this.codigoNotaFiscal = codigoNotaFiscal;
	}

	/*public Contratado getContratado() {
		return contratado;
	}

	public void setContratado(Contratado contratado) {
		this.contratado = contratado;
	}

	public Contratante getContratante() {
		return contratante;
	}

	public void setContratante(Contratante contratante) {
		this.contratante = contratante;
	}*/
	
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
	
	@Override
	public String toString() {
		
		return "Nota fiscal [nota = " + codigoNotaFiscal + " nome do contratado " + nomeContratado + " documento do contratado "
		+ " nome do contratante = " + " CNPJ do contratante + " + cnpjContratante + " valor da nota = " + valorNota
		+ " descrição do serviço = " + descricaoServico + "]";
	}
}
