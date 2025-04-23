package com.qlph.database;

import com.qlph.entity.PhongHoc;

public class MemoryPHFindDAO implements PHFindDAO {

	@Override
	public PhongHoc select(int index) {
		// TODO Auto-generated method stub
		return MemoryPHDB.getPH(index);
	}
	
	
}
