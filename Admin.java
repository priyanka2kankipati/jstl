package jspfiles;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();	
	//	RequestDispatcher rd;
		//String att=(String)(session.getAttribute("k1"));
		Object obj=session.getAttribute("user");
		//out.println(obj.toString());
		
		if (obj==null) {
			out.println("Unauthorized Access");
			//rd=request.getRequestDispatcher("Form.html");
			
			} else {
			
				out.println("<h2>welcome Admin<br>");
				out.println("<a href='Form.html'>Form Page</a>");
				session.invalidate();
		}
	}

}
