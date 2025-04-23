package com.qlph.control;

import com.qlph.database.PHAddDAO;
import com.qlph.entity.PhongHoc;
import com.qlph.ui.PHInputAdd;
import com.qlph.ui.PHOutputAdd;

public class PHControlAdd {
	
	private PHInputAdd phInputAdd;
	private PHAddDAO phAddDAO;
	private PHOutputAdd phOutputAdd;
	
	public PHControlAdd() {
		// TODO Auto-generated constructor stub
	}

	public PHControlAdd(PHInputAdd phInputAdd, PHAddDAO phAddDAO, PHOutputAdd phOutputAdd) {
		super();
		this.phInputAdd = phInputAdd;
		this.phAddDAO = phAddDAO;
		this.phOutputAdd = phOutputAdd;
	}
	
	public void add() {
		PhongHoc ph;
		
		// Phối hợp với các đối tượng
		
		// Gửi thông điệp đến hành vi inputPH() của đối tượng PHInputAdd
		// 1. Người dùng nhập thông tin phòng học
		ph = phInputAdd.inputPH();
		
		// Gửi thông điệp đến hành vi insert() của đối tượng PHAddDAO
		// 2. Thêm phòng học vào cơ sở dữ liệu
		phAddDAO.insert(ph);
		
		// Gửi thông điệp đến hành vi showMessage() của đối tượng PHOutputAdd
		// 3. Hiển thị thông báo cho người dùng
		phOutputAdd.showMessage(ph);
	}
	
	
}
