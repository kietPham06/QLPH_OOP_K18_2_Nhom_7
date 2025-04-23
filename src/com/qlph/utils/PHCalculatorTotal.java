package com.qlph.utils;

import java.util.ArrayList;

import com.qlph.entity.PhongHoc;

public class PHCalculatorTotal {
	
	public int totalPHLT(ArrayList<PhongHoc> dsPH) {
		int soLuong = 0;
		for (PhongHoc ph : dsPH) {
			if (ph == null) continue;
			if ("LT".equals(ph.getLoaiPhong())) {
				soLuong++;
			}
		}
		return soLuong;
	}
	
	public int totalPHMT(ArrayList<PhongHoc> dsPH) {
		int soLuong = 0;
		for (PhongHoc ph : dsPH) {
			if (ph == null) continue;
			if ("MT".equals(ph.getLoaiPhong())) {
				soLuong++;
			}
		}
		return soLuong;
	}
	
	public int totalPHTN(ArrayList<PhongHoc> dsPH) {
		int soLuong = 0;
		for (PhongHoc ph : dsPH) {
			if (ph == null) continue;
			if ("TN".equals(ph.getLoaiPhong())) {
				soLuong++;
			}
		}
		return soLuong;
	}
	
	
}
