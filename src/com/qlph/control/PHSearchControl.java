package com.qlph.control;

import com.qlph.database.PHSearchDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHSearchInput;
import com.qlph.ui.PHSearchOutput;

public class PHSearchControl {
	
	// Ô 2 - Fields
	PHSearchDAO phSearchDAO;
	PHSearchInput phSearchInput;
	PHSearchOutput phSearchOutput;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHSearchControl() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHSearchControl(PHSearchDAO phSearchDAO, PHSearchInput phSearchInput, PHSearchOutput phSearchOutput) {
		super();
		this.phSearchDAO = phSearchDAO;
		this.phSearchInput = phSearchInput;
		this.phSearchOutput = phSearchOutput;
	}
	
	public void search() {
		String maPhong;
		String loaiPhong;
		PhongHoc ph;
		
		// Phối hợp với các đối tượng
		// 1. Gửi thông điệp đến object PHSearchInput
		// Người dùng nhập thông tin phòng cần tìm
		maPhong = phSearchInput.inputMaPhong();
		loaiPhong = phSearchInput.inputLoaiPhong();
		
		// 2. Gửi thông điệp đến object PHSearchDAO
		// Tìm kiếm phòng học trong CSDL trùng khớp với thông tin người dùng nhập
		ph = phSearchDAO.search(maPhong, loaiPhong);
		
		// 3. Gửi thông điệp đến object PHSearchOutput
		// Hiển thị thông tin phòng
		phSearchOutput.hienThiThongTin(ph);
	}
}

