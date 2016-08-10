package andrea.maino.blog.model.entity;

import java.time.LocalDateTime;

public class Comentario {

	private int id;
	private String autor;
	private String comentario;
	private LocalDateTime dataHora;
	private Post post;
	
	public int getId() {
		return id;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora() {
		this.dataHora = LocalDateTime.now();
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
}
