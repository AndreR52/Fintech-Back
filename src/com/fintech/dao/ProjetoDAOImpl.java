package com.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.fintech.db.DbManager;
import com.fintech.projeto.Projeto;

public class ProjetoDAOImpl implements ProjetoDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void gravar(Projeto projeto) {
		
		try {
			conexao = DbManager.obterConexao();
			pstmt = conexao.prepareStatement("INSERT INTO T_PROJETO " + 
			"(IDT_PROJETO, NM_PROJETO, DT_CRIACAO) " + 
					"VALUES (SEQ_PROJETO.NEXTVAL, ?, ?)");
			
			
			pstmt.setString(1, projeto.getNomeProjeto());
			pstmt.setDate(2, new java.sql.Date(projeto.getDataCriacao().getTimeInMillis()));
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				pstmt.close();
				conexao.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	}

	@Override
	public List<Projeto> buscarTodos() {
		
		List<Projeto> projetos = new ArrayList<Projeto>();
		ResultSet rs = null;
		
		try {
			conexao = DbManager.obterConexao();
			pstmt = conexao.prepareStatement("SELECT * FROM T_PROJETO");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				java.sql.Date data = rs.getDate("DT_CRIACAO");
				Calendar dtCriacao = Calendar.getInstance();
				dtCriacao.setTimeInMillis(data.getTime());
				
				Projeto projeto = new Projeto(rs.getInt("IDT_PROJETO"), 
						rs.getString("NM_PROJETO"),	dtCriacao);
				
				projetos.add(projeto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				pstmt.close();
				rs.close();
				conexao.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return projetos;
	}

	@Override
	public void atualizar(Projeto projeto) {
		
		try {
			conexao = DbManager.obterConexao();
			pstmt = conexao.prepareStatement(
					"UPDATE T_PROJETO SET NM_PROJETO = ?, DT_CRIACAO = ? WHERE IDT_PROJETO = ?");
			pstmt.setString(1, projeto.getNomeProjeto());
			pstmt.setDate(2, new java.sql.Date(projeto.getDataCriacao().getTimeInMillis()));
			pstmt.setInt(3, projeto.getCodigoProjeto());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				pstmt.close();
				conexao.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void remover(int codigo) {
		
		try {
			conexao = DbManager.obterConexao();
			pstmt = conexao.prepareStatement("DELETE FROM T_PROJETO WHERE IDT_PROJETO = ?");
			pstmt.setInt(1, codigo);
			pstmt.executeUpdate();
						
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				pstmt.close();
				conexao.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	}
}
