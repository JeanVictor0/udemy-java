package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	private final static String stringDeConexao = "jdbc:mysql://localhost:3306/agenda?verifyServerCertificate=false?useSSL=true";
	private final static String usuario = "root";
	private final static String senha = "12345678";
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = DriverManager.getConnection(stringDeConexao,usuario,senha);
		
		conexao.close();
	}
	


}
