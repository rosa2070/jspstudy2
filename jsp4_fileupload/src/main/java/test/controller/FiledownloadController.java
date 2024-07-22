package test.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.FileinfoDAO;
import test.dto.Fileinfo;

@WebServlet("/file/download")
public class FiledownloadController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int filenum = Integer.parseInt(req.getParameter("filenum"));
		FileinfoDAO dao = new FileinfoDAO();
		Fileinfo vo = dao.select(filenum);
		String orgfilename = vo.getOrgfilename();
		String savefilename = vo.getSavefilename();
		long filesize = vo.getFilesize();
		////////// 1. 다운로드창으로 응답하기  ///////////////////////
		// 파일명이 한글인 경우 깨지는 경우를 방지하기 위해 파일명을 인코딩하기
		String filename = URLEncoder.encode(orgfilename, "utf-8"); //import java.net.URLEncoder;
		//+문자를 공백문자(%20)으로 변환
		filename = filename.replaceAll("\\+", "%20");
		// 다운로드창으로 응답하겠다
		resp.setContentType("application/octet-stream");
		//전송할 파일크기 설정
		resp.setContentLengthLong(filesize);
		//다운로드창에 보여질 파일명 지정
		resp.setHeader("Content-Disposition", "attachment;filename=" + filename);
		////////// 2. 클라이언트에 파일내용보내기-클라이언트 웹브라우저에서 전송된 내용을 파일로 저장해줌 //////////
		String path = getServletContext().getRealPath("/upload");
		// 클라이언트(사용자)에 전송할 파일을 읽어오기 위한 스트림객체
		FileInputStream fis = new FileInputStream(path + "\\" + savefilename);
		// 클라이언트에 파일내용을 보낼 스트림객체
		OutputStream os = resp.getOutputStream();
		// 속도향상을 위한 Buffered객체로 가공하기
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		byte[] b = new byte[1024];
		int n = 0;
		while((n = bis.read(b))!= -1) {//파일을 읽어와
			bos.write(b, 0, n); // 클라이언트(사용자웹브라우저)에 보내기
		}
		bos.flush();
		bos.close();
		bis.close();
		
	}

}
