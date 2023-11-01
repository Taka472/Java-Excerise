package bai10;

public class SinhVien {
	private String maSV;
	private String tenSV;
	
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	
	public SinhVien(String ma, String name) {
		setMaSV(ma);
		setTenSV(name);
	}
	
	public String toString() {
		return getMaSV() + "	|	" + getTenSV() + "\n";
	}
}
