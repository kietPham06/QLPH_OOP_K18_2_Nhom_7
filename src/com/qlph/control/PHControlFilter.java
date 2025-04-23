package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHFilterDAO;
import com.qlph.entity.PhongHoc;
import com.qlph.ui.PHOutputFilter;
import com.qlph.utils.PHFilter;

public class PHControlFilter {
	
	private PHFilterDAO phFilterDAO;
	private PHFilter phFilter;
	private PHOutputFilter phOutputFilter;
	
	public PHControlFilter() {
		// TODO Auto-generated constructor stub
	}

	public PHControlFilter(PHFilterDAO phFilterDAO, PHFilter phFilter, PHOutputFilter phOutputFilter) {
		super();
		this.phFilterDAO = phFilterDAO;
		this.phFilter = phFilter;
		this.phOutputFilter = phOutputFilter;
	}
	
	public void filter() {
		ArrayList<PhongHoc> dsPH;
		ArrayList<PhongHoc> dsPHKDC;
		
		// Phối hợp với các đối tượng
		
		// Gửi thông điệp đến hành vi getDSPH() của đối tượng PHFilterDAO
		// 1. Thực hiện thao tác lấy danh sách phòng học từ cơ sở dữ liệu\
		dsPH = phFilterDAO.getDSPH();
		
		// Gửi thông điệp đến hành vi filter() của đối tượng PHFilter
		// 2. Lọc ra các phòng học không đạt chuẩn
		dsPHKDC = phFilter.filter(dsPH);
		
		// Gửi thông điệp đến hành vi output() của đối tượng PHOutputFilter
		// 3. Hiển thị danh sách phòng học không đạt chuẩn cho người dùng
		phOutputFilter.output(dsPHKDC);
	}
	
	
}
