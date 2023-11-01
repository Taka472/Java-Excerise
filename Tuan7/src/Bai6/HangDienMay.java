package Bai6;

public class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh;
	private double kw;
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) throws Exception{
		if (thoiGianBaoHanh < 0) throw new Exception("Thoi gian < 0");
		else this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public double getKw() {
		return kw;
	}
	public void setKw(double kw) throws Exception{
		if (kw < 0) throw new Exception("KW < 0");
		else this.kw = kw;
	}
	
	public HangDienMay(String maHang, String name, double price, int amount, int thoiGian, double kw) throws Exception {
		super(maHang, name, price, amount);
		setThoiGianBaoHanh(thoiGian);
		setKw(kw);
		decideTinhTrang();
		setVAT(0.1);
	}
	
	public void decideTinhTrang() {
		if (getSoLuong() < 3)
			setTinhTrang("Ban duoc");
		else setTinhTrang("Khong danh gia");
	}
	
	public String toString() {
		return super.toString() + " - Loai hang: dien may - Thoi gian bao hanh: " + getThoiGianBaoHanh() +
				" thang - Cong suat: " + getKw() + "kw - Tinh trang: " + getTinhTrang() + "\n";
	}
}