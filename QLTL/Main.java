package QLTL;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuanLyTaiLieu qls = new QuanLyTaiLieu();
		int choice;
		do {
			System.out.println("Admin");
			System.out.println("1. Thêm Tài liệu");
			System.out.println("2. Xóa tài liệu");
			System.out.println("3. Tìm kiếm tài liệu theo tên");
			System.out.println("4. Hiển thị danh sách tài liệu");
			System.out.println("0. Thoát");
			System.out.println("Nhập lựa chọn của bạn: ");
			choice = QuanLyTaiLieu.inputNumber(scanner);
			switch (choice) {
			case 1:
				addObject(scanner, qls);
				break;
			case 2:
				qls.hienThiDanhSach();
				System.out.println("Nhập tên tài liệu muốn xóa:");
				String titleDel = scanner.nextLine();
				qls.xoaTheoTen(titleDel);
			case 3:
				System.out.println("Nhập tên muốn tìm kiếm: ");
				String Title = scanner.nextLine();
				qls.traTaiLieu(Title);
				break;
			case 4:
				qls.hienThiDanhSach();
				break;

			}
		} while (choice != 0);
	}

	
	public static void addObject(Scanner scanner, QuanLyTaiLieu qls) {
	    System.out.println("Chọn loại tài liệu: ");
	    System.out.println("1. Sách");
	    System.out.println("2. Tạp chí");
	    System.out.println("3. Báo");
	    System.out.println("Nhập lựa chọn của bạn: ");
	    
	    int choice1 = QuanLyTaiLieu.inputNumber(scanner);
	    TaiLieu TL;
	    switch (choice1) {
	        case 1:
	            TL = new Sach();
	            break;
	        case 2:
	            TL = new TapChi();
	            break;
	        case 3:
	            TL = new Bao();
	            break;
	        default:
	            System.out.println("Lựa chọn không hợp lệ.");
	            return;
	    }
	    qls.themTaiLieu(choice1);
	}
}