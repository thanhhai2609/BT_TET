package QLTL;

public class TaiLieu {
	private String MaTL;
	private String NhaXB;
	private int SoBanPH;
	
	public TaiLieu() {
		super();
	}
	
	public TaiLieu(String maTL, String nhaXB, int soBanPH) {
		super();
		this.MaTL = maTL;
		this.NhaXB = nhaXB;
		this.SoBanPH = soBanPH;
	}
	
	public String getMaTL() {
		return MaTL;
	}
	
	public void setMaTL(String maTL) {
		MaTL = maTL;
	}
	
	public String getNhaXB() {
		return NhaXB;
	}
	
	public void setNhaXB(String nhaXB) {
		NhaXB = nhaXB;
	}
	
	public int getSoBanPH() {
		return SoBanPH;
	}
	
	public void setSoBanPH(int soBanPH) {
		SoBanPH = soBanPH;
	}
	
	@Override
	public String toString() {
		return "TaiLieu [MaTL=" + MaTL + ", NhaXB=" + NhaXB + ", SoBanPH=" + SoBanPH + "]";
	}
	
}
