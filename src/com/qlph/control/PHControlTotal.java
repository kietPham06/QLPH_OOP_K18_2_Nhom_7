package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHTotalDAO;
import com.qlph.entity.PhongHoc;
import com.qlph.ui.PHOutputTotal;
import com.qlph.utils.PHCalculatorTotal;

public class PHControlTotal {
	
	private PHTotalDAO phTotalDAO;
	private PHCalculatorTotal phCalculatorTotal;
	private PHOutputTotal phOutputTotal;
	
	public PHControlTotal() {
		// TODO Auto-generated constructor stub
	}

	public PHControlTotal(PHTotalDAO phTotalDAO, PHCalculatorTotal phCalculatorTotal, PHOutputTotal phOutputTotal) {
		super();
		this.phTotalDAO = phTotalDAO;
		this.phCalculatorTotal = phCalculatorTotal;
		this.phOutputTotal = phOutputTotal;
	}
	
	public void total() {
		ArrayList<PhongHoc> dsPH;
		int tongSoLuongPHLT;
		int tongSoLuongPHMT;
		int tongSoLuongPHTN;
		
		// Phối hợp với các đối tượng
		
		// Gửi thông điệp đến hành vi getDSPH() của đối tượng PHTotalDAO
		// 1. Thực hiện thao tác lấy danh sách phòng học từ cơ sở dữ liệu
		dsPH = phTotalDAO.getDSPH();
		
		// Gửi thông điệp đến các hành vi totalPHLT(), totalPHMT(), totalPHTN() của đối tượng PHCalculatorTotal
		// 2. Tính tổng số lượng từng loại phòng
		tongSoLuongPHLT = phCalculatorTotal.totalPHLT(dsPH);
		tongSoLuongPHMT = phCalculatorTotal.totalPHMT(dsPH);
		tongSoLuongPHTN = phCalculatorTotal.totalPHTN(dsPH);
		
		// Gửi thông điệp đến hành vi output() của đối tượng PHOutputTotal
		// 3. Hiển thị số lượng từng loại phòng cho người dùng
		phOutputTotal.output(tongSoLuongPHLT, tongSoLuongPHMT, tongSoLuongPHTN);
	}
	
	
}
