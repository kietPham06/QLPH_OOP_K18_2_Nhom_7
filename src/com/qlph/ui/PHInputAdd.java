package com.qlph.ui;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.qlph.entity.PHLyThuyet;
import com.qlph.entity.PHMayTinh;
import com.qlph.entity.PHThiNghiem;
import com.qlph.entity.PhongHoc;

public class PHInputAdd {
	
	private Scanner keyboard;
	private PrintWriter out;
	
	public PHInputAdd() {
		// TODO Auto-generated constructor stub
	}
	
	public PHInputAdd(Scanner keyboard, PrintWriter out) {
		super();
		this.keyboard = keyboard;
		this.out = out;
	}
	
	public PhongHoc inputPH() {
		String maPhong;
		String dayNha;
		double dienTich;
		int soBongDen;
		String ngayHoatDong;
		Date ngayHoatDongJava;
		
		String loaiPhong;
		
		PhongHoc ph = null;
		
		out.print("Mã phòng: ");
		out.flush();
		maPhong = keyboard.nextLine();
	
		out.print("Dãy nhà: ");
		out.flush();
		dayNha = keyboard.nextLine();
		
		out.print("Diện tích: ");
		out.flush();
		dienTich = keyboard.nextDouble();
		
		out.print("Số bóng đèn: ");
		out.flush();
		soBongDen = keyboard.nextInt();
		keyboard.nextLine();
		
		out.print("Ngày hoạt động (dd/MM/yyyy): ");
		out.flush();
		ngayHoatDong = keyboard.nextLine();
		ngayHoatDongJava = convertStringtoDate(ngayHoatDong);
		
		out.print("Loại phòng (LT - MT - TN): ");
		out.flush();
		loaiPhong = keyboard.nextLine();
		if ("LT".equalsIgnoreCase(loaiPhong)) {
			ph = inputPHLT(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava);
		}
		if ("MT".equalsIgnoreCase(loaiPhong)) {
			ph = inputPHMT(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava);
		}
		if ("TN".equalsIgnoreCase(loaiPhong)) {
			ph = inputPHTN(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava);
		}	
		return ph;
	}
	
	private Date convertStringtoDate(String date) {
		Date ngayHoatDongJava = null;
		SimpleDateFormat dateFormat;
		
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngayHoatDongJava =  dateFormat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ngayHoatDongJava;
	}
	
	private PhongHoc inputPHLT(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDongJava) {
		boolean coMayChieu;
		PHLyThuyet phLT;
		
		out.print("Có máy chiếu (true/false): ");
		out.flush();
		coMayChieu = keyboard.nextBoolean();
		
		phLT = new PHLyThuyet(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava, coMayChieu);
		return phLT;
	}
	
	private PhongHoc inputPHMT(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDongJava) {
		int soLuongMayTinh;
		PHMayTinh phMT;
		
		out.print("Số lượng máy tính: ");
		out.flush();
		soLuongMayTinh = keyboard.nextInt();
		
		phMT = new PHMayTinh(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava, soLuongMayTinh);
		return phMT;
	}
	
	private PhongHoc inputPHTN(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDongJava) {
		String chuyenNganh;
		int sucChua;
		boolean coBonRua;
		PHThiNghiem phTN;
		
		out.print("Chuyên ngành: ");
		out.flush();
		chuyenNganh = keyboard.nextLine();
		
		out.print("Sức chứa: ");
		out.flush();
		sucChua = keyboard.nextInt();
		
		out.print("Có bồn rửa (true/false): ");
		out.flush();
		coBonRua = keyboard.nextBoolean();
		
		phTN = new PHThiNghiem(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava, chuyenNganh, sucChua, coBonRua);
		return phTN;
	}
	
	
}
