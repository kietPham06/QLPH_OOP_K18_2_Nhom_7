package com.qlph.database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.qlph.entity.PhongHoc;

public class FilePHDeleteDAO implements PHDeleteDAO {

	@Override
	public boolean delete(int index) {
		FileOutputStream fOS;
		ObjectOutputStream oOS;
		ArrayList<PhongHoc> dsPH;
				
		dsPH = new ArrayList<PhongHoc>();
		try {
			// Đọc danh sách phòng học đã có trong file
			dsPH = readPHFromFile();
			
			if (index < 0 || index >= dsPH.size()) {
                return false;
            }
	        dsPH.remove(index);
			// 1. Kết nối đến file phonghoc.db
			fOS = new FileOutputStream("phonghoc.db");
			// 2. Lưu đối tượng ph vào file phonghoc.db
			oOS = new ObjectOutputStream(fOS);
			oOS.writeObject(dsPH);
			fOS.close();
			oOS.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	private ArrayList<PhongHoc> readPHFromFile() {
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
