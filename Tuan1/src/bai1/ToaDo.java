package bai1;

public class ToaDo {
	private String name;
	private int x;
	private int y;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public ToaDo() {
		setName("");
		setX(0);
		setY(0);
	}
	
	public ToaDo(String name, int x, int y) {
		setName(name);
		setX(x);
		setY(y);
	}
	
	public String toString() {
		return getName() + "(" + getX() + ", " + getY() + ")";
	}
}
