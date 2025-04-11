package com.qlph.ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class PHDeleteInput {
	
	// Ô 2 - Fields
	Scanner keyboard;
	PrintWriter out;
	
	// Ô 3 - Methods
	public PHDeleteInput() {
		// TODO Auto-generated constructor stub
	}

	public PHDeleteInput(Scanner keyboard, PrintWriter out) {
		super();
		this.keyboard = keyboard;
		this.out = out;
	}
	
	public String inputMaPhong() {
		String maPhong;
		
		out.print("Mã phòng: ");
		out.flush();
		maPhong = keyboard.nextLine();
		
		return maPhong;
	}

	public String inputLoaiPhong() {
    	String loaiPhong;
        out.print("Loại phòng (LT - MT - TN): ");
		out.flush();
		loaiPhong = keyboard.nextLine();
		if ("LT".equalsIgnoreCase(loaiPhong)) {
			loaiPhong = "LT";
		}
		if ("MT".equalsIgnoreCase(loaiPhong)) {
			loaiPhong = "MT";
		}
		if ("TN".equalsIgnoreCase(loaiPhong)) {
			loaiPhong = "TN";
		}
        return loaiPhong;
    }
	
	
}
