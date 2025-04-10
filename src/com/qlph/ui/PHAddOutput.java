package com.qlph.ui;

import java.io.PrintWriter;

import com.qlph.model.PhongHoc;

public class PHAddOutput {
	
	// Ô 2 - Fields
	PrintWriter out;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHAddOutput() {
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor
	public PHAddOutput(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void showMessage(PhongHoc ph) {
		if (ph == null) {
			out.println("-------------------------");
			out.flush();
			out.println("Thêm phòng học thất bại!");
			out.flush();
			out.println("-------------------------");
			out.flush();
		} else {
			out.println("-------------------------");
			out.flush();
			out.println("Thêm phòng học thành công!");
			out.flush();
			out.println(ph);
			out.flush();
			out.println("-------------------------");
			out.flush();
		}
	}
	
	
}
