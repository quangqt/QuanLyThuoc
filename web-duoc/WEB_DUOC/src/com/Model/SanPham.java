package com.Model;

import java.util.Date;

public class SanPham {
	 private String maSp;
	    private String tenSp;
	    private String moTa;
	    private String xuatXu;
	    private int gia;
	    private String maCongty;
	    private String maLoai;
	    private int soluong;
	    private int soluongton;
	    private boolean tinhtrang;
	    private Date upd;
	    private String manv;
	    private String chude;

	    public String getUrl() {
	        return url;
	    }

	    public void setUrl(String url) {
	        this.url = url;
	    }
	    private String url;
	    
	    public String getMaSp() {
	        return maSp;
	    }

	    public void setMaSp(String maSp) {
	        this.maSp = maSp;
	    }

	    public String getTenSp() {
	        return tenSp;
	    }

	    public void setTenSp(String tenSp) {
	        this.tenSp = tenSp;
	    }

	    public String getMoTa() {
	        return moTa;
	    }

	    public void setMoTa(String moTa) {
	        this.moTa = moTa;
	    }

	    public String getXuatXu() {
	        return xuatXu;
	    }

	    public void setXuatXu(String xuatXu) {
	        this.xuatXu = xuatXu;
	    }

	    public int getGia() {
	        return gia;
	    }

	    public void setGia(int gia) {
	        this.gia = gia;
	    }

	    public String getMaCongty() {
	        return maCongty;
	    }

	    public void setMaCongty(String maCongty) {
	        this.maCongty = maCongty;
	    }

	    public String getMaLoai() {
	        return maLoai;
	    }

	    public void setMaLoai(String maLoai) {
	        this.maLoai = maLoai;
	    }

	    public int getSoluong() {
	        return soluong;
	    }

	    public void setSoluong(int soluong) {
	        this.soluong = soluong;
	    }

	    public int getSoluongton() {
	        return soluongton;
	    }

	    public void setSoluongton(int soluongton) {
	        this.soluongton = soluongton;
	    }

	    public boolean isTinhtrang() {
	        return tinhtrang;
	    }

	    public void setTinhtrang(boolean tinhtrang) {
	        this.tinhtrang = tinhtrang;
	    }

	    public Date getUpd() {
	        return upd;
	    }

	    public void setUpd(Date upd) {
	        this.upd = upd;
	    }

	    public String getManv() {
	        return manv;
	    }

	    public void setManv(String manv) {
	        this.manv = manv;
	    }

	    public String getChude() {
	        return chude;
	    }

	    public void setChude(String chude) {
	        this.chude = chude;
	    }

	    public SanPham() {
	    }

	    public SanPham(String maSp, String tenSp, String moTa, String xuatXu, int gia, String maCongty, String maLoai, int soluong, int soluongton, boolean tinhtrang, Date upd, String manv, String chude) {
	        this.maSp = maSp;
	        this.tenSp = tenSp;
	        this.moTa = moTa;
	        this.xuatXu = xuatXu;
	        this.gia = gia;
	        this.maCongty = maCongty;
	        this.maLoai = maLoai;
	        this.soluong = soluong;
	        this.soluongton = soluongton;
	        this.tinhtrang = tinhtrang;
	        this.upd = upd;
	        this.manv = manv;
	        this.chude = chude;
	    }
	}
