package bai5;

public class Demo {
	public static void main(String[] arg) {
		Triangle a = null, b = null, c = null, d = null, e = null;
		try {
			a = new Triangle(1,2,4);
			b = new Triangle(3,5,6);
			c = new Triangle(3,5,7);
			d = new Triangle(3,3,5);
			e = new Triangle(5,5,5);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		System.out.println(a.toString() + "\n\n" + b.toString() + "\n\n" + c.toString() + "\n\n" + d.toString() + "\n\n" + e.toString())
;	}
}
