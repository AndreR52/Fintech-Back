package com.fintech.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.fintech.dao.ProjetoDAO;
import com.fintech.dao.ProjetoDAOImpl;
import com.fintech.projeto.Projeto;

public class TesteCrud {

	public static void main(String[] args) {
		
			ProjetoDAO dao = new ProjetoDAOImpl();
			
			Projeto projeto = new Projeto();
			
			projeto.setNomeProjeto("Projeto 10");
			Calendar calendar = new GregorianCalendar(2020, 8, 12);
			projeto.setDataCriacao(calendar);
			
			/*dao.gravar(projeto);
			
			System.out.println("O produto foi criado");*/
			
			/*projeto.setCodigoProjeto(2);
			projeto.setNomeProjeto("Projeto novo");
			
			dao.atualizar(projeto);
			
			System.out.println("Projeto atualizado");*/
			
			dao.remover(7);
			
			System.out.println("Projeto removido");
	}

}
