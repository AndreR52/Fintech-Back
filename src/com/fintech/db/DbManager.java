package com.fintech.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbManager {
	
	public static Connection obterConexao() {
		
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM96010",
					"270991");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conexao;
	}
}