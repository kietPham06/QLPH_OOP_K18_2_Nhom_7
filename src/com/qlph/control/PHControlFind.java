package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHFindDAO;
import com.qlph.database.PHFindLocatorDAO;
import com.qlph.entity.PhongHoc;
import com.qlph.ui.PHInputFindLocator;
import com.qlph.ui.PHOutputFind;
import com.qlph.utils.PHFindLocator;

public class PHControlFind {
	
	private PHInputFindLocator phInputFindLocator;
	private PHFindLocatorDAO phFindLocatorDAO;
	private PHFindLocator phFindLocator;
	private PHFindDAO phFindDAO;
	private PHOutputFind phOutputFind;
	
	public PHControlFind() {
		// TODO Auto-generated constructor stub
	}

	public PHControlFind(PHInputFindLocator phInputFindLocator, PHFindLocatorDAO phFindLocatorDAO, PHFindLocator phFindLocator,
			PHFindDAO phFindDAO, PHOutputFind phOutputFind) {
		super();
		this.phInputFindLocator = phInputFindLocator;
		this.phFindLocatorDAO = phFindLocatorDAO;
		this.phFindLocator = phFindLocator;
		this.phFindDAO = phFindDAO;
		this.phOutputFind = phOutputFind;
	}
	
	public void find() {
		String maPhong;
		String loaiPhong;
		ArrayList<PhongHoc> dsPH;
		int index;
		PhongHoc ph;
		
		// Phối hợp với các đối tượng
		
		// Gửi thông điệp đến hành vi inputMaPhong() và hành vi inputLoaiPhong() của đối tượng PHInputFind
		// 1. Người dùng nhập mã phòng và loại phòng
		maPhong = phInputFindLocator.inputMaPhong();
		loaiPhong = phInputFindLocator.inputLoaiPhong();
		
		// Gửi thông điệp đến hành vi getDSPH() của đối tượng PHFindLocatorDAO
		// 2. Thực hiện thao tác lấy danh sách phòng học từ cơ sở dữ liệu
		dsPH = phFindLocatorDAO.getDSPH();
		
		// Gửi thông điệp đến hành vi getIndexFromIdAndRoomType() của đối tượng PHFindLocator
		// 3. Tìm kiếm vị trí phòng học trong cơ sở dữ liệu 
		index = phFindLocator.getIndexFromIdAndRoomType(maPhong, loaiPhong, dsPH);
		
		// Gửi thông điệp đến hành vi select() của đối tượng PHFindDAO
		// 4. Thực hiện thao tác lấy phòng học từ cơ sở dữ liệu
		ph = phFindDAO.select(index);
		
		// Gửi thông điệp đến hành vi printPH() của đối tượng PHOutputFind
		// 5. Hiển thị thông tin phòng học
		phOutputFind.printPH(ph);
	}
	
	
}