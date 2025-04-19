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
import com.qlph.logic.PHDeleteLogic;
import com.qlph.logic.PHSearchLogic;
import com.qlph.logic.PHUpdateLogic;
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
		PHDeleteLogic phDeleteLogic;
		PHDeleteControl phDeleteControl;
		
		// Khai báo biến tham chiếu chức năng cập nhật
		PHUpdateDAO phUpdateDAO;
		PHUpdateInput phUpdateInput;
		PHUpdateOutput phUpdateOutput;
		PHUpdateLogic phUpdateLogic;
		PHUpdateControl phUpdateControl;
		
		// Khai báo biến tham chiếu chức năng tìm kiếm
		PHSearchDAO phSearchDAO;
		PHSearchInput phSearchInput;
		PHSearchOutput phSearchOutput;
		PHSearchLogic phSearchLogic;
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
		phAddDAO /* Bước 3 */ = /* Bước 2 */ new PHAddDAO();
		phAddInput /* Bước 3 */ = /* Bước 2 */ new PHAddInput(keyboard, out);
		phAddOutput /* Bước 3 */ = /* Bước 2 */ new PHAddOutput(out);
		phAddControl /* Bước 3 */ = /* Bước 2 */ new PHAddControl(phAddDAO, phAddInput, phAddOutput);
		
		// Chức năng in
		phPrintDAO /* Bước 3 */ = /* Bước 2 */ new PHPrintDAO();
		phPrintOutput /* Bước 3 */ = /* Bước 2 */ new PHPrintOutput(out);
		phPrintControl /* Bước 3 */ = /* Bước 2 */ new PHPrintControl(phPrintDAO, phPrintOutput);
	
		// Chức năng tính trung bình diện tích phòng lý thuyết
		phltavgdao /* Bước 3 */ = /* Bước 2 */ new PHLTAVGDAO();
		phltavgCalculator /* Bước 3 */ = /* Bước 2 */ new PHLTAVGCalculator();
		phltavgOutput /* Bước 3 */ = /* Bước 2 */ new PHLTAVGOutput(out);
		phltavgControl /* Bước 3 */ = /* Bước 2 */ new PHLTAVGControl(phltavgdao, phltavgCalculator, phltavgOutput);
		
		// Chức năng xóa
		phDeleteDAO /* Bước 3 */ = /* Bước 2 */ new PHDeleteDAO();
		phDeleteInput /* Bước 3 */ = /* Bước 2 */ new PHDeleteInput(keyboard, out);
		phDeleteOutput /* Bước 3 */ = /* Bước 2 */ new PHDeleteOutput(out);
		phDeleteLogic = new PHDeleteLogic();
		phDeleteControl /* Bước 3 */ = /* Bước 2 */ new PHDeleteControl(phDeleteDAO, phDeleteInput, phDeleteOutput, phDeleteLogic);
		
		// Chức năng cập nhật
		phUpdateDAO /* Bước 3 */ = /* Bước 2 */ new PHUpdateDAO();
		phUpdateInput /* Bước 3 */ = /* Bước 2 */ new PHUpdateInput(keyboard, out);
		phUpdateOutput /* Bước 3 */ = /* Bước 2 */ new PHUpdateOutput(out);
		phUpdateLogic = new PHUpdateLogic();
		phUpdateControl /* Bước 3 */ = /* Bước 2 */ new PHUpdateControl(phUpdateDAO, phUpdateInput, phUpdateOutput, phUpdateLogic);
		
		// Chức năng tìm kiếm
		phSearchDAO /* Bước 3 */ = /* Bước 2 */ new PHSearchDAO();
		phSearchInput /* Bước 3 */ = /* Bước 2 */ new PHSearchInput(keyboard, out);
		phSearchOutput /* Bước 3 */ = /* Bước 2 */ new PHSearchOutput(out);
		phSearchLogic = new PHSearchLogic();
		phSearchControl /* Bước 3 */ = /* Bước 2 */ new PHSearchControl(phSearchDAO, phSearchInput, phSearchOutput, phSearchLogic);
		
		// Chức năng tổng số lượng phòng học từng loại
		phCountDAO /* Bước 3 */ = /* Bước 2 */ new PHCountDAO();
		phCountCalculator /* Bước 3 */ = /* Bước 2 */ new PHCountCalculator();
		phCountOutput /* Bước 3 */ = /* Bước 2 */ new PHCountOutput(out);
		phCountControl /* Bước 3 */ = /* Bước 2 */ new PHCountControl(phCountDAO, phCountCalculator, phCountOutput);
		
		// Chức năng xuất ra phòng không đạt chuẩn
		phFilterDAO /* Bước 3 */ = /* Bước 2 */ new PHFilterDAO();
		phFilter /* Bước 3 */ = /* Bước 2 */ new PHFilter();
		phFilterOutput /* Bước 3 */ = /* Bước 2 */ new PHFilterOutput(out);
		phFilterControl /* Bước 3 */ = /* Bước 2 */ new PHFilterControl(phFilterDAO, phFilter, phFilterOutput);
		
		// Hiển thị menu
		menu /* Bước 3 */ = /* Bước 2 */ new PHMenu(keyboard, out, prompt);
		
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
