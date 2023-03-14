import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Serve2 extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
	
		HttpSession session=req.getSession(false);
        String empNameSession=(String)session.getAttribute("empNameSession");  
        out.print("Hello "+empNameSession);
				
	}
}
