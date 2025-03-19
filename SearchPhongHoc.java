import java.io.PrintWriter;
import java.util.Scanner;

public class SearchPhongHoc {

		// Ô 2
		Scanner keyboard;
		PrintWriter out;
		SearchPhongHocStorage storage;
		SearchPhongHocOutput output;
		
		// Ô 3
		SearchPhongHoc() {
			keyboard = new Scanner(System.in);
			out = new PrintWriter(System.out);
			storage = new SearchPhongHocStorage();
			output = new SearchPhongHocOutput();
		}
		
		SearchPhongHoc(Scanner keyboard, PrintWriter out) {
			this.keyboard = keyboard;
			this.out = out;
		}
		
		SearchPhongHoc(Scanner keyboard, PrintWriter out, SearchPhongHocStorage storage) {
			this(keyboard, out);
			this.storage = storage;
		}
		
		SearchPhongHoc(Scanner keyboard, PrintWriter out, SearchPhongHocStorage storage, SearchPhongHocOutput output) {
			this(keyboard, out, storage);
			this.output = output;
		}
		
		void searchPhongHoc() {
		    out.print("Nhập mã phòng cần tìm: ");
		    out.flush();
		    
		    String maPhong = keyboard.nextLine();

		    out.println("Chọn loại phòng học:");
		    out.flush();
		    
		    out.println("1 - Lý thuyết | 2 - Máy tính | 3 - Thí nghiệm");
		    out.flush();
		    
		    out.print("Chọn: ");
		    out.flush();
		    
		    int loaiPhongHoc = keyboard.nextInt();
		    keyboard.nextLine(); // Xử lý dòng trống

		    switch (loaiPhongHoc) {
		        case 1:
		            PhongHocLyThuyet phongHocLyThuyet = storage.selectPhongHocLyThuyet(maPhong);
		            if (phongHocLyThuyet != null) {
		                output.output(phongHocLyThuyet);
		            } else {
		                out.println("Không tìm thấy phòng lý thuyết có mã: " + maPhong);
		                out.flush();
		            }
		            break;
		        case 2:
		            PhongHocMayTinh phongHocMayTinh = storage.selectPhongHocMayTinh(maPhong);
		            if (phongHocMayTinh != null) {
		                output.output(phongHocMayTinh);
		            } else {
		                out.println("Không tìm thấy phòng máy tính có mã: " + maPhong);
		                out.flush();
		            }
		            break;
		        case 3:
		            PhongHocThiNghiem phongHocThiNghiem = storage.selectPhongHocThiNghiem(maPhong);
		            if (phongHocThiNghiem != null) {
		                output.output(phongHocThiNghiem);
		            } else {
		                out.println("Không tìm thấy phòng thí nghiệm có mã: " + maPhong);
		                out.flush();
		            }
		            break;
		        default:
		            out.println("Lựa chọn không hợp lệ!");
		            out.flush();
		    }
		}

	}

