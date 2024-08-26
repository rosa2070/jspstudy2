package test.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test.dao.BoardDao;

@WebServlet("/board/list")
public class ListController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String field = req.getParameter("field");
		String keyword = req.getParameter("keyword");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("field", field);
		map.put("keyword", keyword);
		
		
		BoardDao dao= BoardDao.getInstance();
		req.setAttribute("list", dao.selectList(map));
		req.getRequestDispatcher("/board/list.jsp").forward(req, resp);
	}
}










