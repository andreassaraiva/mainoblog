package andrea.maino.blog.controller.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	String executa(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
