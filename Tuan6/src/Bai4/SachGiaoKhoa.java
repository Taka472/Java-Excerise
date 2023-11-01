package Bai4;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	public SachGiaoKhoa() {
		super();
		setTinhTrang(false);
	}
	
	public SachGiaoKhoa(String ma, LocalDate date, double price, int amount, String root, boolean tinhTrang) {
		super(ma, date, price, amount, root);
		setTinhTrang(tinhTrang);
	}
	
	public double getThanhTien() {
		return super.getThanhTien() * (isTinhTrang() ? 1 : 0.5);
	}
	
	public String toString() {
		return super.toString() + " - Tinh trang: " + isTinhTrang();
	}
}
