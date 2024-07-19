package test.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.FileinfoDAO;
import test.dto.Fileinfo;

@WebServlet("/file/delete")
public class FileDeleteController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int filenum = Integer.parseInt(req.getParameter("filenum"));	
		try {
			// 1. 파일삭제
			// 디렉토리 경로 얻어오기
			String path = req.getServletContext().getRealPath("/upload");
			// 삭제할 파일이름 db에 가져오기
			FileinfoDAO dao = new FileinfoDAO();
			String filename = dao.select(filenum).getSavefilename();
			File f = new File(path + "\\" + filename);
			f.delete();
			
			// 2. db에서 삭제
			dao.delete(filenum);
			resp.sendRedirect(req.getContextPath() + "/file/list");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			resp.sendRedirect(req.getContextPath() + "/error.jsp");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sfilenum = req.getParameter("filenum");
		int filenum = Integer.parseInt(sfilenum);
		FileinfoDAO dao = new FileinfoDAO();
		int n = dao.delete(filenum);
		if (n > 0) {
			resp.sendRedirect(req.getContextPath() + "/file/list");
		} else {
			req.setAttribute("msg", "오류로 인해 삭제 실패!");
			req.getRequestDispatcher("/file/result.jsp").forward(req, resp);
		}
		RequestDispatcher rd = req.getRequestDispatcher("/list.jsp");
		rd.forward(req, resp);
		
	}

}
