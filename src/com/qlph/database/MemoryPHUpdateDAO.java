package com.qlph.database;

import com.qlph.entity.PhongHoc;

public class MemoryPHUpdateDAO implements PHUpdateDAO {

	@Override
	public PhongHoc update(int index, PhongHoc ph) {
		// TODO Auto-generated method stub
		return MemoryPHDB.set(index, ph);
	}

	
}
