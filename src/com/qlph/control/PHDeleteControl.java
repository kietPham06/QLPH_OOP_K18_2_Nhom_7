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
		// Kiểm tra phòng học và xử lý xóa
		// 3. Gửi thông điệp đến object PHDeleleOutput
	    // Hiển thị thông báo cho người dùng
		
	    ph = phDeleteDAO.search(maPhong, loaiPhong);  
	    // Kiểm tra phòng học trong CSDL
	    if (ph == null) {
	    	// Hiển thị thông báo
	    	phDeleteOutput.showMessage(false);
	    } else {
	    	// Thực hiện thao tác xóa trong CSDL
	    	xoaThanhCong = phDeleteDAO.delete(maPhong, loaiPhong);
	    	// Hiển thị thông báo
	    	phDeleteOutput.showMessage(xoaThanhCong);
	    }
	}

	
}
