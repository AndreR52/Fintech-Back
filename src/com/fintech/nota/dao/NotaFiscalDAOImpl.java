package com.fintech.nota.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fintech.db.DbManager;
import com.fintech.nota.NotaFiscal;

public class NotaFiscalDAOImpl implements NotaFiscalDAO{
	
	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void gravar(NotaFiscal notaFiscal) {
		
		try {
			conexao = DbManager.obterConexao();
			pstmt = conexao.prepareStatement("INSERT INTO T_NOTA_FISCAL " + 
			"(IDT_NOTA, NM_CONTRATADO, NR_DOC_CONTRATADO, NM_CONTRATANTE, NR_CNPJ_CONTRATANTE, VL_NOTA, TX_DESCRICAO) " + 
					"VALUES (SEQ_NOTA_FISCAL.NEXTVAL, ?, ?, ?, ?, ?, ?)");
			
			
			pstmt.setString(1, notaFiscal.getNomeContratado());
			pstmt.setLong(2, notaFiscal.getCpf_cnpjContratado());
			pstmt.setString(3, notaFiscal.getNomeContratante());
			pstmt.setLong(4, notaFiscal.getCnpjContratante());
			pstmt.setDouble(5, notaFiscal.getValorNota());
			pstmt.setString(6, notaFiscal.getDescricaoServico());
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
	public List<NotaFiscal> buscarTodos() {
		
		List<NotaFiscal> notas = new ArrayList<NotaFiscal>();
		ResultSet rs = null;
		
		try {
			conexao = DbManager.obterConexao();
			pstmt = conexao.prepareStatement("SELECT * FROM T_NOTA_FISCAL");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
								
				NotaFiscal nota = new NotaFiscal(rs.getInt("IDT_NOTA"), 
						rs.getString("NM_CONTRATADO"),	rs.getLong("NR_DOC_CONTRATADO"), rs.getString("NM_CONTRATANTE"), rs.getLong("NR_CNPJ_CONTRATANTE"), rs.getDouble("VL_NOTA"), rs.getString("TX_DESCRICAO"));
				
				notas.add(nota);
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
		
		return notas;
	}

	@Override
	public void atualizar(NotaFiscal notaFiscal) {
		
		try {
			conexao = DbManager.obterConexao();
			pstmt = conexao.prepareStatement(
					"UPDATE T_NOTA_FISCAL SET NM_CONTRATADO = ?, NR_DOC_CONTRATADO = ?, NM_CONTRATANTE = ?, NR_CNPJ_CONTRATANTE = ?, VL_NOTA = ?, TX_DESCRICAO = ? WHERE IDT_NOTA = ?");
			pstmt.setString(1, notaFiscal.getNomeContratado());
			pstmt.setLong(2, notaFiscal.getCpf_cnpjContratado());
			pstmt.setString(3, notaFiscal.getNomeContratante());
			pstmt.setLong(4,notaFiscal.getCnpjContratante());
			pstmt.setDouble(5, notaFiscal.getValorNota());
			pstmt.setString(6, notaFiscal.getDescricaoServico());
			pstmt.setInt(7, notaFiscal.getCodigoNotaFiscal());
			
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
			pstmt = conexao.prepareStatement("DELETE FROM T_NOTA_FISCAL WHERE IDT_NOTA = ?");
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
