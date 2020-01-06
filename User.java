package jspfiles;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession http = request.getSession();
		Object obj=http.getAttribute("k2");
		if (obj!=null) {
			out.println("<h2>welcome user<br>");
			out.println("<a href='Form.html'>Form Page</a>");
			http.invalidate();
		} else {
			out.println("Unauthorized Access");
		}
	}
}
