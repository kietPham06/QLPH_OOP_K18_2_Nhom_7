package com.qlph.database;

import com.qlph.model.PhongHoc;

public class PHUpdateDAO {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public PhongHoc search(String maPhong, String loaiPhong) {
        return MemoryPHDB.search(maPhong, loaiPhong);
    }
	
	public PhongHoc update(PhongHoc newPH) {
	    return MemoryPHDB.update(newPH);
	}
	
}
