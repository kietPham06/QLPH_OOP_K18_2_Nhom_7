package com.qlph.logic;

import java.util.ArrayList;
import com.qlph.model.PhongHoc;
import com.qlph.database.PHDeleteDAO;
import com.qlph.ui.PHDeleteInput;
import com.qlph.ui.PHDeleteOutput;

public class PHDeleteLogic {

    public void processDelete(PHDeleteDAO phDeleteDAO, PHDeleteInput phDeleteInput, PHDeleteOutput phDeleteOutput) {
        ArrayList<PhongHoc> kiemTraDSPH;
        PhongHoc kiemTraPH;
        String maPhong;
        String loaiPhong;
        boolean xoaThanhCong;

        // Lấy danh sách phòng học từ CSDL
        kiemTraDSPH = phDeleteDAO.getDSPH();

        // Kiểm tra danh sách phòng học
        if (kiemTraDSPH.isEmpty()) {
            // Hiển thị thông báo danh sách rỗng
            phDeleteOutput.DSPHIsEmpty();
        } else {
            // Người dùng nhập thông tin phòng cần xóa
            maPhong = phDeleteInput.inputMaPhong();
            loaiPhong = phDeleteInput.inputLoaiPhong();

            // Kiểm tra phòng học tồn tại
            kiemTraPH = phDeleteDAO.search(maPhong, loaiPhong);

            // Kiểm tra phòng học
            if (kiemTraPH == null) {
                // Hiển thị thông báo xóa thất bại
                phDeleteOutput.showMessage(false);
            } else {
                // Thực hiện thao tác xóa trong CSDL
                xoaThanhCong = phDeleteDAO.delete(maPhong, loaiPhong);

                // Hiển thị thông báo kết quả
                phDeleteOutput.showMessage(xoaThanhCong);
            }
        }
    }
}