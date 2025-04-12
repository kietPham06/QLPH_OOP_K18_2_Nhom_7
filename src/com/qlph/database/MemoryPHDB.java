package com.qlph.database;

import java.util.ArrayList;
import java.util.Date;

import com.qlph.model.PHLyThuyet;
import com.qlph.model.PHMayTinh;
import com.qlph.model.PHThiNghiem;
import com.qlph.model.PhongHoc;

// Đây là lớp giả lập cơ sở dữ liệu
public class MemoryPHDB {

	// Ô 2 - Fields
	private static ArrayList<PhongHoc> phDB;
	
	// Static block code
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
	
	// Ô 3 - Methods
	public static void insert(PhongHoc ph) {
		// Thao tác thêm phòng vào danh sách (thêm một phần tử vào Mảng)
		phDB.add(ph);
	}
	
	public static ArrayList<PhongHoc> getDSPH() {
		// Trả về danh sách phòng (trả về mảng)
		return phDB;
	}
	
	public static boolean delete(String maPhong, String loaiPhong) {
		// Duyệt ngược, vì nếu duyệt từ trái sang phải khi xóa một phần tử nó sẽ dịch từ phải sang trái
		// lần duyệt tiếp theo có thể bỏ qua một phần tử
		// Nếu dùng duyệt ngược thì duyệt từ phải sang trái cùng chiều với phần tử dịch từ phải sang trái
	    for (int i = phDB.size() - 1; i >= 0; i--) {
	        PhongHoc ph = phDB.get(i);
	    	// Nếu duyệt đến phần tử null thì bỏ qua phần tử này và duyệt đến phần tử tiếp theo trong vòng lặp
	        if (ph == null) continue;
	        if (ph.getMaPhong().equalsIgnoreCase(maPhong) && ph.getLoaiPhong().equalsIgnoreCase(loaiPhong)) {
	            phDB.remove(i);
	            return true; // Xóa thành công
	        }
	    }
	    return false; // Không tìm thấy
	}
	
	public static PhongHoc search(String maPhong, String loaiPhong) {
        for (PhongHoc ph : phDB) {
	    	// Nếu duyệt đến phần tử null thì bỏ qua phần tử này và duyệt đến phần tử tiếp theo trong for-each
	        if (ph == null) continue;
            if (ph.getMaPhong().equalsIgnoreCase(maPhong) &&
                ph.getLoaiPhong().equalsIgnoreCase(loaiPhong)) {
                return ph; // Tìm thấy phòng
            }
        }
        return null; // Phòng không tồn tại
    }
	
	public static PhongHoc update(PhongHoc newPH) {
	    for (PhongHoc oldPH : phDB) {
	    	// Nếu duyệt đến phần tử null thì bỏ qua phần tử này và duyệt đến phần tử tiếp theo trong for-each
	        if (oldPH == null) continue;

	        // So sánh đúng phòng cần cập nhật
	        if (oldPH.getMaPhong().equalsIgnoreCase(newPH.getMaPhong()) &&
	            oldPH.getLoaiPhong().equalsIgnoreCase(newPH.getLoaiPhong())) {

	            // Cập nhật thuộc tính chung
	        	oldPH.setMaPhong(newPH.getMaPhong());
	            oldPH.setDayNha(newPH.getDayNha());
	            oldPH.setDienTich(newPH.getDienTich());
	            oldPH.setSoBongDen(newPH.getSoBongDen());
	            oldPH.setNgayHoatDong(newPH.getNgayHoatDong());

	            // Cập nhật thuộc tính riêng theo loại phòng
	            if (oldPH.getLoaiPhong().equalsIgnoreCase("LT")) {
	            	// Ép về kiểu con để gọi phương thức đặc thù
	                PHLyThuyet oldLT = (PHLyThuyet) oldPH;
	                PHLyThuyet newLT = (PHLyThuyet) newPH;
	                oldLT.setMayChieu(newLT.isMayChieu());

	            } else if (oldPH.getLoaiPhong().equalsIgnoreCase("MT")) {
	            	// Ép về kiểu con để gọi phương thức đặc thù
	                PHMayTinh oldMT = (PHMayTinh) oldPH;
	                PHMayTinh newMT = (PHMayTinh) newPH;
	                oldMT.setSoLuongMayTinh(newMT.getSoLuongMayTinh());

	            } else if (oldPH.getLoaiPhong().equalsIgnoreCase("TN")) {
	            	// Ép về kiểu con để gọi phương thức đặc thù
	                PHThiNghiem oldTN = (PHThiNghiem) oldPH;
	                PHThiNghiem newTN = (PHThiNghiem) newPH;
	                oldTN.setChuyenNganh(newTN.getChuyenNganh());
	                oldTN.setSucChua(newTN.getSucChua());
	                oldTN.setBonRua(newTN.isBonRua());
	            }

	            return newPH; // Trả về nếu cập nhật thành công
	        }
	    }

	    return null; // Không tìm thấy phòng cần cập nhật
	}

	
}
