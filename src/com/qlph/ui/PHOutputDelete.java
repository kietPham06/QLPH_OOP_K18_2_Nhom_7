package com.qlph.ui;

import java.io.PrintWriter;

public class PHOutputDelete {
	
	private PrintWriter out;
	
	public PHOutputDelete() {
		// TODO Auto-generated constructor stub
	}

	public PHOutputDelete(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void showMessage(boolean success) {
		out.println("-------------------------");
		out.flush();
		if (!success) {
			out.println("Xóa phòng học thất bại!");
			out.flush();
		} else {
			out.println("Xóa phòng học thành công!");
			out.flush();
		}
		out.println("-------------------------");
		out.flush();
	}
	
	
}
