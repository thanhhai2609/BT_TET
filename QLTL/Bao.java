package QLTL;

public class Bao extends TaiLieu{
	private String NgayPH;
	
	public Bao() {
		super();
	}

	public Bao(String MaTL, String NhaXB, int SoBanPH, String ngayPH) {
		super(MaTL, NhaXB, SoBanPH);
		this.NgayPH = ngayPH;
	}

	public String getNgayPH() {
		return NgayPH;
	}

	public void setNgayPH(String ngayPH) {
		NgayPH = ngayPH;
	}

	@Override
	public String toString() {
		return "Bao [NgayPH=" + NgayPH + "]";
	}
}
