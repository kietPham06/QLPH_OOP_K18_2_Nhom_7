package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHCountDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHCountOutput;
import com.qlph.utils.PHCountCalculator;

public class PHCountControl {
	
	// Ô 2 - Fields
	private PHCountDAO phCountDAO;
	private PHCountCalculator phCountCalculator;
	private PHCountOutput phCountOutput;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHCountControl() {
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor
	public PHCountControl(PHCountDAO phCountDAO, PHCountCalculator phCountCalculator, PHCountOutput phCountOutput) {
		super();
		this.phCountDAO = phCountDAO;
		this.phCountCalculator = phCountCalculator;
		this.phCountOutput = phCountOutput;
	}

	public void count() {
		ArrayList<PhongHoc> dSPH;
		int soLuongPHLyThuyet;
		int soLuongPHMayTinh;
		int soLuongPHThiNghiem;
		
		// Phối hợp với các đối tượng
		// 1. Gửi thông điệp đến object PHCountDAO
		// Lấy danh sách phòng học từ CSDL
		dSPH = phCountDAO.getDSPH();
		
		// 2. Gửi thông điệp đến object PHCountCalculator
		// Tính số lượng từng loại phòng
		soLuongPHLyThuyet = phCountCalculator.countPHLT(dSPH);
		soLuongPHMayTinh = phCountCalculator.countPHMT(dSPH);
		soLuongPHThiNghiem = phCountCalculator.countPHTN(dSPH);
		
		// 3. Gửi thông điệp đến object PHCountOutput
		// Hiển thị số lượng từng loại phòng
		phCountOutput.countPrint(soLuongPHLyThuyet, soLuongPHMayTinh, soLuongPHThiNghiem);
	}
	
	
}
