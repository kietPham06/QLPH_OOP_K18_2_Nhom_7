package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHDeleteDAO;
import com.qlph.database.PHDeleteLocatorDAO;
import com.qlph.entity.PhongHoc;
import com.qlph.ui.PHInputDeleteLocator;
import com.qlph.ui.PHOutputDelete;
import com.qlph.utils.PHDeleteLocator;


public class PHControlDelete {

	private PHInputDeleteLocator phInputDeleteLocator;
	private PHDeleteLocatorDAO phDeleteLocatorDAO;
	private PHDeleteLocator phDeleteLocator;
	private PHDeleteDAO phDeleteDAO;
	private PHOutputDelete phOutputDelete;
	
	public PHControlDelete() {
		// TODO Auto-generated constructor stub
	}

	public PHControlDelete(PHInputDeleteLocator phInputDeleteLocator, PHDeleteLocatorDAO phDeleteLocatorDAO,
			PHDeleteLocator phDeleteLocator, PHDeleteDAO phDeleteDAO, PHOutputDelete phOutputDelete) {
		super();
		this.phInputDeleteLocator = phInputDeleteLocator;
		this.phDeleteLocatorDAO = phDeleteLocatorDAO;
		this.phDeleteLocator = phDeleteLocator;
		this.phDeleteDAO = phDeleteDAO;
		this.phOutputDelete = phOutputDelete;
	}
	
	public void delete() {
		String maPhong;
		String loaiPhong;
		ArrayList<PhongHoc> dsPH;
		int index;
		boolean xoaThanhCong;
		
		// Phối hợp với các đối tượng
		
		// Gửi thông điệp đến hành vi inputMaPhong() và inputLoaiPhong() của đối tượng PHInputDeleteLocator
		// 1. Người dùng nhập mã phòng, loại phòng
		maPhong = phInputDeleteLocator.inputMaPhong();
		loaiPhong = phInputDeleteLocator.inputLoaiPhong();
		
		// Gửi thông điệp đến hành vi getDSPH() của đối tượng PHeleteLocatorDAO
		// 2. Thực hiện thao tác lấy danh sách phòng học từ cơ sở dữ liệu
		dsPH = phDeleteLocatorDAO.getDSPH();
		
		// Gửi thông điệp đến hành vi getIndexFromIdAndRoomType() của đối tượng PHDeleteLocator
		// 3. Tìm kiếm vị trí phòng học trong cơ sở dữ liệu
		index = phDeleteLocator.getIndexFromIdAndRoomType(maPhong, loaiPhong, dsPH);
		
		// Gửi thông điệp đến hành vi update() của đối tượng PHDeleteDAO
		// 4. Thực hiện thao tác xóa phòng học trong cơ sở dữ liệu
		xoaThanhCong = phDeleteDAO.delete(index);
		
		// Gửi thông điệp đến hành vi showMessage() của đối tượng PHOutputDelete
		// 5. Hiển thị thông báo cho người dùng
		phOutputDelete.showMessage(xoaThanhCong);
	}
	
	
}
