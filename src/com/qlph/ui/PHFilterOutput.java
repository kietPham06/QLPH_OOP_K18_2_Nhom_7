package com.qlph.ui;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
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
    public void printFilter(ArrayList<PhongHoc> dsPKDC) {
        if (dsPKDC != null && !dsPKDC.isEmpty()) {
        	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        	out.println("------------------------------------");
        	out.flush();
            out.println("Danh sách các phòng không đạt chuẩn:");
		    out.println("==================================================================================================");
		    out.flush();
		    out.printf("%-15s %-12s %-15s %-15s %-18s %-15s%n", 
		        "Mã Phòng", "Dãy Nhà", "Diện Tích", "Số Bóng Đèn", "Ngày Hoạt Động", "Loại Phòng");
		    out.flush();
		    out.println("==================================================================================================");
		    out.flush();
            for (PhongHoc ph : dsPKDC) {
            	String loaiPhong = ph.getLoaiPhong();
            	
		        // Chuyển đổi loại phòng từ mã viết tắt
		        if (loaiPhong.equals("LT")) {
		            loaiPhong = "Lý thuyết";
		        } else if (loaiPhong.equals("MT")) {
		            loaiPhong = "Máy tính";
		        } else if (loaiPhong.equals("TN")) {
		            loaiPhong = "Thí nghiệm";
		        }
		        
		        out.printf("%-15s %-12s %-15.2f %-15d %-18s %-15s%n", 
		            ph.getMaPhong(), ph.getDayNha(), ph.getDienTich(), ph.getSoBongDen(), 
		            formatter.format(ph.getNgayHoatDong()), loaiPhong);
            }
		    out.println("==================================================================================================");
		    out.flush();
        } else {
           	out.println("-------------------------------");
        	out.flush();
            out.println("Tất cả phòng học đều đạt chuẩn.");
           	out.println("-------------------------------");
        }
        out.flush();
    }

    
}
