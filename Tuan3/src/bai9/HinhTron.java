package bai9;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;
	
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public HinhTron() {
		setTam(new ToaDo());
		setBanKinh(0);
	}
	
	public HinhTron(ToaDo tam, double banKinh) {
		setTam(tam);
		setBanKinh(banKinh);
	}
	
	public double Parameter() {
		return Math.round(2 * Math.PI * getBanKinh() * 100) / 100.0;
	}
	
	public double Area() {
		return Math.round(Math.pow(getBanKinh(), 2) * Math.PI * 100) / 100.0;
	}
	
	public String toString() {
		return "Dien tich va chu vi cua hinh tron tam " + getTam().toString() + " co ban kinh " + getBanKinh() + "m la " + Parameter() + " va " + Area();
	}
}
