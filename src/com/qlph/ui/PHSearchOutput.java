package com.qlph.ui;

import java.io.PrintWriter;

import com.qlph.model.PhongHoc;

public class PHSearchOutput {
	
	// Ô 2 - Fields
	private PrintWriter out;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHSearchOutput() {
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor
	public PHSearchOutput(PrintWriter out) {
		super();
		this.out = out;
	}

	public void printSearch(PhongHoc phong) {
		out.println("-----------------------------");
		out.flush();
        if (phong == null) {
            out.println("Phòng học không tồn tại.");
        } else {
            out.println(phong);
        }
    	out.flush();
		out.println("-----------------------------");
		out.flush();
    }
	
    public void DSPHIsEmpty() { 
    	out.println("---------------------");
	    out.flush();
		out.println("Vui lòng thêm phòng.");
	    out.flush();
		out.println("---------------------");
	    out.flush();
    }
	
	
}
