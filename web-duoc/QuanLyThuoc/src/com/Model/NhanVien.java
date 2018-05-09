package com.Model;

public class NhanVien {
	
	public static final String GENDER_MALE = "M";
	public static final String GENDER_FEMALE = "F";

	private String tk;
	private String matkhau;
	private Number manv;
	private String tennv;
	private String diachi;
	private Number machucvu;
	private Number namsinh;
	private boolean gioitinh;
	private Number macn;

	public String getTk() {
		return tk;
	}

	public void setTk(String tk) {
		this.tk = tk;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public Number getManv() {
		return manv;
	}

	public void setManv(Number manv) {
		this.manv = manv;
	}

	public String getTennv() {
		return tennv;
	}

	public void setTennv(String tennv) {
		this.tennv = tennv;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Number getMachucvu() {
		return machucvu;
	}

	public void setMachucvu(Number machucvu) {
		this.machucvu = machucvu;
	}

	public Number getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(Number namsinh) {
		this.namsinh = namsinh;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public Number getMacn() {
		return macn;
	}

	public void setMacn(Number macn) {
		this.macn = macn;
	}

	public NhanVien(Number manv, String tennv, String diachi, Number machucvu, Number namsinh, boolean gioitinh,
			Number macn) {
		super();
		this.manv = manv;
		this.tennv = tennv;
		this.diachi = diachi;
		this.machucvu = machucvu;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.macn = macn;
	}

	public NhanVien() {
		super();
	}

}
