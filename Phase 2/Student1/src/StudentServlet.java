

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")

public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int rollno=Integer.parseInt(request.getParameter("txtrollno"));
        String name=request.getParameter("txtname");
        int marks=Integer.parseInt(request.getParameter("txtmarks"));
        PrintWriter out=response.getWriter();
        out.println(rollno);
        out.println(name);
        out.println(marks);
        
        
    }
}
