package test.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.JdbcUtil;
import test.dto.Member;


public class MemberDao {
	public int insert(Member vo) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=JdbcUtil.getCon();
			String sql="insert into member values(?,?,?,?,sysdate)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,vo.getId());
			pstmt.setString(2,vo.getPwd());
			pstmt.setString(3,vo.getEmail());
			pstmt.setInt(4,vo.getAge());
			return pstmt.executeUpdate();
		}catch(SQLException s) {
			s.printStackTrace();
			return -1;
		}finally {
			JdbcUtil.close(con, pstmt, null);
		}
	}
	public ArrayList<Member> selectAll(){
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=JdbcUtil.getCon();
			String sql="select * from member";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			ArrayList<Member> list=new ArrayList<Member>();
			while(rs.next()) {
				String id=rs.getString("id");
				String pwd=rs.getString("pwd");
				String email=rs.getString("email");
				int age=rs.getInt("age");
				Date regdate=rs.getDate("regdate");
				Member member=new Member(id, pwd, email, age, regdate);
				list.add(member);
			}
			return list;
		}catch(SQLException s) {
			s.printStackTrace();
			return null;
		}finally {
			JdbcUtil.close(con, pstmt, rs);
			
		}
	}
	
	public int delete(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.getCon();
			String sql = "delete from member where id = ?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			return pstmt.executeUpdate();
		} catch (SQLException s) {
			s.printStackTrace();
			return -1;
		}finally {
			JdbcUtil.close(con, pstmt, null);
		}
	}
	
	public int update(Member vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = JdbcUtil.getCon();
			String sql = "update member set pwd=?, email=?, age=? where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getPwd());
			pstmt.setString(2, vo.getEmail());
			pstmt.setInt(3, vo.getAge());
			pstmt.setString(4, vo.getId());
			return pstmt.executeUpdate();
		} catch (SQLException s) {
			// TODO Auto-generated catch block
			s.printStackTrace();
			return -1;
		} finally {
			JdbcUtil.close(con, pstmt, null);
		}
	}
	
	public Member select(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtil.getCon();
			String sql = "select * from member where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String pwd = rs.getString("pwd");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				Date regdate = rs.getDate("regDate");
				Member member = new Member(id, pwd, email, age, regdate);
				return member;
			} else {
				return null;
			}
		} catch (SQLException s) {
			// TODO Auto-generated catch block
			s.printStackTrace();
			return null;
		} finally {
			JdbcUtil.close(con, pstmt , rs);
		}
		
	}
}
