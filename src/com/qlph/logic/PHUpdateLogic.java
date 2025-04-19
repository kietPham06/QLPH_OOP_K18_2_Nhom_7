package com.qlph.logic;

import java.util.ArrayList;
import com.qlph.model.PhongHoc;
import com.qlph.database.PHUpdateDAO;
import com.qlph.ui.PHUpdateInput;
import com.qlph.ui.PHUpdateOutput;

public class PHUpdateLogic {

    public void processUpdate(PHUpdateDAO phUpdateDAO, PHUpdateInput phUpdateInput, PHUpdateOutput phUpdateOutput) {
        ArrayList<PhongHoc> kiemTraDSPH;
        PhongHoc kiemTraPH;
        String maPhong;
        String loaiPhong;
        PhongHoc newPH;
        PhongHoc updatedPH;

        // Lấy danh sách phòng học từ CSDL
        kiemTraDSPH = phUpdateDAO.getDSPH();

        // Kiểm tra danh sách phòng học
        if (kiemTraDSPH.isEmpty()) {
            // Hiển thị thông báo danh sách rỗng
            phUpdateOutput.DSPHIsEmpty();
        } else {
            // Người dùng nhập thông tin phòng cần cập nhật
            maPhong = phUpdateInput.inputMaPhong();
            loaiPhong = phUpdateInput.inputLoaiPhong();

            // Kiểm tra phòng học tồn tại
            kiemTraPH = phUpdateDAO.search(maPhong, loaiPhong);

            // Kiểm tra phòng học
            if (kiemTraPH == null) {
                // Phòng không tồn tại
                phUpdateOutput.showMessage(null);
            } else {
                // Người dùng nhập dữ liệu phòng cần cập nhật
                newPH = phUpdateInput.inputPH(maPhong, loaiPhong);

                // Cập nhật phòng học trong CSDL
                updatedPH = phUpdateDAO.update(newPH);

                // Hiển thị thông báo cho người dùng
                phUpdateOutput.showMessage(updatedPH);
            }
        }
    }
}