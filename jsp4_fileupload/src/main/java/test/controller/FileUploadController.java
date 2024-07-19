package test.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import test.dao.FileinfoDAO;
import test.dto.Fileinfo;

@WebServlet("/file/upload")
public class FileUploadController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext application = req.getServletContext();
		String uploadPath = application.getRealPath("/upload"); //upload 폴더의 실제 경로 얻어오기
		System.out.println(uploadPath);
		
		MultipartRequest mr = new MultipartRequest(
				req,
				uploadPath, // 저장할 디렉토리
				1024 * 1024 * 5, // 업로드할 최대 크기
				"utf-8",
				new DefaultFileRenamePolicy()
		);
		String writer = mr.getParameter("writer");
		String title = mr.getParameter("title");
		String content = mr.getParameter("content");
		String orgFileName = mr.getOriginalFileName("file1"); // 전송된 파일명
		String saveFileName = mr.getFilesystemName("file1"); //저장된 파일명
		File f = mr.getFile("file1");
		long filesize = f.length();//파일크기
		Fileinfo vo = new Fileinfo(0, writer, title, content,
									orgFileName, saveFileName, filesize);
		FileinfoDAO dao = new FileinfoDAO();
		int n = dao.insert(vo);
		if (n>0) {
			resp.sendRedirect(req.getContextPath() + "/main.jsp");
		} else {
			resp.sendRedirect(req.getContentType() + "/error.jsp");
		}
		
	}
}
