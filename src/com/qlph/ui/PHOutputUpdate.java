package com.qlph.ui;

import java.io.PrintWriter;

import com.qlph.entity.PhongHoc;

public class PHOutputUpdate {
	
	private PrintWriter out;
	
	public PHOutputUpdate() {
		// TODO Auto-generated constructor stub
	}

	public PHOutputUpdate(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void showMessage(PhongHoc ph) {
		if (ph == null) {
			out.println("-------------------------");
	    	out.flush();
			out.println("Cập nhật phòng học thất bại!");
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
