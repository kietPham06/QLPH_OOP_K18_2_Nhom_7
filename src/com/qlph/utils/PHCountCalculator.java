package com.qlph.utils;

import java.util.ArrayList;

import com.qlph.model.PhongHoc;

public class PHCountCalculator {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public int countPHLT(ArrayList<PhongHoc> dSPH) {
		int soLuong = 0;
		for (PhongHoc ph : dSPH) {
			// Kiểm tra nếu phòng học là loại lý thuyết
			if (ph.getLoaiPhong().equals("LT")) { 
				soLuong++;
			}
		}
		return soLuong;
	}
	public int countPHMT(ArrayList<PhongHoc> dSPH) {
		int soLuong = 0;
		for (PhongHoc ph : dSPH) {
			// Kiểm tra nếu phòng học là loại lý thuyết
			if (ph.getLoaiPhong().equals("MT")) { 
				soLuong++;
			}
		}
		return soLuong;
	}
	public int countPHTN(ArrayList<PhongHoc> dSPH) {
		int soLuong = 0;
		for (PhongHoc ph : dSPH) {
			// Kiểm tra nếu phòng học là loại lý thuyết
			if (ph.getLoaiPhong().equals("TN")) { 
				soLuong++;
			}
		}
		return soLuong;
	}
}
