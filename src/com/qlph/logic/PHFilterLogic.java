package com.qlph.logic;

import java.util.ArrayList;
import com.qlph.model.PhongHoc;
import com.qlph.database.PHFilterDAO;
import com.qlph.ui.PHFilterOutput;
import com.qlph.utils.PHFilter;

public class PHFilterLogic {

    public void processFilter(PHFilterDAO phFilterDAO, PHFilter phFilter, PHFilterOutput phFilterOutput) {
        ArrayList<PhongHoc> dSPH;
        ArrayList<PhongHoc> dSPKDC;

        // Lấy danh sách phòng học từ CSDL
        dSPH = phFilterDAO.getDSPH();

        // Kiểm tra danh sách phòng học
        if (dSPH.isEmpty()) {
            // Yêu cầu người dùng thêm phòng
            phFilterOutput.DSPHIsEmpty();
        } else {
            // Lọc danh sách phòng học không đạt chuẩn
            dSPKDC = phFilter.filterPH(dSPH);

            // In ra các phòng không đạt chuẩn
            phFilterOutput.printFilter(dSPKDC);
        }
    }
}