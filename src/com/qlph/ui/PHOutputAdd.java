package com.qlph.ui;

import java.io.PrintWriter;

import com.qlph.entity.PhongHoc;

public class PHOutputAdd {
	
	private PrintWriter out;
	
	public PHOutputAdd() {
		// TODO Auto-generated constructor stub
	}
	
	public PHOutputAdd(PrintWriter out) {
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
			out.println("-----------------------------");
			out.flush();
			out.println("Thêm phòng học thành công!");
			out.flush();
			out.println(ph);
			out.flush();
			out.println("-----------------------------");
			out.flush();
		}
	}
	
	
}
