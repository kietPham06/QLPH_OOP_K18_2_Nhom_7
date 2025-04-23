package com.qlph.ui;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.qlph.entity.PhongHoc;

public class PHOutputFilter {
	
	private PrintWriter out;
	
	public PHOutputFilter() {
		// TODO Auto-generated constructor stub
	}

	public PHOutputFilter(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void output(ArrayList<PhongHoc> dsPH) {
		if (dsPH == null || dsPH.isEmpty()) {
           	out.println("-------------------------------");
        	out.flush();
            out.println("Tất cả phòng học đều đạt chuẩn.");
        	out.flush();
           	out.println("-------------------------------");
        	out.flush();
		} else {
			out.println("==================================================================================================");
		    out.flush();
		    out.printf("%-15s %-12s %-15s %-15s %-18s %-15s%n", 
		        "Mã Phòng", "Dãy Nhà", "Diện Tích", "Số Bóng Đèn", "Ngày Hoạt Động", "Loại Phòng");
		    out.flush();
		    out.println("==================================================================================================");
		    out.flush();
		    for (PhongHoc ph : dsPH) {
		        
		        out.printf("%-15s %-12s %-15.2f %-15d %-18s %-15s%n", 
		            ph.getMaPhong(), ph.getDayNha(), ph.getDienTich(), ph.getSoBongDen(), 
		            convertDatetoString(ph.getNgayHoatDong()), expand(ph.getLoaiPhong()));
		    }
		    out.println("==================================================================================================");
		    out.flush();
		}
	}
	
	private String convertDatetoString(Date date) {
		String ngayHoatDong = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		ngayHoatDong = dateFormat.format(date);
		return ngayHoatDong;
	}
	
	private String expand(String s) {
	    if ("LT".equalsIgnoreCase(s)) {
	    	s = "Lý thuyết";
	    } else if ("MT".equalsIgnoreCase(s)) {
	    	s = "Máy tính";
	    } else if ("TN".equalsIgnoreCase(s)) {
	    	s = "Thí nghiệm";
	    }
	    return s;
	}
	
	
}
