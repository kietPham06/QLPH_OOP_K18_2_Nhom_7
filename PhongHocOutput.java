import java.io.PrintWriter;
import java.util.Calendar;

public class PhongHocOutput {
	
	// Ô 2
	PrintWriter out;
	
	// Ô 3
	PhongHocOutput() {
		out = new PrintWriter(System.out);
	}
	
	PhongHocOutput(PrintWriter out) {
		this.out = out;
	}
	
	void output(PhongHocLyThuyet phongHoc) {
		out.println("Đã lưu phòng học lý thuyết thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		
	}
	
	void output(PhongHocMayTinh phongHoc) {
		out.println("Đã lưu phòng học máy tính thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
	}
	
	void output(PhongHocThiNghiem phongHoc) {
		out.println("Đã lưu phòng học thí nghiệm thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
	}
}
