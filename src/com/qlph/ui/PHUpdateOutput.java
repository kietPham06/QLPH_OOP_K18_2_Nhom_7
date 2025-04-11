package com.qlph.ui;

import java.io.PrintWriter;

import com.qlph.model.PhongHoc;

public class PHUpdateOutput {
	
	// Ô 2 - Fields
	private PrintWriter out;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHUpdateOutput() {
		// TODO Auto-generated constructor stub
	}
	
	// Parameter Constructor
	public PHUpdateOutput(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void showMessage(PhongHoc ph) {
		if (ph == null) {
			out.println("-------------------------");
	    	out.flush();
			out.println("Phòng học không tồn tại!");
			out.flush();
			out.println("-------------------------");
	    	out.flush();
		} else {
			out.println("------------------------------");
			out.flush();
			out.println("Cập nhật phòng học thành công!");
			out.flush();
			out.println(ph);
			out.flush();
			out.println("------------------------------");
			out.flush();
		}
	}
	
	
}
