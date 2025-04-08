
package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHPrintDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHPrintOutput;

public class PHPrintControl {
	
	// Ô 2 - Fields
	private PHPrintDAO phPrintDAO;
	private PHPrintOutput phPrintOutput;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHPrintControl() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHPrintControl(PHPrintDAO phPrintDAO, PHPrintOutput phPrintOutput) {
		super();
		this.phPrintDAO = phPrintDAO;
		this.phPrintOutput = phPrintOutput;
	}
	
	public void print() {
		ArrayList<PhongHoc> dsPH;
		
		// Phối hợp với các đối tượng
		// 1. Gửi thông điệp đến object PHPrintDAO
		// Lấy danh sách phòng học từ CSDL
		dsPH = phPrintDAO.getDSPH();
		
		// 2. Gửi thông điệp đến object PHPrintOutput
		// Hiển thị danh sách phòng học
		phPrintOutput.output(dsPH); 
	}
	
	
}
