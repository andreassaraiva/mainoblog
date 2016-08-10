package andrea.maino.blog.model.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import andrea.maino.blog.model.entity.Comentario;
import andrea.maino.blog.model.jdbc.ConnectionFactory;

public class ComentarioDao {
	
	private Connection connection;

	public ComentarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Comentario comentario) {
		String sql = "INSERT INTO comentario (AUTOR, COMENTARIO, DATAHORA, ID_POST) " +
                "VALUES (?,?,?,?)";

		 try {
	
	      // prepared statement para inserção
	      PreparedStatement stmt = connection.prepareStatement(sql);
	      
	      // seta os valores
	      stmt.setString(1,comentario.getAutor());
	      stmt.setString(2,comentario.getComentario());
	      stmt.setTimestamp(3, Timestamp.valueOf(comentario.getDataHora()));
	      stmt.setInt(4,comentario.getPost().getId());
	
	      // executa
	      stmt.execute();
	      stmt.close();
	
	  } catch (SQLException e) {
	      throw new RuntimeException(e);
	  }
	}
	

}
