package bai3;

public class Cylinder {
	private int radius;
	private int height;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Cylinder(int radius, int height) {
		setRadius(radius);
		setHeight(height);
	}
	
	public double Surround() {
		return getHeight() * 2 * Math.PI * getRadius();
	}
	
	public double All() {
		return Surround() + 2 * Math.pow(getRadius(), 2);
	}
	
	public double Area() {
		return 2 * Math.pow(getRadius(), 2) * getHeight();
	}
}
