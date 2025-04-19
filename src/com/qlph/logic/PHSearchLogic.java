package com.qlph.logic;

import java.util.ArrayList;
import com.qlph.model.PhongHoc;
import com.qlph.database.PHSearchDAO;
import com.qlph.ui.PHSearchInput;
import com.qlph.ui.PHSearchOutput;

public class PHSearchLogic {

    public void processSearch(PHSearchDAO phSearchDAO, PHSearchInput phSearchInput, PHSearchOutput phSearchOutput) {
        ArrayList<PhongHoc> kiemTraDSPH;
        String maPhong;
        String loaiPhong;
        PhongHoc kiemTraPH;

        // Lấy danh sách phòng học từ CSDL
        kiemTraDSPH = phSearchDAO.getDSPH();

        // Kiểm tra danh sách phòng học
        if (kiemTraDSPH.isEmpty()) {
            // Hiển thị thông báo danh sách rỗng
            phSearchOutput.DSPHIsEmpty();
        } else {
            // Người dùng nhập thông tin phòng cần tìm
            maPhong = phSearchInput.inputMaPhong();
            loaiPhong = phSearchInput.inputLoaiPhong();

            // Tìm kiếm phòng học trong CSDL
            kiemTraPH = phSearchDAO.search(maPhong, loaiPhong);

            // Hiển thị thông tin phòng
            phSearchOutput.printSearch(kiemTraPH);
        }
    }
}