package QLTL;

public class Sach extends TaiLieu{
	private String TenTG;
	private int SoTrang;
	
	public Sach() {
		super();
	}
	
	public Sach(String MaTL, String NhaXB, int SoBanPH, String tenTG, int soTrang) {
		super(MaTL, NhaXB, SoBanPH);
		this.TenTG = tenTG;
		this.SoTrang = soTrang;
	}
	
	public String getTenTG() {
		return TenTG;
	}
	
	public void setTenTG(String tenTG) {
		TenTG = tenTG;
	}
	
	public int getSoTrang() {
		return SoTrang;
	}
	
	public void setSoTrang(int soTrang) {
		SoTrang = soTrang;
	}

	@Override
	public String toString() {
		return "Sach [TenTG=" + TenTG + ", SoTrang=" + SoTrang + "]";
	}
	
}
