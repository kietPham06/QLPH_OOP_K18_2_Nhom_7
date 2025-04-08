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
        out.println("-------------------------");
    	out.flush();
		if (ph == null) {
			out.println("Phòng học không tồn tại!");
		} else {
			out.println("Cập nhật phòng học thành công!");
			out.flush();
			out.println(ph);
		}
		out.flush();
        out.println("-------------------------");
		out.flush();
	}
	
}
