package com.qlph.utils;

import java.util.ArrayList;

import com.qlph.entity.PhongHoc;

public class PHDeleteLocator {

	public int getIndexFromIdAndRoomType(String maPhong, String loaiPhong, ArrayList<PhongHoc> dsPH) {
		int index = -1;
		for (int i = dsPH.size() - 1; i >= 0; i--) {
			if (dsPH.get(i) == null) continue;
			if (maPhong.equalsIgnoreCase(dsPH.get(i).getMaPhong()) && loaiPhong.equalsIgnoreCase(dsPH.get(i).getLoaiPhong())) {
				index = i;
			}
		}
		return index;
	}
	
	
}
