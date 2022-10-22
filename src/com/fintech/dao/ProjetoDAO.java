package com.fintech.dao;

import java.util.List;

import com.fintech.projeto.Projeto;

public interface ProjetoDAO {
	
	void gravar(Projeto projeto);
	
	List<Projeto> buscarTodos();
	
	void atualizar(Projeto projeto);
	
	void remover(int codigo);

}
