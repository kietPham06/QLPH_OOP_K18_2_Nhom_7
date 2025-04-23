package com.qlph.database;

import java.util.ArrayList;

import com.qlph.entity.PhongHoc;

public class MemoryPHFilterDAO implements PHFilterDAO {

	@Override
	public ArrayList<PhongHoc> getDSPH() {
		// TODO Auto-generated method stub
		return MemoryPHDB.getDSPH();
	}
	
	
}
