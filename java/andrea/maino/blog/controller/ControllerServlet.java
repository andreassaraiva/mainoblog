package andrea.maino.blog.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import andrea.maino.blog.controller.acao.Action;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/blog")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametro = request.getParameter("action");
        String nomeDaClasse = "andrea.maino.blog.controller.acao." + parametro;

        try {
            Class<?> classe = Class.forName(nomeDaClasse);

            Action logica = (Action) classe.newInstance();
            String pagina = logica.executa(request, response);

            request.getRequestDispatcher(pagina).forward(request, response);

        } catch (Exception e) {
            throw new ServletException(
              "A lógica de negócios causou uma exceção", e);
        }
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}

}
