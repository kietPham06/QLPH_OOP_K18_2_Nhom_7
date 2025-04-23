package com.qlph.database;

public class MemoryPHDeleteDAO implements PHDeleteDAO {

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		return MemoryPHDB.remove(index);
	}
	
	
}
