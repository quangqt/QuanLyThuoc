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

	public List<SanPham> getListSanPham() throws SQLException, ClassNotFoundException {
		Connection connection = ConnectionUtil.getMyConnection();
		String sql = "select top 10 s.masp,tensp,gia,url from sanpham s inner join HinhAnh h on s.masp = h.masp";
		Statement st = connection.createStatement();
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

	public boolean insertSP(SanPham sp) throws SQLException, ClassNotFoundException {
		try {
			Connection connection = ConnectionUtil.getMyConnection();
			String sql = "INSERT INTO sanpham(TENSP,MOTA,GIA,xuatxu,soluong,maloai) " + "values ('" + sp.getTenSp()
					+ "','" + sp.getMoTa() + "','" + sp.getGia() + "','" + sp.getXuatXu() + "','" + sp.getSoluong()
					+ "','" + sp.getMaLoai() + "')";

			PreparedStatement ps = connection.prepareCall(sql);
			int x = ps.executeUpdate();
			return x == 1;
		} catch (Exception e) {
			return false;
		}
	}

}
