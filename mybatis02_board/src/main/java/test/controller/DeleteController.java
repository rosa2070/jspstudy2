package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.BoardDao;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int num = Integer.parseInt(req.getParameter("num"));
		BoardDao dao = BoardDao.getInstance();
		
		
		try {
			int n = dao.delete(num);
			if (n>0) {
				req.setAttribute("result", "success");
			} else {
				req.setAttribute("result", "fail");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			req.setAttribute("result", "fail");
		}
		req.getRequestDispatcher("/board/result.jsp").forward(req, resp);
	}

}
