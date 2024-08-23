package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.BoardDao;
import test.vo.BoardVo;

@WebServlet("/board/insert")
public class InsertController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/board/insert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String writer = req.getParameter("writer");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		BoardVo vo = new BoardVo(0, writer, title, content, null);
		BoardDao dao = BoardDao.getInstance();
		
		// n에 대한 if문 안써도 동작?? n이 0보다 크다던지...
		try {
			int n = dao.insert(vo);
			req.setAttribute("result", "success");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			req.setAttribute("result", "fail");
		}
		req.getRequestDispatcher("/board/result.jsp").forward(req, resp);
	}
}
