package com.Model;

public class HinhAnh {
	 private String maHinhAnh;
	    private String url;
	    private String maSp;

	    public String getMaHinhAnh() {
	        return maHinhAnh;
	    }

	    public void setMaHinhAnh(String maHinhAnh) {
	        this.maHinhAnh = maHinhAnh;
	    }

	    public String getUrl() {
	        return url;
	    }

	    public void setUrl(String url) {
	        this.url = url;
	    }

	    public String getMaSp() {
	        return maSp;
	    }

	    public void setMaSp(String maSp) {
	        this.maSp = maSp;
	    }

	    public HinhAnh() {
	    }

	    public HinhAnh(String maHinhAnh, String url, String maSp) {
	        this.maHinhAnh = maHinhAnh;
	        this.url = url;
	        this.maSp = maSp;
	    }
	    
	}
