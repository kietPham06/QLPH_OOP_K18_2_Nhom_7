package com.qlph.ui;

import java.io.PrintWriter;

public class PHDeleteOutput {
	
	// Ô 2 - Fields
	private PrintWriter out;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHDeleteOutput() {
		// TODO Auto-generated constructor stub
	}

	public PHDeleteOutput(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void showMessage(boolean isThanhCong) {
		out.println("-----------------------------");
		out.flush();
		if (isThanhCong) {
			out.println("Xóa phòng học thành công!");
			out.flush();
		} else {
			out.println("Xóa phòng học thất bại!");
			out.flush();
		}
		out.println("-----------------------------");
		out.flush();
	}
	
    public void DSPHIsEmpty() { 
    	out.println("--------------------------------------------------");
	    out.flush();
		out.println("Hiện tại, không có phòng học nào trong danh sách.");
	    out.flush();
	  	out.println("--------------------------------------------------");
	    out.flush();
    }
	
	
}
