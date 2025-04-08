package com.qlph.database;

import java.util.ArrayList;

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
		
	}
	
	// Ô 3 - Methods
	public static void insert(PhongHoc ph) {
		phDB.add(ph);
	}
	
	public static ArrayList<PhongHoc> getDSPH() {
		return phDB;
	}
	
	public static boolean remove(String maPhong, String loaiPhong) {
	    for (int i = phDB.size() - 1; i >= 0; i--) {
	        PhongHoc ph = phDB.get(i);
	        if (ph.getMaPhong().equals(maPhong) && ph.getLoaiPhong().equals(loaiPhong)) {
	            phDB.remove(i);
	            return true; // Xóa thành công
	        }
	    }
	    return false; // Không tìm thấy
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
