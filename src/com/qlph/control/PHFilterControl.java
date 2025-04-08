package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHFilterDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHFilterOutput;
import com.qlph.utils.PHFilter;

public class PHFilterControl {
	
	// Ô 2 - Fields
	private PHFilterDAO phFilterDAO;
	private PHFilter phFilter;
	private PHFilterOutput phFilterOutput;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHFilterControl() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHFilterControl(PHFilterDAO phFilterDAO, PHFilter phFilter, PHFilterOutput phFilterOutput) {
		super();
		this.phFilterDAO = phFilterDAO;
		this.phFilter = phFilter;
		this.phFilterOutput = phFilterOutput;
	}
	
	public void filter() {
		ArrayList<PhongHoc> dSPH;
		ArrayList<PhongHoc> dSPKDC;
		
		// Phối hợp với các đối tượng
		// 1. Gửi thông điệp đến object PHFilterDAO
		// Lấy ra danh sách phòng học từ CSDL
		dSPH = phFilterDAO.getDSPH();
		
		// 2. Gửi thông điệp đến object PHFilter
		// Lọc ra các phòng không đạt chuẩn
		// 3. Gửi thông điệp đến object PHFilterOutput
		// Hiển thị các phòng không đạt chuẩn
		if (dSPH.isEmpty()) {
			phFilterOutput.DSPHIsEmpty();
		} else {
			dSPKDC = phFilter.filterPH(dSPH);
			phFilterOutput.filterPrint(dSPKDC);
		}
	}
	
	
}
