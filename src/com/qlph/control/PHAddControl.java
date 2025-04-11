package com.qlph.control;

import com.qlph.database.PHAddDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHAddInput;
import com.qlph.ui.PHAddOutput;

public class PHAddControl {
	
	// Ô 2 - Fields
	private PHAddDAO phAddDAO;
	private PHAddInput phAddInput;
	private PHAddOutput phAddOutput;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHAddControl() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHAddControl(PHAddDAO phAddDAO, PHAddInput phAddInput, PHAddOutput phAddOutput) {
		super();
		this.phAddDAO = phAddDAO;
		this.phAddInput = phAddInput;
		this.phAddOutput = phAddOutput;
	}
	
	public void add() {
		PhongHoc ph;
		
		// Phối hợp với các đối tượng
		// 1. Gửi thông điệp đến object PHAddInput
		// Người dùng nhập dữ liệu từ bàn phím
		ph = phAddInput.inputPH();
		
		// 2. Gửi thông điệp đến object PHAddDAO
		// Thêm phòng học vào CSDL
		phAddDAO.insert(ph);
		
		// 3. Gửi thông điệp đến object PHAddOuput
		// Hiển thị kết quả cho người dùng
		phAddOutput.showMessage(ph);
	}
	
	
}
