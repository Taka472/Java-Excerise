package Bai6;

public class HangHoa {
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuong;
	private String tinhTrang;
	private double VAT;
	
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) throws Exception{
		if (maHang.equals("")) throw new Exception("Ma hang rong");
		else this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if (tenHang.equals("")) this.tenHang = "xxx";
		else this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception{
		if (donGia < 0) throw new Exception("Don gia < 0");
		else this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) throws Exception{
		if (soLuong < 0) throw new Exception("So luong < 0");
		else this.soLuong = soLuong;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String t) {
		this.tinhTrang = t;
	}
	public double getVAT() {
		return VAT;
	}
	public void setVAT(double vat) {
		this.VAT = vat;
	}
	
	public HangHoa(String maHang, String name, double price, int amount) throws Exception {
		setMaHang(maHang);
		setTenHang(name);
		setDonGia(price);
		setSoLuong(amount);
	}
	
	public void decideTinhTrang() {}
	
	public String toString() {
		return "Ma hang: " + getMaHang() + " - Ten hang: " + getTenHang() + 
				" - Don gia: " + getDonGia() + " - So luong: " + getSoLuong();
	}
}