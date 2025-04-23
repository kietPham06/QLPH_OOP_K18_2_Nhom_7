package com.qlph.utils;

import java.util.ArrayList;

import com.qlph.entity.PhongHoc;

public class PHLTCalculatorAVG {
	
	public double averageArea(ArrayList<PhongHoc> dsPH) {
		int soLuong = 0;
		double tongDienTich = 0;
		for (PhongHoc ph : dsPH) {
			if (ph == null) continue;
			if ("LT".equals(ph.getLoaiPhong())) {
				tongDienTich += ph.getDienTich();
				soLuong++;
			}
		}
		return tongDienTich / soLuong;
	}
	
	
}
