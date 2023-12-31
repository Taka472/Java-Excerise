package bai9;

public class ToaDo {
	private String name;
	private float x, y;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public ToaDo() {
		setX(0);
		setY(0);
		setName("A");
	}
	
	public ToaDo(String name, float x, float y) {
		setX(x);
		setY(y);
		setName(name);
	}
	
	public String toString() {
		return getName() + "(" + getX() + ", " + getY() + ")";
	}
}
