package test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import test.dao.CommentsDao;

@WebServlet("/comm/delete")
public class CommDeleteController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		CommentsDao dao = CommentsDao.getInstance();
		int n = dao.delete(num);
		
		resp.setContentType("text/xml;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		JSONObject result = new JSONObject();
		if (n>0) {
			result.put("code", true);
		} else {
			result.put("code", false);
		}
		pw.println(result);
		pw.close();
	}

}
