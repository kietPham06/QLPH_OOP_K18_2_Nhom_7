package com.qlph.ui;

import java.io.PrintWriter;
import java.util.ArrayList;

import com.qlph.model.PhongHoc;

public class PHFilterOutput {
	
	// Ô 2 - Fields
	PrintWriter out;
	
	// Ô 3 - Methods
	// Default Constructor
    public PHFilterOutput(PrintWriter out) {
        super();
        this.out = out;
    }
    
	// Parameterized Constructor
    public void filterPrint(ArrayList<PhongHoc> dsPKDC) {
        if (dsPKDC != null && !dsPKDC.isEmpty()) {
        	out.println("------------------------------------");
        	out.flush();
            out.println("Danh sách các phòng không đạt chuẩn:");
            for (PhongHoc ph : dsPKDC) {
            	out.println("-------------------------------");
            	out.flush();
                out.println(ph);
            }
           	out.println("-------------------------------");
        	out.flush();
        } else {
           	out.println("-------------------------------");
        	out.flush();
            out.println("Tất cả phòng học đều đạt chuẩn.");
           	out.println("-------------------------------");
        }
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
