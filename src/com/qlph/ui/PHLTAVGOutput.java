package com.qlph.ui;

import java.io.PrintWriter;

public class PHLTAVGOutput {
	
	// Ô 2 - Fields
	private PrintWriter out;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHLTAVGOutput() {
		
	}
	
	// Parameterized Constructor
	public PHLTAVGOutput(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void printAVG(double results) {
		out.println("---------------------------------------------------");
    	out.flush();
		out.println("[Diện tích trung bình phòng học lý thuyết] = " + results);
		out.flush();
		out.println("---------------------------------------------------");
    	out.flush();
	}
	
	
}
