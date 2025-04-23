package com.qlph.utils;

import java.util.ArrayList;

import com.qlph.entity.PhongHoc;

public class PHFilter {
	
	public ArrayList<PhongHoc> filter(ArrayList<PhongHoc> dsPH) {
		ArrayList<PhongHoc> dsPHKDC = new ArrayList<>();
		for (PhongHoc ph : dsPH) {
			if (ph == null) continue;
			if (!ph.DatChuan()) {
				dsPHKDC.add(ph);
			}
		}
		return dsPHKDC;
	}
	
	
}
