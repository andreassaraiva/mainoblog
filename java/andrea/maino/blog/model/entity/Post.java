package andrea.maino.blog.model.entity;

import java.time.LocalDateTime;

public class Post {
	
	private int id;
	private String titulo;
	private String introducao;
	private String conteudo;
	private LocalDateTime dataHora;
	private Blog blog;
	
	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIntroducao() {
		return introducao;
	}
	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora() {
		this.dataHora = LocalDateTime.now();
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	
	
	

}
