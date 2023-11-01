package Bai12;

public class CD {
	private int ID;
	private String name;
	private int amount;
	private int price;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		if (iD <= 0) ID = 999999;
		else ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.equals("")) this.name = "Không xác định";
		else this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) throws Exception{
		if (amount <= 0) throw new Exception("Amount <= 0");
		else this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) throws Exception{
		if (price <= 0) throw new Exception("Price <= 0");
		else this.price = price;
	}
	
	public CD(int ID, String name, int amount, int price) throws Exception{
		setID(ID);
		setName(name);
		setAmount(amount);
		setPrice(price);
	}
	
	public String toString() {
		return "\nMã CD: " + getID() + "\nTên CD: " + getName() + "\nSố lượng bài: " + getAmount() + "\nGiá: " + getPrice();
	}
}