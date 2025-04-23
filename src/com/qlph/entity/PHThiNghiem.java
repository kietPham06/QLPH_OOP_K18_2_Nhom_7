package com.qlph.entity;

import java.util.Date;

public class PHThiNghiem extends PhongHoc {
	
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;
	
	public PHThiNghiem() {
		// TODO Auto-generated constructor stub
	}
	
	public PHThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDong, String chuyenNganh, int sucChua, boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong);
		// TODO Auto-generated constructor stub
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}

	@Override
	public boolean DatChuan() {
		// TODO Auto-generated method stub
		return super.DatChuan() && coBonRua;
	}
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isCoBonRua() {
		return coBonRua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	@Override
	public String getLoaiPhong() {
		// TODO Auto-generated method stub
		return "TN";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nChuyên ngành: " + chuyenNganh
				+ "\nSức chứa: " + sucChua
				+ "\nCó bồn rửa (true/false): " + coBonRua;
	}
	
	
}
