package com.qlph.entity;

import java.util.Date;

public class PHLyThuyet extends PhongHoc{

	private boolean coMayChieu;
	
	public PHLyThuyet() {
		// TODO Auto-generated constructor stub
	}
	
	public PHLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDong, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong);
		// TODO Auto-generated constructor stub
		this.coMayChieu = coMayChieu;
	}

	@Override
	public boolean DatChuan() {
		// TODO Auto-generated method stub
		return super.DatChuan() && coMayChieu;
	}
	
	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	@Override
	public String getLoaiPhong() {
		// TODO Auto-generated method stub
		return "LT";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nCó máy chiếu (true/false): " + coMayChieu;
	}
	
	
}
