package com.qlph.main;

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
import com.qlph.database.FilePHAddDAO;
import com.qlph.database.FilePHDeleteDAO;
import com.qlph.database.FilePHDeleteLocatorDAO;
import com.qlph.database.FilePHFilterDAO;
import com.qlph.database.FilePHFindDAO;
import com.qlph.database.FilePHFindLocatorDAO;
import com.qlph.database.FilePHLTAVGDAO;
import com.qlph.database.FilePHPrintDAO;
import com.qlph.database.FilePHTotalDAO;
import com.qlph.database.FilePHUpdateDAO;
import com.qlph.database.FilePHUpdateLocatorDAO;
import com.qlph.database.MemoryPHAddDAO;
import com.qlph.database.MemoryPHDeleteDAO;
import com.qlph.database.MemoryPHDeleteLocatorDAO;
import com.qlph.database.MemoryPHFilterDAO;
import com.qlph.database.MemoryPHLTAVGDAO;
import com.qlph.database.MemoryPHPrintDAO;
import com.qlph.database.MemoryPHFindDAO;
import com.qlph.database.MemoryPHFindLocatorDAO;
import com.qlph.database.MemoryPHTotalDAO;
import com.qlph.database.MemoryPHUpdateDAO;
import com.qlph.database.MemoryPHUpdateLocatorDAO;
import com.qlph.database.PHAddDAO;
import com.qlph.database.PHDeleteDAO;
import com.qlph.database.PHFilterDAO;
import com.qlph.database.PHFindDAO;
import com.qlph.database.PHLTAVGDAO;
import com.qlph.database.PHPrintDAO;
import com.qlph.database.PHTotalDAO;
import com.qlph.database.PHUpdateDAO;
import com.qlph.ui.PHInputAdd;
import com.qlph.ui.PHInputDeleteLocator;
import com.qlph.ui.PHInputFindLocator;
import com.qlph.ui.PHInputUpdate;
import com.qlph.ui.PHInputUpdateLocator;
import com.qlph.ui.PHLTOutputAVG;
import com.qlph.ui.PHMenu;
import com.qlph.ui.PHOutputAdd;
import com.qlph.ui.PHOutputDelete;
import com.qlph.ui.PHOutputFilter;
import com.qlph.ui.PHOutputFind;
import com.qlph.ui.PHOutputPrint;
import com.qlph.ui.PHOutputTotal;
import com.qlph.ui.PHOutputUpdate;
import com.qlph.utils.PHCalculatorTotal;
import com.qlph.utils.PHDeleteLocator;
import com.qlph.utils.PHFilter;
import com.qlph.utils.PHFindLocator;
import com.qlph.utils.PHLTCalculatorAVG;
import com.qlph.utils.PHUpdateLocator;

