

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
		LoginBean lb = new LoginBean();
		request.setAttribute("lb", lb);
		getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		LoginBean lb = new LoginBean();

		try {
			lb.setNum1(Integer.parseInt(request.getParameter("num1")));
			lb.setNum2(Integer.parseInt(request.getParameter("num2")));
			lb.setAnswer(lb.getNum1() + lb.getNum2());

		} catch(Exception e) {
			lb.setMsg("整数に変換できません");
		}
		request.setAttribute("lb", lb);
		getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
	}

}
