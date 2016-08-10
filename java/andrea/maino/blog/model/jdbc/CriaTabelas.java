package andrea.maino.blog.model.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriaTabelas {
public static boolean criaTabelas() {
		
		try {
		 
			String sqlUsuario = "CREATE TABLE IF NOT EXISTS USUARIO (" +
		              			"ID         SERIAL PRIMARY KEY	NOT NULL," +
		              			"EMAIL      TEXT	 NOT NULL," +
		              			"NOME       TEXT	 NOT NULL," +
		              			"SENHA	    CHAR(10) NOT NULL)";
		
		 
			PreparedStatement stmt = new ConnectionFactory().getConnection().prepareStatement(sqlUsuario);
			
			stmt.execute();
			stmt.close();
			
			String sqlBlog = "CREATE TABLE IF NOT EXISTS BLOG (" +
          			"ID         SERIAL PRIMARY KEY	NOT NULL," +
          			"NOME       TEXT	 NOT NULL," +
          			"DESCRICAO	TEXT," +
          			"ID_USUARIO INT REFERENCES USUARIO(ID) NOT NULL)";
			
			PreparedStatement stmt_blog = new ConnectionFactory().getConnection().prepareStatement(sqlBlog);
			
			stmt_blog.execute();
			stmt_blog.close();
			
			String sqlPost = "CREATE TABLE IF NOT EXISTS POST (" +
          			"ID         SERIAL PRIMARY KEY	NOT NULL," +
          			"TITULO      TEXT	 NOT NULL," +
          			"INTRODUCAO  TEXT	 NOT NULL," +
          			"CONTEUDO    TEXT	 NOT NULL," +
          			"DATAHORA	 timestamp  NOT NULL," +
          			"ID_BLOG INT REFERENCES BLOG(ID) NOT NULL)";
			
			PreparedStatement stmt_post = new ConnectionFactory().getConnection().prepareStatement(sqlPost);
			
			stmt_post.execute();
			stmt_post.close();
			
			String sqlComentario = "CREATE TABLE IF NOT EXISTS COMENTARIO (" +
          			"ID         SERIAL PRIMARY KEY	NOT NULL," +
          			"AUTOR      TEXT	 NOT NULL," +
          			"COMENTARIO       TEXT	 NOT NULL," +
          			"DATAHORA	 timestamp  NOT NULL," +
          			"ID_POST    INT REFERENCES POST(ID) NOT NULL)";
		
			PreparedStatement stmt_comentario = new ConnectionFactory().getConnection().prepareStatement(sqlComentario);
			
			stmt_comentario.execute();
			stmt_comentario.close();
		 
		 } catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
		
		return false;
	}
}
