package bai7;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private int price;
	private LocalDate ngaySX;
	private LocalDate ngayHH;

	public String getMaHang() {
		return maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String ten) {
		if (ten.equals("")) this.tenHang = "xxx";
		else this.tenHang = ten;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) throws Exception {
		if (price < 0) throw new Exception("Loi gia");
		else this.price = price;
	}
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(LocalDate ngaySX) {
		if (ngaySX.isAfter(LocalDate.now())) this.ngaySX = LocalDate.now();
		else this.ngaySX = ngaySX;
	}
	public LocalDate getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(LocalDate ngayHH) {
		if (ngayHH.isBefore(getNgaySX())) this.ngayHH = getNgaySX();
		else this.ngayHH = ngayHH;
	}
	
	public HangThucPham(String ma, String ten, int price, LocalDate ngaySX, LocalDate ngayHH) throws Exception {
		this.maHang = ma;
		setTenHang(ten);
		setPrice(price);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
	}
	
	public HangThucPham(String ma) throws Exception {
		this.maHang = ma;
		setTenHang("");
		setPrice(0);
		setNgaySX(LocalDate.now());
		setNgayHH(LocalDate.now());
	}
	
	public boolean isExpire() {
		if (getNgayHH().isBefore(LocalDate.now())) return true;
		return false;
	}
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return getMaHang() + "		" + getTenHang() + "		" + df.format(getPrice()) + "		" + dtf.format(getNgaySX()) + "		" + dtf.format(getNgayHH()) + "		" + (isExpire() ? "Hang het han" : "");
	}
}
