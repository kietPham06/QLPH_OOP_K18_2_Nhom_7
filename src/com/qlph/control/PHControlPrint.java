package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHPrintDAO;
import com.qlph.entity.PhongHoc;
import com.qlph.ui.PHOutputPrint;

public class PHControlPrint {
	
	private PHPrintDAO phPrintDAO;
	private PHOutputPrint phOutputPrint;
	
	public PHControlPrint() {
		// TODO Auto-generated constructor stub
	}

	public PHControlPrint(PHPrintDAO phPrintDAO, PHOutputPrint phOutputPrint) {
		super();
		this.phPrintDAO = phPrintDAO;
		this.phOutputPrint = phOutputPrint;
	}
	
	public void print() {
		ArrayList<PhongHoc> dsPH;
		
		// Phối hợp với các đối tượng
		
		// Gửi thông điệp đến hành vi getDSPH() của đối tượng PHPrintDAO
		// 1. Thực hiện thao tác lấy danh sách phòng học từ cơ sở dữ liệu
		dsPH = phPrintDAO.getDSPH();
		
		// Gửi thông điệp đến hành vi output() của đối tượng PHOutputPrint
		// 2. Hiển thị danh sách phòng học cho người dùng
		phOutputPrint.output(dsPH);
	}
	
	
}
