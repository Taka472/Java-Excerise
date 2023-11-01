package bai5;

public class Triangle {
	private int a, b, c;

	public int getA() {
		return a;
	}

	public void setA(int a) throws Exception{
		if (a <= 0) throw new Exception("A loi");
		else this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) throws Exception{
		if (b <= 0) throw new Exception("B loi");
		else this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) throws Exception{
		if (c <= 0) throw new Exception("C loi");
		else this.c = c;
	}
	
	public Triangle() throws Exception{
		setA(0);
		setB(0);
		setC(0);
	}
	
	public Triangle(int a, int b, int c) throws Exception{
		setA(a);
		setB(b);
		setC(c);
	}
	
	public double Perimeter() {
		return getA() + getB() + getC();
	}
	
	public double Area() {
		double p = Perimeter() / 2;
		return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
	}
	
	public String Type() {
		int a = getA(), b = getB(), c = getC();
		if (a == b && b == c) return "Deu";
		else if (a == b || b == c || a == c) return "Can";
		else if (a + b > c && b + c > a && a + c > b) return "Thuong";
		return "Khong phai la tam giac";
	}
	
	public String toString() {
		return "(" + getA() + ", " + getB() + ", " + getC() + ")\n" + "Loai: " + Type() + "\nChu vi: " + Perimeter() + "\nDien tich: " + Area();
	}
}
