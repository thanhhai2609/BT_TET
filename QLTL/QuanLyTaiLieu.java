package QLTL;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLyTaiLieu {
	private TaiLieu[] TLS;
	private Scanner sc;
	private int INDEX = 0;
	
	public QuanLyTaiLieu(Scanner sc) {
		super();
		TLS = new TaiLieu[0];
		this.sc = sc;
	}
	
	public void themTaiLieu(int choice) {
		TaiLieu[] newTLS = Arrays.copyOf(TLS, TLS.length + 1);
		newTLS[INDEX] = taoTaiLieu(choice);
		TLS = newTLS;
		INDEX++;
	}
	
	public void hienThiDanhSach() {
		for(TaiLieu TL : TLS) {
			if(TL != null) {
				System.out.println(TL.toString());
			}
		}
	}
	
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
	
	
	public void xoaTheoTen(String name) {
		TaiLieu[] newTLs = new TaiLieu[TLS.length - 1];
		for (int i = 0, j = 0; i < TLS.length - 1; i++, j++) {
			if (!TLS[i].getMaTL().equals(name)) {
				newTLs[i] = TLS[j];
			} else {
				j++;
				newTLs[i] = TLS[j];
			}
		}
		TLS = newTLs;
		INDEX--;
	}
	
	public void traTaiLieu(String MaTL) {
		for (TaiLieu TL : TLS) {
			if (TL.getMaTL().contains(MaTL)) {
				System.out.println(TL.toString());
			}
		}
	}
}
