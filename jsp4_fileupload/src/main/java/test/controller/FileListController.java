package test.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.FileinfoDAO;
import test.dto.Fileinfo;

@WebServlet("/file/list")
public class FileListController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FileinfoDAO dao = new FileinfoDAO();
		ArrayList<Fileinfo> list = dao.selectAll();
		req.setAttribute("list", list);
//		req.getRequestDispatcher("/list.jsp").forward(req, resp);
		req.getRequestDispatcher("/list1.jsp").forward(req, resp);
		
		
	}

}
