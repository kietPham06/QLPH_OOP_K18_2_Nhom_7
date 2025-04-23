package com.qlph.ui;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlph.control.PHControlAdd;
import com.qlph.control.PHControlDelete;
import com.qlph.control.PHControlFilter;
import com.qlph.control.PHControlFind;
import com.qlph.control.PHControlPrint;
import com.qlph.control.PHControlTotal;
import com.qlph.control.PHControlUpdate;
import com.qlph.control.PHLTControlAVG;

public class PHMenu {
	
	private Scanner keyboard;
	private PrintWriter out;
	private String prompt;
	
	private PHControlAdd phControlAdd;
	private PHControlPrint phControlPrint;
	private PHLTControlAVG phltControlAVG;
	private PHControlTotal phControlTotal;
	private PHControlFilter phControlFilter;
	private PHControlFind phControlFind;
	private PHControlDelete phControlDelete;
	private PHControlUpdate phControlUpdate;

	public PHMenu() {
		// TODO Auto-generated constructor stub
	}

	public PHMenu(Scanner keyboard, PrintWriter out, String prompt) {
		super();
		this.keyboard = keyboard;
		this.out = out;
		this.prompt = prompt;
	}
	
	public void setPhControlAdd(PHControlAdd phControlAdd) {
		this.phControlAdd = phControlAdd;
	}

	public void setPhControlPrint(PHControlPrint phControlPrint) {
		this.phControlPrint = phControlPrint;
	}

	public void setPhltControlAVG(PHLTControlAVG phltControlAVG) {
		this.phltControlAVG = phltControlAVG;
	}

	public void setPhControlTotal(PHControlTotal phControlTotal) {
		this.phControlTotal = phControlTotal;
	}

	public void setPhControlFilter(PHControlFilter phControlFilter) {
		this.phControlFilter = phControlFilter;
	}
	
	public void setPhControlFind(PHControlFind phControlFind) {
		this.phControlFind = phControlFind;
	}
	
	public void setPhControlDelete(PHControlDelete phControlDelete) {
		this.phControlDelete = phControlDelete;
	}

	public void setPhControlUpdate(PHControlUpdate phControlUpdate) {
		this.phControlUpdate = phControlUpdate;
	}

	public void controlLoop() {
		out.println("Gõ lệnh \"help\" để được hỗ trợ!");
		out.flush();
		
		while(true) {
			String command = " ";
			out.print(prompt);
			out.flush();
			command = keyboard.nextLine();// <== HELP , ABOUT, ADD, EDIT, DELETE,...
			command = command.trim();// Cắt khoảng trắng 2 đầu
			
			if("help".equalsIgnoreCase(command)) {
				 help();
				continue;
			}
			
			if("about".equalsIgnoreCase(command)) {
				about();
				continue;
			}
			
			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
			
			if("update".equalsIgnoreCase(command)) {
				update();
				continue;
			}
			
			if("delete".equalsIgnoreCase(command)) {
				delete();
				continue;
			}
			
			if("find".equalsIgnoreCase(command)) {
				find();
				continue;
			}
			
			if("print".equalsIgnoreCase(command)) {
				print();
				continue;
			}
			
			if("total".equalsIgnoreCase(command)) {
				total();
				continue;
			}
			
			if("filter".equalsIgnoreCase(command)) {
				filter();
				continue;
			}
			
			if("average".equalsIgnoreCase(command)) {
				average();
				continue;
			}
			
			if("exit".equalsIgnoreCase(command)) {
				break;
			}
		}
	}
	
	private void help() {
		out.println("===============================================");
		out.flush();
		out.println("|               USER HELP MENU                |");
		out.flush();
		out.println("===============================================");
		out.flush();
		out.println("| [HELP]    | Hướng dẫn sử dụng                |");
		out.flush();
		out.println("| [ABOUT]   | Thông tin về phần mềm            |");
		out.flush();
		out.println("| [ADD]     | Thêm sinh viên                   |");
		out.flush();
		out.println("| [UPDATE]  | Cập nhật thông tin phòng học     |");
		out.flush();
		out.println("| [DELETE]  | Xóa phòng học                    |");
		out.flush();
		out.println("| [FIND]  | Tìm kiếm phòng học               |");
		out.flush();
		out.println("| [PRINT]   | In ra danh sách tất cả phòng     |");
		out.flush();
		out.println("| [TOTAL]   | Tổng số lượng phòng học từng loại|");
		out.flush();
		out.println("| [FILTER]  | Lọc ra các phòng không đạt chuẩn|");
		out.flush();
		out.println("| [AVERAGE] | Diện tích trung bình phòng lý thuyết |");
		out.flush();
		out.println("| [EXIT]    | Thoát chương trình               |");
		out.flush();
		out.println("===============================================");
		out.flush();
	}
	
	private void about() {
		// TODO Auto-generated method stub
		out.println("===============================================");
		out.flush();
		out.println("|          ABOUT THIS SOFTWARE                |");
		out.flush();
		out.println("===============================================");
		out.flush();
		out.println("| Tên phần mềm | Quản lý phòng học            |");
		out.flush();
		out.println("| Phiên bản    | 1.0                          |");
		out.flush();
		out.println("| Tác giả      | Nhóm 7 - Khóa 18 - Lớp 2     |");
		out.flush();
		out.println("| Mô tả        |                              |");
		out.flush();
		out.println("|    - Phần mềm quản lý phòng                 |");
		out.flush();
		out.println("|    - Hỗ trợ thêm, sửa, xóa, tìm            |");
		out.flush();
		out.println("|    - Xuất danh sách phòng lỗi              |");
		out.flush();
		out.println("|    - Thống kê số lượng, diện tích          |");
		out.flush();
		out.println("===============================================");
		out.flush();
	}

	private void add() {
		// TODO Auto-generated method stub
		phControlAdd.add();
	}

	private void update() {
		// TODO Auto-generated method stub
		phControlUpdate.update();
	}

	private void delete() {
		// TODO Auto-generated method stub
		phControlDelete.delete();
	}

	private void find() {
		// TODO Auto-generated method stub
		phControlFind.find();
	}

	private void print() {
		// TODO Auto-generated method stub
		phControlPrint.print();
	}

	private void total() {
		// TODO Auto-generated method stub
		phControlTotal.total();
	}

	private void filter() {
		// TODO Auto-generated method stub
		phControlFilter.filter();
	}

	private void average() {
		// TODO Auto-generated method stub
		phltControlAVG.average();
	}
	

}
