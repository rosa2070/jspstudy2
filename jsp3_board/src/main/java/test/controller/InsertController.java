package test.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import test.dao.BoardDao;
import test.dto.Board;

@WebServlet("/board/insert")
public class InsertController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.sendRedirect(req.getContextPath() + "/board/insertForm.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String writer = req.getParameter("writer");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		BoardDao dao = new BoardDao();
		Board board = new Board();
		board.setWriter(writer);
		board.setTitle(title);
		board.setContent(content);
		int n = dao.insert(board);
		if(n==1) {
			req.setAttribute("msg","글 작성 완료!!");
		}else {
			req.setAttribute("msg","오류로 인해 글 작성 실패");
		}
		RequestDispatcher rd=req.getRequestDispatcher("/board/result.jsp");
		rd.forward(req, resp);
		
		
		
		
		
		
	}
	

}
