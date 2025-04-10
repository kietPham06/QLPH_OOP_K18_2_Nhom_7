package com.qlph.control;

import com.qlph.database.PHUpdateDAO;
import com.qlph.model.PhongHoc;
import com.qlph.ui.PHUpdateInput;
import com.qlph.ui.PHUpdateOutput;

public class PHUpdateControl {

    // Ô 2 - Fields
    private PHUpdateDAO phUpdateDAO;
    private PHUpdateInput phUpdateInput;
    private PHUpdateOutput phUpdateOutput;
    
    // Ô 3 - Methods
    // Default Constructor
    public PHUpdateControl() {
        // TODO Auto-generated constructor stub
    }

    // Parameter Constructor
    public PHUpdateControl(PHUpdateDAO phUpdateDAO, PHUpdateInput phUpdateInput, PHUpdateOutput phUpdateOutput) {
        super();
        this.phUpdateDAO = phUpdateDAO;
        this.phUpdateInput = phUpdateInput;
        this.phUpdateOutput = phUpdateOutput;
    }
    
    public void update() {
        String maPhong;
        String loaiPhong;
        PhongHoc ph;
        PhongHoc updatedPH;
        
        // 1. Gửi thông điệp đến object PHUpdateInput
        // Người dùng nhập thông tin phòng cần cập nhật
        maPhong = phUpdateInput.inputMaPhong();
        loaiPhong = phUpdateInput.inputLoaiPhong();
        
        // 2. Gửi thông điệp đến object PHUpdateDAO
        // Kiểm tra thông tin phòng học và cập nhật phòng
        if (phUpdateDAO.search(maPhong, loaiPhong) == null) {
            phUpdateOutput.showMessage(null); // Phòng không tồn tại
        } else {
            ph = phUpdateInput.inputPH(maPhong, loaiPhong); // Người dùng nhập dữ liệu phòng cần cập nhật
            updatedPH = phUpdateDAO.update(ph); // Cập nhật phòng học trong CSDL
            phUpdateOutput.showMessage(updatedPH); // Hiển thị kết quả, dù thành công hay thất bại
        }
    }
}