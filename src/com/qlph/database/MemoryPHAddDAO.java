package com.qlph.database;

import com.qlph.entity.PhongHoc;

public class MemoryPHAddDAO implements PHAddDAO {

	@Override
	public void insert(PhongHoc ph) {
		// TODO Auto-generated method stub
		MemoryPHDB.add(ph);
	}

	
}
