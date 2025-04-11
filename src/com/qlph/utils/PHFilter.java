package com.qlph.utils;

import java.util.ArrayList;

import com.qlph.model.PhongHoc;

public class PHFilter {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public ArrayList<PhongHoc> filterPH(ArrayList<PhongHoc> dSPH) {
	    ArrayList<PhongHoc> dsPKDC = new ArrayList<>();
	    for (PhongHoc ph : dSPH) {
	        if (!ph.isDatChuan()) {
	        	dsPKDC.add(ph);
	        }
	    }
	    return dsPKDC;
	}
}
