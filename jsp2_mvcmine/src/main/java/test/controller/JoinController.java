package test.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import test.dao.MemberDao;
import test.dto.Member;
@WebServlet("/member/join")
public class JoinController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(req.getContextPath() +"/member/join.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 전송된 데이터를 DB에 저장하기
		String id=req.getParameter("id");
		String pwd=req.getParameter("pwd");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		int iage=Integer.parseInt(age);		
		MemberDao dao=new MemberDao();
		Member member=new Member(id, pwd, email, iage,null);
		int n=dao.insert(member);
		// 결과를 응답하기
		if(n==1) {
			req.setAttribute("msg","회원가입 완료!!");
		}else {
			req.setAttribute("msg","오류로 인해 회원 가입실패");
		}
		RequestDispatcher rd=req.getRequestDispatcher("/member/result.jsp");
		rd.forward(req, resp);
	
	}
}










