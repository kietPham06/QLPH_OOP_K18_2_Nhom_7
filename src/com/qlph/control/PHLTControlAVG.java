package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHLTAVGDAO;
import com.qlph.entity.PhongHoc;
import com.qlph.ui.PHLTOutputAVG;
import com.qlph.utils.PHLTCalculatorAVG;

public class PHLTControlAVG {
	
	private PHLTAVGDAO phltavgdao;
	private PHLTCalculatorAVG phltCalculatorAVG;
	private PHLTOutputAVG phltOutputAVG;
	
	public PHLTControlAVG() {
		// TODO Auto-generated constructor stub
	}

	public PHLTControlAVG(PHLTAVGDAO phltavgdao, PHLTCalculatorAVG phltCalculatorAVG, PHLTOutputAVG phltOutputAVG) {
		super();
		this.phltavgdao = phltavgdao;
		this.phltCalculatorAVG = phltCalculatorAVG;
		this.phltOutputAVG = phltOutputAVG;
	}
	
	public void average() {
		ArrayList<PhongHoc> dsPH;
		double dienTichTrungBinh;
		
		// Phối hợp với các đối tượng
		
		// Gửi thông điệp đến hành vi getDSPH() của đối tượng PHLTAVGDAO
		// 1. Thực hiện thao tác lấy danh sách phòng học từ cơ sở dữ liệu
		dsPH = phltavgdao.getDSPH();
		
		// Gửi thông điệp đến hành vi averageArea() của đối tượng PHLTCalculatorAVG
		// 2. Tính diện tích trung bình phòng học lý thuyết
		dienTichTrungBinh = phltCalculatorAVG.averageArea(dsPH);
		
		// Gửi thông điệp đến hành vi output() của đối tượng PHLTOutputAVG
		// 3. Hiển thị kết quả cho người dùng
		phltOutputAVG.output(dienTichTrungBinh);
	}
	
	
}
