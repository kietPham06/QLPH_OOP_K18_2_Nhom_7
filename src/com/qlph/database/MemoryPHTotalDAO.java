package com.qlph.database;

import java.util.ArrayList;

import com.qlph.entity.PhongHoc;

public class MemoryPHTotalDAO implements PHTotalDAO {

	@Override
	public ArrayList<PhongHoc> getDSPH() {
		// TODO Auto-generated method stub
		return MemoryPHDB.getDSPH();
	}

	
}
