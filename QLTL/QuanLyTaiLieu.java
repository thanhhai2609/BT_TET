package QLTL;

import java.util.ArrayList;

import java.util.Scanner;


public class QuanLyTaiLieu {
	private ArrayList<TaiLieu> TLS;

    public QuanLyTaiLieu() {
        TLS = new ArrayList<>();
    }
    
	
	
	public static int inputNumber(Scanner scanner) {
		int number = -1;
		do {
			try {
				number = Integer.parseInt(scanner.nextLine());
			} catch (RuntimeException e) {
				System.out.println("Sai định dạng, mời nhập lại:");
			}
		} while (number == -1);
		return number;
	}
	
	public void themTaiLieu(int choice) {
		TLS.add(taoTaiLieu(choice));
        System.out.println("Thêm mới thành công!");
	}
	
	public void hienThiDanhSach() {
		for(TaiLieu TL : TLS) {
			if(TL != null) {
				System.out.println(TL.toString());
			}
		}
	}
	Scanner sc = new Scanner(System.in);
	public TaiLieu taoTaiLieu(int choice) {
		TaiLieu TL;
		
		System.out.println("Nhập mã tài liệu:");
		String MaTL = sc.nextLine();
		System.out.println("Nhập nhà xuất bản:");
		String NhaXB = sc.nextLine();
		System.out.println("Nhập số bản phát hành:");
		int SoBanPH = sc.nextInt();
		if (choice == 1) {
			sc.nextLine();
			System.out.println("Nhập tên tác giả: ");
			String TenTG = sc.nextLine();
			System.out.println("Nhập số trang:");
			int SoTrang = sc.nextInt();
			TL = new Sach(MaTL, NhaXB, SoBanPH, TenTG, SoTrang);
		} else if (choice == 2) {
			sc.nextLine();
			System.out.println("Nhập số phát hành: ");
			int SoPH = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập tháng phát hành:");
			String ThangPH = sc.nextLine();
			TL = new TapChi(MaTL, NhaXB, SoBanPH, SoPH, ThangPH);
		} else {
			System.out.println("Nhập ngày phát hành: ");
			String NgayPH = sc.nextLine();
			TL = new Bao(MaTL, NhaXB, SoBanPH, NgayPH);
		}
		return TL;
	}
	
	public void xoaTheoTen(String name) {
		TLS.removeIf(TaiLieu -> TaiLieu.getMaTL().equals(name));
	}
	
	public void traTaiLieu(String MaTL) {
		for (TaiLieu TL : TLS) {
			if (TL.getMaTL().contains(MaTL)) {
				System.out.println(TL.toString());
			}
		}
	}
}
