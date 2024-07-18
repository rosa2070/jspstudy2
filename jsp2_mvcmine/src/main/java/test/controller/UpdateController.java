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

@WebServlet("/member/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 파라미터 값 읽어오기
		String id = req.getParameter("id");
		// 2. db에서 해당 정보 조회하기
		MemberDao dao = new MemberDao();
		Member m = dao.select(id);
		// 3. 조회된 결과를 스코프에 담기
		req.setAttribute("m", m);
		// 4. 뷰페이지로 이동하기
		req.getRequestDispatcher("/member/update.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		String pwd=req.getParameter("pwd");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		int iage=Integer.parseInt(age);		
		MemberDao dao=new MemberDao();
		Member member=new Member(id, pwd, email, iage,null);
		int n=dao.update(member);
		// 결과를 응답하기
		if(n==1) {
			req.setAttribute("msg","회원정보 수정 완료!!");
		}else {
			req.setAttribute("msg","오류로 인해 회원 수정실패");
		}
		RequestDispatcher rd=req.getRequestDispatcher("/member/result.jsp");
		rd.forward(req, resp);
	
	}

}
