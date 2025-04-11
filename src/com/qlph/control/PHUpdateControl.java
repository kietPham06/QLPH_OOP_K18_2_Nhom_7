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
        PhongHoc newPH;
        PhongHoc updatedPH;
        
        // 1. Gửi thông điệp đến object PHUpdateInput
        // Người dùng nhập thông tin phòng cần cập nhật
        maPhong = phUpdateInput.inputMaPhong();
        loaiPhong = phUpdateInput.inputLoaiPhong();
        
        // 2. Gửi thông điệp đến object PHUpdateDAO
        // Kiểm tra thông tin phòng học và cập nhật phòng
        // 3. Gửi thông điệp đến object PHUpdateOutput
        // Hiển thị thông báo cho người dùng
        
        ph = phUpdateDAO.search(maPhong, loaiPhong);
        // Kiểm tra phòng học trong CSDL
        if (ph == null) {
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