import java.io.PrintWriter;
import java.util.Scanner;

public class PhongHocInput {
	
	Scanner keyboard;
	PrintWriter out;
	PhongHocStorage storage;
	PhongHocOutput phongHocOutput;
	
	PhongHocInput() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		storage = new PhongHocStorage();
		phongHocOutput = new PhongHocOutput();
	}
	
	PhongHocInput(Scanner keyboard, PrintWriter out) {
		this.keyboard = keyboard;
		this.out = out;	
	}
	
	PhongHocInput(Scanner keyboard, PrintWriter out, PhongHocStorage storage) {
		this(keyboard, out);
		this.storage = storage;
	}
	
	PhongHocInput(Scanner keyboard, PrintWriter out, PhongHocStorage storage, PhongHocOutput phongHocOutput) {
		this(keyboard, out, storage);
		this.phongHocOutput = phongHocOutput;
	}
	
	void input() {
	    String maPhong, dayNha;
	    double dienTich;
	    int soBongDen, ngay, thang, nam, loaiPhongHoc;
	    boolean mayChieu;
	    int soLuongMayTinh;
	    String chuyenNganh;
	    int sucChua;
	    boolean bonRua;

	    PhongHocLyThuyet phongHocLyThuyet;
	    PhongHocMayTinh phongHocMayTinh;
	    PhongHocThiNghiem phongHocThiNghiem;

	    // Nhập thông tin chung
	    out.print("Mã phòng: ");
	    out.flush();
	    maPhong = keyboard.nextLine();

	    out.print("Dãy Nhà: ");
	    out.flush();
	    dayNha = keyboard.nextLine();

	    out.print("Diện Tích: ");
	    out.flush();
	    dienTich = keyboard.nextDouble();
	    keyboard.nextLine(); // Xử lý xuống dòng

	    out.print("Số bóng đèn: ");
	    out.flush();
	    soBongDen = keyboard.nextInt();
	    keyboard.nextLine(); // Xử lý xuống dòng

	    out.print("Ngày: ");
	    out.flush();
	    ngay = keyboard.nextInt();
	    keyboard.nextLine(); // Xử lý xuống dòng

	    out.print("Tháng: ");
	    out.flush();
	    thang = keyboard.nextInt();
	    keyboard.nextLine(); // Xử lý xuống dòng

	    out.print("Năm: ");
	    out.flush();
	    nam = keyboard.nextInt();
	    keyboard.nextLine(); // Xử lý xuống dòng

	    out.println("Chọn loại phòng học:");
	    out.println("1 - Lý thuyết | 2 - Máy tính | 3 - Thí nghiệm");
	    out.print("Chọn: ");
	    out.flush();
	    loaiPhongHoc = keyboard.nextInt();
	    keyboard.nextLine(); // Xử lý xuống dòng

	    switch (loaiPhongHoc) {
	        case 1: // Phòng lý thuyết
	            out.print("Có máy chiếu không (true/false): ");
	            out.flush();
	            mayChieu = keyboard.nextBoolean();
	            keyboard.nextLine(); // Xử lý xuống dòng

	            phongHocLyThuyet = new PhongHocLyThuyet(maPhong, dayNha, dienTich, soBongDen, nam, thang, ngay, mayChieu);
	            storage.insertPhongHocLyThuyet(phongHocLyThuyet);
	            phongHocOutput.output(phongHocLyThuyet);
	            break;
	            
	        case 2: // Phòng máy tính
	            out.print("Số lượng máy tính: ");
	            out.flush();
	            soLuongMayTinh = keyboard.nextInt();
	            keyboard.nextLine(); // Xử lý xuống dòng

	            phongHocMayTinh = new PhongHocMayTinh(maPhong, dayNha, dienTich, soBongDen, nam, thang, ngay, soLuongMayTinh);
	            storage.insertPhongHocLyMayTinh(phongHocMayTinh);
	            phongHocOutput.output(phongHocMayTinh);
	            break;

	        case 3: // Phòng thí nghiệm
	            out.print("Chuyên ngành: ");
	            out.flush();
	            chuyenNganh = keyboard.nextLine();

	            out.print("Sức chứa: ");
	            out.flush();
	            sucChua = keyboard.nextInt();
	            keyboard.nextLine(); // Xử lý xuống dòng

	            out.print("Có bồn rửa không (true/false): ");
	            out.flush();
	            bonRua = keyboard.nextBoolean();
	            keyboard.nextLine(); // Xử lý xuống dòng

	            phongHocThiNghiem = new PhongHocThiNghiem(maPhong, dayNha, dienTich, soBongDen, nam, thang, ngay, chuyenNganh, sucChua, bonRua);
	            storage.insertPhongHocLyThiNghiem(phongHocThiNghiem);
	            phongHocOutput.output(phongHocThiNghiem);
	            break;

	        default:
	            out.println("Lựa chọn không hợp lệ!");
	    }
	}
}
