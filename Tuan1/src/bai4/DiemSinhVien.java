package bai4;

public class DiemSinhVien {
	private int maSV;
	private String name;
	private double LT, TH;
	
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) throws Exception{
		if (maSV < 0) throw new Exception("MaSV < 0");
		else this.maSV = maSV;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception{
		if (name.equals("")) throw new Exception("Ten rong");
		else this.name = name;
	}
	public double getLT() {
		return LT;
	}
	public void setLT(double lT) throws Exception{
		if (lT < 0 || lT > 10) throw new Exception("Loi diem LT");
		else LT = lT;
	}
	public double getTH() {
		return TH;
	}
	public void setTH(double tH) throws Exception{
		if (tH < 0 || tH > 10) throw new Exception("Loi diem TH");
		else TH = tH;
	}
	
	public DiemSinhVien() throws Exception {
		setName("a");
		setLT(0);
		setTH(0);
		setMaSV(1);
	}
	
	public DiemSinhVien(int ma, String name, double LT, double TH) throws Exception {
		setName(name);
		setLT(LT);
		setTH(TH);
		setMaSV(ma);

	}
	
	public double Average() {
		return (double)((getLT() + getTH()) / 2);
	}
	
	public String toString( ) {
		return getMaSV() + "	" + getName() + "		" + getLT() + "	" + getTH() + "	" + Average();
	}
}