public class AppQLPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// KHAI BÁO BIẾN THAM CHIẾU
		Scanner keyboard;
		PrintWriter out;
		String prompt = ">";
		
		// "Memory" là thao tác trong bộ nhớ (RAM)
		// "File" là thao tác trên file
		
		// THÊM
		PHInputAdd phInputAdd;
		MemoryPHAddDAO memoryPHAddDAO;
		FilePHAddDAO filePHAddDAO;
		PHOutputAdd phOutputAdd;
		PHControlAdd phControlAdd;
		
		// IN
		MemoryPHPrintDAO memoryPHPrintDAO;
		FilePHPrintDAO filePHPrintDAO;
		PHOutputPrint phOutputPrint;
		PHControlPrint phControlPrint;
		
		// TRUNG BÌNH
		MemoryPHLTAVGDAO memoryPHLTAVGDAO;
		FilePHLTAVGDAO filePHLTAVGDAO;
		PHLTCalculatorAVG phltCaculatorAVG;
		PHLTOutputAVG phltOutputAVG;
		PHLTControlAVG phltControlAVG;
		
		// TỔNG
		MemoryPHTotalDAO memoryPHTotalDAO;
		FilePHTotalDAO filePHTotalDAO;
		PHCalculatorTotal phCalculatorTotal;
		PHOutputTotal phOutputTotal;
		PHControlTotal phControlTotal;
		
		// PHÒNG KHÔNG ĐẠT CHUẨN
		MemoryPHFilterDAO memoryPHFilterDAO;
		FilePHFilterDAO filePHFilterDAO;
		PHFilter phFilter;
		PHOutputFilter phOutputFilter;
		PHControlFilter phControlFilter;
		
		// TÌM KIẾM
		PHInputFindLocator phInputFind;
		MemoryPHFindLocatorDAO memoryPHFindLocatorDAO;
		FilePHFindLocatorDAO filePHFindLocatorDAO;
		PHFindLocator phFindLocator;
		MemoryPHFindDAO memoryPHFindDAO;
		FilePHFindDAO filePHFindDAO;
		PHOutputFind phOutputFind;
		PHControlFind phControlFind;
		
		// XÓA
		PHInputDeleteLocator phInputDelete;
		MemoryPHDeleteLocatorDAO memoryPHDeleteLocatorDAO;
		FilePHDeleteLocatorDAO filePHDeleteLocatorDAO;
		PHDeleteLocator phDeleteLocator;
		MemoryPHDeleteDAO memoryPHDeleteDAO;
		FilePHDeleteDAO filePHDeleteDAO;
		PHOutputDelete phOutputDelete;
		PHControlDelete phControlDelete;
		
		// CẬP NHẬT
		PHInputUpdateLocator phInputUpdateLocator;
		PHInputUpdate phInputUpdate;
		MemoryPHUpdateLocatorDAO memoryPHUpdateLocatorDAO;
		FilePHUpdateLocatorDAO filePHUpdateLocatorDAO;
		PHUpdateLocator phUpdateLocator;
		MemoryPHUpdateDAO memoryPHUpdateDAO;
		FilePHUpdateDAO filePHUpdateDAO;
		PHOutputUpdate phOutputUpdate;
		PHControlUpdate phControlUpdate;
		
		// MENU
		PHMenu menu;
		
		// KHỞI TẠO ĐỐI TƯỢNG VÀ TRỎ BIẾN THAM CHIẾU ĐẾN ĐỐI TƯỢNG
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		
		// THÊM
		phInputAdd = new PHInputAdd(keyboard, out);
		memoryPHAddDAO = new MemoryPHAddDAO();
		filePHAddDAO = new FilePHAddDAO();
		phOutputAdd = new PHOutputAdd(out);
		phControlAdd = new PHControlAdd(phInputAdd, filePHAddDAO, phOutputAdd);
		
		// IN
		memoryPHPrintDAO = new MemoryPHPrintDAO();
		filePHPrintDAO = new FilePHPrintDAO();
		phOutputPrint = new PHOutputPrint(out);
		phControlPrint = new PHControlPrint(filePHPrintDAO, phOutputPrint);
		
		// TRUNG BÌNH
		memoryPHLTAVGDAO = new MemoryPHLTAVGDAO();
		filePHLTAVGDAO = new FilePHLTAVGDAO();
		phltCaculatorAVG = new PHLTCalculatorAVG();
		phltOutputAVG = new PHLTOutputAVG(out);
		phltControlAVG = new PHLTControlAVG(filePHLTAVGDAO, phltCaculatorAVG, phltOutputAVG);
		
		// TỔNG
		memoryPHTotalDAO = new MemoryPHTotalDAO();
		filePHTotalDAO = new FilePHTotalDAO();
		phCalculatorTotal = new PHCalculatorTotal();
		phOutputTotal = new PHOutputTotal(out);
		phControlTotal = new PHControlTotal(filePHTotalDAO, phCalculatorTotal, phOutputTotal);
		
		// PHÒNG KHÔNG ĐẠT CHUẨN
		memoryPHFilterDAO = new MemoryPHFilterDAO();
		filePHFilterDAO = new FilePHFilterDAO();
		phFilter = new PHFilter();
		phOutputFilter = new PHOutputFilter(out);
		phControlFilter = new PHControlFilter(filePHFilterDAO, phFilter, phOutputFilter);
		
		// TÌM KIẾM
		phInputFind = new PHInputFindLocator(keyboard, out);
		memoryPHFindLocatorDAO = new MemoryPHFindLocatorDAO();
		filePHFindLocatorDAO = new FilePHFindLocatorDAO();
		phFindLocator = new PHFindLocator();
		memoryPHFindDAO = new MemoryPHFindDAO();
		filePHFindDAO = new FilePHFindDAO();
		phOutputFind = new PHOutputFind(out);
		phControlFind = new PHControlFind(phInputFind, filePHFindLocatorDAO, phFindLocator, filePHFindDAO, phOutputFind);
		
		// XÓA
		phInputDelete = new PHInputDeleteLocator(keyboard, out);
		memoryPHDeleteLocatorDAO = new MemoryPHDeleteLocatorDAO();
		filePHDeleteLocatorDAO = new FilePHDeleteLocatorDAO();
		phDeleteLocator = new PHDeleteLocator();
		memoryPHDeleteDAO = new MemoryPHDeleteDAO();
		filePHDeleteDAO = new FilePHDeleteDAO();
		phOutputDelete = new PHOutputDelete(out);
		phControlDelete = new PHControlDelete(phInputDelete, filePHDeleteLocatorDAO, phDeleteLocator, filePHDeleteDAO, phOutputDelete);
		
		// CẬP NHẬT
		phInputUpdateLocator = new PHInputUpdateLocator(keyboard, out);
		phInputUpdate = new PHInputUpdate(keyboard, out);
		memoryPHUpdateLocatorDAO = new MemoryPHUpdateLocatorDAO();
		filePHUpdateLocatorDAO = new FilePHUpdateLocatorDAO();
		phUpdateLocator = new PHUpdateLocator();
		memoryPHUpdateDAO = new MemoryPHUpdateDAO();
		filePHUpdateDAO = new FilePHUpdateDAO();
		phOutputUpdate = new PHOutputUpdate(out);
		phControlUpdate = new PHControlUpdate(phInputUpdateLocator, phInputUpdate, filePHUpdateLocatorDAO, phUpdateLocator, filePHUpdateDAO, phOutputUpdate);
		
		// MENU
		menu = new PHMenu(keyboard, out, prompt);
		
		// TIÊU ĐỀ
		out.println("===============================================");
		out.flush();
		out.println("|        CHƯƠNG TRÌNH QUẢN LÍ PHÒNG HỌC       |");
		out.flush();
		out.println("===============================================");
		out.flush();
		
		// Gửi thông điệp đến hành vi ... của đối tượng PHMenu 
		menu.setPhControlAdd(phControlAdd);
		menu.setPhControlPrint(phControlPrint);
		menu.setPhltControlAVG(phltControlAVG);
		menu.setPhControlTotal(phControlTotal);
		menu.setPhControlFilter(phControlFilter);
		menu.setPhControlFind(phControlFind);
		menu.setPhControlDelete(phControlDelete);
		menu.setPhControlUpdate(phControlUpdate);
		menu.controlLoop();
		
	}

	
}
