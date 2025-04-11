package com.qlph.ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class PHSearchInput {
	
	// Ô 2 - Fields
	private Scanner keyboard;
	private PrintWriter out;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHSearchInput() {
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor
    public PHSearchInput(Scanner keyboard, PrintWriter out) {
		super();
		this.keyboard = keyboard;
		this.out = out;
	}


	public String inputMaPhong() {
		String maPhong;
        System.out.print("Nhập mã phòng: ");
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
