package com.qlph.ui;

import java.io.PrintWriter;

public class PHLTOutputAVG {
	
	private PrintWriter out;
	
	public PHLTOutputAVG() {
		
	}
	
	public PHLTOutputAVG(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void output(double result) {
		out.println("---------------------------------------------------");
    	out.flush();
		out.println("[Diện tích trung bình phòng học lý thuyết] = " + result);
		out.flush();
		out.println("---------------------------------------------------");
    	out.flush();
	}
	
	
}
