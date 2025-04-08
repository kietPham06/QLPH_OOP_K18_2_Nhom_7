package com.qlph.main;

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
import com.qlph.database.PHLTAVGDAO;
import com.qlph.database.PHAddDAO;
import com.qlph.database.PHCountDAO;
import com.qlph.database.PHPrintDAO;
import com.qlph.database.PHSearchDAO;
import com.qlph.database.PHUpdateDAO;
import com.qlph.database.PHDeleteDAO;
import com.qlph.database.PHFilterDAO;
import com.qlph.ui.PHLTAVGOutput;
import com.qlph.ui.PHAddInput;
import com.qlph.ui.PHAddOutput;
import com.qlph.ui.PHCountOutput;
import com.qlph.ui.PHMenu;
import com.qlph.ui.PHPrintOutput;
import com.qlph.ui.PHSearchInput;
import com.qlph.ui.PHSearchOutput;
import com.qlph.ui.PHUpdateInput;
import com.qlph.ui.PHUpdateOutput;
import com.qlph.ui.PHDeleteInput;
import com.qlph.ui.PHDeleteOutput;
import com.qlph.ui.PHFilterOutput;
import com.qlph.utils.PHCountCalculator;
import com.qlph.utils.PHFilter;
import com.qlph.utils.PHLTAVGCalculator;

public class AppQLPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bước 1: Khai báo biến tham chiếu đối tượng
		Scanner keyboard;
		PrintWriter out;
		String prompt = ">";
		
		// Khai báo biến tham chiếu chức năng thêm
		PHAddDAO phAddDAO;
		PHAddInput phAddInput;
		PHAddOutput phAddOutput;
		PHAddControl phAddControl;
		
		// Khai báo biến tham chiếu chức năng in
		PHPrintControl phPrintControl;
		PHPrintOutput phPrintOutput;
		PHPrintDAO phPrintDAO;
		
		// Khai báo biến tham chiếu chức năng tính trung bình diện tích phòng lý thuyết
		PHLTAVGDAO phltavgdao;
		PHLTAVGCalculator phltavgCalculator;
		PHLTAVGOutput phltavgOutput;
		PHLTAVGControl phltavgControl;
		
		
		// Khai báo biến tham chiếu chức năng xóa
		PHDeleteDAO phDeleteDAO;
		PHDeleteInput phDeleteInput;
		PHDeleteOutput phDeleteOutput;
		PHDeleteControl phDeleteControl;
		
		// Khai báo biến tham chiếu chức năng cập nhật
		PHUpdateDAO phUpdateDAO;
		PHUpdateInput phUpdateInput;
		PHUpdateOutput phUpdateOutput;
		PHUpdateControl phUpdateControl;
		
		// Khai báo biến tham chiếu chức năng tìm kiếm
		PHSearchDAO phSearchDAO;
		PHSearchInput phSearchInput;
		PHSearchOutput phSearchOutput;
		PHSearchControl phSearchControl;
		
		// Khai báo biến tham chiếu chức năng tổng số lượng phòng học từng loại
		PHCountDAO phCountDAO;
		PHCountCalculator phCountCalculator;
		PHCountOutput phCountOutput;
		PHCountControl phCountControl;
		
		// Khai báo biến tham chiếu chức năng xuất ra phòng không đạt chuẩn
		PHFilterDAO phFilterDAO;
		PHFilter phFilter;
		PHFilterOutput phFilterOutput;
		PHFilterControl phFilterControl;
		
		// Khai báo biến tham chiếu menu
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
	
		// Chức năng tính trung bình diện tích phòng lý thuyết
		phltavgdao = new PHLTAVGDAO();
		phltavgCalculator = new PHLTAVGCalculator();
		phltavgOutput = new PHLTAVGOutput(out);
		phltavgControl = new PHLTAVGControl(phltavgdao, phltavgCalculator, phltavgOutput);
		
		// Chức năng xóa
		phDeleteDAO = new PHDeleteDAO();
		phDeleteInput = new PHDeleteInput(keyboard, out);
		phDeleteOutput = new PHDeleteOutput(out);
		phDeleteControl = new PHDeleteControl(phDeleteDAO, phDeleteInput, phDeleteOutput);
		
		// Chức năng cập nhật
		phUpdateDAO = new PHUpdateDAO();
		phUpdateInput = new PHUpdateInput(keyboard, out);
		phUpdateOutput = new PHUpdateOutput(out);
		phUpdateControl = new PHUpdateControl(phUpdateDAO, phUpdateInput, phUpdateOutput);
		
		// Chức năng tìm kiếm
		phSearchDAO = new PHSearchDAO();
		phSearchInput = new PHSearchInput(keyboard, out);
		phSearchOutput = new PHSearchOutput(out);
		phSearchControl = new PHSearchControl(phSearchDAO, phSearchInput, phSearchOutput);
		
		// Chức năng tổng số lượng phòng học từng loại
		phCountDAO = new PHCountDAO();
		phCountCalculator = new PHCountCalculator();
		phCountOutput = new PHCountOutput(out);
		phCountControl = new PHCountControl(phCountDAO, phCountCalculator, phCountOutput);
		
		// Chức năng xuất ra phòng không đạt chuẩn
		phFilterDAO = new PHFilterDAO();
		phFilter = new PHFilter();
		phFilterOutput = new PHFilterOutput(out);
		phFilterControl= new PHFilterControl(phFilterDAO, phFilter, phFilterOutput);
		
		// Hiển thị menu
		menu = new PHMenu(keyboard, out, prompt);
		
		// Gửi thông điệp đến object PHAddControl
		menu.setPHAddControl(phAddControl);
		
		// Gửi thông điệp đến object PHPrintControl
		menu.setPHPrintcontrol(phPrintControl);
		
		//  Gửi thông điệp đến object PHLTAVGControl
		menu.setPHLTAVGControl(phltavgControl);
		
		// Gửi thông điệp đến object PHRemoveControl
		menu.setPHDeleteControl(phDeleteControl);
		
		// Gửi thông điệp đến object PHUpdateControl
		menu.setPHUpdateControl(phUpdateControl);
		
		// Gửi thông điệp đến object PHSearchControl
		menu.setPHSearchControl(phSearchControl);
		
		// Gửi thông điệp đến object PHCountControl
		menu.setPHCountControl(phCountControl);
		
		// Gửi thông điệp đến object PHFilterControl
		menu.setPHFilterControl(phFilterControl);
		
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
