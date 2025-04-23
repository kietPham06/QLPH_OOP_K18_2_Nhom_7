package com.qlph.entity;

import java.util.Date;

public class PHMayTinh extends PhongHoc {

	private int soLuongMayTinh;
	
	public PHMayTinh() {
		// TODO Auto-generated constructor stub
	}
	
	public PHMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDong, int soLuongMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong);
		// TODO Auto-generated constructor stub
		this.soLuongMayTinh = soLuongMayTinh;
	}

	@Override
	public boolean DatChuan() {
	    if (getDienTich() < 0 || soLuongMayTinh < 0) {
	        return false;
	    }
	    return super.DatChuan() && soLuongMayTinh <= (int) Math.floor(getDienTich() / 1.5);
	}
	
	public void setSoLuongMayTinh(int soLuongMayTinh) {
		this.soLuongMayTinh = soLuongMayTinh;
	}
	
	public int getSoLuongMayTinh() {
		return soLuongMayTinh;
	}

	@Override
	public String getLoaiPhong() {
		// TODO Auto-generated method stub
		return "MT";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nSố lượng máy tính: " + soLuongMayTinh;
	}
	
	
}
