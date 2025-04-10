package com.qlph.database;

import java.util.ArrayList;

import com.qlph.model.PhongHoc;

public class PHFilterDAO {
	
	// Ô 2 - Fields
	
	
	// Ô 3 - Methods
	// Default Constructor
	/*Không cần tạo vì java tự động tạo*/
	
	public ArrayList<PhongHoc> getDSPH() {
		return MemoryPHDB.getDSPH();
	}
	
	
}
