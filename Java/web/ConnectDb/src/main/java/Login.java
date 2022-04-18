

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.LoginBeen;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
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
		LoginBeen lb = new LoginBeen();
		request.setAttribute("lb", lb);
		getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginBeen lb = new LoginBeen();
	      lb.setId(request.getParameter("id"));
	      lb.setPass(request.getParameter("pass"));
	      //System.out.println("id="+ id);
	      //System.out.println("pass"+ pass);
	      //チェック
	      if(!lb.check()) {
	            request.setAttribute("lb",lb);
	            getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
	            return;
	      }
	      response.setCharacterEncoding("UTF-8");
	      response.setContentType("text/html;charset=UTF-8");
	      response.getWriter().append("こんにちは、").append(lb.getShain_name()).append("さんがログイン中・・・");
	      response.getWriter().append("こんにちは、").append(lb.getShain_code()).append("さんがログイン中・・・");

	}

}
