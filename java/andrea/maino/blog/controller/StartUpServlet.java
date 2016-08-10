package andrea.maino.blog.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import andrea.maino.blog.model.jdbc.CriaTabelas;

/**
 * Servlet implementation class StartUpServlet
 */
@WebServlet(value="/login", name="StartupServlet", loadOnStartup=1)
public class StartUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		CriaTabelas.criaTabelas();
	}

}
