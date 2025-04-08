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
	// Tạo object để test
		
		// 1. PHMayTinh - Đạt chuẩn
		phDB.add(new PHMayTinh("MT01", "A1", 60.0, 6, new Date(), 40));
		// Diện tích 60m2, 6 bóng đèn (>= 60/10), 40 máy tính (>= 60/1.5 = 40) -> Đạt chuẩn

		// 2. PHMayTinh - Không đạt chuẩn (thiếu máy tính)
		phDB.add(new PHMayTinh("MT02", "A2", 60.0, 6, new Date(), 30));
		// Diện tích 60m2, 6 bóng đèn (>= 60/10), 30 máy tính (< 60/1.5 = 40) -> Không đạt chuẩn

		// 3. PHLyThuyet - Đạt chuẩn
		phDB.add(new PHLyThuyet("LT01", "B1", 50.0, 5, new Date(), true));
		// Diện tích 50m2, 5 bóng đèn (>= 50/10), có máy chiếu -> Đạt chuẩn

		// 4. PHLyThuyet - Không đạt chuẩn (không có máy chiếu)
		phDB.add(new PHLyThuyet("LT02", "B2", 50.0, 5, new Date(), false));
		// Diện tích 50m2, 5 bóng đèn (>= 50/10), không máy chiếu -> Không đạt chuẩn

		// 5. PHThiNghiem - Đạt chuẩn
		phDB.add(new PHThiNghiem("TN01", "C1", 80.0, 8, new Date(), "Hóa học", 30, true));
		// Diện tích 80m2, 8 bóng đèn (>= 80/10), có bồn rửa -> Đạt chuẩn

		// 6. PHThiNghiem - Không đạt chuẩn (thiếu bóng đèn)
		phDB.add(new PHThiNghiem("TN02", "C2", 80.0, 7, new Date(), "Sinh học", 25, true));
		// Diện tích 80m2, 7 bóng đèn (< 80/10), có bồn rửa -> Không đạt chuẩn
		
	}
	
	// Ô 3 - Methods
	public static void insert(PhongHoc ph) {
		phDB.add(ph);
	}
	
	public static ArrayList<PhongHoc> getDSPH() {
		return phDB;
	}
	
	public static void remove(PhongHoc ph) {
		phDB.remove(ph);
	}
	
	public static PhongHoc search(String maPhong, String loaiPhong) {
        for (PhongHoc phong : phDB) {
            if (phong.getMaPhong().equalsIgnoreCase(maPhong) &&
                phong.getLoaiPhong().equalsIgnoreCase(loaiPhong)) {
                return phong;
            }
        }
        return null;
    }
	
	public static PhongHoc update(PhongHoc newPH) {
	    for (PhongHoc oldPH : phDB) {
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
	                PHLyThuyet oldLT = (PHLyThuyet) oldPH;
	                PHLyThuyet newLT = (PHLyThuyet) newPH;
	                oldLT.setMayChieu(newLT.isMayChieu());

	            } else if (oldPH.getLoaiPhong().equalsIgnoreCase("MT")) {
	                PHMayTinh oldMT = (PHMayTinh) oldPH;
	                PHMayTinh newMT = (PHMayTinh) newPH;
	                oldMT.setSoLuongMayTinh(newMT.getSoLuongMayTinh());

	            } else if (oldPH.getLoaiPhong().equalsIgnoreCase("TN")) {
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
