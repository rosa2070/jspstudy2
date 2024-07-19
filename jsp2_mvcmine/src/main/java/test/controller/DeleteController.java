package test.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import test.dao.MemberDao;

@WebServlet("/member/delete")
public class DeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 파라미터 값(삭제할 아이디) 얻어오기
		String id = req.getParameter("id");
		// 2. db에서 해당 데이터 삭제하기
		MemberDao dao = new MemberDao();
		int n = dao.delete(id);
		// 3. 결과 응답하기
		if (n > 0) { //삭제 성공
			resp.sendRedirect(req.getContextPath() + "/member/list");
		} else {
			req.setAttribute("msg", "오류로 인해 삭제 실패!");
			req.getRequestDispatcher("/member/result.jsp").forward(req, resp);
		}
		RequestDispatcher rd = req.getRequestDispatcher("/member/list.jsp");
		rd.forward(req, resp);
	}
	
	


}
