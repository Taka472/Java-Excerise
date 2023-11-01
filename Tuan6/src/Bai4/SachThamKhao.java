package Bai4;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	private double Thue;

	public double getThue() {
		return Thue;
	}

	public void setThue(double thue) {
		Thue = thue;
	}
	
	public SachThamKhao() {
		super();
		setThue(0);
	}
	
	public SachThamKhao(String ma, LocalDate date, double price, int amount, String root, double thue) {
		super(ma, date, price, amount, root);
		setThue(thue);
	}
	
	public double getThanhTien() {
		return super.getThanhTien() + getThue();
	}
	
	public String toString() {
		return super.toString() + " - Thue: " + getThue();
	}
}
