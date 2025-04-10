package com.qlph.control;

import java.util.ArrayList;

import com.qlph.database.PHLTAVGDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHLTAVGOutput;
import com.qlph.utils.PHLTAVGCalculator;

public class PHLTAVGControl {

	// Ô 2 - Fields
	private PHLTAVGDAO phltavgdao;
	private PHLTAVGCalculator phltavgCalculator;
	private PHLTAVGOutput phltavgOutput;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHLTAVGControl() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHLTAVGControl(PHLTAVGDAO phltavgdao, PHLTAVGCalculator phltavgCalculator, PHLTAVGOutput phltavgOutput) {
		super();
		this.phltavgdao = phltavgdao;
		this.phltavgCalculator = phltavgCalculator;
		this.phltavgOutput = phltavgOutput;
	}
	
	public void average() {
		ArrayList<PhongHoc> dSPH;
		double DienTichTrungBinh;
		
		// Phối hợp với các đối tượng
		// 1. Gửi thông điệp đến object PHLTAVGDAO
		// Lấy danh sách phòng học từ CSDL
		dSPH = phltavgdao.getDSPH();
		
		// 2. Gửi thông điệp đến object PHLTAVGCalculator
		// Tính diện tích trung bình phòng học Lý thuyết
		DienTichTrungBinh = phltavgCalculator.calculatorAVG(dSPH);
		
		// 3. Gửi thông điệp đến object PHLTAVGOutput
		// Hiển thị kết quả
		phltavgOutput.printAVG(DienTichTrungBinh);
	}

	
}
