package com.qlph.database;

import com.qlph.model.PhongHoc;

public class PHDeleteDAO {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public void delete(PhongHoc ph) {
		MemoryPHDB.remove(ph);
	}
	
	public PhongHoc search(String maPhong, String loaiPhong) {
        return MemoryPHDB.search(maPhong, loaiPhong);
    }
	
	
	
}
