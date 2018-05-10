package com.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	public SanPham getSanPhamById(Connection conn, String id) throws SQLException, ClassNotFoundException {
		String sql = "select MASP,TENSP,MOTA,GIA,XUATXU,SOLUONG,MALOAI,CHUDE,IMAGES from sanpham WHERE MASP=?";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		SanPham sp = new SanPham();
		while (rs.next()) {
			sp.setMaSp(rs.getString(1));
			sp.setTenSp(rs.getString(2));
			sp.setMoTa(rs.getString(3));
			sp.setGia(rs.getInt(4));
			sp.setXuatXu(rs.getString(5));
			sp.setSoluong(rs.getInt(6));
			sp.setMaLoai(rs.getString(7));
			sp.setChude(rs.getString(8));
			sp.setUrl(rs.getString(9));
			return sp;
		}
		return null;
	}

	public boolean insertSP(Connection conn, SanPham sp) throws SQLException, ClassNotFoundException {
		try {
			String sql = "INSERT INTO sanpham(TENSP,MOTA,GIA,xuatxu,soluong,maloai,chude,images,ngaycapnhat) "
					+ " values (?,?,?,?,?,?,?,?,GETDATE())";

			PreparedStatement ps = conn.prepareCall(sql);
			ps.setString(1, sp.getTenSp());
			ps.setString(2, sp.getMoTa());
			ps.setInt(3, sp.getGia());
			ps.setString(4, sp.getXuatXu());
			ps.setInt(5, sp.getSoluong());
			ps.setString(6, sp.getMaLoai());
			ps.setString(7, sp.getChude());
			ps.setString(8, sp.getUrl());
			int x = ps.executeUpdate();
			return x == 1;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean updateSP(Connection conn, SanPham sp) {
		try {
			String sql = "UPDATE SANPHAM SET TENSP = ?, MOTA = ?, GIA = ?, XUATXU = ?, SOLUONG = ?"
					+ ",MALOAI = ?,CHUDE = ?, IMAGES = ?, NGAYCAPNHAT = GETDATE()";
			PreparedStatement ps = conn.prepareCall(sql);
			ps.setString(1, sp.getTenSp());
			ps.setString(2, sp.getMoTa());
			ps.setInt(3, sp.getGia());
			ps.setString(4, sp.getXuatXu());
			ps.setInt(5, sp.getSoluong());
			ps.setString(6, sp.getMaLoai());
			ps.setString(7, sp.getChude());
			ps.setString(8, sp.getUrl());
			int result = ps.executeUpdate();
			return result == 1;
		} catch (Exception e) {
			return false;
			// TODO: handle exception
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

	public List<SanPham> getListProductByCate(Connection conn, String code) throws SQLException {
		String sql = "SELECT MASP,TENSP,MOTA,GIA,XUATXU,SOLUONG,MALOAI,CHUDE,IMAGES FROM SANPHAM WHERE MALOAI = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, code);
		ResultSet rs = ps.executeQuery();
		List<SanPham> lstProduct = new ArrayList<>();
		while (rs.next()) {
			SanPham product = new SanPham();
			product.setMaSp(rs.getString(1));
			product.setTenSp(rs.getString(2));
			product.setMoTa(rs.getString(3));
			product.setGia(rs.getInt(4));
			product.setXuatXu(rs.getString(5));
			product.setSoluong(rs.getInt(6));
			product.setMaLoai(rs.getString(7));
			product.setChude(rs.getString(8));
			product.setUrl(rs.getString(9));
			lstProduct.add(product);
		}
		return lstProduct;
	}
}
