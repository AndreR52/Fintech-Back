package com.fintech.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.fintech.nota.NotaFiscal;
import com.fintech.nota.dao.NotaFiscalDAO;
import com.fintech.nota.dao.NotaFiscalDAOImpl;
import com.fintech.projeto.Projeto;
import com.fintech.projeto.dao.ProjetoDAO;
import com.fintech.projeto.dao.ProjetoDAOImpl;

public class TesteCrud {

	public static void main(String[] args) {
		
			ProjetoDAO daoProjeto = new ProjetoDAOImpl();
			
			Projeto projeto = new Projeto();
			
			/*projeto.setNomeProjeto("Projeto 1");
			Calendar calendar = new GregorianCalendar(2018, 6, 9);
			projeto.setDataCriacao(calendar);
			
			daoProjeto.gravar(projeto);
			
			System.out.println("O projeto " + projeto.getNomeProjeto() + "  foi criado");
			
			projeto.setNomeProjeto("Projeto 2");
			Calendar calendar2 = new GregorianCalendar(2020, 11, 5);
			projeto.setDataCriacao(calendar2);
			
			daoProjeto.gravar(projeto);
			
			System.out.println("O projeto " + projeto.getNomeProjeto() + "  foi criado");
			
			projeto.setNomeProjeto("Projeto 3");
			Calendar calendar3 = new GregorianCalendar(2020, 12, 20);
			projeto.setDataCriacao(calendar3);
			
			daoProjeto.gravar(projeto);
			
			System.out.println("O projeto " + projeto.getNomeProjeto() + "  foi criado");
			
			projeto.setNomeProjeto("Projeto 4");
			Calendar calendar4 = new GregorianCalendar(2021, 1, 19);
			projeto.setDataCriacao(calendar4);
			
			daoProjeto.gravar(projeto);
			
			System.out.println("O projeto " + projeto.getNomeProjeto() + "  foi criado");
			
			projeto.setNomeProjeto("Projeto 5");
			Calendar calendar5 = new GregorianCalendar(2021, 3, 10);
			projeto.setDataCriacao(calendar5);
			
			daoProjeto.gravar(projeto);
			
			System.out.println("O projeto " + projeto.getNomeProjeto() + "  foi criado");*/
		
		
		
			
			/*projeto.setCodigoProjeto(2);
			projeto.setNomeProjeto("Projeto novo");
			Calendar calendar = new GregorianCalendar(2022, 9, 27);
			projeto.setDataCriacao(calendar);
			
			daoProjeto.atualizar(projeto);
			
			System.out.println("Projeto "+ projeto.getNomeProjeto() + " atualizado");*/
		
		
		
			
			List<Projeto> projetos = daoProjeto.buscarTodos();
			
			for(Projeto proj: projetos) {
				System.out.println(proj.toString());
			}	
			
		
		
		
			/*daoProjeto.remover(7);
			
			System.out.println("Projeto removido");*/
		
		
		
		
		NotaFiscalDAO daoNota = new NotaFiscalDAOImpl();
		
		NotaFiscal nota = new NotaFiscal();
		
		/*nota.setNomeContratado("Paula");
		nota.setCpf_cnpjContratado(12345678901L);
		nota.setNomeContratante("Maria");
		nota.setCnpjContratante(98765432198L);
		nota.setValorNota(1250.50);
		nota.setDescricaoServico("Serviço 1");
		
		daoNota.gravar(nota);
		
		System.out.println("Nota " + nota.getDescricaoServico() + " criada");
		
		nota.setNomeContratado("João");
		nota.setCpf_cnpjContratado(12345678901L);
		nota.setNomeContratante("Padro");
		nota.setCnpjContratante(98765432198L);
		nota.setValorNota(550.55);
		nota.setDescricaoServico("Serviço 2");
		
		daoNota.gravar(nota);
		
		System.out.println("Nota " + nota.getDescricaoServico() + " criada");
		
		nota.setNomeContratado("Pedro");
		nota.setCpf_cnpjContratado(12345678901L);
		nota.setNomeContratante("Sonia");
		nota.setCnpjContratante(98765432198L);
		nota.setValorNota(150.50);
		nota.setDescricaoServico("Serviço 3");
		
		daoNota.gravar(nota);
		
		System.out.println("Nota " + nota.getDescricaoServico() + " criada");
		
		nota.setNomeContratado("Mario");
		nota.setCpf_cnpjContratado(12345678901L);
		nota.setNomeContratante("Carla");
		nota.setCnpjContratante(98765432198L);
		nota.setValorNota(7300.30);
		nota.setDescricaoServico("Serviço 4");
		
		daoNota.gravar(nota);
		
		System.out.println("Nota " + nota.getDescricaoServico() + " criada");
		
		nota.setNomeContratado("Fabio");
		nota.setCpf_cnpjContratado(12345678901L);
		nota.setNomeContratante("Celia");
		nota.setCnpjContratante(98765432198L);
		nota.setValorNota(199.99);
		nota.setDescricaoServico("Serviço 5");
		
		daoNota.gravar(nota);
		
		System.out.println("Nota " + nota.getDescricaoServico() + " criada");*/
		
		
		
		
		
		List<NotaFiscal> notas = daoNota.buscarTodos();
		
		for(NotaFiscal not: notas) {
			System.out.println(not.toString());
		}
		
		
		
		
		/*nota.setCodigoNotaFiscal(2);
		nota.setNomeContratado("Pedro");
		nota.setCpf_cnpjContratado(658464);
		nota.setNomeContratante("Jorge");
		nota.setCnpjContratante(6864654);
		nota.setValorNota(150.50);
		nota.setDescricaoServico("Serviço novo");
		
		daoNota.atualizar(nota);
		
		System.out.println("Nota Fiscal " + nota.getDescricaoServico() + " atualizada");*/
		
		
		
		
		//daoNota.remover(1);
	}

}
