package test.controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import test.dao.MemberDao;
import test.dto.Member;

@WebServlet("/member/list")
public class ListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String id = (String)session.getAttribute("id");
		if (id==null) {
			resp.sendRedirect(req.getContextPath() + "/member/login.jsp");
		} else {
			MemberDao dao=new MemberDao();
			ArrayList<Member> list=dao.selectAll();
			req.setAttribute("list",list);
			req.getRequestDispatcher("/member/list.jsp").forward(req, resp);
		}

		

	}
}
