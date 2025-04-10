package com.qlph.control;

import com.qlph.database.PHDeleteDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHDeleteInput;
import com.qlph.ui.PHDeleteOutput;

public class PHDeleteControl {
		
	// Ô 2 - Fields
	private PHDeleteDAO phDeleteDAO;
	private PHDeleteInput phDeleteInput;
	private PHDeleteOutput phDeleteOutput;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHDeleteControl() {
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor
	public PHDeleteControl(PHDeleteDAO phDeleteDAO, PHDeleteInput phDeleteInput, PHDeleteOutput phDeleteOutput) {
		super();
		this.phDeleteDAO = phDeleteDAO;
		this.phDeleteInput = phDeleteInput;
		this.phDeleteOutput = phDeleteOutput;
	}
	
	public void delete() {
		PhongHoc ph;
		String maPhong;
		String loaiPhong;
		boolean xoaThanhCong;
		
	    // 1. Gửi thông điệp đến object PHDeleteInput
	    // Người dùng nhập thông tin phòng cần xóa
		maPhong = phDeleteInput.inputMaPhong();
		loaiPhong = phDeleteInput.inputLoaiPhong();
	    
	    // 2. Gửi thông điệp đến object PHDeleteDAO
	    // Tìm phòng và kiểm tra xem có tồn tại không
	    ph = phDeleteDAO.search(maPhong, loaiPhong);
	    
	    // 3. Kiểm tra và xử lý xóa
	    if (ph == null) {
	    	phDeleteOutput.showMessage(false);
	    } else {
	    	xoaThanhCong = phDeleteDAO.delete(maPhong, loaiPhong);
	    	phDeleteOutput.showMessage(xoaThanhCong);
	    }
	}

	
}
