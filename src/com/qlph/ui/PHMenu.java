package com.qlph.ui;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlph.control.PHLTAVGControl;
import com.qlph.control.PHAddControl;
import com.qlph.control.PHCountControl;
import com.qlph.control.PHPrintControl;
import com.qlph.control.PHSearchControl;
import com.qlph.control.PHUpdateControl;
import com.qlph.control.PHDeleteControl;
import com.qlph.control.PHFilterControl;

public class PHMenu {
	
	// Ô 2 - Fields
	private Scanner keyboard;
	private PrintWriter out;
	private String prompt;
	private PHAddControl phAddControl;
	private PHPrintControl phPrintControl;
	private PHLTAVGControl phltavgControl;
	private PHDeleteControl phDeleteControl;
	private PHUpdateControl phUpdateControl;
	private PHSearchControl phSearchControl;
	private PHCountControl phCountControl;
	private PHFilterControl phFilterControl;
	// Ô 3 - Methods
	// Default Constructor
	public PHMenu() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHMenu(Scanner keyboard, PrintWriter out, String prompt) {
		super();
		this.keyboard = keyboard;
		this.out = out;
		this.prompt = prompt;
	}
	
	public void setPHAddControl(PHAddControl phAddControl) {
		this.phAddControl = phAddControl;
	}
	
	public void setPHPrintcontrol(PHPrintControl phPrintControl) {
		this.phPrintControl = phPrintControl;
	}
	
	public void setPHLTAVGControl( PHLTAVGControl phltavgControl) {
		this.phltavgControl = phltavgControl;
	}
	
	public void setPHDeleteControl(PHDeleteControl phDeleteControl) {
		this.phDeleteControl = phDeleteControl;
	}
	
	public void setPHUpdateControl(PHUpdateControl phUpdateControl) {
		this.phUpdateControl = phUpdateControl;
	}
	
	public void setPHSearchControl(PHSearchControl phSearchControl) {
		this.phSearchControl = phSearchControl;
	}
	
	public void setPHCountControl(PHCountControl phCountControl) {
		this.phCountControl = phCountControl;
	}
	
	public void setPHFilterControl(PHFilterControl phFilterControl) {
		this.phFilterControl = phFilterControl;
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
			
			if("search".equalsIgnoreCase(command)) {
				search();
				continue;
			}
			
			if("print".equalsIgnoreCase(command)) {
				print();
				continue;
			}
			
			if("count".equalsIgnoreCase(command)) {
				count();
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
		out.println("| [SEARCH]  | Tìm kiếm phòng học               |");
		out.flush();
		out.println("| [PRINT]   | In ra danh sách tất cả phòng     |");
		out.flush();
		out.println("| [COUNT]   | Tổng số lượng phòng học từng loại|");
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
		phAddControl.add();
	}

	private void update() {
		// TODO Auto-generated method stub
		phUpdateControl.update();
	}

	private void delete() {
		// TODO Auto-generated method stub
		phDeleteControl.delete();
	}

	private void search() {
		// TODO Auto-generated method stub
		phSearchControl.search();
	}

	private void print() {
		// TODO Auto-generated method stub
		phPrintControl.print();		
	}

	private void count() {
		// TODO Auto-generated method stub
		phCountControl.count();
	}

	private void filter() {
		// TODO Auto-generated method stub
		phFilterControl.filter();
	}

	private void average() {
		// TODO Auto-generated method stub
		phltavgControl.average();
	}
	

}
