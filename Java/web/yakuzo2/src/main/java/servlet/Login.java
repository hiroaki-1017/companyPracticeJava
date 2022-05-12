package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoginBean;

/**
 * Servlet implementation class Login
 */
@WebServlet("/")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		LoginBean lb = new LoginBean();
		request.setAttribute("lb",lb);
		getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginBean lb = new LoginBean();
		lb.setShain_code(request.getParameter("shain_code").toString());
		lb.setPassword(request.getParameter("password").toString());
		lb.setTenpo_code(request.getParameter("tenpo_code").toString());

		if(!lb.check()) {
			request.setAttribute("lb", lb);
			getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
		}

		//sessionに記憶
		HttpSession session = request.getSession();
		session.setAttribute("login_shain_code", lb.getShain_code());




	}

}
