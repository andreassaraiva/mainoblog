package andrea.maino.blog.model.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import andrea.maino.blog.model.entity.Blog;
import andrea.maino.blog.model.jdbc.ConnectionFactory;

public class BlogDao {

	private Connection connection;

	public BlogDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Blog blog) {
		String sql = "INSERT INTO blog (NOME, DESCRICAO, ID_USUARIO) " +
		             "VALUES (?,?,?)";
		
		 try {
	
	        // prepared statement para inserção
	        PreparedStatement stmt = connection.prepareStatement(sql);
	        
	        // seta os valores
	        stmt.setString(1,blog.getNome());
	        stmt.setString(2,blog.getDescricao());
	        stmt.setInt(3,blog.getUsuario().getId());
	
	        // executa
	        stmt.execute();
	        stmt.close();
	
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public Blog recuperaporusuario(int id_usuario){
		return null;
		
	}
	
}
	

