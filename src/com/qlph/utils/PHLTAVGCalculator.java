package com.qlph.utils;

import java.util.ArrayList;

import com.qlph.model.PhongHoc;

public class PHLTAVGCalculator {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public double calculatorAVG(ArrayList<PhongHoc> dsPH) {
		double tongDienTich = 0;
		int soLuongPhongHoc = 0;
		for (PhongHoc ph : dsPH) {
			// Kiểm tra nếu phòng học là loại Lý thuyết
			if (ph.getLoaiPhong().equals("LT")) { 
				tongDienTich += ph.getDienTich();
				soLuongPhongHoc++;
			}
		}
		return tongDienTich / soLuongPhongHoc;
	}
	
	
}
