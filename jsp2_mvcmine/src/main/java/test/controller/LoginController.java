package test.controller;

import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import test.dao.LoginDao;

@WebServlet("/member/login")
public class LoginController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/member/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		LoginDao dao = new LoginDao();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pwd", pwd);		
		boolean a = dao.isMember(map);
		if (a) { //아이디와 비밀번호가 맞는 경우
			HttpSession session = req.getSession();
			session.setAttribute("id", id);
			resp.sendRedirect(req.getContextPath()+"/home.jsp");
		} else { // 아이디와 비밀번호가 틀린 경우
			req.setAttribute("errMsg", "아이디 또는 비밀번호가 맞지 않아요");
			req.getRequestDispatcher("/member/login.jsp").forward(req, resp);
			
		}
		
	}
	

}
