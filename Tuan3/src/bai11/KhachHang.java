package bai11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private List<SoTietKiem> dsSoTietKiem = new ArrayList<SoTietKiem>();
	private int SoLuongHienCo;
	public String getMaKH() {
		return maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public List<SoTietKiem> getDsSoTietKiem() {
		return dsSoTietKiem;
	}
	public int getSoLuongHienCo() {
		return SoLuongHienCo;
	}
	
	public KhachHang(String ma, String name, int soLuong) {
		this.maKH = ma;
		setTenKH(name);
		this.SoLuongHienCo = soLuong;
	}
	
	public boolean ThemSoTietKiem(String ma, LocalDate date, double money, int kyHan, float laiSuat) {
		SoTietKiem a = new SoTietKiem(ma, date, money, kyHan, laiSuat);
		getDsSoTietKiem().add(a);
		this.SoLuongHienCo += 1;
		return true;
	}
	
	public String toString() {
		String s = "";
		s += "Khách hàng: " + getMaKH() + " - " + getTenKH() + "\n";
		for (int i = 0; i < getDsSoTietKiem().size(); i++) {
			s += getDsSoTietKiem().get(i) + "\n";
		}
		return s;
	}
}
