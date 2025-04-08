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
	    // 1. Gửi thông điệp đến object PHDeleteInput
	    // Người dùng nhập thông tin phòng cần xóa
	    String maPhong = phDeleteInput.inputMaPhong();
	    String loaiPhong = phDeleteInput.inputLoaiPhong();
	    
	    // 2. Gửi thông điệp đến object PHDeleteDAO
	    // Tìm phòng và kiểm tra xem có tồn tại không
	    PhongHoc phongHoc = phDeleteDAO.search(maPhong, loaiPhong);
	    boolean phongTonTai = (phongHoc != null);
	    
	    // Thử xóa phòng nếu nó tồn tại
	    boolean xoaThanhCong = phongTonTai && phDeleteDAO.delete(maPhong, loaiPhong);
	    
	    // 3. Gửi thông điệp đến object PHDeleteOutput
	    // Hiển thị thông báo cho người dùng (thành công hay thất bại)
	    phDeleteOutput.showMessage(xoaThanhCong);
	}

	
}
