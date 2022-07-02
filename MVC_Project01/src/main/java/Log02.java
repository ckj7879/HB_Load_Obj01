

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Log02")
public class Log02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Log02() {
        super();
         }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		out.println("<html>");
		out.println("<body bgcolor='lightgreen'>");
		out.println("<center>");
		
		
		
		LoginBean bean=(LoginBean)request.getAttribute("bean");
		
		String s1=bean.getName();
		
		out.println("Welcome...");
		out.println(s1);
		
		out.println("</center>");
		out.println("</body>");
		out.print("</html>");
		
		
		
	}

}
