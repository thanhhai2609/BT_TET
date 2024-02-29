package QLTL;

public class TapChi extends TaiLieu{
	private int SoPH;
	private String ThangPH;

	public TapChi(int soPH, String thangPH) {
		super();
		SoPH = soPH;
		ThangPH = thangPH;
	}

	public TapChi() {
		super();
	}
	
	public TapChi(String MaTL, String NhaXB, int SoBanPH, int soPH, String thangPH) {
		super(MaTL, NhaXB, SoBanPH);
		this.SoPH = soPH;
		this.ThangPH = thangPH;
	}

	public int getSoPH() {
		return SoPH;
	}

	public void setSoPH(int soPH) {
		SoPH = soPH;
	}

	public String getThangPH() {
		return ThangPH;
	}

	public void setThangPH(String thangPH) {
		ThangPH = thangPH;
	}

	@Override
	public String toString() {
		return "TapChi [SoPH=" + SoPH + ", ThangPH=" + ThangPH + "]";
	}
	
	
}
