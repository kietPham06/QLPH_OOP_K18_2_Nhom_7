package com.qlph.ui;

import java.io.PrintWriter;

public class PHOutputTotal {
	
	private PrintWriter out;
	
	public PHOutputTotal() {
		// TODO Auto-generated constructor stub
	}

	public PHOutputTotal(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void output(int totalPHLT,int totalPHMT,int totalPHTN) {
		out.println("-------------------------------------------------");
		out.flush();
		out.println("[Tổng số lượng phòng học lý thuyết]= " + totalPHLT);
		out.flush();
		out.println("[Tổng số lượng phòng học máy tính]= " + totalPHMT);
		out.flush();
		out.println("[Tổng số lượng phòng học thí nghiệm]= " + totalPHTN);
		out.flush();
		out.println("-------------------------------------------------");
		out.flush();
	}
	
	
}
