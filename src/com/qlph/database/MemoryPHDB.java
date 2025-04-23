package com.qlph.database;

import java.util.ArrayList;
import java.util.Date;

import com.qlph.entity.PhongHoc;
import com.qlph.entity.PHLyThuyet;
import com.qlph.entity.PHMayTinh;
import com.qlph.entity.PHThiNghiem;

public class MemoryPHDB {
	
	private static ArrayList<PhongHoc> phDB;
	
	static {
		phDB = new ArrayList<PhongHoc>();
		
		// AI Generate
		// 1. Phòng lý thuyết - Đạt chuẩn
        phDB.add(new PHLyThuyet("LT001", "A1", 50.0, 6, new Date(), true)); 
        // dienTich/10 = 5 <= 6, có máy chiếu -> Đạt
        
        // 2. Phòng lý thuyết - Không đạt (thiếu máy chiếu)
        phDB.add(new PHLyThuyet("LT002", "A2", 40.0, 5, new Date(), false)); 
        // dienTich/10 = 4 <= 5, nhưng không có máy chiếu -> Không đạt
        
        // 3. Phòng máy tính - Đạt chuẩn
        phDB.add(new PHMayTinh("MT001", "B1", 60.0, 8, new Date(), 40)); 
        // dienTich/10 = 6 <= 8, dienTich/1.5 = 40 <= 40 -> Đạt
        
        // 4. Phòng máy tính - Không đạt (thiếu máy tính)
        phDB.add(new PHMayTinh("MT002", "B2", 60.0, 8, new Date(), 30)); 
        // dienTich/10 = 6 <= 8, nhưng dienTich/1.5 = 40 > 30 -> Không đạt
        
        // 5. Phòng thí nghiệm - Đạt chuẩn
        phDB.add(new PHThiNghiem("TN001", "C1", 70.0, 10, new Date(), "Hóa học", 30, true)); 
        // dienTich/10 = 7 <= 10, có bồn rửa -> Đạt
        
        // 6. Phòng thí nghiệm - Không đạt (thiếu bồn rửa)
        phDB.add(new PHThiNghiem("TN002", "C2", 50.0, 6, new Date(), "Vật lý", 20, false)); 
        // dienTich/10 = 5 <= 6, nhưng không có bồn rửa -> Không đạt
        
        // 7. Phòng lý thuyết - Không đạt (thiếu bóng đèn)
        phDB.add(new PHLyThuyet("LT003", "A3", 50.0, 4, new Date(), true)); 
        // dienTich/10 = 5 > 4, dù có máy chiếu -> Không đạt
        
        // 8. Phòng máy tính - Đạt chuẩn
        phDB.add(new PHMayTinh("MT003", "B3", 45.0, 5, new Date(), 30)); 
        // dienTich/10 = 4.5 <= 5, dienTich/1.5 = 30 <= 30 -> Đạt
        
        // 9. Phòng thí nghiệm - Đạt chuẩn
        phDB.add(new PHThiNghiem("TN003", "C3", 80.0, 10, new Date(), "Sinh học", 40, true)); 
        // dienTich/10 = 8 <= 10, có bồn rửa -> Đạt
        
        // 10. Phòng lý thuyết - Không đạt (thiếu cả bóng đèn và máy chiếu)
        phDB.add(new PHLyThuyet("LT004", "A4", 60.0, 5, new Date(), false)); 
        // dienTich/10 = 6 > 5, không có máy chiếu -> Không đạt
        
     // Ghi chú: Danh sách mã phòng đạt chuẩn và không đạt chuẩn
        // Đạt chuẩn:
        // - LT001 (Phòng lý thuyết)
        // - MT001 (Phòng máy tính)
        // - MT003 (Phòng máy tính)
        // - TN001 (Phòng thí nghiệm)
        // - TN003 (Phòng thí nghiệm)
        // Không đạt chuẩn:
        // - LT002 (Phòng lý thuyết - thiếu máy chiếu)
        // - LT003 (Phòng lý thuyết - thiếu bóng đèn)
        // - LT004 (Phòng lý thuyết - thiếu bóng đèn và máy chiếu)
        // - MT002 (Phòng máy tính - thiếu máy tính)
        // - TN002 (Phòng thí nghiệm - thiếu bồn rửa)
        
     // Kết quả thống kê:
     // Số lượng phòng lý thuyết: 4
     // Số lượng phòng máy tính: 3
     // Số lượng phòng thí nghiệm: 3
     // Diện tích trung bình phòng lý thuyết: 50.0
	}
	
	public static void add(PhongHoc ph) {
		phDB.add(ph);
	}
	
	public static ArrayList<PhongHoc> getDSPH() {
		return phDB;
	}
	
	public static PhongHoc getPH(int index) {
        if (index < 0 || index >= phDB.size()) {
        	return null;
        }
		return phDB.get(index);
	}
	
	public static boolean remove(int index) {
		if (index < 0 || index >= phDB.size()) {
			return false;
		}
		phDB.remove(index);
		return true;
	}
	
	public static PhongHoc set(int index, PhongHoc ph) {
		if (index < 0 || index >= phDB.size()) {
			return null;
		}
		phDB.set(index, ph);
		return ph;
	}
	
	
}
