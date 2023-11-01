package Bai4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;
	
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	public Sach() {
		setMaSach("");
		setNgayNhap(LocalDate.now());
		setDonGia(0);
		setSoLuong(0);
		setNhaXuatBan("");
	}
	
	public Sach(String ma, LocalDate date, double price, int amount, String root) {
		setMaSach(ma);
		setNgayNhap(date);
		setDonGia(price);
		setSoLuong(amount);
		setNhaXuatBan(root);
	}
	
	public double getThanhTien() {
		return getSoLuong() * getDonGia();
 	}
	
	public String toString() {
		DateTimeFormatter dmf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Ma: " + getMaSach() + " - Ngay nhap: " + dmf.format(getNgayNhap()) + " - Nha Xuat Ban: " + getNhaXuatBan();
	}
}
