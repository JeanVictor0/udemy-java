package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public static Connection getConexao() {
		final String stringDeConexao = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false?useSSL=true";
		final String usuario = "root";
		final String senha = "12345678";
		try {
			Connection conexao1 = DriverManager.getConnection(stringDeConexao,usuario,senha);
			return conexao1;
		} catch (SQLException e) {
			return null;
		}

	}
}
