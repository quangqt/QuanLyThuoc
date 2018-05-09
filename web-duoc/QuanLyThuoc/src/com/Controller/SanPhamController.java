package com.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Connection.ConnectionUtil;
import com.Model.SanPham;

public class SanPhamController {

	public List<SanPham> getListSanPham(Connection conn) throws SQLException, ClassNotFoundException {
		Statement st = conn.createStatement();
		String sql = "select masp,tensp,gia,images from sanpham";

		ResultSet rs = st.executeQuery(sql);
		List<SanPham> lstProduct = new ArrayList<SanPham>();
		while (rs.next()) {
			SanPham sp = new SanPham();
			sp.setMaSp(rs.getString(1));
			sp.setTenSp(rs.getString(2));
			sp.setGia(rs.getInt(3));
			sp.setUrl(rs.getString(4));
			lstProduct.add(sp);
		}
		return lstProduct;
	}

	public SanPham getSanPhamById(String id) throws SQLException, ClassNotFoundException {
		Connection connection = ConnectionUtil.getMyConnection();
		Statement st = connection.createStatement();
		String sql = "select * from sanpham";
		ResultSet rs = st.executeQuery(sql);
		SanPham sp = new SanPham();
		sp.setMaSp(rs.getString(1));
		sp.setTenSp(rs.getString(2));
		return sp;
	}

	public boolean insertSP(Connection conn, SanPham sp) throws SQLException, ClassNotFoundException {
		try {
			String sql = "INSERT INTO sanpham(TENSP,MOTA,GIA,xuatxu,soluong,maloai,chude,images,ngaycapnhat) "
					+ " values (N'" + sp.getTenSp() + "',N'" + sp.getMoTa() + "','" + sp.getGia() + "',N'"
					+ sp.getXuatXu() + "','" + sp.getSoluong() + "','" + sp.getMaLoai() + "', N'" + sp.getChude()
					+ "','" + sp.getUrl() + "',GETDATE())";

			PreparedStatement ps = conn.prepareCall(sql);
			int x = ps.executeUpdate();
			return x == 1;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean deleteSP(Connection conn, String maSp) throws SQLException {
		try {
			String sql = "DELETE FROM SANPHAM WHERE MASP = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, maSp);
			int index = ps.executeUpdate();
			return index == 1;
		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}
}
