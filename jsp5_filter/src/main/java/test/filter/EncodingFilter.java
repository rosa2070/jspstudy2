package test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/*
 * [ Filter ]
 * - 클라이언트의 요청을 중간에 가로채서 요청페이지로 가기전에 특정 작업을 수행함.
 *   수행후 요청페이지로 갈수도 있고 필터에서 다른 페이지로 이동도 가능하다.
 * - 만드는 방법
 *  1) Filter인터페이스를 상속받아 doFilter메소드에서 필터로 수행할 작업을 구현한다.
 *  2) web.xml 또는 어노테이션으로 필터가 언제 동작할지에 대한 경로를 매핑한다.
 */

//모든페이지를 요청할때 Filter가 실행됨
@WebFilter("/*")
public class EncodingFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("EncodingFilter클래스의 doFilter메소드가 호출됨");
		request.setCharacterEncoding("utf-8");
		//다음에 수행할 필터를 호출하고 필터가 없으면 사용자가 요청한 페이지로 이동
		chain.doFilter(request, response);
	}
}
