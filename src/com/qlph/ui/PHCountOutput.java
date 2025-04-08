package com.qlph.ui;

import java.io.PrintWriter;

public class PHCountOutput {
	
	// Ô 2 - Fields
	private PrintWriter out;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHCountOutput() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHCountOutput(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void Countprint(int Countphlt,int Countphmt,int Countphtn) {
		out.println("-------------------------------------------------");
		out.flush();
		out.println("[Tổng số lượng phòng học lý thuyết]= " + Countphlt);
		out.flush();
		out.println("[Tổng số lượng phòng học máy tính]= " + Countphmt);
		out.flush();
		out.println("[Tổng số lượng phòng học thí nghiệm]= " + Countphtn);
		out.flush();
		out.println("-------------------------------------------------");
		out.flush();
	}
	
	
}
