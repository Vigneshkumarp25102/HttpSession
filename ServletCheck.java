import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
public class ServletCheck extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	static String myUsername="vignesh";
	static String myPassword="vignesh@123";

	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();

		if(myUsername.equals(username) && myPassword.equals(password)) {

			HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("visit");
			response.setStatus(HttpServletResponse.SC_OK);
		}else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('username and password is incorrect');");
			   out.println("</script>");
			   
		}	
	}	
}
