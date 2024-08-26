package test.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.BoardDao;
import test.vo.BoardVo;

@WebServlet("/board/list1")
public class ListController1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		//체크박스 파라미터 값들
		String writer = req.getParameter("writer");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		//검색키워드 파라미터 값
		String keyword = req.getParameter("keyword");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("writer", writer);
		map.put("title", title);
		map.put("content", content);
		map.put("keyword", keyword);
		
		BoardDao dao = BoardDao.getInstance();
		List<BoardVo> list = dao.searchList(map);
		req.setAttribute("list", list);
		req.getRequestDispatcher("/board/list1.jsp").forward(req, resp);
	}

}
