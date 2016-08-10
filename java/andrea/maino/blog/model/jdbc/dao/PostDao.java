package andrea.maino.blog.model.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import andrea.maino.blog.model.entity.Post;
import andrea.maino.blog.model.jdbc.ConnectionFactory;

public class PostDao {
	
	private Connection connection;

	public PostDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Post post){
		String sql = "INSERT INTO post (TITULO, INTRODUCAO, CONTEUDO, DATAHORA, ID_BLOG) " +
	                 "VALUES (?,?,?,?,?)";
	
		 try {
	
	       // prepared statement para inserção
	       PreparedStatement stmt = connection.prepareStatement(sql);
	       
	       // seta os valores
	       stmt.setString(1,post.getTitulo());
	       stmt.setString(2,post.getIntroducao());
	       stmt.setString(3, post.getConteudo());
	       stmt.setTimestamp(4, Timestamp.valueOf(post.getDataHora()));
	       stmt.setInt(5,post.getBlog().getId());
	
	       // executa
	       stmt.execute();
	       stmt.close();
	
	   } catch (SQLException e) {
	       throw new RuntimeException(e);
	   }
	}
	
}
