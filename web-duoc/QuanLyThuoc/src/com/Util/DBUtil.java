package com.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.ConnectionUtil;
import com.Model.NhanVien;

public class DBUtil {
	public static NhanVien findUser(Connection conn, 
	            String userName, String password) throws SQLException, ClassNotFoundException {
	        String sql = "select manv,tennv,gioitinh,machucvu from nhanvien "
	                + "where taikhoan = ? and passwork = ?";
	 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, userName);
	        pstm.setString(2, password);
	        ResultSet rs = pstm.executeQuery();
	        if (rs.next()) {
	        	NhanVien user = new NhanVien();
	        	user.setTk(userName);
	        	user.setMatkhau(password);
	        	return user;
	        	}
	        return null;
	 }
	
	public static NhanVien findUser(Connection conn, String user) throws SQLException {
		String sql = "select manv,tennv,gioitinh,machucvu from nhanvien" + 
					 "where manv = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, user);
 
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            String tennv = rs.getString("tennv");
            NhanVien nhanvien = new NhanVien();
            nhanvien.setTennv(tennv);
            return nhanvien;
        }
        return null;
	}
}
