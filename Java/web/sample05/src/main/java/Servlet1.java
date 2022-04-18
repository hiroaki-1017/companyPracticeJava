

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Map<String, Object>>list = new ArrayList<Map<String, Object>>();
		Map<String, Object>map = new HashMap<String,Object>();

		map.put("name","千賀　滉大");
		map.put("defence", 2.79);
		map.put("win",13);
		map.put("lost",8);
		list.add(map);

		map = new HashMap<String,Object>();
		map.put("name","高橋　礼");
		map.put("defence", 3.34);
		map.put("win", 12);
		map.put("lost",6);
		list.add(map);

		map = new HashMap<String,Object>();
		map.put("name","リバン・モイネロ");
		map.put("defence", 1.52);
		map.put("win", 3);
		map.put("lost",1);
		list.add(map);

		request.setAttribute("list",list);


		getServletContext().getRequestDispatcher("/jsp31.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
