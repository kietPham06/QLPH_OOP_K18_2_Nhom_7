package com.qlph.utils;

import java.util.ArrayList;

import com.qlph.model.PhongHoc;

public class PHCountCalculator {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public int Countphlt(ArrayList<PhongHoc> getPhongHocs) {
		int phlt = 0;
		for (PhongHoc ph : getPhongHocs) {
			// Kiểm tra nếu phòng học là loại lý thuyết
			if (ph.getLoaiPhong().equals("LT")) { 
				phlt ++;
			}
		}
		return phlt;
	}
	public int Countphmt(ArrayList<PhongHoc> getPhongHocs) {
		int phmt = 0;
		for (PhongHoc ph : getPhongHocs) {
			// Kiểm tra nếu phòng học là loại lý thuyết
			if (ph.getLoaiPhong().equals("MT")) { 
				phmt ++;
			}
		}
		return phmt;
	}
	public int Countphtn(ArrayList<PhongHoc> getPhongHocs) {
		int phtn = 0;
		for (PhongHoc ph : getPhongHocs) {
			// Kiểm tra nếu phòng học là loại lý thuyết
			if (ph.getLoaiPhong().equals("TN")) { 
				phtn ++;
			}
		}
		return phtn;
	}
}
