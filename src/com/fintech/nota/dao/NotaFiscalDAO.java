package com.fintech.nota.dao;

import java.util.List;

import com.fintech.nota.NotaFiscal;

public interface NotaFiscalDAO {
	
void gravar(NotaFiscal notaFiscal);
	
	List<NotaFiscal> buscarTodos();
	
	void atualizar(NotaFiscal notaFiscal);
	
	void remover(int codigo);

}
