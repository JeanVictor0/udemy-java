 package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informa o nome");
		String nome = entrada.nextLine();
		
//		String sql = String.format("INSERT INTO pessoas (nome) VALUES ( ? )", nome);
		String sql = "INSERT INTO pessoas (nome) VALUES ( ? )";
		
		Connection conexao = FabricaConexa	o.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
//		stmt.setInt(2, 100);
		
		stmt.execute();
		
		entrada.close();
	}
}
