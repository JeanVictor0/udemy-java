package jdbc;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
//	private final static String stringDeConexao = "jdbc:mysql://localhost:3306/?verifyServerCertificate=false?useSSL=true";
//	private final static String usuario = "root";
//	private final static String senha = "12345678";
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		Statement statement = conexao.createStatement();
		statement.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso");
		
		conexao.close();
	}
	
}

