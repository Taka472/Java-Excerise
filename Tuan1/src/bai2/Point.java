package bai2;

public class Point {
	private String name;
	private int x;
	private int y;
	
	public String getName() {
		return this.name;
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
	
	public Point(String name, int x, int y) {
		this.name = name;
		setX(x);
		setY(y);
	}
	
	public Point negate() {
		return new Point("-" + getName(), -getX(), -getY());
	}
	
	public double getDistance() {
		return Math.sqrt(getX() * getX() + getY() * getY());
	}
	
	public String toString() {
		return getName() + "(" + getX() + ", " + getY() + ")";
	}
}
