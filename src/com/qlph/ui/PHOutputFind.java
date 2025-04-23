package com.qlph.ui;

import java.io.PrintWriter;

import com.qlph.entity.PhongHoc;

public class PHOutputFind {
	
	private PrintWriter out;
	
	public PHOutputFind() {
		// TODO Auto-generated constructor stub
	}

	public PHOutputFind(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void printPH(PhongHoc ph) {
		out.println("-----------------------------");
		out.flush();
        if (ph == null) {
            out.println("Phòng học không tồn tại.");
            out.flush();
        } else {
        	out.println("Đã tìm thấy phòng học!");
        	out.flush();
            out.println(ph);
            out.flush();
        }
		out.println("-----------------------------");
		out.flush();	
	}
	
	
}
