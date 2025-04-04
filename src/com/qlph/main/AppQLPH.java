package com.qlph.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlph.control.PHLTAVGControl;
import com.qlph.control.PHAddControl;
import com.qlph.control.PHPrintControl;
import com.qlph.database.PHLTAVGDAO;
import com.qlph.database.PHAddDAO;
import com.qlph.database.PHPrintDAO;
import com.qlph.ui.PHLTAVGOutput;
import com.qlph.ui.PHAddInput;
import com.qlph.ui.PHAddOutput;
import com.qlph.ui.PHMenu;
import com.qlph.ui.PHPrintOutput;
import com.qlph.utils.PHLTAVGCalculator;

public class AppQLPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bước 1: Khai báo biến tham chiếu đối tượng
		Scanner keyboard;
		PrintWriter out;
		String prompt = ">";
		
		// Chức năng thêm
		PHAddDAO phAddDAO;
		PHAddInput phAddInput;
		PHAddOutput phAddOutput;
		PHAddControl phAddControl;
		
		// Chức năng in
		PHPrintControl phPrintControl;
		PHPrintOutput phPrintOutput;
		PHPrintDAO phPrintDAO;
		
		// Chức năng tính trung bình diện tích phòng học lý thuyết
		PHLTAVGControl phltavgControl;
		PHLTAVGDAO phltavgdao;
		PHLTAVGOutput phltavgOutput;
		PHLTAVGCalculator phltavgCalculator;
		
		// Hiển thị menu
		PHMenu menu;
		
		// Bước 2: Khởi tạo đối tượng trong vùng nhớ Heap
		// Bước 3: Trỏ biến tham chiếu đến với đối tượng nằm trong vùng nhớ Heap
		keyboard /* Bước 3 */ = /* Bước 2 */ new Scanner(System.in);
		out = new PrintWriter(System.out);
		
		// Chức năng thêm
		phAddDAO = new PHAddDAO();
		phAddInput = new PHAddInput(keyboard, out);
		phAddOutput = new PHAddOutput(out);
		phAddControl = new PHAddControl(phAddDAO, phAddInput, phAddOutput);
		
		// Chức năng in
		phPrintDAO = new PHPrintDAO();
		phPrintOutput = new PHPrintOutput(out);
		phPrintControl = new PHPrintControl(phPrintDAO, phPrintOutput);
	
		// Chức năng tính trung bình diện tích phòng học lý thuyết
		phltavgdao = new PHLTAVGDAO();
		phltavgCalculator = new PHLTAVGCalculator();
		phltavgOutput = new PHLTAVGOutput(out);
		phltavgControl = new PHLTAVGControl(phltavgdao, phltavgCalculator, phltavgOutput);
		
		// Hiển thị menu
		menu = new PHMenu(keyboard, out, prompt);
		
		// Gửi thông điệp đến object PHAddControl
		menu.setPHAddControl(phAddControl);
		
		// Gửi thông điệp đến object PHPrintControl
		menu.setPHPrintcontrol(phPrintControl);
		
		//  Gửi thông điệp đến object PHLTAVGControl
		menu.setPHLTAVGControl(phltavgControl);
		
		// Hiển thị tiêu đề
		out.println("===============================================");
		out.flush();
		out.println("|        CHƯƠNG TRÌNH QUẢN LÍ PHÒNG HỌC       |");
		out.flush();
		out.println("===============================================");
		out.flush();
		
		// Gửi thông điệp đến object PHMenu
		menu.controlLoop();
	}

	
}
