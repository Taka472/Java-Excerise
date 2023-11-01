package Bai6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa {
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isAfter(LocalDate.now()))
			this.ngaySanXuat = LocalDate.now();
		else this.ngaySanXuat = ngaySanXuat;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isBefore(getNgaySanXuat()))
			this.ngayHetHan = getNgaySanXuat();
		else this.ngayHetHan = ngayHetHan;
	}
	
	public HangThucPham(String maHang, String name, double price, int amount, String ncc, LocalDate sx, LocalDate hh) throws Exception{
		super(maHang, name, price, amount);
		setNhaCungCap(ncc);
		setNgaySanXuat(sx);
		setNgayHetHan(hh);
		decideTinhTrang();
		setVAT(0.05);
	}
	
	public void decideTinhTrang() {
		if (LocalDate.now().isAfter(getNgayHetHan()))
			setTinhTrang("Kho ban");
		else setTinhTrang("Khong danh gia");
	}
	
	public String toString() {
		DateTimeFormatter dmf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + " - Loai hang: thuc pham - Nha cung cap: " + getNhaCungCap() + 
				" - Ngay san xuat: " + dmf.format(getNgaySanXuat()) + " - Ngay het han: " + dmf.format(getNgayHetHan()) + 
				" - Tinh trang: " + getTinhTrang() + "\n";
	}
}