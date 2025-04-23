package com.qlph.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class PhongHoc implements Serializable {
	
	private String maPhong;
	private String dayNha;
	private double dienTich;
	private int soBongDen;
	private Date ngayHoatDong;
	
	protected PhongHoc() {
		// TODO Auto-generated constructor stub
	}

	protected PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDong) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
		this.ngayHoatDong = ngayHoatDong;
	}
	
	public boolean DatChuan() {
	    if (dienTich < 0 || soBongDen < 0) {
	        return false;
	    }
	    return soBongDen >= (int) Math.ceil(dienTich / 10.0);
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	public Date getNgayHoatDong() {
		return ngayHoatDong;
	}

	public void setNgayHoatDong(Date ngayHoatDong) {
		this.ngayHoatDong = ngayHoatDong;
	}
	
	public abstract String getLoaiPhong();
	
	@Override
	public String toString() {
		return "Mã phòng: " + maPhong +
				"\nDãy nhà: " + dayNha +
				"\nDiện tích: " + dienTich + 
				"\nSố bóng đèn: "+ soBongDen +
				"\nNgày hoạt động: " + convertDatetoString(ngayHoatDong);
	}
	
	private String convertDatetoString(Date date) {
		String ngayHoatDong = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		ngayHoatDong = dateFormat.format(date);
		return ngayHoatDong;
	}
	
	
}
