package andrea.maino.blog.model.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import andrea.maino.blog.model.entity.Usuario;
import andrea.maino.blog.model.jdbc.ConnectionFactory;

public class UsuarioDao {
	
	 private Connection connection;

	public UsuarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public int adiciona(Usuario usuario) {
		
		String sql = "INSERT INTO usuario (EMAIL, NOME, SENHA) " +
		             "VALUES (?,?,?)";
		
		 try {

	         // prepared statement para inserção
	         PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	         
	         // seta os valores
	         stmt.setString(1,usuario.getEmail());
	         stmt.setString(2,usuario.getNome());
	         stmt.setString(3,usuario.getSenha());

	         // executa
	         stmt.execute();
	         
	         int id = 0;
	         
	         ResultSet rs = stmt.getGeneratedKeys();
	         if (rs.next()){
	             id=rs.getInt(1);
	         }

	         stmt.close();
	         
	         return id;

	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
		
	}
}
