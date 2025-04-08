package com.qlph.model;

import java.text.SimpleDateFormat;
import java.util.Date;

// Superclass
public abstract class PhongHoc {
	
	// Ô 2 - Fields
	private String maPhong;
	private String dayNha;
	private double dienTich;
	private int soBongDen;
	private Date ngayHoatDong;
	
	// Ô 3 - Methods
	// Default Constuctor
	protected PhongHoc() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	protected PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDong) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
		this.ngayHoatDong = ngayHoatDong;
	}
	
	// Kiểm tra phòng học đạt chuẩn
	public abstract boolean isDatChuan();
	
	// Getters and Setters
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

	// toString()
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = formatter.format(ngayHoatDong);
		return "Mã phòng: " + maPhong +
				"\nDãy nhà: " + dayNha +
				"\nDiện tích: " + dienTich +
				"\nSố bóng đèn: "+ soBongDen +
				"\nNgày hoạt động: " + formattedDate;
	}
	
	
}
