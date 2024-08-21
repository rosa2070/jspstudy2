package test.filter;

import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/member/*")
//@WebFilter(urlPatterns = {"/member/*", "/admin/*"})
public class LoginFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//1. 세션에 id가 존재하면 login변수에 true, id가 존재하지 않으면 false가 저장되도록 코드를 작성해 보세요.
		boolean login = false;
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		if (session!=null) {
			String id = (String) session.getAttribute("id");
			if (id!=null) {
				login = true;
			}
 		}
		
		
		//2.login이 true이면 요청페이지(또는 다음에 수행할필터)로 false이면 로그인페이지로 이동하도록 해보세요.
		if (login) {
			chain.doFilter(req, response);
		} else {
			HttpServletResponse resp = (HttpServletResponse)response;
			resp.sendRedirect(req.getContextPath() + "/login/login.jsp");
		}
	}

}
