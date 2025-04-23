package com.qlph.ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class PHInputDeleteLocator {
	
	private Scanner keyboard;
	private PrintWriter out;
	
	public PHInputDeleteLocator() {
		// TODO Auto-generated constructor stub
	}

	public PHInputDeleteLocator(Scanner keyboard, PrintWriter out) {
		super();
		this.keyboard = keyboard;
		this.out = out;
	}
	
	public String inputMaPhong() {
		String maPhong;
        System.out.print("Mã phòng: ");
        maPhong = keyboard.nextLine();
        return maPhong;
    }

    public String inputLoaiPhong() {
    	String loaiPhong;
        out.print("Loại phòng (LT - MT - TN): ");
		out.flush();
		loaiPhong = keyboard.nextLine();
		
        return loaiPhong;
    }
    
    
}
