package test.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext sc = getServletContext();//서블릿컨텍스트 얻어오기
		sc.setAttribute("cp", req.getContextPath()); //컨텍스트경로 저장하기
		req.getRequestDispatcher("/main.jsp").forward(req, resp);
	}
}
