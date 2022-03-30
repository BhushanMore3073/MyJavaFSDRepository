

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employeedashboard
 */
@WebServlet("/Employeedashboard")
public class Employeedashboard extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String user = req.getParameter("user");
		String pass = req.getParameter("password");
		
		if ("vinod".equals(user) && "ambatkar".equals(pass)) {
			response(resp, "login ok");
		} else {
			response(resp, "invalid login");
		}
	}

	private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}

}
	
   
	