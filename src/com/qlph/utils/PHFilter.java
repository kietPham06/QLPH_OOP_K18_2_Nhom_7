package com.qlph.utils;

import java.util.ArrayList;

import com.qlph.model.PhongHoc;

public class PHFilter {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public ArrayList<PhongHoc> filterPH(ArrayList<PhongHoc> dSPH) {
        ArrayList<PhongHoc> phongKhongDatChuan = new ArrayList<>();
        for (PhongHoc ph : dSPH) {
            // Kiểm tra nếu phòng học không đạt chuẩn
            if (!ph.isDatChuan()) {
                phongKhongDatChuan.add(ph); // Thêm vào danh sách
            }
        }
        // Nếu không có phòng nào không đạt chuẩn, trả về danh sách rỗng
        return phongKhongDatChuan;
    }
}
