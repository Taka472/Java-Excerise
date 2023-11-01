package bai6;

public class ThongTinDangKye {
	private String name;
	private String type;
	private int price;
	private int cc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) throws Exception{
		if (price <= 0) throw new Exception("Loi gia thanh");
		else this.price = price;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) throws Exception{
		if (cc <= 0) throw new Exception("Loi cc");
		else this.cc = cc;
	}
	
	public ThongTinDangKye(String name, String type, int cc, int price) throws Exception{
		setName(name);
		setType(type);
		setPrice(price);
		setCc(cc);
	}
	
	public double Tax() {
		int cc = getCc();
		if (cc < 100) return 0.01;
		else if (cc < 200) return 0.03;
		return 0.05;
	}
	
	public String toString() {
		return getName() + "		" + getType() + "		" + getCc() + "		" + getPrice() + "		" + (int)(getPrice() * Tax());
	}
}
