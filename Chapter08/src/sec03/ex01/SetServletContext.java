package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cset")
public class SetServletContext extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		


		PrintWriter out = response.getWriter();
		
		ServletContext context = getServletContext();
		
		List member = new ArrayList();
		member.add("김승준");
		member.add(23);
		
		context.setAttribute("member", member);
		
		out.print("<html><body>");
		out.print("김승준 23");
		out.print("</body></html");
		
	
	}

}
