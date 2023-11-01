package Bai6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if (ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = LocalDate.now();
		else this.ngayNhapKho = ngayNhapKho;
	}
	
	public HangSanhSu(String maHang, String name, double price, int amount, String nsx, LocalDate ngayNhapKho) throws Exception{
		super(maHang, name, price, amount);
		setNhaSanXuat(nsx);
		setNgayNhapKho(ngayNhapKho);
		decideTinhTrang();
		setVAT(0.1);
	}
	
	public void decideTinhTrang() {
		if (getSoLuong() > 50 && getNgayNhapKho().compareTo(LocalDate.now()) > 10)
			setTinhTrang("Ban cham");
		else setTinhTrang("Khong danh gia");
	}
	
	public String toString() {
		DateTimeFormatter dmf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + " - Loai hang: sanh su - Nha san xuat: " + getNhaSanXuat() + 
				" - Ngay nhap kho: " + dmf.format(getNgayNhapKho()) + 
				"Tinh trang: " + getTinhTrang() + "\n";
	}
}