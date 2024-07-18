package test.controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import test.dao.BoardDao;
import test.dto.Board;

@WebServlet("/board/list") 
public class BoardListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// getParameter는 return 타입이 무조건 string
		req.setCharacterEncoding("utf-8");
		String pNum = req.getParameter("pageNum");
		
		String field = req.getParameter("field");
		String keyword = req.getParameter("keyword");
		
		int pageNum = 1;
		if (pNum != null) {
			pageNum = Integer.parseInt(pNum);
		}
		int startRow = (pageNum-1)*10 + 1; // int startRow = (pageNum*10) -9
		int endRow = startRow + 9;
		BoardDao dao = new BoardDao();
		ArrayList<Board> list = dao.list(startRow, endRow, field, keyword);
		
		int pageCount=(int)Math.ceil(dao.getCount(field, keyword)/10.0); //전체 페이지 갯수
		int startPage=(pageNum-1)/10*10 + 1; 
		int endPage=startPage + 9; 
		if (endPage>pageCount) {
			endPage=pageCount;
		}
		
		req.setAttribute("list", list);
		req.setAttribute("pageCount", pageCount);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		req.setAttribute("pageNum", pageNum);
		req.setAttribute("field", field);
		req.setAttribute("keyword", keyword);
		req.getRequestDispatcher("/board/list.jsp").forward(req, resp);
		
	}
}
