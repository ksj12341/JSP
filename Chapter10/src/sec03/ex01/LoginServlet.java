package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	public void init() {
		System.out.println("init 메소스 호출");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	request.setCharacterEncoding("utf-8");
	//	response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		String user_name = request.getParameter("user_name");
		String user_pwd = request.getParameter("user_pwd");

		
		String data="안녕하세요!<br> "+ user_name + " 님 환영합니다. <br><br>";
		data+="<html><body>";
		data+="이름 : " +user_name;
		data+="<br>";
		data+="비밀번호 : "+user_pwd;
		data+="<br>";
		data+="</body></html>";
		out.print(data);
		
	}
}
