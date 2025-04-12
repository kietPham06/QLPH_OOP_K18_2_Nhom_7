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
	
	public void countPrint(int countPHLT,int countPHMT,int countPHTN) {
		out.println("-------------------------------------------------");
		out.flush();
		out.println("[Tổng số lượng phòng học lý thuyết]= " + countPHLT);
		out.flush();
		out.println("[Tổng số lượng phòng học máy tính]= " + countPHMT);
		out.flush();
		out.println("[Tổng số lượng phòng học thí nghiệm]= " + countPHTN);
		out.flush();
		out.println("-------------------------------------------------");
		out.flush();
	}
	
	
}
