package bai11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGui;
	private int kyHan;
	private float laiSuat;
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}
	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}
	public double getSoTienGui() {
		return soTienGui;
	}
	public void setSoTienGui(double soTienGui) {
		this.soTienGui = soTienGui;
	}
	public int getKyHan() {
		return kyHan;
	}
	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}
	public float getLaiSuat() {
		return laiSuat;
	}
	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}
	
	public SoTietKiem(String ma, LocalDate date, double money, int kyHan, float lai) {
		setMaSo(ma);
		setNgayMoSo(date);
		setSoTienGui(money);
		setKyHan(kyHan);
		setLaiSuat(lai);
	}
	
	public int tinhSoThangGoiThuc() {
		Period age = Period.between(getNgayMoSo(), LocalDate.now());
		int dt_nam = age.getYears(), dt_thang = age.getMonths();
		int soThangGui = dt_nam * 12 + dt_thang;
		if (soThangGui % getKyHan() == 0) {
			return soThangGui;
		}
		return soThangGui / getKyHan() * getKyHan();
	}
	
	public double tinhTienLai() {
		return Math.round(getSoTienGui() * getLaiSuat() * tinhSoThangGoiThuc() * 100.0) / 100.0;
	}
	
	public String toString() {
		DecimalFormat dmf = new DecimalFormat("#,#00.00");
		DateTimeFormatter dmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "STK " + getMaSo() + "[" + dmt.format(getNgayMoSo()) + "-" + dmt.format(LocalDate.now()) + "]" + "KH " + getKyHan() + " tháng, số tháng tính lãi: "
				+ tinhSoThangGoiThuc() + " tháng, ls " + getLaiSuat() + ", số tiền: " + dmf.format(getSoTienGui()) + " --> Tiền lãi: " + dmf.format(tinhTienLai());
	}
}
