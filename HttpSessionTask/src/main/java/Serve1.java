import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Serve1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String empName = req.getParameter("empName");
		out.print("Welcome to our company " +empName);
		
		HttpSession session = req.getSession();
		session.setAttribute("empNameSession", empName);
		
		out.print("   "+"<a href ='Serve2'>Move</a>");
		
	}
}
