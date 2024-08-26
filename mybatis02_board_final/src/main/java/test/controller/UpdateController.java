package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.BoardDao;
import test.vo.BoardVo;

@WebServlet("/board/update")
public class UpdateController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("num"));
		BoardDao dao=BoardDao.getInstance();
		BoardVo vo= dao.selectOne(num);
		req.setAttribute("vo", vo);
		req.getRequestDispatcher("/board/update.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(req.getParameter("num"));
		String writer=req.getParameter("writer");
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		BoardVo vo=new BoardVo(num, writer, title, content, null);
		BoardDao dao=BoardDao.getInstance();	
		try {
			int n=dao.update(vo);
			req.setAttribute("result","success");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			req.setAttribute("result","fail");
		}
		req.getRequestDispatcher("/board/result.jsp").forward(req, resp);
	}
}






