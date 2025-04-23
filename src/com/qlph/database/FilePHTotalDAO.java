package com.qlph.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.qlph.entity.PhongHoc;

public class FilePHTotalDAO implements PHTotalDAO {

	@Override
	public ArrayList<PhongHoc> getDSPH() {
		// TODO Auto-generated method stub
		ArrayList<PhongHoc> dsPH;
		FileInputStream fIS;
		ObjectInputStream oIS;
		
		dsPH = new ArrayList<PhongHoc>();
		try {
			// 1. Kết nối đến file phonghoc.db
			fIS = new FileInputStream("phonghoc.db");
			// 2. Lấy dữ liệu phòng học lên
			oIS = new ObjectInputStream(fIS);
			dsPH= (ArrayList<PhongHoc>)oIS.readObject();
			
			// Đóng
			fIS.close();
			oIS.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dsPH;
	}

	
}
