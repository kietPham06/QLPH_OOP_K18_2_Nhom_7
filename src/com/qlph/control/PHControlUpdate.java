package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHUpdateDAO;
import com.qlph.database.PHUpdateLocatorDAO;
import com.qlph.entity.PhongHoc;
import com.qlph.ui.PHInputUpdate;
import com.qlph.ui.PHInputUpdateLocator;
import com.qlph.ui.PHOutputUpdate;
import com.qlph.utils.PHUpdateLocator;

public class PHControlUpdate {
	
	private PHInputUpdateLocator phInputUpdateLocator;
	private PHInputUpdate phInputUpdate;
	private PHUpdateLocatorDAO phUpdateLocatorDAO;
	private PHUpdateLocator phUpdateLocator;
	private PHUpdateDAO phUpdateDAO;
	private PHOutputUpdate phOutputUpdate;
	
	public PHControlUpdate() {
		// TODO Auto-generated constructor stub
	}

	public PHControlUpdate(PHInputUpdateLocator phInputUpdateLocator, PHInputUpdate phInputUpdate,
			PHUpdateLocatorDAO phUpdateLocatorDAO, PHUpdateLocator phUpdateLocator, PHUpdateDAO phUpdateDAO,
			PHOutputUpdate phOutputUpdate) {
		super();
		this.phInputUpdateLocator = phInputUpdateLocator;
		this.phInputUpdate = phInputUpdate;
		this.phUpdateLocatorDAO = phUpdateLocatorDAO;
		this.phUpdateLocator = phUpdateLocator;
		this.phUpdateDAO = phUpdateDAO;
		this.phOutputUpdate = phOutputUpdate;
	}
	
	public void update() {
		String maPhong;
		String loaiPhong;
		PhongHoc ph;
		ArrayList<PhongHoc> dsPH;
		int index;
		PhongHoc newPH;
		
		// Phối hợp với các đối tượng
		
		// Gửi thông điệp đến hành vi inputMaPhong() và inputLoaiPhong() của đối tượng PHInputUpdateLocator
		// 1. Người dùng nhập mã phòng, loại phòng
		maPhong = phInputUpdateLocator.inputMaPhong();
		loaiPhong = phInputUpdateLocator.inputLoaiPhong();
		
		// Gửi thông điệp đến hành inputPH() của đối tượng PHInputUpdate
		// 2. Người dùng nhập thông tin phòng cập nhật
		ph = phInputUpdate.inputPH(maPhong, loaiPhong);
		
		// Gửi thông điệp đến hành vi getDSPH() của đối tượng PHUpdateLocatorDAO
		// 3. Thực hiện thao tác lấy danh sách phòng học từ cơ sở dữ liệu
		dsPH = phUpdateLocatorDAO.getDSPH();
		
		// Gửi thông điệp đến hành vi getIndexFromIdAndRoomType() của đối tượng PHUpdateLocator
		// 4. Tìm kiếm vị trí phòng học trong cơ sở dữ liệu
		index = phUpdateLocator.getIndexFromIdAndRoomType(maPhong, loaiPhong, dsPH);
		
		// Gửi thông điệp đến hành vi update() của đối tượng PHUpdateDAO
		// 5. Thực hiện thao tác cập nhật phòng học trong cơ sở dữ liệu
		newPH = phUpdateDAO.update(index, ph);
		
		// Gửi thông điệp đến hành vi showMessage() của đối tượng PHOutputUpdate
		// 6. Hiển thị thông báo cho người dùng
		phOutputUpdate.showMessage(newPH);
	}
	
	
}