package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.JdbcUtil;
import test.dto.Fileinfo;

public class FileinfoDAO {
	public Fileinfo select(int filenum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtil.getCon();
			String sql = "select * from fileinfo where filenum=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, filenum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String orgfilename = rs.getString("orgfilename");
				String savefilename = rs.getString("savefilename");
				long filesize = rs.getLong("filesize");
				Fileinfo vo = new Fileinfo(filenum, writer, title, 
						content, orgfilename, savefilename, filesize);
				return vo;					
			}
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			JdbcUtil.close(con, pstmt, rs);
		}
	}
	
	
	public int insert(Fileinfo vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into fileinfo " +
					"values (fileinfo_seq.nextval, ?, ?, ?, ?, ?, ?)";
			con = JdbcUtil.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getOrgfilename());
			pstmt.setString(5, vo.getSavefilename());
			pstmt.setLong(6, vo.getFilesize());
			return pstmt.executeUpdate();
		} catch (SQLException s) {
			// TODO Auto-generated catch block
			s.printStackTrace();
			return -1;
		} finally {
			JdbcUtil.close(con, pstmt, null);
		}
	}
	
	public ArrayList<Fileinfo> selectAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtil.getCon();
			String sql = "select * from fileinfo";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ArrayList<Fileinfo> list = new ArrayList<Fileinfo>();
			while(rs.next()) {
				int filenum = rs.getInt("filenum");
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String orgfilename = rs.getString("orgfilename");
				String savefilename = rs.getString("savefilename");
				long filesize = rs.getLong("filesize");
				Fileinfo vo = new Fileinfo(filenum, writer, title, 
						content, orgfilename, savefilename, filesize);
				list.add(vo);					
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			JdbcUtil.close(con, pstmt, rs);
		}
	}
	
	public int delete(int filenum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from fileinfo where filenum = ?";
			con=JdbcUtil.getCon();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, filenum);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} finally {
			JdbcUtil.close(con, pstmt, null);
		}
	}
	
	

}
