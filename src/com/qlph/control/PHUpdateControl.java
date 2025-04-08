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
        
        // Phối hợp với các đối tượng
        // 1. Gửi thông điệp đến object PHUpdateInput
		// Người dùng nhập thông tin phòng cần xóa
        maPhong = phUpdateInput.inputMaPhong();
        loaiPhong = phUpdateInput.inputLoaiPhong();
        
        // 2. Gửi thông điệp đến object PHUpdateDAO
        // Kiểm tra thông tin phòng học và cập nhật phòng
        
        // 3. Gửi thông điệp đến object PHUpdateOutput
        // Hiển thị thông báo cho người dùng
        if (phUpdateDAO.search(maPhong, loaiPhong) == null) {
            phUpdateOutput.showMessage(null);
        } else {
        	ph = phUpdateInput.inputPH(maPhong, loaiPhong);
            // Gọi phương thức update để cập nhật dữ liệu trong MemoryPHDB
            updatedPH = phUpdateDAO.update(ph);
            if (updatedPH != null) {
                phUpdateOutput.showMessage(updatedPH);
            } else {
                phUpdateOutput.showMessage(null); // Hiển thị lỗi nếu cập nhật thất bại
            }
        }
    }
}