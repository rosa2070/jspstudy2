package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import db.JdbcUtil;

public class LoginDao {
	public boolean isMember(HashMap<String, String> map) {
		String id = map.get("id");
		String pwd = map.get("pwd");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con=JdbcUtil.getCon();
			String sql = "select * from member where id=? and pwd=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			}
			return false;
		} catch (SQLException s) {
			// TODO Auto-generated catch block
			s.printStackTrace();
			return false;
		} finally {
			JdbcUtil.close(con, pstmt, rs);
		}
	}	
}
