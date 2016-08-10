package andrea.maino.blog.controller.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import andrea.maino.blog.model.entity.Blog;
import andrea.maino.blog.model.entity.Usuario;
import andrea.maino.blog.model.jdbc.dao.BlogDao;
import andrea.maino.blog.model.jdbc.dao.UsuarioDao;

public class CriaBlog implements Action {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String nome = request.getParameter("nome");
		
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		usuario.setSenha(senha);
		usuario.setNome(nome);
		
		UsuarioDao dao = new UsuarioDao();
		int id_usuario = dao.adiciona(usuario);
		
		request.setAttribute("id_usuario", id_usuario);
		
		usuario.setId(id_usuario);
		
		String nome_blog = request.getParameter("nome_blog");
		String desc_blog = request.getParameter("desc_blog");
		
		Blog blog = new Blog();
		blog.setNome(nome_blog);
		blog.setDescricao(desc_blog);
		blog.setUsuario(usuario);
		
		BlogDao daoblog = new BlogDao();
		daoblog.adiciona(blog);
		
		HttpSession session = request.getSession();
		session.setAttribute("blog", blog);
		
		return "admin-blog.jsp";
	}

}
