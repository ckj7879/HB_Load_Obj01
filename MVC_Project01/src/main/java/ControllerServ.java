
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ControllerServ extends HttpServlet {
	
	
	
	private static final long serialVersionUID = 1L;

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		
		// Bean class Operation Starts...
		
		LoginBean bean=new LoginBean();
		
		bean.setName(name);
		bean.setPassword(password);
		
		
		request.setAttribute("bean", bean);
		
		//HttpSession ses=request.getSession();
		//ses.setAttribute("bean",name);
		
		boolean status=bean.validate();
		
		
		if(status)
		{
			//RequestDispatcher rd=request.getRequestDispatcher("login_success.jsp");
			RequestDispatcher rd=request.getRequestDispatcher("./log02");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login_error.jsp");
			rd.forward(request, response);
					
		}
		
		
		
		
		
	}

}
